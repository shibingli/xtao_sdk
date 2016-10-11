/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: BaseBeans.java
 * @Package com.ronglian.sdk.xtao.beans
 * @date 2016年9月25日 上午6:20:48 
 */
package com.ronglian.sdk.xtao.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.Maps;
import com.ronglian.sdk.xtao.SDKUtils;
import com.ronglian.sdk.xtao.beans.user.User;
import com.ronglian.sdk.xtao.beans.user.UserResult;
import com.ronglian.sdk.xtao.exception.AuthException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

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
public class BaseBean implements Serializable {

	final Logger logger = LoggerFactory.getLogger(BaseBean.class);

	public static enum RESULT_STATUS {
		yes, no;
	}

	@JSONField(serialize = false)
	private User user = null;

	@JSONField(serialize = false)
	private String endpoint = "http://127.0.0.1:8080/api/v1";

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
	private static final long serialVersionUID = -8775795533424586037L;

	/**
	 * <br/>Description:登陆并返回用户的 AccessToken
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public String GetUserToken() throws AuthException, IOException {
		User user = Login();
		return user.getAccessToken();
	}

	/**
	 * <br/>Description:XTao API 登陆
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public User Login() throws AuthException, IOException {
		Map<String, String> maps = Maps.newHashMap();
		maps.put("username", this.getUser().getUserName());
		maps.put("password", this.getUser().getPassword());

		UserResult userResult = Post(endpoint, "/account/auth_login", "", maps, UserResult.class);

		if (!SDKUtils.ParseBoolean(userResult.getStatus())) {
			throw new AuthException(userResult.getErrmsg());
		}
		return userResult.getResult();
	}

	/**
	 * <br/>Description:发起XTao API 一个 OkHttp POST 请求
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	public <T> T Post(String endpoint, String path, String accessToken, Map<String, String> maps, Class<T> valueType)
			throws IOException {
		return OkHttpPost(endpoint + SDKUtils.PathStartConvert(path), accessToken, maps, valueType);
	}

	/**
	 * <br/>Description:发起原生一个 OkHttp POST 请求
	 * <p>Author:Eric Shi/史丙利</p>
	 */
	private <T> T OkHttpPost(String url, String accessToken, Map<String, String> maps, Class<T> valueType)
			throws IOException {
		T resultObj = null;
		OkHttpClient client = new OkHttpClient();
		try {
			Builder builderReq = new Request.Builder();
			builderReq.addHeader("User-Agent", SDKUtils.HTTP_HEADER_USER_AGENT).addHeader("X-User-Agent",
					SDKUtils.HTTP_HEADER_USER_AGENT);

			if (StringUtils.isNotBlank(accessToken)) {
				logger.debug("X-Access-Token: {}", accessToken);
				builderReq.addHeader("X-Access-Token", accessToken);
			}

			logger.debug("Request URL: {}; Params: {}", url, SDKUtils.ObjectToJson(maps));

			Request request = builderReq.url(url).post(SDKUtils.CreateFormReqBody(maps)).build();
			Response response = client.newCall(request).execute();

			String respBody = response.body().string();

			logger.debug("Response body: {}", respBody);
			resultObj = SDKUtils.JsonToObject(respBody, valueType);
		} catch (IOException e) {
			throw e;
		}

		return resultObj;
	}

	/**
	 * return user
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public User getUser() {
		return user;
	}

	/**
	 * param user 要设置的 user
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * return endpoint
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * param endpoint 要设置的 endpoint
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = SDKUtils.PathEndConvert(endpoint);
	}
}
