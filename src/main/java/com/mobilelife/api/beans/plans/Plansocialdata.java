package com.mobilelife.api.beans.plans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plansocialdata implements Serializable {

    @XmlAttribute
    private String socialDataGb;
    @XmlAttribute
    private String socialDataUnitrate;
    @XmlAttribute
    private String socialDataInfo;
	/**
	 * @return the socialDataGb
	 */
	public String getSocialDataGb() {
		return socialDataGb;
	}
	/**
	 * @param socialDataGb the socialDataGb to set
	 */
	public void setSocialDataGb(String socialDataGb) {
		this.socialDataGb = socialDataGb;
	}
	/**
	 * @return the socialDataUnitrate
	 */
	public String getSocialDataUnitrate() {
		return socialDataUnitrate;
	}
	/**
	 * @param socialDataUnitrate the socialDataUnitrate to set
	 */
	public void setSocialDataUnitrate(String socialDataUnitrate) {
		this.socialDataUnitrate = socialDataUnitrate;
	}
	/**
	 * @return the socialDataInfo
	 */
	public String getSocialDataInfo() {
		return socialDataInfo;
	}
	/**
	 * @param socialDataInfo the socialDataInfo to set
	 */
	public void setSocialDataInfo(String socialDataInfo) {
		this.socialDataInfo = socialDataInfo;
	}
}
