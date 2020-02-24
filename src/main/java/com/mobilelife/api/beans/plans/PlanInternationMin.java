package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInternationMin {

    @XmlAttribute
	private String international_minutes="";
    @XmlAttribute
	private String international_minute_pulse="";
    @XmlAttribute
	private String international_minutes_rollover="";
    @XmlAttribute
	private String international_min_bucketcode="";
    @XmlAttribute
	private String international_minutes_unitrate="";
    
	/**
	 * @return the international_minutes
	 */
	public String getInternational_minutes() {
		return international_minutes;
	}
	/**
	 * @param international_minutes the international_minutes to set
	 */
	public void setInternational_minutes(String international_minutes) {
		this.international_minutes = international_minutes;
	}
	/**
	 * @return the international_minute_pulse
	 */
	public String getInternational_minute_pulse() {
		return international_minute_pulse;
	}
	/**
	 * @param international_minute_pulse the international_minute_pulse to set
	 */
	public void setInternational_minute_pulse(String international_minute_pulse) {
		this.international_minute_pulse = international_minute_pulse;
	}
	/**
	 * @return the international_minutes_rollover
	 */
	public String getInternational_minutes_rollover() {
		return international_minutes_rollover;
	}
	/**
	 * @param international_minutes_rollover the international_minutes_rollover to set
	 */
	public void setInternational_minutes_rollover(String international_minutes_rollover) {
		this.international_minutes_rollover = international_minutes_rollover;
	}
	/**
	 * @return the international_min_bucketcode
	 */
	public String getInternational_min_bucketcode() {
		return international_min_bucketcode;
	}
	/**
	 * @param international_min_bucketcode the international_min_bucketcode to set
	 */
	public void setInternational_min_bucketcode(String international_min_bucketcode) {
		this.international_min_bucketcode = international_min_bucketcode;
	}
	public String getInternational_minutes_unitrate() {
		return international_minutes_unitrate;
	}
	public void setInternational_minutes_unitrate(String international_minutes_unitrate) {
		this.international_minutes_unitrate = international_minutes_unitrate;
	}
	
}
