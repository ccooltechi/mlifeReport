package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInternationalMms {
	
    @XmlAttribute
    private String international_mms;
    @XmlAttribute
    private String international_mms_unitrate;
	/**
	 * @return the international_mms
	 */
	public String getInternational_mms() {
		return international_mms;
	}
	/**
	 * @param international_mms the international_mms to set
	 */
	public void setInternational_mms(String international_mms) {
		this.international_mms = international_mms;
	}
	/**
	 * @return the international_mms_unitrate
	 */
	public String getInternational_mms_unitrate() {
		return international_mms_unitrate;
	}
	/**
	 * @param international_mms_unitrate the international_mms_unitrate to set
	 */
	public void setInternational_mms_unitrate(String international_mms_unitrate) {
		this.international_mms_unitrate = international_mms_unitrate;
	}

}
