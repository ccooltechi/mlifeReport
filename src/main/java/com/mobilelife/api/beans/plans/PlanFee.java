package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanFee {

	@XmlAttribute
	private String sim_activation_fee="";

    @XmlAttribute
	private int plan_monthly_fee;

    @XmlAttribute
	private int plan_monthly_fee_was;

	/**
	 * @return the sim_activation_fee
	 */
	public String getSim_activation_fee() {
		return sim_activation_fee;
	}

	/**
	 * @param sim_activation_fee the sim_activation_fee to set
	 */
	public void setSim_activation_fee(String sim_activation_fee) {
		this.sim_activation_fee = sim_activation_fee;
	}

	/**
	 * @return the plan_monthly_fee
	 */
	public int getPlan_monthly_fee() {
		return plan_monthly_fee;
	}

	/**
	 * @param plan_monthly_fee the plan_monthly_fee to set
	 */
	public void setPlan_monthly_fee(int plan_monthly_fee) {
		this.plan_monthly_fee = plan_monthly_fee;
	}

	public int getPlan_monthly_fee_was() {
		return plan_monthly_fee_was;
	}

	public void setPlan_monthly_fee_was(int plan_monthly_fee_was) {
		this.plan_monthly_fee_was = plan_monthly_fee_was;
	}
	
}
