package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mobilelife.api.beans.plans.SearchedPlans;

@XmlRootElement(name = "search_response")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResponse {

    @XmlElement
    private ErrorReposne error;
    @XmlElement
	private SearchedPlans searched_plans;
	/**
	 * @return the error
	 */
	public ErrorReposne getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(ErrorReposne error) {
		this.error = error;
	}
	/**
	 * @return the searched_plans
	 */
	public SearchedPlans getSearched_plans() {
		return searched_plans;
	}
	/**
	 * @param searched_plans the searched_plans to set
	 */
	public void setSearched_plans(SearchedPlans searched_plans) {
		this.searched_plans = searched_plans;
	}
}
