/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: PoolCacheInfo.java
 * @Package com.ronglian.sdk.xtao.beans.pool
 * @date 2016年10月10日 下午9:05:26 
 */
package com.ronglian.sdk.xtao.beans.pool;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class PoolCacheInfo extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 1731568459878380402L;
	
	@JSONField(name="max_objects")
    private String MaxObjects;
	
	@JSONField(name="cache_mode")
    private String CacheMode;
	
	@JSONField(name="writeback")
    private String Writeback;
	
	@JSONField(name="max_bytes")
    private String MaxBytes;
	
	@JSONField(name="unit")
    private String Unit;
	
	@JSONField(name="dirty_ratio")
    private String DirtyRatio;

	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public PoolCacheInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return maxObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getMaxObjects() {
		return MaxObjects;
	}

	/**
	 * param maxObjects 要设置的 maxObjects
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setMaxObjects(String maxObjects) {
		MaxObjects = maxObjects;
	}

	/**
	 * return cacheMode
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getCacheMode() {
		return CacheMode;
	}

	/**
	 * param cacheMode 要设置的 cacheMode
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setCacheMode(String cacheMode) {
		CacheMode = cacheMode;
	}

	/**
	 * return writeback
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getWriteback() {
		return Writeback;
	}

	/**
	 * param writeback 要设置的 writeback
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setWriteback(String writeback) {
		Writeback = writeback;
	}

	/**
	 * return maxBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getMaxBytes() {
		return MaxBytes;
	}

	/**
	 * param maxBytes 要设置的 maxBytes
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setMaxBytes(String maxBytes) {
		MaxBytes = maxBytes;
	}

	/**
	 * return unit
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getUnit() {
		return Unit;
	}

	/**
	 * param unit 要设置的 unit
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setUnit(String unit) {
		Unit = unit;
	}

	/**
	 * return dirtyRatio
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getDirtyRatio() {
		return DirtyRatio;
	}

	/**
	 * param dirtyRatio 要设置的 dirtyRatio
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setDirtyRatio(String dirtyRatio) {
		DirtyRatio = dirtyRatio;
	}
}
