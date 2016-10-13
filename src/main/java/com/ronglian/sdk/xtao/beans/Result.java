/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: Result.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年9月22日 下午2:02:30 
 */
package com.ronglian.sdk.xtao.beans;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.SDKUtils;

/**
 * <p>
 * Copyright: All Rights Reserved
 * </p>
 * <p>
 * Company: 北京荣之联科技股份有限公司 http://www.ronglian.com
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author:Eric Shi/史丙利
 * </p>
 */

public class Result implements Serializable {

	/**
	 * <p>
	 * Description:
	 * </p>
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 * 
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -6151922943126590406L;

	@JSONField(name = "status")
	private boolean Status;

	@JSONField(name = "errmsg")
	private String Errmsg;
	
	/**
	 * return status
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public boolean getStatus() {
		return Status;
	}

	/**
	 * param status 要设置的 status
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setStatus(String status) {
		Status =SDKUtils.ParseBoolean(status) ;
	}

	/**
	 * return errmsg
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getErrmsg() {
		return Errmsg;
	}

	/**
	 * param errmsg 要设置的 errmsg
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setErrmsg(String errmsg) {
		Errmsg = errmsg;
	}
}
