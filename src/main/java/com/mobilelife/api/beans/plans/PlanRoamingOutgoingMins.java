package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanRoamingOutgoingMins {

    @XmlAttribute
    private String roaming_outgoing_mins;
    @XmlAttribute
    private String roaming_outgoing_mins_pulse; 
    @XmlAttribute
    private String roaming_outgoing_bucketcode;
	/**
	 * @return the roaming_outgoing_mins
	 */
	public String getRoaming_outgoing_mins() {
		return roaming_outgoing_mins;
	}
	/**
	 * @param roaming_outgoing_mins the roaming_outgoing_mins to set
	 */
	public void setRoaming_outgoing_mins(String roaming_outgoing_mins) {
		this.roaming_outgoing_mins = roaming_outgoing_mins;
	}
	/**
	 * @return the roaming_outgoing_mins_pulse
	 */
	public String getRoaming_outgoing_mins_pulse() {
		return roaming_outgoing_mins_pulse;
	}
	/**
	 * @param roaming_outgoing_mins_pulse the roaming_outgoing_mins_pulse to set
	 */
	public void setRoaming_outgoing_mins_pulse(String roaming_outgoing_mins_pulse) {
		this.roaming_outgoing_mins_pulse = roaming_outgoing_mins_pulse;
	}
	/**
	 * @return the roaming_outgoing_bucketcode
	 */
	public String getRoaming_outgoing_bucketcode() {
		return roaming_outgoing_bucketcode;
	}
	/**
	 * @param roaming_outgoing_bucketcode the roaming_outgoing_bucketcode to set
	 */
	public void setRoaming_outgoing_bucketcode(String roaming_outgoing_bucketcode) {
		this.roaming_outgoing_bucketcode = roaming_outgoing_bucketcode;
	} 

}
