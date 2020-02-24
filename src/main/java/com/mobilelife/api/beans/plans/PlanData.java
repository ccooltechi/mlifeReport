package com.mobilelife.api.beans.plans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanData {

    @XmlAttribute
	private String data_national_gb="";
    @XmlAttribute
	private String data_national_roll_over_gb="";
    @XmlAttribute
	private String data_national_gb_unitrate="";
    @XmlAttribute
	private String data_national_gb_was;
    @XmlAttribute
	private String data_national_gb_discount;
    @XmlAttribute
	private String data_national_gb_unit;

	/**
	 * @return the data_national_gb
	 */
	public String getData_national_gb() {
		return data_national_gb;
	}
	/**
	 * @param data_national_gb the data_national_gb to set
	 */
	public void setData_national_gb(String data_national_gb) {
		this.data_national_gb = data_national_gb;
	}
	/**
	 * @return the data_national_roll_over_gb
	 */
	public String getData_national_roll_over_gb() {
		return data_national_roll_over_gb;
	}
	/**
	 * @param data_national_roll_over_gb the data_national_roll_over_gb to set
	 */
	public void setData_national_roll_over_gb(String data_national_roll_over_gb) {
		this.data_national_roll_over_gb = data_national_roll_over_gb;
	}
	/**
	 * @return the data_national_gb_unitrate
	 */
	public String getData_national_gb_unitrate() {
		return data_national_gb_unitrate;
	}
	/**
	 * @param data_national_gb_unitrate the data_national_gb_unitrate to set
	 */
	public void setData_national_gb_unitrate(String data_national_gb_unitrate) {
		this.data_national_gb_unitrate = data_national_gb_unitrate;
	}
	public String getData_national_gb_was() {
		return data_national_gb_was;
	}
	public void setData_national_gb_was(String data_national_gb_was) {
		this.data_national_gb_was = data_national_gb_was;
	}
	public String getData_national_gb_discount() {
		return data_national_gb_discount;
	}
	public void setData_national_gb_discount(String data_national_gb_discount) {
		this.data_national_gb_discount = data_national_gb_discount;
	}
	public String getData_national_gb_unit() {
		return data_national_gb_unit;
	}
	public void setData_national_gb_unit(String data_national_gb_unit) {
		this.data_national_gb_unit = data_national_gb_unit;
	}

}
