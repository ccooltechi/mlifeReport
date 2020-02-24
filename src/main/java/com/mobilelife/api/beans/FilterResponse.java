package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.plans.SearchedPlans;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.FIELD)
public class FilterResponse {

    @XmlElement
    private ErrorReposne error;
    @XmlElement
	private FiltersResponse filters;
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
	/**
	 * @return the filters
	 */
	public FiltersResponse getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(FiltersResponse filters) {
		this.filters = filters;
	}

}
