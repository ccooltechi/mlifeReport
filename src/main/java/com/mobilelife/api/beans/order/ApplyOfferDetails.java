package com.mobilelife.api.beans.order;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplyOfferDetails {

    @XmlAttribute
    private String couponid ;
    @XmlAttribute
    private String selectedoffervalue ;

	@XmlElement
	private List<ApplyOfferDetail> selectedoffer;

	public List<ApplyOfferDetail> getSelectedoffer() {
		return selectedoffer;
	}

	public void setSelectedoffer(List<ApplyOfferDetail> selectedoffer) {
		this.selectedoffer = selectedoffer;
	}

	public String getCouponid() {
		return couponid;
	}

	public void setCouponid(String couponid) {
		this.couponid = couponid;
	}
	public String getSelectedoffervalue() {
		return selectedoffervalue;
	}

	public void setSelectedoffervalue(String selectedoffervalue) {
		this.selectedoffervalue = selectedoffervalue;
	}
}
