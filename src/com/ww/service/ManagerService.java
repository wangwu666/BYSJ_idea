package com.ww.service;

import com.ww.dao.ManagerMapper;
import com.ww.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务层
 * 
 * @author Administrator
 *
 */
@Service
public class ManagerService {

	@Autowired
	private ManagerMapper managerMapper;
	
	/**
	 * 修改用户信息
	 * @param account
	 * @param password
	 * @return
	 */
	public int updateManager(String account,String password){
		return managerMapper.update(account, password);
	}

	/**
	 * 登录验证
	 * @param account
	 * @param password
	 * @return
	 */
	public Manager loginService(String account, String password){
		Manager manager = managerMapper.updateLogin(account, password);
		return manager;
	}
	
	/**
	 * 登录
	 * @param account
	 * @param password
	 * @param managerlevel
	 * @return
	 */
	public Manager loginService(String account, String password, String managerlevel){
		Manager manager = managerMapper.login(account, password,managerlevel);
		return manager;
	}
	
}
