/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: Block.java
 * @Package com.ronglian.sdk.xtao.beans.block
 * @date 2016年10月10日 下午9:55:12 
 */
package com.ronglian.sdk.xtao.beans.block;

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
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */
public class Block extends BaseBean {

	/**
	 * <p>Description: </p>
	 * <p>Author:Eric Shi/史丙利</p>
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 2131147348018667016L;

	@JSONField(name="name")
	private String Name;
	
	@JSONField(name="size")
	private String Size;
	
	/**
	 * <br/>Description:
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public Block() {
		// TODO Auto-generated constructor stub
	}
	
	public Block(String endpoint, User user) {
		this.setUser(user);
		this.setEndpoint(endpoint);
	}
	
	/**
	 * <br/>Description:列出Pool下的所有blocks
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public List<Block> Lists(String poolName) throws AuthException, HttpException, IOException {
		BlockListResult blockListResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		
		try {
			blockListResult = Post(this.getEndpoint(), "/blockdev/list_pool_blocks", this.GetUserToken(), maps,
					BlockListResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(blockListResult.getStatus())) {
			throw new HttpException(blockListResult.getErrmsg());
		}

		return blockListResult.getResult();
	}
	
	/**
	 * <br/>Description:查看某个block的详情。
	 * 主要用于展示这个block下的snapshots，以及基于各snapshot创建的克隆的层级信息。
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public BlockInfo Info(String poolName,String blockName) throws AuthException, HttpException, IOException {
		BlockInfoResult blockInfoResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		
		try {
			blockInfoResult = Post(this.getEndpoint(), "/blockdev/info_block", this.GetUserToken(), maps,
					BlockInfoResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(blockInfoResult.getStatus())) {
			throw new HttpException(blockInfoResult.getErrmsg());
		}

		return blockInfoResult.getResult();
	}
	
	/**
	 * <br/>Description:创建一个新的Block
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Create(String poolName,String blockName,String size) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("size", size);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/create_block", this.GetUserToken(), maps,
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
	 * <br/>Description:改变block的Size大小,注意输入的Size需要大于Block之前的Size。
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Resize(String poolName,String blockName,String size) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("size", size);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/resize_block", this.GetUserToken(), maps,
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
	 * <br/>Description:为block创建一个快照
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String CreateSnapshot(String poolName,String blockName,String snapName) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("snap_name", snapName);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/create_block_snap", this.GetUserToken(), maps,
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
	 * <br/>Description:从快照回滚Block数据
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String RollbackSnapshot(String snapName,String poolName,String blockName) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("snap_name", snapName);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/snap_rollback_block", this.GetUserToken(), maps,
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
	 * <br/>Description:基于快照创建克隆
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String CloneBlockBySnapshot(String snapName,String poolName,String blockName,String cloneName) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("snap_name", snapName);
		maps.put("clone_name", cloneName);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/snap_create_clone", this.GetUserToken(), maps,
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
	 * <br/>Description:删除快照
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String DeleteSnapshot(String poolName,String blockName,String snapName) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		maps.put("snap_name", snapName);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/delete_snap", this.GetUserToken(), maps,
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
	 * <br/>Description:删除Block
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String DeleteBlock(String poolName,String blockName) throws AuthException, HttpException, IOException {
		PublicResult  publicResult = null;

		Map<String, String> maps = new HashMap<>();
		maps.put("pool_name", poolName);
		maps.put("block_name", blockName);
		
		try {
			publicResult = Post(this.getEndpoint(), "/blockdev/delete_block", this.GetUserToken(), maps,
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
	public String getSize() {
		return Size;
	}

	/**
	 * param size 要设置的 size
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setSize(String size) {
		Size = size;
	}
	
	
}
