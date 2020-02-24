package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanAddon {

	@XmlAttribute
    private String addonRefid;
	@XmlAttribute
    private String add_on_code;
    @XmlAttribute
    private String add_on_group;
    @XmlAttribute
    private String add_on_name;
    @XmlAttribute
    private String bucket;
    @XmlAttribute
    private String permanent_promo;
    @XmlAttribute
    private String promo_on_flag;
    @XmlAttribute
    private String validity_unit;
    @XmlAttribute
    private String validity_count;
    @XmlAttribute
    private String allowance;
    @XmlAttribute
    private String allowance_unit;
    @XmlAttribute
    private String allowance_description;
    @XmlAttribute
    private String price;
    @XmlAttribute
    private String text;
    @XmlAttribute
    private String rate_per_unit;
    @XmlAttribute
    private String code_parent_plan;
    @XmlAttribute
    private String associated_list;
    @XmlAttribute
    private String ib_oob;
	/**
	 * @return the add_on_code
	 */
	public String getAdd_on_code() {
		return add_on_code;
	}
	/**
	 * @param add_on_code the add_on_code to set
	 */
	public void setAdd_on_code(String add_on_code) {
		this.add_on_code = add_on_code;
	}
	/**
	 * @return the add_on_group
	 */
	public String getAdd_on_group() {
		return add_on_group;
	}
	/**
	 * @param add_on_group the add_on_group to set
	 */
	public void setAdd_on_group(String add_on_group) {
		this.add_on_group = add_on_group;
	}
	/**
	 * @return the add_on_name
	 */
	public String getAdd_on_name() {
		return add_on_name;
	}
	/**
	 * @param add_on_name the add_on_name to set
	 */
	public void setAdd_on_name(String add_on_name) {
		this.add_on_name = add_on_name;
	}
	/**
	 * @return the bucket
	 */
	public String getBucket() {
		return bucket;
	}
	/**
	 * @param bucket the bucket to set
	 */
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	/**
	 * @return the permanent_promo
	 */
	public String getPermanent_promo() {
		return permanent_promo;
	}
	/**
	 * @param permanent_promo the permanent_promo to set
	 */
	public void setPermanent_promo(String permanent_promo) {
		this.permanent_promo = permanent_promo;
	}
	/**
	 * @return the promo_on_flag
	 */
	public String getPromo_on_flag() {
		return promo_on_flag;
	}
	/**
	 * @param promo_on_flag the promo_on_flag to set
	 */
	public void setPromo_on_flag(String promo_on_flag) {
		this.promo_on_flag = promo_on_flag;
	}
	/**
	 * @return the validity_unit
	 */
	public String getValidity_unit() {
		return validity_unit;
	}
	/**
	 * @param validity_unit the validity_unit to set
	 */
	public void setValidity_unit(String validity_unit) {
		this.validity_unit = validity_unit;
	}
	/**
	 * @return the validity_count
	 */
	public String getValidity_count() {
		return validity_count;
	}
	/**
	 * @param validity_count the validity_count to set
	 */
	public void setValidity_count(String validity_count) {
		this.validity_count = validity_count;
	}
	/**
	 * @return the allowance
	 */
	public String getAllowance() {
		return allowance;
	}
	/**
	 * @param allowance the allowance to set
	 */
	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}
	/**
	 * @return the allowance_unit
	 */
	public String getAllowance_unit() {
		return allowance_unit;
	}
	/**
	 * @param allowance_unit the allowance_unit to set
	 */
	public void setAllowance_unit(String allowance_unit) {
		this.allowance_unit = allowance_unit;
	}
	/**
	 * @return the allowance_description
	 */
	public String getAllowance_description() {
		return allowance_description;
	}
	/**
	 * @param allowance_description the allowance_description to set
	 */
	public void setAllowance_description(String allowance_description) {
		this.allowance_description = allowance_description;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the rate_per_unit
	 */
	public String getRate_per_unit() {
		return rate_per_unit;
	}
	/**
	 * @param rate_per_unit the rate_per_unit to set
	 */
	public void setRate_per_unit(String rate_per_unit) {
		this.rate_per_unit = rate_per_unit;
	}
	/**
	 * @return the code_parent_plan
	 */
	public String getCode_parent_plan() {
		return code_parent_plan;
	}
	/**
	 * @param code_parent_plan the code_parent_plan to set
	 */
	public void setCode_parent_plan(String code_parent_plan) {
		this.code_parent_plan = code_parent_plan;
	}
	/**
	 * @return the associated_list
	 */
	public String getAssociated_list() {
		return associated_list;
	}
	/**
	 * @param associated_list the associated_list to set
	 */
	public void setAssociated_list(String associated_list) {
		this.associated_list = associated_list;
	}
	/**
	 * @return the ib_oob
	 */
	public String getIb_oob() {
		return ib_oob;
	}
	/**
	 * @param ib_oob the ib_oob to set
	 */
	public void setIb_oob(String ib_oob) {
		this.ib_oob = ib_oob;
	}
	/**
	 * @return the addonRefid
	 */
	public String getAddonRefid() {
		return addonRefid;
	}
	/**
	 * @param addonRefid the addonRefid to set
	 */
	public void setAddonRefid(String addonRefid) {
		this.addonRefid = addonRefid;
	}
	
}
