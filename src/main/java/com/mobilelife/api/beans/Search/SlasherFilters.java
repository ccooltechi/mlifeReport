package com.mobilelife.api.beans.Search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlasherFilters {
	
    @XmlAttribute
	private String filterType;
    @XmlAttribute
	private String monthlyBudget;
    @XmlAttribute
	private String data;
    @XmlAttribute
	private String socialData;
    @XmlAttribute
	private String flexi;
    @XmlAttribute
	private String national;
    @XmlElement
	private OperatorFilter operators;
    @XmlAttribute
	private String dataperpage;
    @XmlAttribute
	private String pageNumber;
    
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
	 * @return the flexi
	 */
	public String getFlexi() {
		return flexi;
	}
	/**
	 * @param flexi the flexi to set
	 */
	public void setFlexi(String flexi) {
		this.flexi = flexi;
	}
	/**
	 * @return the national
	 */
	public String getNational() {
		return national;
	}
	/**
	 * @param national the national to set
	 */
	public void setNational(String national) {
		this.national = national;
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
	
}
