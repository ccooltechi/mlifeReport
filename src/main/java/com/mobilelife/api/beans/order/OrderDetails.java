package com.mobilelife.api.beans.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderDetails {

    @XmlAttribute
    private String plan_reff_id; 
    @XmlAttribute
    private String order_value;
    @XmlAttribute
    private String user_id;
    @XmlAttribute
    private String generated_from;
    @XmlAttribute
    private String invoice_no;
    @XmlAttribute
	private String emailID ;
    @XmlAttribute
	private String user_name ;


    public String getPlan_reff_id() {
		return plan_reff_id;
	}
	public void setPlan_reff_id(String plan_reff_id) {
		this.plan_reff_id = plan_reff_id;
	}
	public String getOrder_value() {
		return order_value;
	}
	public void setOrder_value(String order_value) {
		this.order_value = order_value;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getGenerated_from() {
		return generated_from;
	}
	public void setGenerated_from(String generated_from) {
		this.generated_from = generated_from;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
}
