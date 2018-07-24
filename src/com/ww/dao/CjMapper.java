package com.ww.dao;

import com.ww.model.Cj;

import java.util.List;

/**
 * 奖惩信息  数据访问层
 * @author dell
 *
 */
public interface CjMapper {
	
	/**
	 * 通过日期查询奖惩表
	 * @param date
	 * @return
	 */
    List<Cj> selectDateByCj(String date);
	
    /**
     * 通过模糊姓名条件查询奖惩表
     * @param name
     * @return
     */
    List<Cj> selectListByCj(String name);
    
    /**
     * 查询奖惩表(cj)
     * @return
     */
	List<Cj> selectCj();
    
	/**
	 * 通过id来删除招聘记录
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Integer id);
    
    /**
     * 添加奖惩信息 
     * @param record
     * @return
     */
    int insert(Cj record);
    
   
}