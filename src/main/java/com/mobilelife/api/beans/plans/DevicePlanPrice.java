package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAttribute;

public class DevicePlanPrice {

    @XmlAttribute
	private String commitment;
    @XmlAttribute
	private String cost;
    @XmlAttribute
	private String commitmentUnit;
	/**
	 * @return the commitment
	 */
	public String getCommitment() {
		return commitment;
	}
	/**
	 * @param commitment the commitment to set
	 */
	public void setCommitment(String commitment) {
		this.commitment = commitment;
	}
	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}
	/**
	 * @return the commitmentUnit
	 */
	public String getCommitmentUnit() {
		return commitmentUnit;
	}
	/**
	 * @param commitmentUnit the commitmentUnit to set
	 */
	public void setCommitmentUnit(String commitmentUnit) {
		this.commitmentUnit = commitmentUnit;
	}
    
    
}
