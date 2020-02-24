package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanRoamingIncomingMins {

    @XmlAttribute
    private String roaming_incoming_mins ;
    @XmlAttribute
    private String roaming_incoming_bucketcode ;
	/**
	 * @return the roaming_incoming_mins
	 */
	public String getRoaming_incoming_mins() {
		return roaming_incoming_mins;
	}
	/**
	 * @param roaming_incoming_mins the roaming_incoming_mins to set
	 */
	public void setRoaming_incoming_mins(String roaming_incoming_mins) {
		this.roaming_incoming_mins = roaming_incoming_mins;
	}
	/**
	 * @return the roaming_incoming_bucketcode
	 */
	public String getRoaming_incoming_bucketcode() {
		return roaming_incoming_bucketcode;
	}
	/**
	 * @param roaming_incoming_bucketcode the roaming_incoming_bucketcode to set
	 */
	public void setRoaming_incoming_bucketcode(String roaming_incoming_bucketcode) {
		this.roaming_incoming_bucketcode = roaming_incoming_bucketcode;
	}

}
