package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "plans")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobilePlans{

    @XmlAttribute
	private String operator_name="";
    @XmlAttribute
	private String planRefid="";
    @XmlAttribute
	private String plan_id="";
    @XmlAttribute
	private String plan_name="";
    @XmlAttribute
	private String plan_start_date="";
    @XmlAttribute
	private String plan_end_date="";
    @XmlAttribute
	private String plan_url="";
    @XmlAttribute
	private String plan_type="";
    @XmlAttribute
	private String is_tax_included="";
    @XmlAttribute
	private String plan_validity="";
    @XmlAttribute
	private String plan_validity_unit="";
    @XmlAttribute
	private String contract_period="";
    @XmlAttribute
	private String contract_period_unit="";
    @XmlAttribute
	private String topupsallowed_flag="";
    @XmlAttribute
	private String number_of_multi_sims="";
    @XmlAttribute
    private String rechargeFrequency="";
    @XmlAttribute
    private String recharge_frequency_unit="";
    @XmlAttribute
    private String rating="";
    @XmlAttribute
    private String totalfeedback="";
    @XmlAttribute
    private String saveingAmt="";
    @XmlAttribute
    private String saveingPer="";

    @XmlAttribute
	private String plan_longname;
    @XmlAttribute
	private String recurring_bundle;
    @XmlAttribute
	private String one_time_addon;
    @XmlAttribute
	private String discount_text;
    @XmlAttribute
	private String planVatPer;
    @XmlAttribute
    private String addOnBucket;
    @XmlAttribute
    private String addOnParent;
    @XmlAttribute
    private String addOnStatus;

    @XmlAttribute
	private String autorenew;
	
    @XmlAttribute
    private boolean supportRetail= false;
    @XmlAttribute
    private boolean supportOnline= false;
    @XmlAttribute
    private boolean isDiscountedUpfrontPayment= false;

    @XmlElement
	private PlanFee plan_fee;
    @XmlElement
	private PlanFlexi flexi_details;
    @XmlElement
	private PlanInternationSms international_sms;
    @XmlElement
	private PlanInternationMin international_min;
    @XmlElement
	private PlanLocalCall local_call;
    @XmlElement
	private PlanData data_bundel;
    
    @XmlElement
    private PlanInterationalCallSms international_call_sms;
    @XmlElement
    private PlanInternationalMms international_mms;
    @XmlElement
    private PlanInternationalVideoCall international_video_call;
    @XmlElement
    private PlanLocalMms local_mms;
    @XmlElement
    private PlanLocalSms localsms;
    @XmlElement
    private PlanLocalSmsOffnet local_sms_offnet;
    @XmlElement
    private PlanLocalSmsOnnet local_sms_onnet;
    @XmlElement
    private PlanLocalVideoCall local_video_call;
    @XmlElement
    private PlanMiscellaneous plan_mis_details;
    @XmlElement
    private PlanNationalMin national_min;
    @XmlElement
    private PlanNationalMinOffnet national_min_offnet;
    @XmlElement
    private PlanNationalMinOnnet natonal_min_onnet;
    @XmlElement
    private PlanOutOfBundle plan_outof_bundel;
    @XmlElement
    private PlanPreferredNumbers plan_preff_number;
    @XmlElement
    private PlanRoamingData roaming_data;
    @XmlElement
    private PlanRoamingIncomingMins roaming_incoming_min; 
    @XmlElement
    private PlanRoamingOutgoingMins roaming_outgoing_min;
    @XmlElement
    private PlanWifi wifi_plan;
    @XmlElement
    private Plansocialdata social_data;
    @XmlElement
    private Addons addons;

    @XmlElement
    private MisFeatures mis_features;

    @XmlAttribute
    private String planCost="";
    @XmlAttribute
    private String discount;
    @XmlAttribute
    private String diamondNumber;
    @XmlAttribute
    private String priority="";

    @XmlAttribute
	private String plan_category="";

    @XmlElement
    private PlanBuckets planBuckets;

    @XmlElement
	private PlanFaqs planFaqs;

    @XmlElement
    private Roamingdata addon_roaming_data;

    @XmlElement
    private Specialminutes addon_special_minutes;

	/**
	 * @return the operator_name
	 */
	public String getOperator_name() {
		return operator_name;
	}
	/**
	 * @param operator_name the operator_name to set
	 */
	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}
	/**
	 * @return the plan_id
	 */
	public String getPlan_id() {
		return plan_id;
	}
	/**
	 * @param plan_id the plan_id to set
	 */
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	/**
	 * @return the plan_name
	 */
	public String getPlan_name() {
		return plan_name;
	}
	/**
	 * @param plan_name the plan_name to set
	 */
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	/**
	 * @return the plan_start_date
	 */
	public String getPlan_start_date() {
		return plan_start_date;
	}
	/**
	 * @param plan_start_date the plan_start_date to set
	 */
	public void setPlan_start_date(String plan_start_date) {
		this.plan_start_date = plan_start_date;
	}
	/**
	 * @return the plan_end_date
	 */
	public String getPlan_end_date() {
		return plan_end_date;
	}
	/**
	 * @param plan_end_date the plan_end_date to set
	 */
	public void setPlan_end_date(String plan_end_date) {
		this.plan_end_date = plan_end_date;
	}
	/**
	 * @return the plan_url
	 */
	public String getPlan_url() {
		return plan_url;
	}
	/**
	 * @param plan_url the plan_url to set
	 */
	public void setPlan_url(String plan_url) {
		this.plan_url = plan_url;
	}
	/**
	 * @return the plan_type
	 */
	public String getPlan_type() {
		return plan_type;
	}
	/**
	 * @param plan_type the plan_type to set
	 */
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	/**
	 * @return the is_tax_included
	 */
	public String getIs_tax_included() {
		return is_tax_included;
	}
	/**
	 * @param is_tax_included the is_tax_included to set
	 */
	public void setIs_tax_included(String is_tax_included) {
		this.is_tax_included = is_tax_included;
	}
	/**
	 * @return the plan_validity
	 */
	public String getPlan_validity() {
		return plan_validity;
	}
	/**
	 * @param plan_validity the plan_validity to set
	 */
	public void setPlan_validity(String plan_validity) {
		this.plan_validity = plan_validity;
	}
	/**
	 * @return the plan_validity_unit
	 */
	public String getPlan_validity_unit() {
		return plan_validity_unit;
	}
	/**
	 * @param plan_validity_unit the plan_validity_unit to set
	 */
	public void setPlan_validity_unit(String plan_validity_unit) {
		this.plan_validity_unit = plan_validity_unit;
	}
	/**
	 * @return the contract_period
	 */
	public String getContract_period() {
		return contract_period;
	}
	/**
	 * @param contract_period the contract_period to set
	 */
	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}
	/**
	 * @return the contract_period_unit
	 */
	public String getContract_period_unit() {
		return contract_period_unit;
	}
	/**
	 * @param contract_period_unit the contract_period_unit to set
	 */
	public void setContract_period_unit(String contract_period_unit) {
		this.contract_period_unit = contract_period_unit;
	}
	/**
	 * @return the topupsallowed_flag
	 */
	public String getTopupsallowed_flag() {
		return topupsallowed_flag;
	}
	/**
	 * @param topupsallowed_flag the topupsallowed_flag to set
	 */
	public void setTopupsallowed_flag(String topupsallowed_flag) {
		this.topupsallowed_flag = topupsallowed_flag;
	}
	/**
	 * @return the number_of_multi_sims
	 */
	public String getNumber_of_multi_sims() {
		return number_of_multi_sims;
	}
	/**
	 * @param number_of_multi_sims the number_of_multi_sims to set
	 */
	public void setNumber_of_multi_sims(String number_of_multi_sims) {
		this.number_of_multi_sims = number_of_multi_sims;
	}
	/**
	 * @return the plan_fee
	 */
	public PlanFee getPlan_fee() {
		return plan_fee;
	}
	/**
	 * @param plan_fee the plan_fee to set
	 */
	public void setPlan_fee(PlanFee plan_fee) {
		this.plan_fee = plan_fee;
	}
	/**
	 * @return the flexi_details
	 */
	public PlanFlexi getFlexi_details() {
		return flexi_details;
	}
	/**
	 * @param flexi_details the flexi_details to set
	 */
	public void setFlexi_details(PlanFlexi flexi_details) {
		this.flexi_details = flexi_details;
	}
	/**
	 * @return the internation_sms
	 */
	public PlanInternationSms getInternational_sms() {
		return international_sms;
	}
	/**
	 * @param internation_sms the internation_sms to set
	 */
	public void setInternational_sms(PlanInternationSms internation_sms) {
		this.international_sms = internation_sms;
	}
	/**
	 * @return the internation_min
	 */
	public PlanInternationMin getInternational_min() {
		return international_min;
	}
	/**
	 * @param internation_min the internation_min to set
	 */
	public void setInternational_min(PlanInternationMin internation_min) {
		this.international_min = internation_min;
	}
	/**
	 * @return the local_call
	 */
	public PlanLocalCall getLocal_call() {
		return local_call;
	}
	/**
	 * @param local_call the local_call to set
	 */
	public void setLocal_call(PlanLocalCall local_call) {
		this.local_call = local_call;
	}
	/**
	 * @return the data_bundel
	 */
	public PlanData getData_bundel() {
		return data_bundel;
	}
	/**
	 * @param data_bundel the data_bundel to set
	 */
	public void setData_bundel(PlanData data_bundel) {
		this.data_bundel = data_bundel;
	}
	/**
	 * @return the international_call_sms
	 */
	public PlanInterationalCallSms getInternational_call_sms() {
		return international_call_sms;
	}
	/**
	 * @param international_call_sms the international_call_sms to set
	 */
	public void setInternational_call_sms(PlanInterationalCallSms international_call_sms) {
		this.international_call_sms = international_call_sms;
	}
	/**
	 * @return the international_mms
	 */
	public PlanInternationalMms getInternational_mms() {
		return international_mms;
	}
	/**
	 * @param international_mms the international_mms to set
	 */
	public void setInternational_mms(PlanInternationalMms international_mms) {
		this.international_mms = international_mms;
	}
	/**
	 * @return the international_video_call
	 */
	public PlanInternationalVideoCall getInternational_video_call() {
		return international_video_call;
	}
	/**
	 * @param international_video_call the international_video_call to set
	 */
	public void setInternational_video_call(PlanInternationalVideoCall international_video_call) {
		this.international_video_call = international_video_call;
	}
	/**
	 * @return the local_mms
	 */
	public PlanLocalMms getLocal_mms() {
		return local_mms;
	}
	/**
	 * @param local_mms the local_mms to set
	 */
	public void setLocal_mms(PlanLocalMms local_mms) {
		this.local_mms = local_mms;
	}
	/**
	 * @return the localsms
	 */
	public PlanLocalSms getLocalsms() {
		return localsms;
	}
	/**
	 * @param localsms the localsms to set
	 */
	public void setLocalsms(PlanLocalSms localsms) {
		this.localsms = localsms;
	}
	/**
	 * @return the local_sms_offnet
	 */
	public PlanLocalSmsOffnet getLocal_sms_offnet() {
		return local_sms_offnet;
	}
	/**
	 * @param local_sms_offnet the local_sms_offnet to set
	 */
	public void setLocal_sms_offnet(PlanLocalSmsOffnet local_sms_offnet) {
		this.local_sms_offnet = local_sms_offnet;
	}
	/**
	 * @return the local_sms_onnet
	 */
	public PlanLocalSmsOnnet getLocal_sms_onnet() {
		return local_sms_onnet;
	}
	/**
	 * @param local_sms_onnet the local_sms_onnet to set
	 */
	public void setLocal_sms_onnet(PlanLocalSmsOnnet local_sms_onnet) {
		this.local_sms_onnet = local_sms_onnet;
	}
	/**
	 * @return the local_video_call
	 */
	public PlanLocalVideoCall getLocal_video_call() {
		return local_video_call;
	}
	/**
	 * @param local_video_call the local_video_call to set
	 */
	public void setLocal_video_call(PlanLocalVideoCall local_video_call) {
		this.local_video_call = local_video_call;
	}
	/**
	 * @return the plan_mis_details
	 */
	public PlanMiscellaneous getPlan_mis_details() {
		return plan_mis_details;
	}
	/**
	 * @param plan_mis_details the plan_mis_details to set
	 */
	public void setPlan_mis_details(PlanMiscellaneous plan_mis_details) {
		this.plan_mis_details = plan_mis_details;
	}
	/**
	 * @return the national_min
	 */
	public PlanNationalMin getNational_min() {
		return national_min;
	}
	/**
	 * @param national_min the national_min to set
	 */
	public void setNational_min(PlanNationalMin national_min) {
		this.national_min = national_min;
	}
	/**
	 * @return the national_min_offnet
	 */
	public PlanNationalMinOffnet getNational_min_offnet() {
		return national_min_offnet;
	}
	/**
	 * @param national_min_offnet the national_min_offnet to set
	 */
	public void setNational_min_offnet(PlanNationalMinOffnet national_min_offnet) {
		this.national_min_offnet = national_min_offnet;
	}
	/**
	 * @return the natonal_min_onnet
	 */
	public PlanNationalMinOnnet getNatonal_min_onnet() {
		return natonal_min_onnet;
	}
	/**
	 * @param natonal_min_onnet the natonal_min_onnet to set
	 */
	public void setNatonal_min_onnet(PlanNationalMinOnnet natonal_min_onnet) {
		this.natonal_min_onnet = natonal_min_onnet;
	}
	/**
	 * @return the plan_outof_bundel
	 */
	public PlanOutOfBundle getPlan_outof_bundel() {
		return plan_outof_bundel;
	}
	/**
	 * @param plan_outof_bundel the plan_outof_bundel to set
	 */
	public void setPlan_outof_bundel(PlanOutOfBundle plan_outof_bundel) {
		this.plan_outof_bundel = plan_outof_bundel;
	}
	/**
	 * @return the plan_preff_number
	 */
	public PlanPreferredNumbers getPlan_preff_number() {
		return plan_preff_number;
	}
	/**
	 * @param plan_preff_number the plan_preff_number to set
	 */
	public void setPlan_preff_number(PlanPreferredNumbers plan_preff_number) {
		this.plan_preff_number = plan_preff_number;
	}
	/**
	 * @return the roaming_data
	 */
	public PlanRoamingData getRoaming_data() {
		return roaming_data;
	}
	/**
	 * @param roaming_data the roaming_data to set
	 */
	public void setRoaming_data(PlanRoamingData roaming_data) {
		this.roaming_data = roaming_data;
	}
	/**
	 * @return the roaming_incoming_min
	 */
	public PlanRoamingIncomingMins getRoaming_incoming_min() {
		return roaming_incoming_min;
	}
	/**
	 * @param roaming_incoming_min the roaming_incoming_min to set
	 */
	public void setRoaming_incoming_min(PlanRoamingIncomingMins roaming_incoming_min) {
		this.roaming_incoming_min = roaming_incoming_min;
	}
	/**
	 * @return the roaming_outgoing_min
	 */
	public PlanRoamingOutgoingMins getRoaming_outgoing_min() {
		return roaming_outgoing_min;
	}
	/**
	 * @param roaming_outgoing_min the roaming_outgoing_min to set
	 */
	public void setRoaming_outgoing_min(PlanRoamingOutgoingMins roaming_outgoing_min) {
		this.roaming_outgoing_min = roaming_outgoing_min;
	}
	/**
	 * @return the wifi_plan
	 */
	public PlanWifi getWifi_plan() {
		return wifi_plan;
	}
	/**
	 * @param wifi_plan the wifi_plan to set
	 */
	public void setWifi_plan(PlanWifi wifi_plan) {
		this.wifi_plan = wifi_plan;
	}
	/**
	 * @return the social_data
	 */
	public Plansocialdata getSocial_data() {
		return social_data;
	}
	/**
	 * @param social_data the social_data to set
	 */
	public void setSocial_data(Plansocialdata social_data) {
		this.social_data = social_data;
	}
	/**
	 * @return the rechargeFrequency
	 */
	public String getRechargeFrequency() {
		return rechargeFrequency;
	}
	/**
	 * @param rechargeFrequency the rechargeFrequency to set
	 */
	public void setRechargeFrequency(String rechargeFrequency) {
		this.rechargeFrequency = rechargeFrequency;
	}
	/**
	 * @return the addons
	 */
	public Addons getAddons() {
		return addons;
	}
	/**
	 * @param addons the addons to set
	 */
	public void setAddons(Addons addons) {
		this.addons = addons;
	}
	/**
	 * @return the planCost
	 */
	public String getPlanCost() {
		return planCost;
	}
	/**
	 * @param planCost the planCost to set
	 */
	public void setPlanCost(String planCost) {
		this.planCost = planCost;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the planRefid
	 */
	public String getPlanRefid() {
		return planRefid;
	}
	/**
	 * @param planRefid the planRefid to set
	 */
	public void setPlanRefid(String planRefid) {
		this.planRefid = planRefid;
	}
	/**
	 * @return the plan_category
	 */
	public String getPlan_category() {
		return plan_category;
	}
	/**
	 * @param plan_category the plan_category to set
	 */
	public void setPlan_category(String plan_category) {
		this.plan_category = plan_category;
	}
	/**
	 * @return the planBuckets
	 */
	public PlanBuckets getPlanBuckets() {
		return planBuckets;
	}
	/**
	 * @param planBuckets the planBuckets to set
	 */
	public void setPlanBuckets(PlanBuckets planBuckets) {
		this.planBuckets = planBuckets;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the totalfeedback
	 */
	public String getTotalfeedback() {
		return totalfeedback;
	}
	/**
	 * @param totalfeedback the totalfeedback to set
	 */
	public void setTotalfeedback(String totalfeedback) {
		this.totalfeedback = totalfeedback;
	}
	/**
	 * @return the saveingAmt
	 */
	public String getSaveingAmt() {
		return saveingAmt;
	}
	/**
	 * @param saveingAmt the saveingAmt to set
	 */
	public void setSaveingAmt(String saveingAmt) {
		this.saveingAmt = saveingAmt;
	}
	/**
	 * @return the saveingPer
	 */
	public String getSaveingPer() {
		return saveingPer;
	}
	/**
	 * @param saveingPer the saveingPer to set
	 */
	public void setSaveingPer(String saveingPer) {
		this.saveingPer = saveingPer;
	}
	/**
	 * @return the mis_features
	 */
	public MisFeatures getMis_features() {
		return mis_features;
	}
	/**
	 * @param mis_features the mis_features to set
	 */
	public void setMis_features(MisFeatures mis_features) {
		this.mis_features = mis_features;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiamondNumber() {
		return diamondNumber;
	}
	public void setDiamondNumber(String diamondNumber) {
		this.diamondNumber = diamondNumber;
	}
	public boolean isDiscountedUpfrontPayment() {
		return isDiscountedUpfrontPayment;
	}
	public void setDiscountedUpfrontPayment(boolean isDiscountedUpfrontPayment) {
		this.isDiscountedUpfrontPayment = isDiscountedUpfrontPayment;
	}
	public String getPlan_longname() {
		return plan_longname;
	}
	public void setPlan_longname(String plan_longname) {
		this.plan_longname = plan_longname;
	}
	public String getRecurring_bundle() {
		return recurring_bundle;
	}
	public void setRecurring_bundle(String recurring_bundle) {
		this.recurring_bundle = recurring_bundle;
	}
	public String getOne_time_addon() {
		return one_time_addon;
	}
	public void setOne_time_addon(String one_time_addon) {
		this.one_time_addon = one_time_addon;
	}
	public String getDiscount_text() {
		return discount_text;
	}
	public void setDiscount_text(String discount_text) {
		this.discount_text = discount_text;
	}
	public String getPlanVatPer() {
		return planVatPer;
	}
	public void setPlanVatPer(String planVatPer) {
		this.planVatPer = planVatPer;
	}
	public String getAutorenew() {
		return autorenew;
	}
	public void setAutorenew(String autorenew) {
		this.autorenew = autorenew;
	}
	public String getRecharge_frequency_unit() {
		return recharge_frequency_unit;
	}
	public void setRecharge_frequency_unit(String recharge_frequency_unit) {
		this.recharge_frequency_unit = recharge_frequency_unit;
	}
//	public String getOperatorTnc() {
//		return operatorTnc;
//	}
//	public void setOperatorTnc(String operatorTnc) {
//		this.operatorTnc = operatorTnc;
//	}
	public PlanFaqs getPlanFaqs() {
		return planFaqs;
	}
	public void setPlanFaqs(PlanFaqs planFaqs) {
		this.planFaqs = planFaqs;
	}
	
	public Roamingdata getAddon_roaming_data() {
		return addon_roaming_data;
	}
	public void setAddon_roaming_data(Roamingdata addon_roaming_data) {
		this.addon_roaming_data = addon_roaming_data;
	}
	public Specialminutes getAddon_special_minutes() {
		return addon_special_minutes;
	}
	public void setAddon_special_minutes(Specialminutes addon_special_minutes) {
		this.addon_special_minutes = addon_special_minutes;
	}
	public String getAddOnBucket() {
		return addOnBucket;
	}
	public void setAddOnBucket(String addOnBucket) {
		this.addOnBucket = addOnBucket;
	}
	public String getAddOnParent() {
		return addOnParent;
	}
	public void setAddOnParent(String addOnParent) {
		this.addOnParent = addOnParent;
	}
	public String getAddOnStatus() {
		return addOnStatus;
	}
	public void setAddOnStatus(String addOnStatus) {
		this.addOnStatus = addOnStatus;
	}
	public boolean isSupportRetail() {
		return supportRetail;
	}
	public void setSupportRetail(boolean supportRetail) {
		this.supportRetail = supportRetail;
	}
	public boolean isSupportOnline() {
		return supportOnline;
	}
	public void setSupportOnline(boolean supportOnline) {
		this.supportOnline = supportOnline;
	}
	
}
