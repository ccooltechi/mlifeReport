package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAttribute;

public class DevicePlan {

    @XmlAttribute
	private String modelid ;
    @XmlAttribute
    
	private String colorid ;

    @XmlAttribute
	private String storage ;

    @XmlAttribute
	private String devicePlanId ;

    @XmlAttribute
	private String commitment ;

	public String getModelid() {
		return modelid;
	}

	public void setModelid(String modelid) {
		this.modelid = modelid;
	}

	public String getColorid() {
		return colorid;
	}

	public void setColorid(String colorid) {
		this.colorid = colorid;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getDevicePlanId() {
		return devicePlanId;
	}

	public void setDevicePlanId(String devicePlanId) {
		this.devicePlanId = devicePlanId;
	}

	public String getCommitment() {
		return commitment;
	}

	public void setCommitment(String commitment) {
		this.commitment = commitment;
	}

    
}
