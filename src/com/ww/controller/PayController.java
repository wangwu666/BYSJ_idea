package com.ww.controller;

import com.ww.model.Pay;
import com.ww.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * 薪资 控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class PayController {
	
	@Autowired
	private PayService payService;
	
	
	/**
	 * 添加薪资记录
	 * @param pay
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertPay")
	public void insertPay(
            @ModelAttribute("pay") Pay pay,
            HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		payService.insertPay(pay);
		if (null != pay) {
			System.out.println("添加薪资成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('添加薪资成功！');window.location.href='selectPay.do';</script>");
		}
	}
	
	
	/**
//	 * 分页查询薪资表
//	 * @param pageSize
//	 * @param curPage
//	 * @return
//	 */
//	@RequestMapping(value = "/selectInvitejob")
//	public ModelAndView goodsListByPagePay(int pageSize, int curPage) {
//		ModelAndView modelView = new ModelAndView(
//				"jsp/invitejob/SelectInvitejob.jsp");
//		List<Invitejob> goodsList = payService.goodsListByPagePay(pageSize,curPage);
//		modelView.addObject("list", goodsList);
//		// 总记录数
//		int total = payService.queryGoodsTotalPay();
//		// 总的页数
//		int totalPage = total / pageSize;
//		if (total % pageSize != 0) {
//			totalPage = totalPage + 1;
//		}
//		modelView.addObject("totalPage", totalPage);
//		return modelView;
//	}
	
	
	/**
	 *  查询薪资表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectPay")
	public String selectPay(HttpServletRequest request) {
		List<Pay> list = payService.selectPay();
		request.setAttribute("list", list);
		return "jsp/pay/SelectPay.jsp";
	}
	
	
	/**
	 * 模糊查询姓名薪资表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectList")
	public String selectList(HttpServletRequest request) {
		String name = request.getParameter("name");
		List<Pay> list = payService.selectList(name);
		request.setAttribute("list", list);
		return "jsp/pay/SelectPay.jsp";
	}
	
	
	/**
	 * 查询日期薪资表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectDate")
	public String selectDate(HttpServletRequest request) {
		String date = request.getParameter("date");
		List<Pay> list = payService.selectList(date);
		request.setAttribute("list", list);
		return "jsp/pay/SelectPay.jsp";
	}
	
	
	/**
	 * 薪资删除
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deletePay", produces = "application/json;charset=UTF-8")
	public void deletePay(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 接受jsp传过来的id，并转换为int类型
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int id = Integer.valueOf(request.getParameter("id"));
		System.out.println(id);
		int result = payService.deletePay(id);
		System.out.println(result);
		if (result == 0) {
			System.out.println("薪资删除成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('薪资删除成功！');window.location.href='selectPay.do';</script>");
		}
	}
	
}
