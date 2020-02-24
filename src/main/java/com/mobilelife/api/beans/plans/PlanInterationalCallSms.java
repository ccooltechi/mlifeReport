package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInterationalCallSms {

    @XmlAttribute
	private String international_sms_calls;

	/**
	 * @return the international_sms_calls
	 */
	public String getInternational_sms_calls() {
		return international_sms_calls;
	}

	/**
	 * @param international_sms_calls the international_sms_calls to set
	 */
	public void setInternational_sms_calls(String international_sms_calls) {
		this.international_sms_calls = international_sms_calls;
	}

}
