package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanNationalMinOffnet {

    @XmlAttribute
	private String national_minutes_offnet; 
    @XmlAttribute
	private String national_minutes_offnet_unitrate; 
    @XmlAttribute
	private String national_minutes_rollover;
	/**
	 * @return the national_minutes_offnet
	 */
	public String getNational_minutes_offnet() {
		return national_minutes_offnet;
	}
	/**
	 * @param national_minutes_offnet the national_minutes_offnet to set
	 */
	public void setNational_minutes_offnet(String national_minutes_offnet) {
		this.national_minutes_offnet = national_minutes_offnet;
	}
	/**
	 * @return the national_minutes_offnet_unitrate
	 */
	public String getNational_minutes_offnet_unitrate() {
		return national_minutes_offnet_unitrate;
	}
	/**
	 * @param national_minutes_offnet_unitrate the national_minutes_offnet_unitrate to set
	 */
	public void setNational_minutes_offnet_unitrate(String national_minutes_offnet_unitrate) {
		this.national_minutes_offnet_unitrate = national_minutes_offnet_unitrate;
	}
	/**
	 * @return the national_minutes_rollover
	 */
	public String getNational_minutes_rollover() {
		return national_minutes_rollover;
	}
	/**
	 * @param national_minutes_rollover the national_minutes_rollover to set
	 */
	public void setNational_minutes_rollover(String national_minutes_rollover) {
		this.national_minutes_rollover = national_minutes_rollover;
	} 

}
