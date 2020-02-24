package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.order.OrderDetails;
import com.mobilelife.api.beans.order.OrderResDetails;
import com.mobilelife.api.beans.plans.SearchedPlans;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderResponse {

    @XmlElement
    private ErrorReposne error;
    @XmlElement
	private OrderResDetails order;
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
	public OrderResDetails getOrder() {
		return order;
	}
	public void setOrder(OrderResDetails order) {
		this.order = order;
	}
	
}
