package com.unicom.webservice.blackList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "BlackListInfo")  
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlType(propOrder = { "endTime", "isSegment","reason","recordstate","sourceNumber" })
public class BlackListInfo {
	private String endTime;  
    private int isSegment;
    private int reason;  
    private int recordstate;
    private String sourceNumber;
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getIsSegment() {
		return isSegment;
	}
	public void setIsSegment(int isSegment) {
		this.isSegment = isSegment;
	}
	public int getReason() {
		return reason;
	}
	public void setReason(int reason) {
		this.reason = reason;
	}
	public int getRecordstate() {
		return recordstate;
	}
	public void setRecordstate(int recordstate) {
		this.recordstate = recordstate;
	}
	public String getSourceNumber() {
		return sourceNumber;
	}
	public void setSourceNumber(String sourceNumber) {
		this.sourceNumber = sourceNumber;
	}
}
