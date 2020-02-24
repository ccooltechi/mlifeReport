package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalVideoCall {

    @XmlAttribute
    private String local_video_call;
    @XmlAttribute
    private String local_video_call_unitrate;
	/**
	 * @return the local_video_call
	 */
	public String getLocal_video_call() {
		return local_video_call;
	}
	/**
	 * @param local_video_call the local_video_call to set
	 */
	public void setLocal_video_call(String local_video_call) {
		this.local_video_call = local_video_call;
	}
	/**
	 * @return the local_video_call_unitrate
	 */
	public String getLocal_video_call_unitrate() {
		return local_video_call_unitrate;
	}
	/**
	 * @param local_video_call_unitrate the local_video_call_unitrate to set
	 */
	public void setLocal_video_call_unitrate(String local_video_call_unitrate) {
		this.local_video_call_unitrate = local_video_call_unitrate;
	}

}
