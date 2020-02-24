package com.mobilelife.api.beans.plans;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class DeviceColor {
	
    @XmlAttribute
	private String id;

    @XmlAttribute
	private String type;

    @XmlAttribute
	private String imageName;

    @XmlAttribute
	private String imageThumbNail;

    @XmlAttribute
	private String hexCode;

    @XmlAttribute
	private String cost;
    
    @XmlAttribute
	private String stock;
    
    @XmlAttribute
	private String data_offer;
    
    @XmlAttribute
	private String gifts;
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHexCode() {
		return hexCode;
	}

	public void setHexCode(String hexCode) {
		this.hexCode = hexCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getData_offer() {
		return data_offer;
	}

	public void setData_offer(String data_offer) {
		this.data_offer = data_offer;
	}

	public String getGifts() {
		return gifts;
	}

	public void setGifts(String gifts) {
		this.gifts = gifts;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageThumbNail() {
		return imageThumbNail;
	}

	public void setImageThumbNail(String imageThumbNail) {
		this.imageThumbNail = imageThumbNail;
	}
	
}
