package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanBucket {

    @XmlAttribute
	private String bucket_id;
    @XmlAttribute
	private String plan_group;
    @XmlAttribute
	private String bucket_name;
    @XmlAttribute
	private String foreignOperator;
    @XmlAttribute
	private String country_in_bundle;
    @XmlAttribute
	private String oob_rate;
    @XmlAttribute
	private String cal_intrabundle_rate;
    @XmlAttribute
	private String min_pluse;
    @XmlAttribute
	private String plan_bucket_label;
    @XmlAttribute
	private String country;
	/**
	 * @return the bucket_id
	 */
	public String getBucket_id() {
		return bucket_id;
	}
	/**
	 * @param bucket_id the bucket_id to set
	 */
	public void setBucket_id(String bucket_id) {
		this.bucket_id = bucket_id;
	}
	/**
	 * @return the plan_group
	 */
	public String getPlan_group() {
		return plan_group;
	}
	/**
	 * @param plan_group the plan_group to set
	 */
	public void setPlan_group(String plan_group) {
		this.plan_group = plan_group;
	}
	/**
	 * @return the bucket_name
	 */
	public String getBucket_name() {
		return bucket_name;
	}
	/**
	 * @param bucket_name the bucket_name to set
	 */
	public void setBucket_name(String bucket_name) {
		this.bucket_name = bucket_name;
	}
	/**
	 * @return the foreignOperator
	 */
	public String getForeignOperator() {
		return foreignOperator;
	}
	/**
	 * @param foreignOperator the foreignOperator to set
	 */
	public void setForeignOperator(String foreignOperator) {
		this.foreignOperator = foreignOperator;
	}
	/**
	 * @return the country_in_bundle
	 */
	public String getCountry_in_bundle() {
		return country_in_bundle;
	}
	/**
	 * @param country_in_bundle the country_in_bundle to set
	 */
	public void setCountry_in_bundle(String country_in_bundle) {
		this.country_in_bundle = country_in_bundle;
	}
	/**
	 * @return the oob_rate
	 */
	public String getOob_rate() {
		return oob_rate;
	}
	/**
	 * @param oob_rate the oob_rate to set
	 */
	public void setOob_rate(String oob_rate) {
		this.oob_rate = oob_rate;
	}
	/**
	 * @return the cal_intrabundle_rate
	 */
	public String getCal_intrabundle_rate() {
		return cal_intrabundle_rate;
	}
	/**
	 * @param cal_intrabundle_rate the cal_intrabundle_rate to set
	 */
	public void setCal_intrabundle_rate(String cal_intrabundle_rate) {
		this.cal_intrabundle_rate = cal_intrabundle_rate;
	}
	/**
	 * @return the min_pluse
	 */
	public String getMin_pluse() {
		return min_pluse;
	}
	/**
	 * @param min_pluse the min_pluse to set
	 */
	public void setMin_pluse(String min_pluse) {
		this.min_pluse = min_pluse;
	}
	/**
	 * @return the plan_bucket_label
	 */
	public String getPlan_bucket_label() {
		return plan_bucket_label;
	}
	/**
	 * @param plan_bucket_label the plan_bucket_label to set
	 */
	public void setPlan_bucket_label(String plan_bucket_label) {
		this.plan_bucket_label = plan_bucket_label;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
