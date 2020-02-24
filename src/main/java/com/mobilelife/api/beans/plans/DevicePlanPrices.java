package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deviceplansprices")
@XmlAccessorType(XmlAccessType.FIELD)
public class DevicePlanPrices {
    @XmlElement
    private List<DevicePlanPrice> devieplanprice;

	/**
	 * @return the devieplanprice
	 */
	public List<DevicePlanPrice> getDevieplanprice() {
		return devieplanprice;
	}

	/**
	 * @param devieplanprice the devieplanprice to set
	 */
	public void setDevieplanprice(List<DevicePlanPrice> devieplanprice) {
		this.devieplanprice = devieplanprice;
	}

    
}
