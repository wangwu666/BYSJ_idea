package com.ww.controller;

import com.ww.model.Employee;
import com.ww.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * 员工信息 控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 *  添加员工记录
	 * @param employee
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/insertEmployee")
	public void insertEmployee(@ModelAttribute("employee") Employee employee,
                               HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		employeeService.insertEmployee(employee);
		if (null != employee) {
			System.out.println("员工添加成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('员工添加成功！');window.location.href='selectEmployee.do?pageSize=2&curPage=1';</script>");
		}
	}

	
	
	
	/**
	 *  通过id来修改员工的记录
	 * @param request
	 * @param response
	 * @param employee
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateEployee")
	public void updateEmployeeById(HttpServletRequest request,
                                   HttpServletResponse response, Employee employee) throws IOException {
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 获取参数信息
//		String emName = request.getParameter("emName");
//		int id = Integer.valueOf(request.getParameter("id"));
		String emSex = request.getParameter("emSex");
		String emCulture = request.getParameter("emCulture");
		String dtName = request.getParameter("dtName");
		int emdepartmentId=Integer.parseInt(dtName);
		System.out.println(emdepartmentId);
		String emTypeWork = request.getParameter("emTypeWork");
		String emCreatime = request.getParameter("emCreatime");
		
		// 设置要更新的对象
		employee.setEmDepartmentid(emdepartmentId);
		employee.setEmSex(emSex);
		employee.setEmCulture(emCulture);
		employee.setDtName(dtName);
		employee.setEmTypework(emTypeWork);
		employee.setEmCreatime(emCreatime);
		int result = employeeService.updateEmployeeById(employee);
		if (0 != result) {
			System.out.println("修改成功！");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('修改成功！');window.location.href='selectEmployee.do?pageSize=2&curPage=1';</script>");
		}
	}
	
	
	
	/**
	 * 员工列表分页
	 * @param pageSize
	 * @param curPage
	 * @return
	 */
	@RequestMapping(value = "/selectEmployee")
	public ModelAndView goodsListByPage(int pageSize, int curPage) {
		ModelAndView modelView = new ModelAndView(
				"jsp/employee/SelectEmployee.jsp");
		List<Employee> goodsList = employeeService.queryGoodsByPage(pageSize,curPage);
		modelView.addObject("list", goodsList);
		// 总记录数
		int total = employeeService.queryGoodsTotal();
		// 总的页数
		int totalPage = total / pageSize;
		if (total % pageSize != 0) {
			totalPage = totalPage + 1;
		}
		modelView.addObject("totalPage", totalPage);
		return modelView;
	}
	
	
	/**
	 * 通过id删除员工记录
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteEmployee")
	public void deleteEmployeeById(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 接受jsp传过来的id，并转换为int类型
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int id = Integer.valueOf(request.getParameter("id"));
		System.out.println(id);
		int result = employeeService.deleteEmployeeById(id);
		System.out.println(result);
		PrintWriter out = null;
		if (result == 0) {
			out = response.getWriter();
			out.println("<script>alert('员工删除成功！');window.location.href='selectEmployee.do?pageSize=2&curPage=1';</script>");
		}
	}
	
}
