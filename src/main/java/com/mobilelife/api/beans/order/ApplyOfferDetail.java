package com.mobilelife.api.beans.order;

import javax.xml.bind.annotation.XmlAttribute;

public class ApplyOfferDetail {

    @XmlAttribute
    private String offer_id ;
    @XmlAttribute
    private String coupon_code ;
    @XmlAttribute
    private String coupon_value ;

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
	public String getCoupon_value() {
		return coupon_value;
	}
	public void setCoupon_value(String coupon_value) {
		this.coupon_value = coupon_value;
	}
}
