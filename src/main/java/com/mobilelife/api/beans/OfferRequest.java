package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "offers")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferRequest {

    @XmlAttribute
	private String authtoken ;
    @XmlAttribute
	private String appID ;
    @XmlAttribute
	private String couponid ;

	/**
	 * @return the authtoken
	 */
	public String getAuthtoken() {
		return authtoken;
	}
	/**
	 * @param authtoken the authtoken to set
	 */
	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}
	/**
	 * @return the appID
	 */
	public String getAppID() {
		return appID;
	}
	/**
	 * @param appID the appID to set
	 */
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getCouponid() {
		return couponid;
	}
	public void setCouponid(String couponid) {
		this.couponid = couponid;
	}
	
}
