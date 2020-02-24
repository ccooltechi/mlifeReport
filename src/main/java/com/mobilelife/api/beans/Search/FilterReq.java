package com.mobilelife.api.beans.Search;

import javax.xml.bind.annotation.XmlAttribute;

public class FilterReq {
	
    @XmlAttribute
	private String filter;

	/**
	 * @return the filter
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * @param filter the filter to set
	 */
	public void setFilter(String filter) {
		this.filter = filter;
	}

    
}
