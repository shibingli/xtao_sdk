/**
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description:  </p>
 * <p>Author:Eric Shi/史丙利</p>
 * @Title: SdkUtils.java
 * @Package com.ronglian.sdk.xtao
 * @date 2016年9月22日 下午3:01:58 
 */
package com.ronglian.sdk.xtao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import okhttp3.MediaType;
import okhttp3.RequestBody;

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

public class SDKUtils {

	public static final MediaType JSON_TYPE = MediaType.parse("application/json; charset=UTF-8");
	public static final String HTTP_HEADER_USER_AGENT = "UEC-Bio-Cloud_XtaoSDK_v1.0";

	/**
	 * <br/>
	 * Description:将一个对象转换为JSON对象，并输出为文本。
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String ObjectToJson(Object obj) {
		return ObjectToJson(obj, false);
	}

	/**
	 * <br/>
	 * Description:将一个对象转换为JSON对象，并输出为文本。注：可过滤空值。
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String ObjectToJson(Object obj, boolean NON_EMPTY) {
		if (NON_EMPTY) {
			return JSON.toJSONString(obj, SerializerFeature.WriteNullStringAsEmpty);
		} else {
			return JSON.toJSONString(obj);
		}
	}

	/**
	 * <br/>
	 * Description:将一个JSON对象转换为Java对象。注：可过滤空值。
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static <T> T JsonToObject(String jsonValue, Class<T> valueType) {
		return JSON.parseObject(jsonValue, valueType);
	}

	/**
	 * <br/>
	 * Description:根据传入的文本文件路径，读取内容并输出为文本。
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String ReadFileUTF8(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8).forEach((line) -> sb.append(line));
		return sb.toString();
	}

	/**
	 * <br/>
	 * Description:佷据传入的对象，创建一个JsonRequestBody
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static RequestBody CreateFormReqBody(Map<String, Object> maps) {

		RequestBody reqBody = RequestBody.create(JSON_TYPE, SDKUtils.ObjectToJson(maps));

		return reqBody;

		// FormBody.Builder formBuilder = new FormBody.Builder();
		// maps.forEach((k, v) -> formBuilder.add(k, v));
		// return formBuilder.build();
	}

	/**
	 * <br/>
	 * Description:获取ClassPath
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String GetClassPath() {
		return ClassLoader.getSystemResource("").getPath();
	}

	/**
	 * <br/>
	 * Description:Path 左侧反斜杠处理
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String PathStartConvert(String path) {
		return "/" + StringUtils.stripStart(path, "/");
	}

	/**
	 * <br/>
	 * Description:Path 右侧反斜杠处理
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String PathEndConvert(String path) {
		return StringUtils.stripEnd(path, "/");
	}

	/**
	 * <br/>
	 * Description:根据传入的字符串（yes/no,ok/error），返回一个布尔值
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static boolean ParseBoolean(String strBool) {
		boolean boo = false;
		if (StringUtils.isNotBlank(strBool)) {
			strBool = StringUtils.trimToEmpty(strBool);
			if (StringUtils.equals("yes", strBool) || StringUtils.equals("ok", strBool)) {
				boo = true;
			} else if (StringUtils.equals("no", strBool) || StringUtils.equals("error", strBool)) {
				boo = false;
			}
		}
		return boo;
	}

	/**
	 * <br/>
	 * Description:根据传入的布尔值，返回：ok/error
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String BooleanToOK(boolean bool) {
		if (bool) {
			return "ok";
		} else {
			return "error";
		}
	}

	/**
	 * <br/>
	 * Description:根据传入的布尔值，返回：yes/no
	 * <p>
	 * Author:Eric Shi/史丙利
	 * </p>
	 */
	public static String BooleanToYes(boolean bool) {
		if (bool) {
			return "yes";
		} else {
			return "no";
		}
	}
}
