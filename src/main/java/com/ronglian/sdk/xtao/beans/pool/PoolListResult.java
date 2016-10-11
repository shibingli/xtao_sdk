/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: PoolListResult.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午8:49:36 
 */
package com.ronglian.sdk.xtao.beans.pool;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class PoolListResult extends Result {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 7757438356939563041L;
	
	@JSONField(name="result")
	private List<Pool> Result;

	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public List<Pool> getResult() {
		return Result;
	}

	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(List<Pool> result) {
		Result = result;
	}
}
