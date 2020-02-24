package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MisFeatures")
@XmlAccessorType(XmlAccessType.FIELD)
public class MisFeatures {

    @XmlElement
    private FeatureDetails[] features;

	/**
	 * @return the features
	 */
	public FeatureDetails[] getFeatures() {
		return features;
	}

	/**
	 * @param features the features to set
	 */
	public void setFeatures(FeatureDetails[] features) {
		this.features = features;
	}

    
}
