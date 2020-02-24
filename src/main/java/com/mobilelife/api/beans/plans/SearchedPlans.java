package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "searched_plans")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchedPlans {

    @XmlAttribute
	private String total_plans;

    @XmlAttribute
	private String currency;

    @XmlElement
	private List<Object> plans;

	/**
	 * @return the plans
	 */
	public List<Object> getPlans() {
		return plans;
	}

	/**
	 * @param plans the plans to set
	 */
	public void setPlans(List<Object> plans) {
		this.plans = plans;
	}

	/**
	 * @return the total_plans
	 */
	public String getTotal_plans() {
		return total_plans;
	}

	/**
	 * @param total_plans the total_plans to set
	 */
	public void setTotal_plans(String total_plans) {
		this.total_plans = total_plans;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
