package com.ww.controller;

import com.ww.model.Department;
import com.ww.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;


/**
 * 部门控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * 获取所有的部门信息
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/selectDepartment")
	public String selectDepartment(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		// 查询部门表将部门字段存入集合和查询部门表
		List<Department> list = departmentService.selectDeparment();
		request.setAttribute("list", list);
		return "jsp/department/SelectDepartment.jsp";
	}
	
	
	/**
	 *  添加部门
	 * @param department
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertDepartment")
	public void insertDepartment(
            @ModelAttribute("department") Department department,
            HttpServletRequest request, HttpServletResponse response)throws IOException {
		//设置编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//添加部门
		Integer result = departmentService.insertDepartment(department);
		if (result > 0) {
			System.out.println("添加部门成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('添加部门成功！');window.location.href='selectDepartment.do';</script>");
		}
	}
	
	
	
	/**
	 * 通过部门名称查询符合信息的部门
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectDepartmentByName")
	public String selectDepartmentByName(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("dtName");
		// 将ISO-8859-1编码设置为utf-8
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(name);
		// 查询部门
		List<Department> list = departmentService.selectDepartmentByName(name);
		request.setAttribute("list", list);
		
		return "jsp/department/SelectDepartment.jsp";
	}
	
	
	/**
	 * 通过id删除部门记录
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteDepartment")
	public void deleteDepartmentById(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 接受jsp传过来的id，并转换为int类型
		int id = Integer.valueOf(request.getParameter("id"));
		System.out.println(id);
		// 删除
		int result = departmentService.deleteDepartment(id);
		if (result == 0) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('部门删除成功！');window.location.href='selectDepartment.do';</script>");
		}
	}
	
}
