package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credential")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthRequest {
	
    @XmlAttribute
	private String username ;
    @XmlAttribute
	private String password ;
    @XmlAttribute
	private String appID ;
    @XmlAttribute
	private String hashCode ;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the hashCode
	 */
	public String getHashCode() {
		return hashCode;
	}
	/**
	 * @param hashCode the hashCode to set
	 */
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
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
