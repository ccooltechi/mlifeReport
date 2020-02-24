package com.mobilelife.api.beans.Search;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "countries")
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryFilter {
    @XmlElement
	private List<Country> country;

	/**
	 * @return the country
	 */
	public List<Country> getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(List<Country> country) {
		this.country = country;
	}


}
