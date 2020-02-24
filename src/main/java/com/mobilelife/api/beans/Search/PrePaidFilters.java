package com.mobilelife.api.beans.Search;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrePaidFilters {

	@XmlElement
	private List<FilterReq> filterReq;

	public List<FilterReq> getFilterReq() {
		return filterReq;
	}

	public void setFilterReq(List<FilterReq> filterReq) {
		this.filterReq = filterReq;
	}

	
	
}
