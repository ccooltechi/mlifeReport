package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalCall {

    @XmlAttribute
	private String local_call_sms="";
    @XmlAttribute
	private String local_call_sms_pulse="";
	/**
	 * @return the local_call_sms
	 */
	public String getLocal_call_sms() {
		return local_call_sms;
	}
	/**
	 * @param local_call_sms the local_call_sms to set
	 */
	public void setLocal_call_sms(String local_call_sms) {
		this.local_call_sms = local_call_sms;
	}
	/**
	 * @return the local_call_sms_pulse
	 */
	public String getLocal_call_sms_pulse() {
		return local_call_sms_pulse;
	}
	/**
	 * @param local_call_sms_pulse the local_call_sms_pulse to set
	 */
	public void setLocal_call_sms_pulse(String local_call_sms_pulse) {
		this.local_call_sms_pulse = local_call_sms_pulse;
	}
	
}
