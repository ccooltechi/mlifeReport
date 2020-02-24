package com.mobilelife.api.beans.Search;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "operators")
@XmlAccessorType(XmlAccessType.FIELD)
public class OperatorFilter {

    @XmlElement
	private List<Operator> operator;

	/**
	 * @return the operator
	 */
	public List<Operator> getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(List<Operator> operator) {
		this.operator = operator;
	}

    
}
