package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAttribute;

public class FilterDeviceAttribs {
	
    @XmlAttribute
	private String filtertype;
    @XmlAttribute
	private String maxunit;
    @XmlAttribute
	private String maxvalue;
    @XmlAttribute
	private String minunit;
    @XmlAttribute
	private String minvalue;
    @XmlAttribute
	private String label;
	/**
	 * @return the filtertype
	 */
	public String getFiltertype() {
		return filtertype;
	}
	/**
	 * @param filtertype the filtertype to set
	 */
	public void setFiltertype(String filtertype) {
		this.filtertype = filtertype;
	}
	/**
	 * @return the maxunit
	 */
	public String getMaxunit() {
		return maxunit;
	}
	/**
	 * @param maxunit the maxunit to set
	 */
	public void setMaxunit(String maxunit) {
		this.maxunit = maxunit;
	}
	/**
	 * @return the maxvalue
	 */
	public String getMaxvalue() {
		return maxvalue;
	}
	/**
	 * @param maxvalue the maxvalue to set
	 */
	public void setMaxvalue(String maxvalue) {
		this.maxvalue = maxvalue;
	}
	/**
	 * @return the minunit
	 */
	public String getMinunit() {
		return minunit;
	}
	/**
	 * @param minunit the minunit to set
	 */
	public void setMinunit(String minunit) {
		this.minunit = minunit;
	}
	/**
	 * @return the minvalue
	 */
	public String getMinvalue() {
		return minvalue;
	}
	/**
	 * @param minvalue the minvalue to set
	 */
	public void setMinvalue(String minvalue) {
		this.minvalue = minvalue;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
    
}
