/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobilelife.api.beans.operator;

/**
 *
 * @author pods
 */
public class PlanFilter{

    private String minvalue;
    private String minunit;
    private String maxvalue;
    private String maxunit;
    private String filtertype;
    private String filterlabel;
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
	 * @return the filterlabel
	 */
	public String getFilterlabel() {
		return filterlabel;
	}
	/**
	 * @param filterlabel the filterlabel to set
	 */
	public void setFilterlabel(String filterlabel) {
		this.filterlabel = filterlabel;
	}

}
