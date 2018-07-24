package com.ww.dao;

import com.ww.model.Department;

import java.util.List;

/**
 * 部门   数据访问层
 * 
 * @author dell
 *
 */
public interface DepartmentMapper {
	
	/**
	 * 通过部门名称查询部门表
	 * @param name
	 * @return
	 */
	List<Department> selectDepartmentByName(String name);
	
	/**
	 * 添加部门
	 * @param record
	 * @return
	 */
	int insert(Department record);
	
	/**
	 * 查询部门表
	 * @return
	 */
	List<Department> selectDepartment();
	
	/**
	 * 通过id来删除部门记录
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

}