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
 * @Title: Node.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年9月22日 下午2:15:33
 */
package com.ronglian.sdk.xtao.beans.node;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.ronglian.sdk.xtao.SDKUtils;
import com.ronglian.sdk.xtao.beans.BaseBean;
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
public class Node extends BaseBean {

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
	private static final long serialVersionUID = -1591110478799760975L;

	@JSONField(name = "host_disk_count")
	private int HostDiskCount;

	@JSONField(name = "host_nic_count")
	private int HostNicCount;

	@JSONField(name = "node_name")
	private String NodeName;

	public Node() {

	}

	public Node(String nodeName, int hostNicCount, int hostDiskCount) {
		this.NodeName = nodeName;
		this.HostDiskCount = hostDiskCount;
		this.HostNicCount = hostNicCount;
	}

	/**
	 * <br/>
	 * Description:
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Node(String endpoint, User user) {
		this.setUser(user);
		this.setEndpoint(endpoint);
	}

	/**
	 * <br/>
	 * Description:获取集群所有机器列表及磁盘/网卡数目概要信息
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 * 
	 * @throws IOException
	 */
	public List<Node> Lists() throws AuthException, HttpException, IOException {
		NodeListResult nodeResult = null;

		try {
			nodeResult = Post(this.getEndpoint(), "/nodes/node/list_nodes", this.GetUserToken(), new HashMap<>(),
					NodeListResult.class);
		} catch (IOException e) {
			throw e;
		}

		if (!SDKUtils.ParseBoolean(nodeResult.getStatus())) {
			throw new HttpException(nodeResult.getErrmsg());
		}

		return nodeResult.getResult();
	}

	/**
	 * return hostDiskCount
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public int getHostDiskCount() {
		return HostDiskCount;
	}

	/**
	 * param hostDiskCount 要设置的 hostDiskCount
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setHostDiskCount(int hostDiskCount) {
		HostDiskCount = hostDiskCount;
	}

	/**
	 * return hostNicCount
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public int getHostNicCount() {
		return HostNicCount;
	}

	/**
	 * param hostNicCount 要设置的 hostNicCount
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setHostNicCount(int hostNicCount) {
		HostNicCount = hostNicCount;
	}

	/**
	 * return nodeName
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getNodeName() {
		return NodeName;
	}

	/**
	 * param nodeName 要设置的 nodeName
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setNodeName(String nodeName) {
		NodeName = nodeName;
	}
}
