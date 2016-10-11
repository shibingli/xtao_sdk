/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: DomainShowResult.java
 * @Package com.ronglian.sdk.xtao.beans.domain
 * @date 2016年10月8日 上午9:06:32 
 */
package com.ronglian.sdk.xtao.beans.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class DomainShow extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = -6901359183756477057L;

	@JSONField(name="free_disks")
	private String[] FreeDisks;
	
	@JSONField(name="tree")
	private Domain Tree;

	/**
	 * return freeDisks
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String[] getFreeDisks() {
		return FreeDisks;
	}

	/**
	 * param freeDisks 要设置的 freeDisks
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setFreeDisks(String[] freeDisks) {
		FreeDisks = freeDisks;
	}

	/**
	 * return tree
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Domain getTree() {
		return Tree;
	}

	/**
	 * param tree 要设置的 tree
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setTree(Domain tree) {
		Tree = tree;
	}
}
