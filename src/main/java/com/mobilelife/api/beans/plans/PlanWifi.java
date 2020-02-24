package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanWifi {

    @XmlAttribute
	private String wifi_access;
    @XmlAttribute
	private String wifi_access_unit;
	/**
	 * @return the wifi_access
	 */
	public String getWifi_access() {
		return wifi_access;
	}
	/**
	 * @param wifi_access the wifi_access to set
	 */
	public void setWifi_access(String wifi_access) {
		this.wifi_access = wifi_access;
	}
	/**
	 * @return the wifi_access_unit
	 */
	public String getWifi_access_unit() {
		return wifi_access_unit;
	}
	/**
	 * @param wifi_access_unit the wifi_access_unit to set
	 */
	public void setWifi_access_unit(String wifi_access_unit) {
		this.wifi_access_unit = wifi_access_unit;
	}
    
}
