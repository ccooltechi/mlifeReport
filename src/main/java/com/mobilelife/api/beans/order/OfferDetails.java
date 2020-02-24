package com.mobilelife.api.beans.order;

import javax.xml.bind.annotation.XmlAttribute;

public class OfferDetails {

    @XmlAttribute
    private String offer_id ;
    @XmlAttribute
    private String coupon_code ;
    @XmlAttribute
    private String coupon_name ;
    @XmlAttribute
    private String coupon_age_from ;
    @XmlAttribute
    private String coupon_age_to ;
    @XmlAttribute
    private String coupon_type ;
    @XmlAttribute
    private String coupon_value ;
    @XmlAttribute
    private String parterns_operator ;
    @XmlAttribute
    private String aliance_partner ;
    @XmlAttribute
    private String aliance_partner_logo ;
    @XmlAttribute
    private String aliance_partner_tnc ;
    @XmlAttribute
    private String aliance_campaign ;
    @XmlAttribute
    private String aliance_campaign_logo ;
    @XmlAttribute
    private String aliance_campaign_tnc ;
	public String getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(String offer_id) {
		this.offer_id = offer_id;
	}
	public String getCoupon_code() {
		return coupon_code;
	}
	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}
	public String getCoupon_name() {
		return coupon_name;
	}
	public void setCoupon_name(String coupon_name) {
		this.coupon_name = coupon_name;
	}
	public String getCoupon_age_from() {
		return coupon_age_from;
	}
	public void setCoupon_age_from(String coupon_age_from) {
		this.coupon_age_from = coupon_age_from;
	}
	public String getCoupon_age_to() {
		return coupon_age_to;
	}
	public void setCoupon_age_to(String coupon_age_to) {
		this.coupon_age_to = coupon_age_to;
	}
	public String getCoupon_type() {
		return coupon_type;
	}
	public void setCoupon_type(String coupon_type) {
		this.coupon_type = coupon_type;
	}
	public String getCoupon_value() {
		return coupon_value;
	}
	public void setCoupon_value(String coupon_value) {
		this.coupon_value = coupon_value;
	}
	public String getParterns_operator() {
		return parterns_operator;
	}
	public void setParterns_operator(String parterns_operator) {
		this.parterns_operator = parterns_operator;
	}
	public String getAliance_partner() {
		return aliance_partner;
	}
	public void setAliance_partner(String aliance_partner) {
		this.aliance_partner = aliance_partner;
	}
	public String getAliance_partner_logo() {
		return aliance_partner_logo;
	}
	public void setAliance_partner_logo(String aliance_partner_logo) {
		this.aliance_partner_logo = aliance_partner_logo;
	}
	public String getAliance_partner_tnc() {
		return aliance_partner_tnc;
	}
	public void setAliance_partner_tnc(String aliance_partner_tnc) {
		this.aliance_partner_tnc = aliance_partner_tnc;
	}
	public String getAliance_campaign() {
		return aliance_campaign;
	}
	public void setAliance_campaign(String aliance_campaign) {
		this.aliance_campaign = aliance_campaign;
	}
	public String getAliance_campaign_logo() {
		return aliance_campaign_logo;
	}
	public void setAliance_campaign_logo(String aliance_campaign_logo) {
		this.aliance_campaign_logo = aliance_campaign_logo;
	}
	public String getAliance_campaign_tnc() {
		return aliance_campaign_tnc;
	}
	public void setAliance_campaign_tnc(String aliance_campaign_tnc) {
		this.aliance_campaign_tnc = aliance_campaign_tnc;
	}
}
