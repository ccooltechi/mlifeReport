package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DevicePlansPlans {

    @XmlElement
    private List<DevicePlans> devieplans;

	public List<DevicePlans> getDevieplans() {
		return devieplans;
	}

	public void setDevieplans(List<DevicePlans> devieplans) {
		this.devieplans = devieplans;
	}
    
}
