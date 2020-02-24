package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "features")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeatureDetails {

	@XmlAttribute
    private String feature_code;
    @XmlAttribute
    private String feature_icon;
    @XmlAttribute
    private String feature_name;
    @XmlAttribute
    private String feature_desc;
    
	/**
	 * @return the feature_code
	 */
	public String getFeature_code() {
		return feature_code;
	}
	/**
	 * @param feature_code the feature_code to set
	 */
	public void setFeature_code(String feature_code) {
		this.feature_code = feature_code;
	}
	/**
	 * @return the feature_icon
	 */
	public String getFeature_icon() {
		return feature_icon;
	}
	/**
	 * @param feature_icon the feature_icon to set
	 */
	public void setFeature_icon(String feature_icon) {
		this.feature_icon = feature_icon;
	}
	/**
	 * @return the feature_name
	 */
	public String getFeature_name() {
		return feature_name;
	}
	/**
	 * @param feature_name the feature_name to set
	 */
	public void setFeature_name(String feature_name) {
		this.feature_name = feature_name;
	}
	/**
	 * @return the feature_desc
	 */
	public String getFeature_desc() {
		return feature_desc;
	}
	/**
	 * @param feature_desc the feature_desc to set
	 */
	public void setFeature_desc(String feature_desc) {
		this.feature_desc = feature_desc;
	}
}
