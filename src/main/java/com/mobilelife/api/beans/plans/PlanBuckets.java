package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanBuckets {

    @XmlElement
	private List<PlanBucket> planBucket;

	/**
	 * @return the planBucket
	 */
	public List<PlanBucket> getPlanBucket() {
		return planBucket;
	}

	/**
	 * @param planBucket the planBucket to set
	 */
	public void setPlanBucket(List<PlanBucket> planBucket) {
		this.planBucket = planBucket;
	}

    
}
