package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class Roamingdata {

    @XmlAttribute
    private String roaming_data;

    @XmlAttribute
    private String data_speed;

	public String getRoaming_data() {
		return roaming_data;
	}

	public void setRoaming_data(String roaming_data) {
		this.roaming_data = roaming_data;
	}

	public String getData_speed() {
		return data_speed;
	}

	public void setData_speed(String data_speed) {
		this.data_speed = data_speed;
	}
}
