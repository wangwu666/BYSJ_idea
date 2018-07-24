package com.ww.service;

import com.ww.dao.PayMapper;
import com.ww.model.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 
 * 薪资业务层
 * 
 * @author Administrator
 *
 */
@Service
public class PayService {

	@Autowired
	private PayMapper payMapper;
	
	
	/**
	 *  查询薪资表
	 * @return
	 */
	public List<Pay> selectPay() {
		return payMapper.selectPay();
	}

	/**
	 *  模糊查询姓名薪资表
	 * @param name
	 * @return
	 */
	public List<Pay> selectList(String name) {
		return payMapper.selectList(name);
	}

	/**
	 *  通过日期查询薪资表
	 * @param name
	 * @return
	 */
	public List<Pay> selectDate(String name) {
		return payMapper.selectDate(name);
	}
	
	/**
	 * 通过id删除薪资记录
	 * @param id
	 * @return
	 */
	public int deletePay(Integer id) {
		return payMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 添加薪资记录
	 * @param pay
	 */
	public void insertPay(@ModelAttribute("pay") Pay pay){
		payMapper.insert(pay);
	}
	
}
