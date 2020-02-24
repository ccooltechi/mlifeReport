package com.mobilelife.api.beans.operator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanType {

    @XmlAttribute
    private String plan_type; 
    @XmlAttribute
    private String operator_id;
    @XmlAttribute
    private String planType_id;
	/**
	 * @return the plan_type
	 */
	public String getPlan_type() {
		return plan_type;
	}
	/**
	 * @param plan_type the plan_type to set
	 */
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	/**
	 * @return the operator_id
	 */
	public String getOperator_id() {
		return operator_id;
	}
	/**
	 * @param operator_id the operator_id to set
	 */
	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}
	/**
	 * @return the planType_id
	 */
	public String getPlanType_id() {
		return planType_id;
	}
	/**
	 * @param planType_id the planType_id to set
	 */
	public void setPlanType_id(String planType_id) {
		this.planType_id = planType_id;
	} 

}
