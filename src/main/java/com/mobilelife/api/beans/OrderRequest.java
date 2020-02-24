package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.Search.SearchingCriteria;
import com.mobilelife.api.beans.order.OrderDetails;
import com.mobilelife.api.beans.user.UserInfoRequest;

@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderRequest {

    @XmlAttribute
	private String authtoken ;
    @XmlAttribute
	private String appID ;

    @XmlElement
	private UserInfoRequest user_info;

    @XmlElement
    private OrderDetails order;
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
	public OrderDetails getOrder() {
		return order;
	}
	public void setOrder(OrderDetails order) {
		this.order = order;
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
	
}
