/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: XtaoClient.java
 * @Package com.ronglian.sdk.xtao
 * @date 2016年9月22日 下午1:42:16 
 */
package com.ronglian.sdk.xtao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ronglian.sdk.xtao.beans.disk.Disk;
import com.ronglian.sdk.xtao.beans.node.Node;
import com.ronglian.sdk.xtao.beans.user.User;

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
public class XTaoClient implements IXTaoClient {

	final Logger logger = LoggerFactory.getLogger(XTaoClient.class);

	private User user = null;
	
	private String endpoint="http://127.0.0.1:8080";

	/**
	 * <br/>
	 * Description:Client 构造函数
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public XTaoClient(String endpoint, String userName, String password) {

		logger.debug("HttpConn info: {} ==> {} == > {}.", endpoint, userName, password);

		user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		
		this.endpoint=endpoint;
	}

	/**
	 * <br/>Description:获取Node API对象
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Node GetNode(){
		return new Node(endpoint,user);
	}
	
	/**
	 * <br/>Description:获取Disk API对象
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Disk GetDisk(){
		return new Disk(endpoint,user);
	}
	

	/**
	 * return endpoint
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * param endpoint 要设置的 endpoint
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * return user
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public User getUser() {
		return user;
	}

	/**
	 * param user 要设置的 user
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
