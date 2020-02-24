package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "feedback")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feedback {

    @XmlAttribute
	private String planreffid ;

    @XmlAttribute
	private String rating ;

    @XmlAttribute
	private String remarks ;

	/**
	 * @return the planreffid
	 */
	public String getPlanreffid() {
		return planreffid;
	}

	/**
	 * @param planreffid the planreffid to set
	 */
	public void setPlanreffid(String planreffid) {
		this.planreffid = planreffid;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
}
