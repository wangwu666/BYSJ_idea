package com.ww.dao;

import com.ww.model.Invitejob;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 招聘信息 数据访问层
 * 
 * @author dell
 *
 */
public interface InvitejobMapper {
	
	/**
	 * 通过id修改invite的录取状态
	 * @param id
	 * @return
	 */
	int updateByPrimaryKey1(Integer id);
	
	/**
	 * 通过id详细查询显示Invitejob
	 * @param id
	 * @return
	 */
//	List<Invitejob> selectByPrimaryKey(Integer id);
	
	/**
	 * 通过非录用查询显示Invitejob
	 * @return
	 */
	List<Invitejob> selectInvitejobNotEnroll();

	/**
	 * 通过录用查询显示Invitejob
	 * @return
	 */
	List<Invitejob> selectInvitejobEnroll();
	
	/**
	 * 查询显示招聘表
	 * @param pagesize
	 * @param startIndex
	 * @return
	 */
	List<Invitejob> goodsListByPagePay(@Param("pagesize") int pagesize,
                                       @Param("startIndex") int startIndex);
	
	/**
	 * 查总数招聘表
	 * @return
	 */
	int queryGoodsTotalPay();
	
	/**
	 * 通过id来删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 添加招聘员工
	 * @param record
	 * @return
	 */
	int insert(Invitejob record);

}