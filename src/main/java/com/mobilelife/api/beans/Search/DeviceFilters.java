package com.mobilelife.api.beans.Search;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceFilters {

	@XmlElement
	private List<DeviceFilter> deviceFilter;

	/**
	 * @return the deviceFilter
	 */
	public List<DeviceFilter> getDeviceFilter() {
		return deviceFilter;
	}

	/**
	 * @param deviceFilter the deviceFilter to set
	 */
	public void setDeviceFilter(List<DeviceFilter> deviceFilter) {
		this.deviceFilter = deviceFilter;
	}
	
	
}
