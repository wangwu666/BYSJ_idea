package com.ww.controller;

import com.ww.model.Manager;
import com.ww.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 员工控制层
 * @author Administrator
 *
 */
@Controller
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;

	/**
	 * 登录判断
	 * @param request
	 * @param response   登录成功到index.jsp;  失败返回到login.jsp
	 * @throws IOException
	 * @throws ServletException
	 */
	@RequestMapping(value = "/login")
	public void loginService(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		//获取用户名，密码，身份等
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String managerlevel = request.getParameter("managerlevel");
		System.out.println("account,password,managerLevel:"+ account + ", " + password+","+managerlevel);
		//查询用户
		Manager manager = managerService.loginService(account, password,managerlevel);
		System.out.println("查询结果：" + manager);
		//判断并将查询到的用户信息存入session
		HttpSession session = request.getSession();
		if (null != manager) {
			//普通用户
			if (("0").equals(managerlevel)) {
				manager.setAccount(account);
				manager.setPassword(password);
				manager.setManagerlevel(managerlevel);
				session.setAttribute("manager", manager);
				response.sendRedirect("jsp/index.jsp");
			} else if(("1").equals(managerlevel)) {
				//管理员
				manager.setAccount(account);
				manager.setPassword(password);
				manager.setManagerlevel(managerlevel);
				session.setAttribute("manager", manager);
				response.sendRedirect("jsp/index.jsp");
			} else{
				PrintWriter out = response.getWriter();
				out.println("<script>alert('身份错误');window.location.href='jsp/login.jsp';</script>");
			}
		} else {
			PrintWriter out = response.getWriter();
			// 登录失败，回到登录页面
			out.println("<script>alert('账号或密码错误');window.location.href='jsp/login.jsp';</script>");
		}
	}
	
	/**
	 * 更新用户信息
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateManager")
	public void updateManager(HttpServletRequest request, HttpServletResponse response)
		throws IOException {
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 接收前台用户信息
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String userpassword = request.getParameter("userpassword");
		System.out.println("account" + account + "旧密码：" + userpassword	+ "password=" + password);
		// 判断用户是否存在
		Manager manager = managerService.loginService(account, userpassword);
		if (null != manager) {
			// 更新用户信息
			int result = managerService.updateManager(account, password);
			System.out.println("更新结果：" + result);
			if (result == 1) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('用户修改成功！');window.location.href='./jsp/login.jsp';</script>");
			} else {
				System.out.println("用户修改失败！");
			}
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('账号或旧密码错误请重新输入！');window.location.href='./jsp/employee/UpdateManager.jsp';</script>");
		}
	}
	
	
	
	
}
