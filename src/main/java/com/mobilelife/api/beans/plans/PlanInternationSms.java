package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInternationSms {
	
    @XmlAttribute
	private String international_sms="";

    @XmlAttribute
	private String international_sms_bucketcode;

	/**
	 * @return the international_sms
	 */
	public String getInternational_sms() {
		return international_sms;
	}

	/**
	 * @param international_sms the international_sms to set
	 */
	public void setInternational_sms(String international_sms) {
		this.international_sms = international_sms;
	}

	/**
	 * @return the international_sms_bucketcode
	 */
	public String getInternational_sms_bucketcode() {
		return international_sms_bucketcode;
	}

	/**
	 * @param international_sms_bucketcode the international_sms_bucketcode to set
	 */
	public void setInternational_sms_bucketcode(String international_sms_bucketcode) {
		this.international_sms_bucketcode = international_sms_bucketcode;
	}

}
