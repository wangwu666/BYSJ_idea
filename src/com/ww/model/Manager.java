package com.ww.model;

/**
 * 系统用户 实体类
 * 
 * @author dell
 *
 */
public class Manager {
	//编号
    private Integer id;
    //登录账号
    private String account;
    //登录密码
    private String password;
    //用户身份(1:管理员    0:普通用户)
    private String managerlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getManagerlevel() {
        return managerlevel;
    }

    public void setManagerlevel(String managerlevel) {
        this.managerlevel = managerlevel == null ? null : managerlevel.trim();
    }

	public Manager(Integer id, String account, String password,
			String managerlevel) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.managerlevel = managerlevel;
	}

	public Manager() {
		super();
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", account=" + account + ", password="
				+ password + ", managerlevel=" + managerlevel + "]";
	}
    
}