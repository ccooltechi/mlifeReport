package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.Search.BillSlasherCriteria;
import com.mobilelife.api.beans.Search.SearchingCriteria;
import com.mobilelife.api.beans.user.UserInfoRequest;

@XmlRootElement(name = "billslasher")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillSlasherRequest {

    @XmlAttribute
	private String authtoken ;
    @XmlAttribute
	private String appID ;

    @XmlElement
	private UserInfoRequest user_info;

    @XmlElement
    private BillSlasherCriteria search_criteria;
	/**
	 * @return the user_info
	 */
	public UserInfoRequest getUser_info() {
		return user_info;
	}
	/**
	 * @param user_info the user_info to set
	 */
	public void setUser_info(UserInfoRequest user_info) {
		this.user_info = user_info;
	}
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
	/**
	 * @return the search_criteria
	 */
	public BillSlasherCriteria getSearch_criteria() {
		return search_criteria;
	}
	/**
	 * @param search_criteria the search_criteria to set
	 */
	public void setSearch_criteria(BillSlasherCriteria search_criteria) {
		this.search_criteria = search_criteria;
	}
	
}
