package com.ww.service;

import com.ww.dao.CjMapper;
import com.ww.model.Cj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 奖惩业务层
 * 
 * @author Administrator
 *
 */
@Service
public class CjService {
	
	@Autowired
	private CjMapper cjMapper;
	
	/**
	 *  通过日期查询奖惩表
	 * @param name
	 * @return
	 */
	public List<Cj> selectDateByCj(String name) {
		return cjMapper.selectDateByCj(name);
	}
	
	/**
	 *  模糊查询姓名薪资表
	 * @param name
	 * @return
	 */
	public List<Cj> selectListByCj(String name) {
		return cjMapper.selectListByCj(name);
	}
	
	/**
	 *  查询奖惩表(cj)
	 * @return
	 */
	public List<Cj> selectCj() {
		return cjMapper.selectCj();
	}
	
	/**
	 * 通过id删除奖惩信息
	 * @param id
	 * @return
	 */
	public int deleteCj(Integer id) {
		return cjMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 添加奖惩记录
	 * @param cj
	 */
	public void insert(@ModelAttribute("cj") Cj cj){
		cjMapper.insert(cj);
	}
	
}
