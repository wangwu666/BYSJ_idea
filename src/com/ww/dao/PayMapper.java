package com.ww.dao;

import com.ww.model.Pay;

import java.util.List;

/**
 * 薪资 数据访问层
 * 
 * @author dell
 *
 */
public interface PayMapper {
    /**
     * 查询薪资表
     * @return
     */
    List<Pay> selectPay();
	
    /**
     * 通过模糊姓名条件查询
     * @param name
     * @return
     */
    List<Pay> selectList(String name);
    
    /**
     * 通过日期查询
     * @param date
     * @return
     */
    List<Pay> selectDate(String date);
    
    /**
     * 通过id进行删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    
    /**
     * 通过id来添加
     * @param record
     * @return
     */
    int insert(Pay record);
}