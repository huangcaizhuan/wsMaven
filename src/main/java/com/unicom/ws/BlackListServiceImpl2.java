package com.unicom.ws;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;

@WebService(endpointInterface="com.unicom.webservice.blackList.BlackListService",targetNamespace="http://blackList.webservice.unicom.com")
public class BlackListServiceImpl2 implements BlackListService2{

	@Override
	public JSONObject getBlackList(String accessInfo, String queryParam) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		json.put("blackListFlag", 1);
		return json;
	}

	@Override
	public JSONObject deleteBlackList(String accessInfo, String delParam) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		json.put("blackListFlag", 1);
		return json;
	}

	@Override
	public JSONObject addBlacklist(String accessInfo, String addParam) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		json.put("blackListFlag", 1);
		return json;
	}

	/*@Override
	public JSONObject singleBlackListQueryReq(String username,String password,String phoneNumber) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		json.put("blackListFlag", 1);
		return json;
	}
	@Override
	public JSONObject singleBlackListAddReq(String username,String password,String phoneNumber) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		return json;
	}

	@Override
	public JSONObject SingleBlackListDelReq(String username,String password,String phoneNumber) {
		JSONObject json = new JSONObject();
		json.put("resultCode", 100);
		json.put("resultDesc", "操作成功");
		return json;
	}*/
}
