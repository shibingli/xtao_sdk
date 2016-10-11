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
 * @Title: IClient.java
 * @Package com.ronglian.sdk.xtao
 * @date 2016年9月22日 下午1:58:24
 */
package com.ronglian.sdk.xtao;

import com.ronglian.sdk.xtao.beans.block.Block;
import com.ronglian.sdk.xtao.beans.disk.Disk;
import com.ronglian.sdk.xtao.beans.domain.Domain;
import com.ronglian.sdk.xtao.beans.node.Node;
import com.ronglian.sdk.xtao.beans.pool.Pool;

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

public interface IXTaoClient {

	/**
	 * <br/>
	 * Description:获取Node API对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Node GetNode();

	/**
	 * <br/>
	 * Description:获取Disk API对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Disk GetDisk();

	/**
	 * <br/>
	 * Description:获取Block API对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Block GetBlock();

	/**
	 * <br/>
	 * Description:获取Domain API对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Domain GetDomain();

	/**
	 * <br/>
	 * Description:获取Pool API对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Pool GetPool();

}
