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
 * @Title: PoolProperties.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午8:42:35
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
public class PoolProperties extends BaseBean {

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
	private static final long serialVersionUID = 7803715233446459037L;

	@JSONField(name = "max_objects")
	private String MaxObjects;

	@JSONField(name = "domain")
	private String Domain;

	@JSONField(name = "name")
	private String Name;

	@JSONField(name = "min_size")
	private String MinSize;

	@JSONField(name = "cluster")
	private String Cluster;

	@JSONField(name = "replica")
	private String Replica;

	@JSONField(name = "stripe")
	private String Stripe;

	@JSONField(name = "type")
	private String PoolType;

	@JSONField(name = "max_size")
	private String MaxSize;

	/**
	 * <br/>
	 * Description:
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public PoolProperties() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return maxObjects
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getMaxObjects() {
		return MaxObjects;
	}

	/**
	 * param maxObjects 要设置的 maxObjects
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setMaxObjects(String maxObjects) {
		MaxObjects = maxObjects;
	}

	/**
	 * return domain
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getDomain() {
		return Domain;
	}

	/**
	 * param domain 要设置的 domain
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setDomain(String domain) {
		Domain = domain;
	}

	/**
	 * return name
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getName() {
		return Name;
	}

	/**
	 * param name 要设置的 name
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * return minSize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getMinSize() {
		return MinSize;
	}

	/**
	 * param minSize 要设置的 minSize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setMinSize(String minSize) {
		MinSize = minSize;
	}

	/**
	 * return cluster
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getCluster() {
		return Cluster;
	}

	/**
	 * param cluster 要设置的 cluster
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setCluster(String cluster) {
		Cluster = cluster;
	}

	/**
	 * return replica
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getReplica() {
		return Replica;
	}

	/**
	 * param replica 要设置的 replica
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setReplica(String replica) {
		Replica = replica;
	}

	/**
	 * return stripe
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getStripe() {
		return Stripe;
	}

	/**
	 * param stripe 要设置的 stripe
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setStripe(String stripe) {
		Stripe = stripe;
	}

	/**
	 * return poolType
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getPoolType() {
		return PoolType;
	}

	/**
	 * param poolType 要设置的 poolType
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setPoolType(String poolType) {
		PoolType = poolType;
	}

	/**
	 * return maxSize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getMaxSize() {
		return MaxSize;
	}

	/**
	 * param maxSize 要设置的 maxSize
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setMaxSize(String maxSize) {
		MaxSize = maxSize;
	}
}
