package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filters")
@XmlAccessorType(XmlAccessType.FIELD)
public class FiltersResponse {

    @XmlElement
	private AdvanceBasicFilters advanceFilter;
    @XmlElement
	private AdvanceBasicFilters basicFilter;
	/**
	 * @return the advanceFilter
	 */
	public AdvanceBasicFilters getAdvanceFilter() {
		return advanceFilter;
	}
	/**
	 * @param advanceFilter the advanceFilter to set
	 */
	public void setAdvanceFilter(AdvanceBasicFilters advanceFilter) {
		this.advanceFilter = advanceFilter;
	}
	/**
	 * @return the basicFilter
	 */
	public AdvanceBasicFilters getBasicFilter() {
		return basicFilter;
	}
	/**
	 * @param basicFilter the basicFilter to set
	 */
	public void setBasicFilter(AdvanceBasicFilters basicFilter) {
		this.basicFilter = basicFilter;
	}

    
}
