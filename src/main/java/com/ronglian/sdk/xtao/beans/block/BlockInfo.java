/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: BlockInfo.java
 * @Package com.ronglian.sdk.xtao.beans.block
 * @date 2016年10月11日 上午8:30:23 
 */
package com.ronglian.sdk.xtao.beans.block;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.beans.BaseBean;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class BlockInfo extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = -7751977132871081791L;
	
	@JSONField(name="name")
	private String BlockName;
	
	@JSONField(name="pool")
	private String PoolName;
	
	@JSONField(name="snaps")
	private List<Snapshot> Snaps;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public BlockInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * return blockName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getBlockName() {
		return BlockName;
	}

	/**
	 * param blockName 要设置的 blockName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setBlockName(String blockName) {
		BlockName = blockName;
	}

	/**
	 * return poolName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String getPoolName() {
		return PoolName;
	}

	/**
	 * param poolName 要设置的 poolName
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setPoolName(String poolName) {
		PoolName = poolName;
	}

	/**
	 * return snaps
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public List<Snapshot> getSnaps() {
		return Snaps;
	}

	/**
	 * param snaps 要设置的 snaps
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setSnaps(List<Snapshot> snaps) {
		Snaps = snaps;
	}

}
