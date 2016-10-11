/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: IClient.java
 * @Package com.ronglian.sdk.xtao
 * @date 2016年9月22日 下午1:58:24 
 */
package com.ronglian.sdk.xtao;

import com.ronglian.sdk.xtao.beans.disk.Disk;
import com.ronglian.sdk.xtao.beans.node.Node;

/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p> 
 * <p>Author:Eric Shi/史丙利</p>
 */

public interface IXTaoClient{
	
	public Node GetNode();
	public Disk GetDisk();

}
