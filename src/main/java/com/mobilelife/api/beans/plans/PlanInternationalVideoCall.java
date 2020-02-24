package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInternationalVideoCall {

    @XmlAttribute
    private String international_video_call;
    @XmlAttribute
    private String international_video_call_unitrate;
	/**
	 * @return the international_video_call
	 */
	public String getInternational_video_call() {
		return international_video_call;
	}
	/**
	 * @param international_video_call the international_video_call to set
	 */
	public void setInternational_video_call(String international_video_call) {
		this.international_video_call = international_video_call;
	}
	/**
	 * @return the international_video_call_unitrate
	 */
	public String getInternational_video_call_unitrate() {
		return international_video_call_unitrate;
	}
	/**
	 * @param international_video_call_unitrate the international_video_call_unitrate to set
	 */
	public void setInternational_video_call_unitrate(String international_video_call_unitrate) {
		this.international_video_call_unitrate = international_video_call_unitrate;
	}

}
