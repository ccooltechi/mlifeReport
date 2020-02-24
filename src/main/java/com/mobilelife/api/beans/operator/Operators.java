package com.mobilelife.api.beans.operator;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Operators")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operators {

    @XmlElement
	private List<Operator> internation_min;

	/**
	 * @return the internation_min
	 */
	public List<Operator> getInternation_min() {
		return internation_min;
	}

	/**
	 * @param internation_min the internation_min to set
	 */
	public void setInternation_min(List<Operator> internation_min) {
		this.internation_min = internation_min;
	}

}
