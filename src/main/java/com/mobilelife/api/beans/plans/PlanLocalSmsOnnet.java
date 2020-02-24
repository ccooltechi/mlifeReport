package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalSmsOnnet {

    @XmlAttribute
    private String local_sms_onnet;
    @XmlAttribute
    private String local_sms_onnet_unitrate;
	/**
	 * @return the local_sms_onnet
	 */
	public String getLocal_sms_onnet() {
		return local_sms_onnet;
	}
	/**
	 * @param local_sms_onnet the local_sms_onnet to set
	 */
	public void setLocal_sms_onnet(String local_sms_onnet) {
		this.local_sms_onnet = local_sms_onnet;
	}
	/**
	 * @return the local_sms_onnet_unitrate
	 */
	public String getLocal_sms_onnet_unitrate() {
		return local_sms_onnet_unitrate;
	}
	/**
	 * @param local_sms_onnet_unitrate the local_sms_onnet_unitrate to set
	 */
	public void setLocal_sms_onnet_unitrate(String local_sms_onnet_unitrate) {
		this.local_sms_onnet_unitrate = local_sms_onnet_unitrate;
	} 

}
