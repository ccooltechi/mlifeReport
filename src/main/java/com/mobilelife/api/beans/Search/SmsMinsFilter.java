package com.mobilelife.api.beans.Search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sms_mins")
@XmlAccessorType(XmlAccessType.FIELD)
public class SmsMinsFilter {

    @XmlAttribute
	private String flexi;
    @XmlAttribute
	private String national;
    @XmlAttribute
	private String international;
	/**
	 * @return the flexi
	 */
	public String getFlexi() {
		return flexi;
	}
	/**
	 * @param flexi the flexi to set
	 */
	public void setFlexi(String flexi) {
		this.flexi = flexi;
	}
	/**
	 * @return the national
	 */
	public String getNational() {
		return national;
	}
	/**
	 * @param national the national to set
	 */
	public void setNational(String national) {
		this.national = national;
	}
	/**
	 * @return the international
	 */
	public String getInternational() {
		return international;
	}
	/**
	 * @param international the international to set
	 */
	public void setInternational(String international) {
		this.international = international;
	}
   
}
