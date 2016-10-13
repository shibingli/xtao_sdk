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
 * @Title: Domain.java
 * @Package com.ronglian.sdk.xtao.beans.domain
 * @date 2016年10月8日 上午8:44:44
 */
package com.ronglian.sdk.xtao.beans.domain;

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
public class Domain extends BaseBean {

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
	private static final long serialVersionUID = -1053972503216264618L;

	@JSONField(name = "color")
	private String Color;

	@JSONField(name = "children")
	private List<Domain> Children;

	@JSONField(name = "name")
	private String Name;

	@JSONField(name = "level")
	private String Level;

	/**
	 * <br/>
	 * Description:
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public Domain() {
	}

	public Domain(String endpoint, User user) {
		this.setUser(user);
		this.setEndpoint(endpoint);
	}

	/**
	 * <br/>
	 * Description:查看故障域Domain树的结构
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public DomainShow ShowDomain(boolean reference, String refName) throws IOException, AuthException, HttpException {

		Map<String, Object> maps = new HashMap<>();
		maps.put("reference", SDKUtils.BooleanToYes(reference));
		maps.put("ref_name", refName);

		DomainShowResult domainShowResult = Post(this.getEndpoint(), "/domains/domain/show_domain", this.GetUserToken(),
				maps, DomainShowResult.class);

		if (!SDKUtils.ParseBoolean(domainShowResult.getStatus())) {
			throw new HttpException(domainShowResult.getErrmsg());
		}

		return domainShowResult.getResult();
	}

	/**
	 * <br/>
	 * Description:获取故障树的一级列表(用于Pool池的创建)
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String[] Lists() throws IOException, AuthException, HttpException {

		DomainListResult domainListResult = Post(this.getEndpoint(), "/domains/domain/get_domain_list",
				this.GetUserToken(), new HashMap<>(), DomainListResult.class);

		if (!SDKUtils.ParseBoolean(domainListResult.getStatus())) {
			throw new HttpException(domainListResult.getErrmsg());
		}

		return domainListResult.getResult();
	}

	/**
	 * <br/>
	 * Description:创建故障树一级节点
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String Create(String name, boolean reference, String refName)
			throws IOException, AuthException, HttpException {

		Map<String, Object> maps = new HashMap<>();
		maps.put("reference", SDKUtils.BooleanToYes(reference));
		maps.put("ref_name", refName);
		maps.put("domain_name", name);

		PublicResult publicResult = Post(this.getEndpoint(), "/domains/domain/create_domain", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * <br/>Description:删除故障树一级节点
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Delete(String name, boolean reference, String refName)
			throws IOException, AuthException, HttpException {

		Map<String, Object> maps = new HashMap<>();
		maps.put("reference", SDKUtils.BooleanToYes(reference));
		maps.put("ref_name", refName);
		maps.put("domain_name", name);

		PublicResult publicResult = Post(this.getEndpoint(), "/domains/domain/delete_domain", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}
	
	public DomainShow Move(String sourceDisk,String destNode,boolean reference, String refName) throws IOException, AuthException, HttpException {

		Map<String, Object> maps = new HashMap<>();
		maps.put("reference", SDKUtils.BooleanToYes(reference));
		maps.put("ref_name", refName);
		maps.put("source_disk", sourceDisk);
		maps.put("dest_node", destNode);

		DomainShowResult domainShowResult = Post(this.getEndpoint(), "/domains/domain/move_domain", this.GetUserToken(),
				maps, DomainShowResult.class);

		if (!SDKUtils.ParseBoolean(domainShowResult.getStatus())) {
			throw new HttpException(domainShowResult.getErrmsg());
		}

		return domainShowResult.getResult();
	}
	
	/**
	 * <br/>Description:提交所有模拟操作(reference=yes)的改动
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String Commit(boolean reference, String refName)
			throws IOException, AuthException, HttpException {

		Map<String, Object> maps = new HashMap<>();
		maps.put("reference", SDKUtils.BooleanToYes(reference));
		maps.put("ref_name", refName);

		PublicResult publicResult = Post(this.getEndpoint(), "/domains/domain/commit_domain", this.GetUserToken(), maps,
				PublicResult.class);

		if (!SDKUtils.ParseBoolean(publicResult.getStatus())) {
			throw new HttpException(publicResult.getErrmsg());
		}

		return publicResult.getResult();
	}

	/**
	 * return color
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getColor() {
		return Color;
	}

	/**
	 * param color 要设置的 color
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setColor(String color) {
		Color = color;
	}



	/**
	 * return children
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public List<Domain> getChildren() {
		return Children;
	}

	/**
	 * param children 要设置的 children
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public void setChildren(List<Domain> children) {
		Children = children;
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
	 * return level
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getLevel() {
		return Level;
	}

	/**
	 * param level 要设置的 level
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setLevel(String level) {
		Level = level;
	}

}
