package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deviceplans")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobilePlansDevice{

    @XmlAttribute
    private String deviceplanid;
    @XmlAttribute
    private String addOns;
    @XmlAttribute
    private String addOnsCost;
    @XmlAttribute
    private String model;
    @XmlAttribute
    private String deviceType;
    @XmlAttribute
    private String flexiNat;
    @XmlAttribute
    private String priority="";
    @XmlAttribute
    private String planType;
    @XmlAttribute
    private String operatorname;
    @XmlAttribute
    private String rating;
    @XmlAttribute
    private String totalfeedback;

    @XmlAttribute
    private String deviceImage;
    @XmlElement
    private DevicePlanPrices devieplanprice;

    
	/**
	 * @return the addOns
	 */
	public String getAddOns() {
		return addOns;
	}

	/**
	 * @param addOns the addOns to set
	 */
	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}

	/**
	 * @return the addOnsCost
	 */
	public String getAddOnsCost() {
		return addOnsCost;
	}

	/**
	 * @param addOnsCost the addOnsCost to set
	 */
	public void setAddOnsCost(String addOnsCost) {
		this.addOnsCost = addOnsCost;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType the deviceType to set
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @return the flexiNat
	 */
	public String getFlexiNat() {
		return flexiNat;
	}

	/**
	 * @param flexiNat the flexiNat to set
	 */
	public void setFlexiNat(String flexiNat) {
		this.flexiNat = flexiNat;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the planType
	 */
	public String getPlanType() {
		return planType;
	}

	/**
	 * @param planType the planType to set
	 */
	public void setPlanType(String planType) {
		this.planType = planType;
	}

	/**
	 * @return the operatorname
	 */
	public String getOperatorname() {
		return operatorname;
	}

	/**
	 * @param operatorname the operatorname to set
	 */
	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}


	/**
	 * @return the devieplanprice
	 */
	public DevicePlanPrices getDevieplanprice() {
		return devieplanprice;
	}

	/**
	 * @param devieplanprice the devieplanprice to set
	 */
	public void setDevieplanprice(DevicePlanPrices devieplanprice) {
		this.devieplanprice = devieplanprice;
	}

	/**
	 * @return the deviceplanid
	 */
	public String getDeviceplanid() {
		return deviceplanid;
	}

	/**
	 * @param deviceplanid the deviceplanid to set
	 */
	public void setDeviceplanid(String deviceplanid) {
		this.deviceplanid = deviceplanid;
	}

	public String getDeviceImage() {
		return deviceImage;
	}

	public void setDeviceImage(String deviceImage) {
		this.deviceImage = deviceImage;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTotalfeedback() {
		return totalfeedback;
	}

	public void setTotalfeedback(String totalfeedback) {
		this.totalfeedback = totalfeedback;
	}

}
