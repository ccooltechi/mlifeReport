package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanLocalMms {

    @XmlAttribute
    private String local_mms;
    @XmlAttribute
    private String local_mms_unitrate;
	/**
	 * @return the local_mms
	 */
	public String getLocal_mms() {
		return local_mms;
	}
	/**
	 * @param local_mms the local_mms to set
	 */
	public void setLocal_mms(String local_mms) {
		this.local_mms = local_mms;
	}
	/**
	 * @return the local_mms_unitrate
	 */
	public String getLocal_mms_unitrate() {
		return local_mms_unitrate;
	}
	/**
	 * @param local_mms_unitrate the local_mms_unitrate to set
	 */
	public void setLocal_mms_unitrate(String local_mms_unitrate) {
		this.local_mms_unitrate = local_mms_unitrate;
	} 

}
