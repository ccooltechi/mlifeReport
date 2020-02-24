package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanNationalMin {

    @XmlAttribute
	private String national_minutes; 
    @XmlAttribute
	private String national_minute_pulse;
    @XmlAttribute
	private String national_minutes_unitrate;
    @XmlAttribute
	private String national_minutes_was;
    @XmlAttribute
	private String national_minutes_discount;

	/**
	 * @return the national_minutes
	 */
	public String getNational_minutes() {
		return national_minutes;
	}
	/**
	 * @param national_minutes the national_minutes to set
	 */
	public void setNational_minutes(String national_minutes) {
		this.national_minutes = national_minutes;
	}
	/**
	 * @return the national_minute_pulse
	 */
	public String getNational_minute_pulse() {
		return national_minute_pulse;
	}
	/**
	 * @param national_minute_pulse the national_minute_pulse to set
	 */
	public void setNational_minute_pulse(String national_minute_pulse) {
		this.national_minute_pulse = national_minute_pulse;
	}
	/**
	 * @return the national_minutes_unitrate
	 */
	public String getNational_minutes_unitrate() {
		return national_minutes_unitrate;
	}
	/**
	 * @param national_minutes_unitrate the national_minutes_unitrate to set
	 */
	public void setNational_minutes_unitrate(String national_minutes_unitrate) {
		this.national_minutes_unitrate = national_minutes_unitrate;
	}
	public String getNational_minutes_was() {
		return national_minutes_was;
	}
	public void setNational_minutes_was(String national_minutes_was) {
		this.national_minutes_was = national_minutes_was;
	}
	public String getNational_minutes_discount() {
		return national_minutes_discount;
	}
	public void setNational_minutes_discount(String national_minutes_discount) {
		this.national_minutes_discount = national_minutes_discount;
	} 

}
