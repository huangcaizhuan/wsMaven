package com.unicom.webservice.blackList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.unicom.webservice.blackList.AccessInfo;

import com.alibaba.fastjson.JSONObject;

@WebService(targetNamespace="http://blackList.webservice.unicom.com",serviceName="BlackListService",portName="BlackListServicePort")
public interface BlackListService {
	
	@WebMethod(operationName="test")
	@WebResult(name="BlackListInfo",targetNamespace="http://blackList.webservice.unicom.com")
	public BlackListInfo test(@WebParam(name="AccessInfo")AccessInfo AccessInfo,@WebParam(name="QueryParam")BlackListInfo BlackListInfo);
	
	
	/*
	
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
			@WebParam(name="RequestAddParam")String addParam);*/
}
