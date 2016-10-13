/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: Snapshot.java
 * @Package com.ronglian.sdk.xtao.beans.block
 * @date 2016年10月10日 下午9:57:00 
 */
package com.ronglian.sdk.xtao.beans.block;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class Snapshot extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 8339027448758979808L;
	
	@JSONField(name="id")
	 private String Id;
	
	@JSONField(name="name")
	 private String Name;
	
	@JSONField(name="size")
	 private long Size;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Snapshot() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return id
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getId() {
		return Id;
	}

	/**
	 * param id 要设置的 id
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setId(String id) {
		Id = id;
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

	/**
	 * return size
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getSize() {
		return Size;
	}

	/**
	 * param size 要设置的 size
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setSize(long size) {
		Size = size;
	}
}
