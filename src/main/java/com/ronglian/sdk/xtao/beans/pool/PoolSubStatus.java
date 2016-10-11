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
public class PoolSubStatus extends BaseBean {

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

	@JSONField(name = "logsize")
	private String Logsize;

	@JSONField(name = "acting")
	private String Acting;

	@JSONField(name = "used")
	private String Used;

	@JSONField(name = "up")
	private String Up;

	@JSONField(name = "objects")
	private String Objects;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolSubStatus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return logsize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getLogsize() {
		return Logsize;
	}

	/**
	 * param logsize 要设置的 logsize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setLogsize(String logsize) {
		Logsize = logsize;
	}

	/**
	 * return acting
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getActing() {
		return Acting;
	}

	/**
	 * param acting 要设置的 acting
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setActing(String acting) {
		Acting = acting;
	}

	/**
	 * return used
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getUsed() {
		return Used;
	}

	/**
	 * param used 要设置的 used
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUsed(String used) {
		Used = used;
	}

	/**
	 * return up
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getUp() {
		return Up;
	}

	/**
	 * param up 要设置的 up
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUp(String up) {
		Up = up;
	}

	/**
	 * return objects
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getObjects() {
		return Objects;
	}

	/**
	 * param objects 要设置的 objects
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setObjects(String objects) {
		Objects = objects;
	}
}
