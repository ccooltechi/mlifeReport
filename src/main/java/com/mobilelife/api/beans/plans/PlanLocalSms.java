package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalSms {

    @XmlAttribute
    private String local_sms; 
    @XmlAttribute
    private String local_sms_unitrate;
	/**
	 * @return the local_sms
	 */
	public String getLocal_sms() {
		return local_sms;
	}
	/**
	 * @param local_sms the local_sms to set
	 */
	public void setLocal_sms(String local_sms) {
		this.local_sms = local_sms;
	}
	/**
	 * @return the local_sms_unitrate
	 */
	public String getLocal_sms_unitrate() {
		return local_sms_unitrate;
	}
	/**
	 * @param local_sms_unitrate the local_sms_unitrate to set
	 */
	public void setLocal_sms_unitrate(String local_sms_unitrate) {
		this.local_sms_unitrate = local_sms_unitrate;
	} 

}
