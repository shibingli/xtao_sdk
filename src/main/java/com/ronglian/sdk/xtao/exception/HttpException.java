/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: AuthException.java
 * @Package com.ronglian.sdk.xtao.exception
 * @date 2016年10月4日 下午7:50:32 
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
public class HttpException extends XTaoException {

	private static final long serialVersionUID = 5816216491033129947L;

	public HttpException() {
	}

	public HttpException(String message) {
		super(message);
	}

	public HttpException(Throwable cause) {
		super(cause);
	}

	public HttpException(String message, Throwable cause) {
		super(message, cause);
	}
}
