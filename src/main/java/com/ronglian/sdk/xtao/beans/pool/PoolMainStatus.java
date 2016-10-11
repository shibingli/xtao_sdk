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
 * 
 * @Title: PoolStatus.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午8:38:35
 */
package com.ronglian.sdk.xtao.beans.pool;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

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
public class PoolMainStatus extends BaseBean {

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
	private static final long serialVersionUID = 7102373424785569277L;

	@JSONField(name="pool_summary")
	private PoolSummary PoolSummary;
	
	@JSONField(name="pool_status")
	private PoolSubStatus pool_status;
	
	@JSONField(name="properties")
	private PoolProperties  PoolProperties;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolMainStatus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return poolSummary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolSummary getPoolSummary() {
		return PoolSummary;
	}

	/**
	 * param poolSummary 要设置的 poolSummary
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPoolSummary(PoolSummary poolSummary) {
		PoolSummary = poolSummary;
	}

	/**
	 * return pool_status
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolSubStatus getPool_status() {
		return pool_status;
	}

	/**
	 * param pool_status 要设置的 pool_status
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPool_status(PoolSubStatus pool_status) {
		this.pool_status = pool_status;
	}

	/**
	 * return poolProperties
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolProperties getPoolProperties() {
		return PoolProperties;
	}

	/**
	 * param poolProperties 要设置的 poolProperties
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPoolProperties(PoolProperties poolProperties) {
		PoolProperties = poolProperties;
	}
}
