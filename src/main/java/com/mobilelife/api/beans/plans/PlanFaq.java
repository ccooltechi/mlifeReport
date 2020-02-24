package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanFaq {

    @XmlAttribute
	private String plan_faq_title="";
    @XmlAttribute
	private String plan_faq_url="";
    
	public String getPlan_faq_title() {
		return plan_faq_title;
	}
	public void setPlan_faq_title(String plan_faq_title) {
		this.plan_faq_title = plan_faq_title;
	}
	public String getPlan_faq_url() {
		return plan_faq_url;
	}
	public void setPlan_faq_url(String plan_faq_url) {
		this.plan_faq_url = plan_faq_url;
	}

    
}
