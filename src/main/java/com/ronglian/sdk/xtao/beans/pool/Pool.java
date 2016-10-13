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
 * @Title: Pool.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年10月10日 下午4:55:07
 */
package com.ronglian.sdk.xtao.beans.pool;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.SDKUtils;
import com.ronglian.sdk.xtao.beans.BaseBean;
import com.ronglian.sdk.xtao.beans.PublicResult;
import com.ronglian.sdk.xtao.beans.user.User;
import com.ronglian.sdk.xtao.exception.AuthException;
import com.ronglian.sdk.xtao.exception.HttpException;

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
public class Pool extends BaseBean {

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
	private static final long serialVersionUID = -5712482809875152905L;

	@JSONField(name = "domain")
	private String Domain;

	@JSONField(name = "name")
	private String Name;

	@JSONField(name = "size_quota_unit")
	private long SizeQuotaUnit;

	@JSONField(name = "minisize")
	private int Minisize;

	@JSONField(name = "cache")
	private String Cache;

	@JSONField(name = "size_quota_number")
	private String SizeQuotaNumber;

	@JSONField(name = "stripe")
	private int Stripe;

	@JSONField(name = "pool_type")
	private String PoolType;

	@JSONField(name = "rep")
	private int Rep;

	@JSONField(name = "objects_quota_number")
	private long ObjectsQuotaNumber;

	/**
	 * <br/>
	 * Description:
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Pool() {

	}

	public Pool(String endpoint, User user) {
		this.setUser(user);
		this.setEndpoint(endpoint);
	}

	/**
	 * <br/>
	 * Description:列出所有的池
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public List<Pool> Lists() throws AuthException, HttpException, IOException {
		PoolListResult poolListResult = null;

		try {
			poolListResult = Post(this.getEndpoint(), "/pools/pool/list_pools", this.GetUserToken(), new HashMap<>(),
					PoolListResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(poolListResult.getStatus())) {
			throw new HttpException(poolListResult.getErrmsg());
		}

		return poolListResult.getResult();
	}

	/**
	 * <br/>
	 * Description:查看某个池的详细信息
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public PoolMainStatus Status() throws AuthException, HttpException, IOException {
		PoolStatusResult poolStatusResult = null;

		try {
			poolStatusResult = Post(this.getEndpoint(), "/pools/pool/status_pool", this.GetUserToken(), new HashMap<>(),
					PoolStatusResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(poolStatusResult.getStatus())) {
			throw new HttpException(poolStatusResult.getErrmsg());
		}

		return poolStatusResult.getResult();
	}

	/**
	 * <br/>Description:创建一个新池
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Create(String poolName, String domainName, int repNum)
			throws AuthException, HttpException, IOException {
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("domain_name", domainName);
		maps.put("rep_num", repNum);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/pool/create_pool", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	/**
	 * <br/>Description:删除池
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Destroy(String poolName)
			throws AuthException, HttpException, IOException {
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("pool_name", poolName);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/pool/destroy_pool", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	/**
	 * <br/>Description:设置池的 Quota，
	 * 设置池能存放的对象的上限(例如500个)，或者池存储的容量的上限(例如1000GB)
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Quota(String poolName,String quotaType,long quotaValue)
			throws AuthException, HttpException, IOException {
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("quota_type", quotaType);
		maps.put("quota_value", quotaValue);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/pool/quota_pool", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	/**
	 * <br/>Description:将一个池添加为另一个池的缓存池
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String AddCache(String storagePool,String cachePool,String cacheMode)
			throws AuthException, HttpException, IOException {
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("storage_pool", storagePool);
		maps.put("cache_pool", cachePool);
		maps.put("cache_mode", cacheMode);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/cache/add_cache", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	/**
	 * <br/>Description:查看缓存池关系列表
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolCacheInfo CacheInfo(String poolName)
			throws AuthException, HttpException, IOException {
		PoolCacheInfoResult poolCacheInfoResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("pool_name", poolName);

		try {
			poolCacheInfoResult = Post(this.getEndpoint(), "/pools/cache/cache_info", this.GetUserToken(), maps,
					PoolCacheInfoResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(poolCacheInfoResult.getStatus())) {
			throw new HttpException(poolCacheInfoResult.getErrmsg());
		}

		return poolCacheInfoResult.getResult();
	}
	
	/**
	 * <br/>Description:调整缓存池的参数
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String SetCache(String cachePoolName,String cacheMode,long maxBytes,long maxObjects,double dirtyRatio)
			throws AuthException, HttpException, IOException {
		
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("cache_pool", cachePoolName);
		maps.put("cache_mode", cacheMode);
		maps.put("max_bytes", maxBytes);
		maps.put("max_objects", maxObjects);
		maps.put("dirty_ratio", dirtyRatio);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/cache/set_cache", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	
	/**
	 * <br/>Description:将缓存池的数据立即刷入存储池
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String FlushCache(String cachePoolName)
			throws AuthException, HttpException, IOException {
		
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("cache_pool", cachePoolName);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/cache/flush_cache", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	/**
	 * <br/>Description:删除两个池之间的缓存关系
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String RemoveCache(String storagePool,String cachePoolName)
			throws AuthException, HttpException, IOException {
		
		PublicResult publicResult = null;

		Map<String, Object> maps = new HashMap<>();
		maps.put("storage_pool", storagePool);
		maps.put("cache_pool", cachePoolName);

		try {
			publicResult = Post(this.getEndpoint(), "/pools/cache/remove_cache", this.GetUserToken(), maps,
					PublicResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
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
	 * return sizeQuotaUnit
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getSizeQuotaUnit() {
		return SizeQuotaUnit;
	}

	/**
	 * param sizeQuotaUnit 要设置的 sizeQuotaUnit
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setSizeQuotaUnit(long sizeQuotaUnit) {
		SizeQuotaUnit = sizeQuotaUnit;
	}

	/**
	 * return minisize
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public int getMinisize() {
		return Minisize;
	}

	/**
	 * param minisize 要设置的 minisize
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setMinisize(int minisize) {
		Minisize = minisize;
	}

	/**
	 * return cache
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getCache() {
		return Cache;
	}

	/**
	 * param cache 要设置的 cache
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setCache(String cache) {
		Cache = cache;
	}

	/**
	 * return sizeQuotaNumber
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getSizeQuotaNumber() {
		return SizeQuotaNumber;
	}

	/**
	 * param sizeQuotaNumber 要设置的 sizeQuotaNumber
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setSizeQuotaNumber(String sizeQuotaNumber) {
		SizeQuotaNumber = sizeQuotaNumber;
	}

	/**
	 * return stripe
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public int getStripe() {
		return Stripe;
	}

	/**
	 * param stripe 要设置的 stripe
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setStripe(int stripe) {
		Stripe = stripe;
	}

	/**
	 * return poolType
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getPoolType() {
		return PoolType;
	}

	/**
	 * param poolType 要设置的 poolType
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPoolType(String poolType) {
		PoolType = poolType;
	}

	/**
	 * return rep
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public int getRep() {
		return Rep;
	}

	/**
	 * param rep 要设置的 rep
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setRep(int rep) {
		Rep = rep;
	}

	/**
	 * return objectsQuotaNumber
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public long getObjectsQuotaNumber() {
		return ObjectsQuotaNumber;
	}

	/**
	 * param objectsQuotaNumber 要设置的 objectsQuotaNumber
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setObjectsQuotaNumber(long objectsQuotaNumber) {
		ObjectsQuotaNumber = objectsQuotaNumber;
	}
}
