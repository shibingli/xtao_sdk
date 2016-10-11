/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: DomainShowResult.java
 * @Package com.ronglian.sdk.xtao.beans.domain
 * @date 2016年10月8日 上午9:06:32 
 */
package com.ronglian.sdk.xtao.beans.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class DomainListResult extends Result {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = -6901359183756477057L;

	@JSONField(name="result")
	private String[] Result;

	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String[] getResult() {
		return Result;
	}

	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(String[] result) {
		Result = result;
	}
}
