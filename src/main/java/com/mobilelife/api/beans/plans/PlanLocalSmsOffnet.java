package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalSmsOffnet {

    @XmlAttribute
    private String local_sms_offnet; 
    @XmlAttribute
    private String local_sms_offnet_unitrate;
	/**
	 * @return the local_sms_offnet
	 */
	public String getLocal_sms_offnet() {
		return local_sms_offnet;
	}
	/**
	 * @param local_sms_offnet the local_sms_offnet to set
	 */
	public void setLocal_sms_offnet(String local_sms_offnet) {
		this.local_sms_offnet = local_sms_offnet;
	}
	/**
	 * @return the local_sms_offnet_unitrate
	 */
	public String getLocal_sms_offnet_unitrate() {
		return local_sms_offnet_unitrate;
	}
	/**
	 * @param local_sms_offnet_unitrate the local_sms_offnet_unitrate to set
	 */
	public void setLocal_sms_offnet_unitrate(String local_sms_offnet_unitrate) {
		this.local_sms_offnet_unitrate = local_sms_offnet_unitrate;
	}

}
