package com.ww.controller;

import com.ww.model.Invitejob;
import com.ww.service.InviteJobService;
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
 * 招聘信息控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class InviteJobController {
	
	@Autowired
	private InviteJobService inviteJobService;
	
	/**
	 * 添加招聘人员
	 * @param invitejob
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertInvitejob")
	public void insertInvitejob(
            @ModelAttribute("invitejob") Invitejob invitejob,
            HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		inviteJobService.insertInvitejob(invitejob);
		System.out.println(invitejob.getTeachschool());
		if (null != invitejob) {
			System.out.println("添加招聘人员成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('添加招聘人员成功！');window.location.href='selectInvitejob.do?pageSize=6&curPage=1';</script>");
		}
	}

	
	/**
	 * 通过id的查询修改是否录取
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateInvitejob")
	public void updateInvitejob(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 查询
		int id = Integer.valueOf(request.getParameter("id"));
		int result = inviteJobService.updateInvitejob(id);
		if (result != 0) {
			System.out.println("录取成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('录取成功！');window.location.href='selectInvitejob.do?pageSize=6&curPage=1';</script>");
		}
	}
	
	
	/**
	 * 通过招聘id详细查询记录
	 * @param request
	 * @return
	 */
//	@RequestMapping(value = "/selectInvitejobById")
//	public String selectInvitejobById(HttpServletRequest request) {
//		int id = Integer.valueOf(request.getParameter("id"));
//		System.out.println(id);
//		List<Invitejob> list = inviteJobService.selectInvitejobById(id);
//		request.setAttribute("list", list);
//		return "jsp/invitejob/SelectInvitejobById.jsp";
//	}
	
	
	/**
	 * 通过招聘非录用查询
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/selectInvitejobNotEnroll")
	public String selectInvitejobNotEnroll(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		List<Invitejob> list = inviteJobService.selectInvitejobNotEnroll();
		request.setAttribute("list", list);
		return "jsp/invitejob/SelectInvitejobFalse.jsp";
	}
	
	
	/**
	 * 通过招聘录用查询
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectInvitejobEnroll")
	public String selectInvitejobEnroll(HttpServletRequest request) {
		List<Invitejob> list = inviteJobService.selectInvitejobEnroll();
		request.setAttribute("list", list);
		return "jsp/invitejob/SelectInvitejobtrue.jsp";
	}
	
	
	/**
	 * 通过id删除招聘记录
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteInvitejob")
	public void deleteInvitejobById(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 接受jsp传过来的id，并转换为int类型
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int id = Integer.valueOf(request.getParameter("id"));
		System.out.println(id);
		int result = inviteJobService.deleteInvitejobById(id);
		System.out.println(result);
		if (result == 0) {
			System.out.println("招聘删除成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('招聘删除成功！');window.location.href='selectInvitejob.do?pageSize=6&curPage=1';</script>");
		}
	}
	
}
