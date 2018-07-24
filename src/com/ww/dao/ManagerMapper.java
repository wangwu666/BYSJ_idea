package com.ww.dao;

import com.ww.model.Manager;
import org.apache.ibatis.annotations.Param;

/**
 * 系统用户  数据访问层
 * 
 * @author dell
 *
 */
public interface ManagerMapper {
    /**
     * 修改用户
     * @param account
     * @param password
     * @return
     */
    int update(@Param("account") String account, @Param("password") String password);

    /**
     * 先判断账号密码是否存在(没有状态值)
     * @param account
     * @param password
     * @return
     */
    Manager updateLogin(@Param("account") String account,
                        @Param("password") String password);

    /**
     * 登录
     * @param account
     * @param password
     * @param managerlevel
     * @return
     */
    Manager login(@Param("account") String account, @Param("password") String password,
                  @Param("managerlevel") String managerlevel);

}