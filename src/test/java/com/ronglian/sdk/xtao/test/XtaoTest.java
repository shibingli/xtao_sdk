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
 * @Title: XtaoTest.java
 * @Package com.ronglian.sdk.xtao.test
 * @date 2016年9月22日 下午1:47:26
 */
package com.ronglian.sdk.xtao.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.ronglian.sdk.xtao.IXTaoClient;
import com.ronglian.sdk.xtao.SDKUtils;
import com.ronglian.sdk.xtao.XTaoClient;
import com.ronglian.sdk.xtao.beans.disk.DiskListResult;
import com.ronglian.sdk.xtao.beans.disk.DiskStatusResult;
import com.ronglian.sdk.xtao.beans.node.Node;
import com.ronglian.sdk.xtao.beans.node.NodeListResult;
import com.ronglian.sdk.xtao.beans.user.User;
import com.ronglian.sdk.xtao.beans.user.UserResult;
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

public class XtaoTest {

	IXTaoClient client = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		client = new XTaoClient("http://127.0.0.1:8888/api/v1", "admin", "nasadmin");
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * <br/>
	 * Description:获取Src路径
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */

	@Test
	public void TestGetClassPath() {
		System.out.println(SDKUtils.GetClassPath());
	}

	/**
	 * <br/>
	 * Description:一次性读取一个文本文件
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 * 
	 * @throws IOException
	 */

	@Test
	public void TestGetTxtFile() throws IOException {
		String json = SDKUtils.ReadFileUTF8(SDKUtils.GetClassPath() + "noderesult.json");
		System.out.println(json);
	}

	/**
	 * <br/>
	 * Description:将一个对象转换成Json对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	@Test
	public void TestObjectToJson() {
		NodeListResult nodeResult = new NodeListResult();
		nodeResult.setErrmsg("");
		nodeResult.setStatus("ok");
		nodeResult.setResult(Lists.newArrayList(new Node("xt1", 1, 10), new Node("xt2", 1, 11)));

		String jsonData = SDKUtils.ObjectToJson(nodeResult);

		System.out.println("JsonData1:" + jsonData);

	}

	/**
	 * <br/>
	 * Description:将Json对象转换为一个Java对象
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	@Test
	public void TestJsonToObject() throws IOException {

		String json = SDKUtils.ReadFileUTF8(SDKUtils.GetClassPath() + "noderesult.json");

		NodeListResult nr = SDKUtils.JsonToObject(json, NodeListResult.class);

		System.out.println(nr.getStatus());
	}

	@Test
	public void TestUserBeanToJson() {
		User user = new User();

		// user.setAccessToken("sssssss");

		user.setUserName("admin");
		user.setPassword("nasadmin");

		UserResult userResult = new UserResult();
		userResult.setStatus("ok");
		userResult.setResult(user);

		System.out.println(SDKUtils.ObjectToJson(user, true));
	}

	@Test
	public void TestGetNodes() throws IOException, AuthException, HttpException {
		NodeListResult nodeListResult = client.GetNode().Lists();
		if (nodeListResult.getStatus()) {
			nodeListResult.getResult().forEach((n) -> System.out
					.println(n.getNodeName() + "==>" + n.getHostDiskCount() + "==>" + n.getHostNicCount()));
		} else {
			System.out.println(nodeListResult.getErrmsg());
		}
	}

	@Test
	public void TestGetDisks() throws IOException, AuthException, HttpException {
		DiskListResult diskListResult = client.GetDisk().Lists("xt1");

		if (diskListResult.getStatus()) {
			diskListResult.getResult().forEach((d) -> System.out.println(d.getUUID() + "==>" + d.getHCTL()));
		} else {
			System.out.println(diskListResult.getErrmsg());
		}
	}

	@Test
	public void TestGetDiskStatus() throws IOException, AuthException, HttpException {

		DiskStatusResult diskStatusResult = client.GetDisk().Status("xt1", "1");
		if (diskStatusResult.getStatus()) {
			System.out.println(diskStatusResult.getResult().getHCTL());
		} else {
			System.out.println(diskStatusResult.getErrmsg());
		}
	}
}
