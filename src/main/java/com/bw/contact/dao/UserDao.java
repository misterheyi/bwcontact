/**
 * @FileName: UserDao.java
 * @Author Huang.Yong
 * @Description:
 * @Date 2015年12月30日 下午3:55:14
 */
package com.bw.contact.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bw.contact.entities.User;

/**
 * @Author Huang.Yong
 * @Description: 用户数据访问接口
 * @Date 2015年12月30日 下午3:55:14
 * @Version 0.1
 */
@Repository
public interface UserDao {

	/**
	 * @Title: selectUserByAccount
	 * @Description: 指定用户账户查询用户
	 * @param account 用户账户
	 * @return User 与指定账户关联的用户对象
	 */
	public User selectUserById(@Param("id") String id);

}
