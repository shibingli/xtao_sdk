/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: PublicResult.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年10月4日 下午12:32:09 
 */
package com.ronglian.sdk.xtao.beans;

import com.alibaba.fastjson.annotation.JSONField;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class PublicResult extends Result {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = -1430505132873162361L;

	@JSONField(name="result")
	private String Result;

	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getResult() {
		return Result;
	}

	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(String result) {
		Result = result;
	}
}
