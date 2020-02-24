package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deviceplans")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobileDevicePlans{

    @XmlAttribute
    private String model;

    @XmlAttribute
    private String modelid;

    @XmlAttribute
    private String startprice_mps;
    
    @XmlAttribute
    private String memory;
    
    @XmlAttribute
    private String memoryunit;
    
    @XmlAttribute
    private String commitment;
    
    @XmlAttribute
    private String brand;

    @XmlElement
	private List<DeviceColor> colors;
    

    @XmlElement
	private MobilePlansDevice deviceplans;

    @XmlElement
	private List<Object> plans;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public MobilePlansDevice getDeviceplans() {
		return deviceplans;
	}

	public void setDeviceplans(MobilePlansDevice deviceplans) {
		this.deviceplans = deviceplans;
	}

	public List<DeviceColor> getColors() {
		return colors;
	}

	public void setColors(List<DeviceColor> colors) {
		this.colors = colors;
	}

	public String getModelid() {
		return modelid;
	}

	public void setModelid(String modelid) {
		this.modelid = modelid;
	}

	public List<Object> getPlans() {
		return plans;
	}

	public void setPlans(List<Object> plans) {
		this.plans = plans;
	}

	public String getStartprice_mps() {
		return startprice_mps;
	}

	public void setStartprice_mps(String startprice_mps) {
		this.startprice_mps = startprice_mps;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getMemoryunit() {
		return memoryunit;
	}

	public void setMemoryunit(String memoryunit) {
		this.memoryunit = memoryunit;
	}

	public String getCommitment() {
		return commitment;
	}

	public void setCommitment(String commitment) {
		this.commitment = commitment;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
    
}
