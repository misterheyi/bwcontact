/**
 * @FileName: User.java
 * @Author Huang.Yong
 * @Description:
 * @Date 2015年12月30日 下午3:41:28
 */
package com.bw.contact.entities;

import java.io.Serializable;

/**
 * @Author Huang.Yong
 * @Description: 用户实体类
 * @Date 2015年12月30日 下午3:41:28
 * @Version 0.1
 */
public class User implements Serializable {

	// @Fields serialVersionUID :
	private static final long serialVersionUID = 8338157283024812555L;

	/**
	 * @Author Huang.Yong
	 * @Description: 性别枚举
	 * @Date 2015年12月30日 下午3:43:51
	 * @Version 0.1
	 */
	public enum Gender {
		/** 男性 */ MALE,
		/** 女性 */ FEMALE,
		/** 保密 */ SECRET;
	}
}
