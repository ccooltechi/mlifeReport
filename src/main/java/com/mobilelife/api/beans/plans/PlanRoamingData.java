package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanRoamingData {

    @XmlAttribute
    private String data_roaming_gb;
    @XmlAttribute
    private String data_roaming_roll_over_gb;
    @XmlAttribute
    private String data_roaming_bucketcode;
	/**
	 * @return the data_roaming_gb
	 */
	public String getData_roaming_gb() {
		return data_roaming_gb;
	}
	/**
	 * @param data_roaming_gb the data_roaming_gb to set
	 */
	public void setData_roaming_gb(String data_roaming_gb) {
		this.data_roaming_gb = data_roaming_gb;
	}
	/**
	 * @return the data_roaming_roll_over_gb
	 */
	public String getData_roaming_roll_over_gb() {
		return data_roaming_roll_over_gb;
	}
	/**
	 * @param data_roaming_roll_over_gb the data_roaming_roll_over_gb to set
	 */
	public void setData_roaming_roll_over_gb(String data_roaming_roll_over_gb) {
		this.data_roaming_roll_over_gb = data_roaming_roll_over_gb;
	}
	/**
	 * @return the data_roaming_bucketcode
	 */
	public String getData_roaming_bucketcode() {
		return data_roaming_bucketcode;
	}
	/**
	 * @param data_roaming_bucketcode the data_roaming_bucketcode to set
	 */
	public void setData_roaming_bucketcode(String data_roaming_bucketcode) {
		this.data_roaming_bucketcode = data_roaming_bucketcode;
	} 

}
