package com.unicom.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;

@WebService(targetNamespace="http://blackList.webservice.unicom.com",serviceName="BlackListService",portName="BlackListServicePort")
public interface BlackListService2 {
	
	@WebMethod(operationName="SingleBlackListQueryReq")
	@WebResult(name="BlackListInfo",targetNamespace="http://blackList.webservice.unicom.com")
	public JSONObject  getBlackList(@WebParam(name="AccessInfo")String accessInfo,
			@WebParam(name="QueryParam")String queryParam);
	
	@WebMethod(operationName="SingleBlackListDelReq")
	@WebResult(name="CommonResp",targetNamespace="http://blackList.webservice.unicom.com")
	public JSONObject  deleteBlackList(@WebParam(name="AccessInfo")String accessInfo,
			@WebParam(name="RequestDelParam")String delParam);
	
	@WebMethod(operationName="SingleBlackListAddReq")
	@WebResult(name="CommonResp",targetNamespace="http://blackList.webservice.unicom.com")
	public JSONObject  addBlacklist(@WebParam(name="AccessInfo")String accessInfo,
			@WebParam(name="RequestAddParam")String addParam);
}
