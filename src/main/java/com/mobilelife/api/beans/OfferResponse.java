package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.order.OfferResDetails;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfferResponse {

    @XmlElement
    private ErrorReposne error;
    @XmlElement
	private OfferResDetails offers;
    @XmlAttribute
	private String status;
	/**
	 * @return the error
	 */
	public ErrorReposne getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(ErrorReposne error) {
		this.error = error;
	}
	public OfferResDetails getOffers() {
		return offers;
	}
	public void setOffers(OfferResDetails offers) {
		this.offers = offers;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
