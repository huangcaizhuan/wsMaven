/*package com.unicom.ws;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;

@WebService(endpointInterface="com.unicom.ws.HelloWS")
public class HelloWSImpl implements HelloWS{

	@Override
	public JSONObject addBlack(String phone) {
		JSONObject json = new JSONObject();
		json.put("code", 0);
		json.put("status", "success");
		json.put("msg", "成功");
		return json;
	}

	@Override
	public Object deleteBlack(String phone) {
		JSONObject json = new JSONObject();
		json.put("code", 0);
		json.put("status", "success");
		json.put("msg", "成功");
		return json;
	}

}
*/