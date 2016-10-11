/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: PoolCacheInfoResult.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午9:11:20 
 */
package com.ronglian.sdk.xtao.beans.pool;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class PoolCacheInfoResult extends Result {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 9147226443517246717L;

	@JSONField(name="result")
	private PoolCacheInfo Result;

	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolCacheInfo getResult() {
		return Result;
	}

	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(PoolCacheInfo result) {
		Result = result;
	}
	
}
