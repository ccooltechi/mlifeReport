package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanFaqs {

    @XmlElement
	private List<PlanFaq> planFaq;

	public List<PlanFaq> getPlanFaq() {
		return planFaq;
	}

	public void setPlanFaq(List<PlanFaq> planFaq) {
		this.planFaq = planFaq;
	}
    
}
