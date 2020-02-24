package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Addons {

    @XmlElement
    private PlanAddon[] planAddon;

	/**
	 * @return the planAddon
	 */
	public PlanAddon[] getPlanAddon() {
		return planAddon;
	}

	/**
	 * @param planAddon the planAddon to set
	 */
	public void setPlanAddon(PlanAddon[] planAddon) {
		this.planAddon = planAddon;
	}
}
