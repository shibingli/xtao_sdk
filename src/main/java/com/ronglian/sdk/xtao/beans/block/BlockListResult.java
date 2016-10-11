/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: BlockInfoResult.java
 * @Package com.ronglian.sdk.xtao.beans.block
 * @date 2016年10月11日 上午9:41:02 
 */
package com.ronglian.sdk.xtao.beans.block;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class BlockListResult extends Result {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 3856129933297060030L;
	
	@JSONField(name="result")
	private List<Block> Result;

	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public List<Block> getResult() {
		return Result;
	}

	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(List<Block> result) {
		Result = result;
	}
}
