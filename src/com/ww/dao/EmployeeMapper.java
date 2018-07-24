package com.ww.dao;

import com.ww.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 员工信息  数据访问层
 * 
 * @author dell
 *
 */
public interface EmployeeMapper {
	
	/**
	 * 通过id来修改员工信息
	 * @param employee
	 * @return
	 */
	int updateEmployeeById(Employee employee);

	
	/**
	 * 以dtname为条件查询显示员工表的所有信息(基础部)
	 * @param pagesize
	 * @param startIndex
	 * @return
	 */
//	List<Employee> selectByExampleJava(EmployeeExample example);
	
	
	/**
	 * 分页查员工表
	 */
	List<Employee> queryGoodsByPage(
            @Param("pagesize") int pagesize,
            @Param("startIndex") int startIndex);
	
	
	/**
	 * 查总数员工表
	 * @return
	 */
	int queryGoodsTotal();
	
	
	/**
	 * 通过id来删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);
	

	/**
	 * 添加员工
	 * @param record
	 * @return
	 */
	int insert(Employee record);

}