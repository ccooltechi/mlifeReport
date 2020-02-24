package com.mobilelife.api.beans.Search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "search_criteria")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchingCriteria {

    @XmlAttribute
	private String category;
    @XmlAttribute
// 	 private String payasyougo;
//   @XmlAttribute
	private String country;
    @XmlAttribute
	private String nationality;
    @XmlAttribute
    private String sortby;
    @XmlAttribute
    private String saveFilter;
    @XmlElement
	private SearchFilters filters;
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the filters
	 */
	public SearchFilters getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(SearchFilters filters) {
		this.filters = filters;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the sortby
	 */
	public String getSortby() {
		return sortby;
	}
	/**
	 * @param sortby the sortby to set
	 */
	public void setSortby(String sortby) {
		this.sortby = sortby;
	}
	/**
	 * @return the saveFilter
	 */
	public String getSaveFilter() {
		return saveFilter;
	}
	/**
	 * @param saveFilter the saveFilter to set
	 */
	public void setSaveFilter(String saveFilter) {
		this.saveFilter = saveFilter;
	}
	/**
	 * @return the payasyougo
	 */
	// public String getPayasyougo() {
	// 	return payasyougo;
	// }
	/**
	 * @param payasyougo the payasyougo to set
	 */
	// public void setPayasyougo(String payasyougo) {
	// 	this.payasyougo = payasyougo;
	// }
	
}
