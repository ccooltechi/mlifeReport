package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanNationalMinOnnet {

    @XmlAttribute
    private String national_minutes_onnet;
    @XmlAttribute
    private String national_minutes_onnet_unitrate ;
	/**
	 * @return the national_minutes_onnet
	 */
	public String getNational_minutes_onnet() {
		return national_minutes_onnet;
	}
	/**
	 * @param national_minutes_onnet the national_minutes_onnet to set
	 */
	public void setNational_minutes_onnet(String national_minutes_onnet) {
		this.national_minutes_onnet = national_minutes_onnet;
	}
	/**
	 * @return the national_minutes_onnet_unitrate
	 */
	public String getNational_minutes_onnet_unitrate() {
		return national_minutes_onnet_unitrate;
	}
	/**
	 * @param national_minutes_onnet_unitrate the national_minutes_onnet_unitrate to set
	 */
	public void setNational_minutes_onnet_unitrate(String national_minutes_onnet_unitrate) {
		this.national_minutes_onnet_unitrate = national_minutes_onnet_unitrate;
	}

}
