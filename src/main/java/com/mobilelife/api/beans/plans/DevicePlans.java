package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deviceplans")
@XmlAccessorType(XmlAccessType.FIELD)
public class DevicePlans {

    @XmlAttribute
	private String plan_mis_details;
    @XmlAttribute
	private String wifi_plan;
    @XmlAttribute
	private String social_data;
    @XmlAttribute
	private String data_bundel;
    @XmlAttribute
	private String flexi_details;
    @XmlAttribute
	private String plan_outof_bundel;
    @XmlAttribute
	private String national_min;
    @XmlAttribute
	private String roaming_incoming_min;
    @XmlAttribute
	private String national_min_offnet;
    @XmlAttribute
	private String plan_preff_number;
    @XmlAttribute
	private String international_sms;
    @XmlAttribute
	private String plan_fee;
    @XmlAttribute
	private String mis_features;
    @XmlAttribute
	private String plan_id;
    @XmlAttribute
	private String plan_url;
    @XmlAttribute
	private String planRefid;

    public String getPlan_mis_details() {
		return plan_mis_details;
	}
	public void setPlan_mis_details(String plan_mis_details) {
		this.plan_mis_details = plan_mis_details;
	}
	public String getWifi_plan() {
		return wifi_plan;
	}
	public void setWifi_plan(String wifi_plan) {
		this.wifi_plan = wifi_plan;
	}
	public String getSocial_data() {
		return social_data;
	}
	public void setSocial_data(String social_data) {
		this.social_data = social_data;
	}
	public String getData_bundel() {
		return data_bundel;
	}
	public void setData_bundel(String data_bundel) {
		this.data_bundel = data_bundel;
	}
	public String getFlexi_details() {
		return flexi_details;
	}
	public void setFlexi_details(String flexi_details) {
		this.flexi_details = flexi_details;
	}
	public String getPlan_outof_bundel() {
		return plan_outof_bundel;
	}
	public void setPlan_outof_bundel(String plan_outof_bundel) {
		this.plan_outof_bundel = plan_outof_bundel;
	}
	public String getNational_min() {
		return national_min;
	}
	public void setNational_min(String national_min) {
		this.national_min = national_min;
	}
	public String getRoaming_incoming_min() {
		return roaming_incoming_min;
	}
	public void setRoaming_incoming_min(String roaming_incoming_min) {
		this.roaming_incoming_min = roaming_incoming_min;
	}
	public String getNational_min_offnet() {
		return national_min_offnet;
	}
	public void setNational_min_offnet(String national_min_offnet) {
		this.national_min_offnet = national_min_offnet;
	}
	public String getPlan_preff_number() {
		return plan_preff_number;
	}
	public void setPlan_preff_number(String plan_preff_number) {
		this.plan_preff_number = plan_preff_number;
	}
	public String getInternational_sms() {
		return international_sms;
	}
	public void setInternational_sms(String international_sms) {
		this.international_sms = international_sms;
	}
	public String getPlan_fee() {
		return plan_fee;
	}
	public void setPlan_fee(String plan_fee) {
		this.plan_fee = plan_fee;
	}
	public String getMis_features() {
		return mis_features;
	}
	public void setMis_features(String mis_features) {
		this.mis_features = mis_features;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_url() {
		return plan_url;
	}
	public void setPlan_url(String plan_url) {
		this.plan_url = plan_url;
	}
	public String getPlanRefid() {
		return planRefid;
	}
	public void setPlanRefid(String planRefid) {
		this.planRefid = planRefid;
	}
	
}
