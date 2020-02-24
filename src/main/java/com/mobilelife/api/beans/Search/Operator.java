package com.mobilelife.api.beans.Search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "operator")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operator {
    @XmlAttribute
	private String operators_id;

    @XmlAttribute
	private String operators_name;

    
    /**
	 * @return the operators_id
	 */
	public String getOperators_id() {
		return operators_id;
	}

	/**
	 * @param operators_id the operators_id to set
	 */
	public void setOperators_id(String operators_id) {
		this.operators_id = operators_id;
	}

	/**
	 * @return the operators_name
	 */
	public String getOperators_name() {
		return operators_name;
	}

	/**
	 * @param operators_name the operators_name to set
	 */
	public void setOperators_name(String operators_name) {
		this.operators_name = operators_name;
	}

}
