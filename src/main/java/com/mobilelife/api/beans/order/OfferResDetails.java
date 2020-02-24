package com.mobilelife.api.beans.order;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferResDetails {

    @XmlAttribute
	private String orderValue;
    @XmlAttribute
	private String totalOffers;

	@XmlElement
	private List<OfferDetails> offer;

	public List<OfferDetails> getOffer() {
		return offer;
	}

	public void setOffer(List<OfferDetails> offer) {
		this.offer = offer;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public String getTotalOffers() {
		return totalOffers;
	}

	public void setTotalOffers(String totalOffers) {
		this.totalOffers = totalOffers;
	}

}
