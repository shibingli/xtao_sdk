/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: XTaoException.java
 * @Package com.ronglian.sdk.xtao.exception
 * @date 2016年10月4日 下午7:44:19 
 */
package com.ronglian.sdk.xtao.exception;

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
public class XTaoException extends Exception {

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
	private static final long serialVersionUID = 42308347149174620L;

	public XTaoException() {
	}

	public XTaoException(String message) {
		super(message);
	}

	public XTaoException(Throwable cause) {
		super(cause);
	}

	public XTaoException(String message, Throwable cause) {
		super(message, cause);
	}
}
