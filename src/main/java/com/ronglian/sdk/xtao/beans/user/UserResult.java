/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: UserResult.java
 * @Package com.ronglian.sdk.xtao.beans.user
 * @date 2016年9月24日 下午8:29:00 
 */
package com.ronglian.sdk.xtao.beans.user;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class UserResult extends Result{

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 238591492328025950L;
	
	
	@JSONField(name="result")
	private User Result;


	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public User getResult(){
		return Result;
	}


	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(User result){
		Result = result;
	}
}
