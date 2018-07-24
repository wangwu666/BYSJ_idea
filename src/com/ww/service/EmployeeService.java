package com.ww.service;

import com.ww.dao.EmployeeMapper;
import com.ww.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 员工业务层
 * 
 * @author Administrator
 * 
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * 更新员工信息
	 * 
	 * @param employee
	 * @return
	 */
	public int updateEmployeeById(Employee employee) {
		return employeeMapper.updateEmployeeById(employee);
	}

	/**
	 * 通过部门名称查询员工记录
	 * 
	 * @return
	 */
	public List<Employee> selectEmployeeByDtname() {
//		EmployeeExample employeeExample = new EmployeeExample();
//		return employeeMapper.selectByExampleJava(employeeExample);
		return null;
	}

	/**
	 * 分页查员工表
	 * 
	 * @param pageSize
	 * @param curPage
	 * @return
	 */
	public List<Employee> queryGoodsByPage(int pageSize, int curPage) {
		// 开始的记录 =(总页数-1)*页面的条数
		int startIndex = (curPage - 1) * pageSize;
		List<Employee> list = employeeMapper.queryGoodsByPage(pageSize,startIndex);
		return list;
	}

	/**
	 * 总行数员工表
	 * 
	 * @return
	 */
	public int queryGoodsTotal() {
		return employeeMapper.queryGoodsTotal();
	}

	/**
	 * 通过编号删除员工信息
	 * 
	 * @param id
	 * @return
	 */
	public int deleteEmployeeById(Integer id) {
		return employeeMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 添加员工记录
	 * @param employee
	 */
	public void insertEmployee(@ModelAttribute("employee")Employee employee){
		 employeeMapper.insert(employee);
	}
}
