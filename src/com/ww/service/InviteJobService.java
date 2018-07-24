package com.ww.service;

import com.ww.dao.InvitejobMapper;
import com.ww.model.Invitejob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 招聘信息业务层
 * 
 * @author Administrator
 *
 */
@Service
public class InviteJobService {
	
	@Autowired
	private InvitejobMapper invitejobMapper;

	/**
	 * 通过id修改招聘的状态
	 * @param id
	 * @return
	 */
	public int updateInvitejob(int id){
		return invitejobMapper.updateByPrimaryKey1(id);
	}
	

	/**
	 *  通过招聘id查询显示详细信息
	 * @param id
	 * @return
	 */
//	public List<Invitejob> selectInvitejobById(int id) {
//		List<Invitejob> list = invitejobMapper.selectByPrimaryKey(id);
//		return list;
//	}

	/**
	 *  通过非录用查询记录
	 * @return
	 */
	public List<Invitejob> selectInvitejobNotEnroll() {
		List<Invitejob> list = invitejobMapper.selectInvitejobNotEnroll();
		return list;
	}

	/**
	 *  通过录用查询记录
	 * @return
	 */
	public List<Invitejob> selectInvitejobEnroll() {
		List<Invitejob> list = invitejobMapper.selectInvitejobEnroll();
		return list;
	}
	
	/**
	 *  分页查招聘信息显示
	 * @param pageSize
	 * @param curPage
	 * @return
	 */
	public List<Invitejob> goodsListByPagePay(int pageSize, int curPage) {

		// 开始的记录 =(总页数-1)*页面的条数
		int startIndex = (curPage - 1) * pageSize;
		List<Invitejob> list = invitejobMapper.goodsListByPagePay(pageSize, startIndex);
		return list;
	}

	/**
	 *  分页查总行数招聘信息表
	 * @return
	 */
	public int queryGoodsTotalPay() {
		return invitejobMapper.queryGoodsTotalPay();
	}
	
	/**
	 *  通过ID删除招聘记录
	 * @param id
	 * @return
	 */
	public int deleteInvitejobById(Integer id) {
		return invitejobMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 添加招聘信息
	 * @param invitejob
	 */
	public void insertInvitejob(@ModelAttribute("invitejob") Invitejob invitejob){
		invitejobMapper.insert(invitejob);
	}
	
}
