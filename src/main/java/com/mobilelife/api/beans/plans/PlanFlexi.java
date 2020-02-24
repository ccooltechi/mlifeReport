package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanFlexi {

    @XmlAttribute
	private String flexi_minutes="";
    @XmlAttribute
	private String flexi_minutes_pulse="";
    @XmlAttribute
	private String flexi_minutes_rollover="";
    @XmlAttribute
	private String flexi_minutes_was;
    @XmlAttribute
	private String flexi_minutes_discount;

	/**
	 * @return the flexi_minutes
	 */
	public String getFlexi_minutes() {
		return flexi_minutes;
	}
	/**
	 * @param flexi_minutes the flexi_minutes to set
	 */
	public void setFlexi_minutes(String flexi_minutes) {
		this.flexi_minutes = flexi_minutes;
	}
	/**
	 * @return the flexi_minutes_pulse
	 */
	public String getFlexi_minutes_pulse() {
		return flexi_minutes_pulse;
	}
	/**
	 * @param flexi_minutes_pulse the flexi_minutes_pulse to set
	 */
	public void setFlexi_minutes_pulse(String flexi_minutes_pulse) {
		this.flexi_minutes_pulse = flexi_minutes_pulse;
	}
	/**
	 * @return the flexi_minutes_rollover
	 */
	public String getFlexi_minutes_rollover() {
		return flexi_minutes_rollover;
	}
	/**
	 * @param flexi_minutes_rollover the flexi_minutes_rollover to set
	 */
	public void setFlexi_minutes_rollover(String flexi_minutes_rollover) {
		this.flexi_minutes_rollover = flexi_minutes_rollover;
	}
	public String getFlexi_minutes_was() {
		return flexi_minutes_was;
	}
	public void setFlexi_minutes_was(String flexi_minutes_was) {
		this.flexi_minutes_was = flexi_minutes_was;
	}
	public String getFlexi_minutes_discount() {
		return flexi_minutes_discount;
	}
	public void setFlexi_minutes_discount(String flexi_minutes_discount) {
		this.flexi_minutes_discount = flexi_minutes_discount;
	}
	

}
