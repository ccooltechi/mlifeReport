package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "colors")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceColors {

	@XmlElement
	private List<DeviceColor> deviceColor;

	public List<DeviceColor> getDeviceColor() {
		return deviceColor;
	}

	public void setDeviceColor(List<DeviceColor> deviceColor) {
		this.deviceColor = deviceColor;
	}
	
}
