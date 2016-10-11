package com.ronglian.sdk.xtao.beans.disk;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.Result;

public class DiskStatusResult extends Result{

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 926400924876280397L;


	@JSONField(name="result")
	private Disk Result;


	/**
	 * return result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Disk getResult() {
		return Result;
	}


	/**
	 * param result 要设置的 result
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setResult(Disk result) {
		Result = result;
	}
}
