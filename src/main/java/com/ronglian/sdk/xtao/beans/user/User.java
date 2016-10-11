/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: User.java
 * @Package com.ronglian.sdk.xtao.beans.user
 * @date 2016年9月22日 下午9:24:13 
 */
package com.ronglian.sdk.xtao.beans.user;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/**
 * <p>Copyright: All Rights Reserved</p>
 * <p>Company: 北京荣之联科技股份有限公司 http://www.ronglian.com</p>
 * <p>Description: </p>
 * <p>Author:Eric Shi/史丙利</p>
 */
public class User extends BaseBean implements Serializable{

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * 
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 245031500993428008L;

	@JSONField(name = "username")
	private String UserName;

	@JSONField(name = "password")
	private String Password;

	@JSONField(name = "access_token")
	private String AccessToken;

	/**
	 * return userName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getUserName(){
		return UserName;
	}

	/**
	 * param userName 要设置的 userName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setUserName(String userName){
		UserName = userName;
	}

	/**
	 * return password
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getPassword(){
		return Password;
	}

	/**
	 * param password 要设置的 password
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPassword(String password){
		Password = password;
	}

	/**
	 * return accessToken
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getAccessToken(){
		return AccessToken;
	}

	/**
	 * param accessToken 要设置的 accessToken
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setAccessToken(String accessToken){
		AccessToken = accessToken;
	}
}
