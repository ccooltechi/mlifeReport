package com.mobilelife.api.beans.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderResDetails {

    @XmlAttribute
    private String order_id; 
    @XmlAttribute
    private String invoice_no; 
    @XmlAttribute
    private String couponCode;
    @XmlAttribute
    private String order_validity_date;
    
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getOrder_validity_date() {
		return order_validity_date;
	}
	public void setOrder_validity_date(String order_validity_date) {
		this.order_validity_date = order_validity_date;
	}

}
