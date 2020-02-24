package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class Specialminutes {

    @XmlAttribute
    private String special_minutes;
    
    @XmlAttribute
    private String special_minutes_description;

	public String getSpecial_minutes() {
		return special_minutes;
	}

	public void setSpecial_minutes(String special_minutes) {
		this.special_minutes = special_minutes;
	}

	public String getSpecial_minutes_description() {
		return special_minutes_description;
	}

	public void setSpecial_minutes_description(String special_minutes_description) {
		this.special_minutes_description = special_minutes_description;
	}

}
