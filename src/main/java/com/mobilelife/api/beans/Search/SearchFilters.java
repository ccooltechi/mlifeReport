package com.mobilelife.api.beans.Search;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchFilters {
	
    @XmlAttribute
	private String filterType;
    @XmlAttribute
	private String contract;
    @XmlAttribute
	private String monthlyBudget;
    @XmlAttribute
	private String filterConstant;
    @XmlAttribute
	private String data;
    @XmlAttribute
	private String socialData;
    @XmlAttribute
    private PrePaidFilters rechargeFrequency;
    @XmlElement
	private CallMinFilter call_mins;
    @XmlElement
	private SmsMinsFilter sms_mins;
    @XmlElement
	private DeviceFilters deviceBrand;
    @XmlElement
	private DeviceFilters deviceModels;
    @XmlElement
	private DeviceFilters deviceMemory;
    @XmlElement
	private DeviceFilters deviceColor;
    @XmlElement
	private OperatorFilter operators;
    @XmlAttribute
	private String dataperpage;
    @XmlAttribute
	private String pageNumber;
    @XmlElement
	private CountryFilter countries;
    @XmlAttribute
    private String autoRenew;
    @XmlAttribute
    private String dataOnly;

    @XmlAttribute
    private String prepaidInline;

    @XmlAttribute
    private PrePaidFilters prepaidTypeFilter;

    @XmlAttribute
    private PrePaidFilters callPlanType;

    /**
	 * @return the contract
	 */
	public String getContract() {
		return contract;
	}
	/**
	 * @param contract the contract to set
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}
	/**
	 * @return the monthlyBudget
	 */
	public String getMonthlyBudget() {
		return monthlyBudget;
	}
	/**
	 * @param monthlyBudget the monthlyBudget to set
	 */
	public void setMonthlyBudget(String monthlyBudget) {
		this.monthlyBudget = monthlyBudget;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the call_mins
	 */
	public CallMinFilter getCall_mins() {
		return call_mins;
	}
	/**
	 * @param call_mins the call_mins to set
	 */
	public void setCall_mins(CallMinFilter call_mins) {
		this.call_mins = call_mins;
	}
	/**
	 * @return the sms_mins
	 */
	public SmsMinsFilter getSms_mins() {
		return sms_mins;
	}
	/**
	 * @param sms_mins the sms_mins to set
	 */
	public void setSms_mins(SmsMinsFilter sms_mins) {
		this.sms_mins = sms_mins;
	}
	/**
	 * @return the operators
	 */
	public OperatorFilter getOperators() {
		return operators;
	}
	/**
	 * @param operators the operators to set
	 */
	public void setOperators(OperatorFilter operators) {
		this.operators = operators;
	}
	/**
	 * @return the filterType
	 */
	public String getFilterType() {
		return filterType;
	}
	/**
	 * @param filterType the filterType to set
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	/**
	 * @return the dataperpage
	 */
	public String getDataperpage() {
		return dataperpage;
	}
	/**
	 * @param dataperpage the dataperpage to set
	 */
	public void setDataperpage(String dataperpage) {
		this.dataperpage = dataperpage;
	}
	/**
	 * @return the pageNumber
	 */
	public String getPageNumber() {
		return pageNumber;
	}
	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	/**
	 * @return the countries
	 */
	public CountryFilter getCountries() {
		return countries;
	}
	/**
	 * @param countries the countries to set
	 */
	public void setCountries(CountryFilter countries) {
		this.countries = countries;
	}
	/**
	 * @return the deviceModels
	 */
	public DeviceFilters getDeviceModels() {
		return deviceModels;
	}
	/**
	 * @param deviceModels the deviceModels to set
	 */
	public void setDeviceModels(DeviceFilters deviceModels) {
		this.deviceModels = deviceModels;
	}
	/**
	 * @return the deviceMemory
	 */
	public DeviceFilters getDeviceMemory() {
		return deviceMemory;
	}
	/**
	 * @param deviceMemory the deviceMemory to set
	 */
	public void setDeviceMemory(DeviceFilters deviceMemory) {
		this.deviceMemory = deviceMemory;
	}
	/**
	 * @return the deviceColor
	 */
	public DeviceFilters getDeviceColor() {
		return deviceColor;
	}
	/**
	 * @param deviceColor the deviceColor to set
	 */
	public void setDeviceColor(DeviceFilters deviceColor) {
		this.deviceColor = deviceColor;
	}
	/**
	 * @return the socialData
	 */
	public String getSocialData() {
		return socialData;
	}
	/**
	 * @param socialData the socialData to set
	 */
	public void setSocialData(String socialData) {
		this.socialData = socialData;
	}
	/**
	 * @return the filterConstant
	 */
	public String getFilterConstant() {
		return filterConstant;
	}
	/**
	 * @param filterConstant the filterConstant to set
	 */
	public void setFilterConstant(String filterConstant) {
		this.filterConstant = filterConstant;
	}
	/**
	 * @return the autoRenew
	 */
	public String getAutoRenew() {
		return autoRenew;
	}
	/**
	 * @param autoRenew the autoRenew to set
	 */
	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}
	public String getDataOnly() {
		return dataOnly;
	}
	public void setDataOnly(String dataOnly) {
		this.dataOnly = dataOnly;
	}
	public PrePaidFilters getRechargeFrequency() {
		return rechargeFrequency;
	}
	public void setRechargeFrequency(PrePaidFilters rechargeFrequency) {
		this.rechargeFrequency = rechargeFrequency;
	}
	public PrePaidFilters getPrepaidTypeFilter() {
		return prepaidTypeFilter;
	}
	public void setPrepaidTypeFilter(PrePaidFilters prepaidTypeFilter) {
		this.prepaidTypeFilter = prepaidTypeFilter;
	}
	public String getPrepaidInline() {
		return prepaidInline;
	}
	public void setPrepaidInline(String prepaidInline) {
		this.prepaidInline = prepaidInline;
	}
	public DeviceFilters getDeviceBrand() {
		return deviceBrand;
	}
	public void setDeviceBrand(DeviceFilters deviceBrand) {
		this.deviceBrand = deviceBrand;
	}
	public PrePaidFilters getCallPlanType() {
		return callPlanType;
	}
	public void setCallPlanType(PrePaidFilters callPlanType) {
		this.callPlanType = callPlanType;
	}

}
