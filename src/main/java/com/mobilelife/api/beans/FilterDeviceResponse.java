package com.mobilelife.api.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.plans.SearchedPlans;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.FIELD)
public class FilterDeviceResponse {

    @XmlElement
    private ErrorReposne error;
    
    @XmlElement
	private List<Filters> filters;
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
	public List<Filters> getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(List<Filters> filters) {
		this.filters = filters;
	}

}
