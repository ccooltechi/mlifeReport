package com.mobilelife.api.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AdvanceBasicFilters {
    @XmlElement
	private List<Filters> filters;

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
