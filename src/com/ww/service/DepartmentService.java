package com.ww.service;

import com.ww.dao.DepartmentMapper;
import com.ww.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 部门业务层
 * 
 * @author Administrator
 *
 */
@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	/**
	 * 获取所有的部门信息
	 * @return
	 */
	public List<Department> selectDeparment() {
		return departmentMapper.selectDepartment();
	}
	
	/**
	 * 添加部门记录(需要有返回值)
	 * @param department
	 */
	public Integer insertDepartment(@ModelAttribute("department") Department department){
		int result = departmentMapper.insert(department);
		return result;
	}
	
	/**
	 * 通过部门名称查询符合的部门信息
	 * @param name
	 * @return
	 */
	public List<Department> selectDepartmentByName(String name) {
		return departmentMapper.selectDepartmentByName(name);
	}
	
	/**
	 * 通过编号删除部门信息
	 * @param id
	 * @return
	 */
	public int deleteDepartment(Integer id) {
		return departmentMapper.deleteByPrimaryKey(id);
	}
}
