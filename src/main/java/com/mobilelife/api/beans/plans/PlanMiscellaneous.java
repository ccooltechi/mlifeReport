package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanMiscellaneous {

    @XmlAttribute
    private String sim_activation_info ;
    @XmlAttribute
    private String added_benefits_info ;
    @XmlAttribute
    private String optional_benefits_info; 
    @XmlAttribute
    private String plan_activation_info; 
    @XmlAttribute
    private String peak_off_peak_info ;
    @XmlAttribute
    private String how_to_subscribe_info; 
    @XmlAttribute
    private String how_to_unsubscribe_info;
    @XmlAttribute
    private String early_termination_fees;
	/**
	 * @return the sim_activation_info
	 */
	public String getSim_activation_info() {
		return sim_activation_info;
	}
	/**
	 * @param sim_activation_info the sim_activation_info to set
	 */
	public void setSim_activation_info(String sim_activation_info) {
		this.sim_activation_info = sim_activation_info;
	}
	/**
	 * @return the added_benefits_info
	 */
	public String getAdded_benefits_info() {
		return added_benefits_info;
	}
	/**
	 * @param added_benefits_info the added_benefits_info to set
	 */
	public void setAdded_benefits_info(String added_benefits_info) {
		this.added_benefits_info = added_benefits_info;
	}
	/**
	 * @return the optional_benefits_info
	 */
	public String getOptional_benefits_info() {
		return optional_benefits_info;
	}
	/**
	 * @param optional_benefits_info the optional_benefits_info to set
	 */
	public void setOptional_benefits_info(String optional_benefits_info) {
		this.optional_benefits_info = optional_benefits_info;
	}
	/**
	 * @return the plan_activation_info
	 */
	public String getPlan_activation_info() {
		return plan_activation_info;
	}
	/**
	 * @param plan_activation_info the plan_activation_info to set
	 */
	public void setPlan_activation_info(String plan_activation_info) {
		this.plan_activation_info = plan_activation_info;
	}
	/**
	 * @return the peak_off_peak_info
	 */
	public String getPeak_off_peak_info() {
		return peak_off_peak_info;
	}
	/**
	 * @param peak_off_peak_info the peak_off_peak_info to set
	 */
	public void setPeak_off_peak_info(String peak_off_peak_info) {
		this.peak_off_peak_info = peak_off_peak_info;
	}
	/**
	 * @return the how_to_subscribe_info
	 */
	public String getHow_to_subscribe_info() {
		return how_to_subscribe_info;
	}
	/**
	 * @param how_to_subscribe_info the how_to_subscribe_info to set
	 */
	public void setHow_to_subscribe_info(String how_to_subscribe_info) {
		this.how_to_subscribe_info = how_to_subscribe_info;
	}
	/**
	 * @return the how_to_unsubscribe_info
	 */
	public String getHow_to_unsubscribe_info() {
		return how_to_unsubscribe_info;
	}
	/**
	 * @param how_to_unsubscribe_info the how_to_unsubscribe_info to set
	 */
	public void setHow_to_unsubscribe_info(String how_to_unsubscribe_info) {
		this.how_to_unsubscribe_info = how_to_unsubscribe_info;
	}
	/**
	 * @return the early_termination_fees
	 */
	public String getEarly_termination_fees() {
		return early_termination_fees;
	}
	/**
	 * @param early_termination_fees the early_termination_fees to set
	 */
	public void setEarly_termination_fees(String early_termination_fees) {
		this.early_termination_fees = early_termination_fees;
	}

}
