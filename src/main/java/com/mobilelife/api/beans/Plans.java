package com.mobilelife.api.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "plans")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plans {

    @XmlAttribute
	private List<String> planids;

	/**
	 * @return the planids
	 */
	public List<String> getPlanids() {
		return planids;
	}

	/**
	 * @param planids the planids to set
	 */
	public void setPlanids(List<String> planids) {
		this.planids = planids;
	}
	
}
