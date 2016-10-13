/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: Tag.java
 * @Package com.ronglian.sdk.xtao.beans.osgw
 * @date 2016年10月11日 下午9:12:52 
 */
package com.ronglian.sdk.xtao.beans.osgw;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class Tag extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = -5769657345534557028L;
	
	@JSONField(name="pools")
    private String[] Pools;
	
	@JSONField(name="descs")
    private String Descs;
	
	@JSONField(name="users")
    private String[] Users;
	
	@JSONField(name="name")
    private String Name;

	/**
	 * return pools
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String[] getPools() {
		return Pools;
	}

	/**
	 * param pools 要设置的 pools
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPools(String[] pools) {
		Pools = pools;
	}

	/**
	 * return descs
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getDescs() {
		return Descs;
	}

	/**
	 * param descs 要设置的 descs
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setDescs(String descs) {
		Descs = descs;
	}

	/**
	 * return users
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String[] getUsers() {
		return Users;
	}

	/**
	 * param users 要设置的 users
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setUsers(String[] users) {
		Users = users;
	}

	/**
	 * return name
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getName() {
		return Name;
	}

	/**
	 * param name 要设置的 name
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setName(String name) {
		Name = name;
	}
	
}
