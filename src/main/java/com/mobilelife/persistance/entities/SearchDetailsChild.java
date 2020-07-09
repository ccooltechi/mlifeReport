package com.mobilelife.persistance.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author deepakupadhyay
 */
@Entity
@Table(name = "search_details_child")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SearchDetailsChild.findAll", query = "SELECT s FROM SearchDetailsChild s")
    , @NamedQuery(name = "SearchDetailsChild.findById", query = "SELECT s FROM SearchDetailsChild s WHERE s.id = :id")
    , @NamedQuery(name = "SearchDetailsChild.findByRequestType", query = "SELECT s FROM SearchDetailsChild s WHERE s.requestType = :requestType")
    , @NamedQuery(name = "SearchDetailsChild.findByCategory", query = "SELECT s FROM SearchDetailsChild s WHERE s.category = :category")
    , @NamedQuery(name = "SearchDetailsChild.findBySubcategory", query = "SELECT s FROM SearchDetailsChild s WHERE s.subcategory = :subcategory")
    , @NamedQuery(name = "SearchDetailsChild.findByMoresaving", query = "SELECT s FROM SearchDetailsChild s WHERE s.moresaving = :moresaving")
    , @NamedQuery(name = "SearchDetailsChild.findByNationality", query = "SELECT s FROM SearchDetailsChild s WHERE s.nationality = :nationality")
    , @NamedQuery(name = "SearchDetailsChild.findByMonthlyBudget", query = "SELECT s FROM SearchDetailsChild s WHERE s.monthlyBudget = :monthlyBudget")
    , @NamedQuery(name = "SearchDetailsChild.findByData", query = "SELECT s FROM SearchDetailsChild s WHERE s.data = :data")
    , @NamedQuery(name = "SearchDetailsChild.findByRechargeFrequency", query = "SELECT s FROM SearchDetailsChild s WHERE s.rechargeFrequency = :rechargeFrequency")
    , @NamedQuery(name = "SearchDetailsChild.findByFlexi", query = "SELECT s FROM SearchDetailsChild s WHERE s.flexi = :flexi")
    , @NamedQuery(name = "SearchDetailsChild.findByNational", query = "SELECT s FROM SearchDetailsChild s WHERE s.national = :national")
    , @NamedQuery(name = "SearchDetailsChild.findByInternational", query = "SELECT s FROM SearchDetailsChild s WHERE s.international = :international")
    , @NamedQuery(name = "SearchDetailsChild.findByDeviceBrand", query = "SELECT s FROM SearchDetailsChild s WHERE s.deviceBrand = :deviceBrand")
    , @NamedQuery(name = "SearchDetailsChild.findByDeviceModels", query = "SELECT s FROM SearchDetailsChild s WHERE s.deviceModels = :deviceModels")
    , @NamedQuery(name = "SearchDetailsChild.findByDeviceMemory", query = "SELECT s FROM SearchDetailsChild s WHERE s.deviceMemory = :deviceMemory")
    , @NamedQuery(name = "SearchDetailsChild.findByDeviceColor", query = "SELECT s FROM SearchDetailsChild s WHERE s.deviceColor = :deviceColor")
    , @NamedQuery(name = "SearchDetailsChild.findByOperator", query = "SELECT s FROM SearchDetailsChild s WHERE s.operator = :operator")
    , @NamedQuery(name = "SearchDetailsChild.findByCountries", query = "SELECT s FROM SearchDetailsChild s WHERE s.countries = :countries")
    , @NamedQuery(name = "SearchDetailsChild.findByAutoRenew", query = "SELECT s FROM SearchDetailsChild s WHERE s.autoRenew = :autoRenew")
    , @NamedQuery(name = "SearchDetailsChild.findByDataOnly", query = "SELECT s FROM SearchDetailsChild s WHERE s.dataOnly = :dataOnly")
    , @NamedQuery(name = "SearchDetailsChild.findByPrepaidInline", query = "SELECT s FROM SearchDetailsChild s WHERE s.prepaidInline = :prepaidInline")
    , @NamedQuery(name = "SearchDetailsChild.findByPrepaidTypeFilter", query = "SELECT s FROM SearchDetailsChild s WHERE s.prepaidTypeFilter = :prepaidTypeFilter")
    , @NamedQuery(name = "SearchDetailsChild.findByCallPlanType", query = "SELECT s FROM SearchDetailsChild s WHERE s.callPlanType = :callPlanType")
    , @NamedQuery(name = "SearchDetailsChild.findByCreationDatetime", query = "SELECT s FROM SearchDetailsChild s WHERE s.creationDatetime = :creationDatetime")
    , @NamedQuery(name = "SearchDetailsChild.findByLastModifiedDatetime", query = "SELECT s FROM SearchDetailsChild s WHERE s.lastModifiedDatetime = :lastModifiedDatetime")
    , @NamedQuery(name = "SearchDetailsChild.findByIsActive", query = "SELECT s FROM SearchDetailsChild s WHERE s.isActive = :isActive")})
public class SearchDetailsChild implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "request_type")
    private String requestType;
    @Column(name = "category")
    private String category;
    @Column(name = "subcategory")
    private String subcategory;
    @Column(name = "moresaving")
    private String moresaving;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "monthlyBudget")
    private String monthlyBudget;
    @Column(name = "data")
    private String data;
    @Column(name = "rechargeFrequency")
    private String rechargeFrequency;
    @Column(name = "flexi")
    private String flexi;
    @Column(name = "national")
    private String national;
    @Column(name = "international")
    private String international;
    @Column(name = "deviceBrand")
    private String deviceBrand;
    @Column(name = "deviceModels")
    private String deviceModels;
    @Column(name = "deviceMemory")
    private String deviceMemory;
    @Column(name = "deviceColor")
    private String deviceColor;
    @Column(name = "operator")
    private String operator;
    @Column(name = "countries")
    private String countries;
    @Column(name = "autoRenew")
    private String autoRenew;
    @Column(name = "dataOnly")
    private String dataOnly;
    @Column(name = "prepaidInline")
    private String prepaidInline;
    @Column(name = "prepaidTypeFilter")
    private String prepaidTypeFilter;
    @Column(name = "callPlanType")
    private String callPlanType;
    @Basic(optional = false)
    @Column(name = "creation_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDatetime;
    @Column(name = "last_modified_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDatetime;
    @Basic(optional = false)
    @Column(name = "is_active")
    private boolean isActive;
    @JoinColumn(name = "search_id", referencedColumnName = "id")
    @OneToOne(optional = false)
    private SearchDetails searchId;
    @Column(name = "token")
    private String token;
    @Column(name = "plan_reponse")
    private String planReponse;
    
    @Column(name = "selected_plan")
    private String selectedPlan;

    @Column(name = "sort_by")
    private String sortBy;

    @Column(name = "compairedPlans")
    private String compairedPlans;

    @Column(name = "callback_plan")
    private String callbackPlan;

    @Column(name = "actionKey")
    private String actionKey;
    
    @Column(name = "actionValue")
    private String actionValue;

    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "searchId")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "searchId", cascade = CascadeType.ALL)
    private Collection<SearchDetailsXtimes> searchDetailsXtimesCollection;

    public SearchDetailsChild() {
    }

    public SearchDetailsChild(Integer id) {
        this.id = id;
    }

    public SearchDetailsChild(Integer id, Date creationDatetime, boolean isActive) {
        this.id = id;
        this.creationDatetime = creationDatetime;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getMoresaving() {
        return moresaving;
    }

    public void setMoresaving(String moresaving) {
        this.moresaving = moresaving;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(String monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRechargeFrequency() {
        return rechargeFrequency;
    }

    public void setRechargeFrequency(String rechargeFrequency) {
        this.rechargeFrequency = rechargeFrequency;
    }

    public String getFlexi() {
        return flexi;
    }

    public void setFlexi(String flexi) {
        this.flexi = flexi;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModels() {
        return deviceModels;
    }

    public void setDeviceModels(String deviceModels) {
        this.deviceModels = deviceModels;
    }

    public String getDeviceMemory() {
        return deviceMemory;
    }

    public void setDeviceMemory(String deviceMemory) {
        this.deviceMemory = deviceMemory;
    }

    public String getDeviceColor() {
        return deviceColor;
    }

    public void setDeviceColor(String deviceColor) {
        this.deviceColor = deviceColor;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }

    public String getDataOnly() {
        return dataOnly;
    }

    public void setDataOnly(String dataOnly) {
        this.dataOnly = dataOnly;
    }

    public String getPrepaidInline() {
        return prepaidInline;
    }

    public void setPrepaidInline(String prepaidInline) {
        this.prepaidInline = prepaidInline;
    }

    public String getPrepaidTypeFilter() {
        return prepaidTypeFilter;
    }

    public void setPrepaidTypeFilter(String prepaidTypeFilter) {
        this.prepaidTypeFilter = prepaidTypeFilter;
    }

    public String getCallPlanType() {
        return callPlanType;
    }

    public void setCallPlanType(String callPlanType) {
        this.callPlanType = callPlanType;
    }

    public Date getCreationDatetime() {
        return creationDatetime;
    }

    public void setCreationDatetime(Date creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public Date getLastModifiedDatetime() {
        return lastModifiedDatetime;
    }

    public void setLastModifiedDatetime(Date lastModifiedDatetime) {
        this.lastModifiedDatetime = lastModifiedDatetime;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public SearchDetails getSearchId() {
        return searchId;
    }

    public void setSearchId(SearchDetails searchId) {
        this.searchId = searchId;
    }
    
    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPlanReponse() {
		return planReponse;
	}

	public void setPlanReponse(String planReponse) {
		this.planReponse = planReponse;
	}

	
	public String getSelectedPlan() {
		return selectedPlan;
	}

	public void setSelectedPlan(String selectedPlan) {
		this.selectedPlan = selectedPlan;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	
	public String getCompairedPlans() {
		return compairedPlans;
	}

	public void setCompairedPlans(String compairedPlans) {
		this.compairedPlans = compairedPlans;
	}
	
	public String getCallbackPlan() {
		return callbackPlan;
	}

	public void setCallbackPlan(String callbackPlan) {
		this.callbackPlan = callbackPlan;
	}
	
	public String getActionKey() {
		return actionKey;
	}

	public void setActionKey(String actionKey) {
		this.actionKey = actionKey;
	}

	public String getActionValue() {
		return actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
	}

	public Collection<SearchDetailsXtimes> getSearchDetailsXtimesCollection() {
		return searchDetailsXtimesCollection;
	}

	public void setSearchDetailsXtimesCollection(Collection<SearchDetailsXtimes> searchDetailsXtimesCollection) {
		this.searchDetailsXtimesCollection = searchDetailsXtimesCollection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionKey == null) ? 0 : actionKey.hashCode());
		result = prime * result + ((actionValue == null) ? 0 : actionValue.hashCode());
		result = prime * result + ((autoRenew == null) ? 0 : autoRenew.hashCode());
		result = prime * result + ((callPlanType == null) ? 0 : callPlanType.hashCode());
		result = prime * result + ((callbackPlan == null) ? 0 : callbackPlan.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((compairedPlans == null) ? 0 : compairedPlans.hashCode());
		result = prime * result + ((countries == null) ? 0 : countries.hashCode());
		result = prime * result + ((creationDatetime == null) ? 0 : creationDatetime.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((dataOnly == null) ? 0 : dataOnly.hashCode());
		result = prime * result + ((deviceBrand == null) ? 0 : deviceBrand.hashCode());
		result = prime * result + ((deviceColor == null) ? 0 : deviceColor.hashCode());
		result = prime * result + ((deviceMemory == null) ? 0 : deviceMemory.hashCode());
		result = prime * result + ((deviceModels == null) ? 0 : deviceModels.hashCode());
		result = prime * result + ((flexi == null) ? 0 : flexi.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((international == null) ? 0 : international.hashCode());
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((lastModifiedDatetime == null) ? 0 : lastModifiedDatetime.hashCode());
		result = prime * result + ((monthlyBudget == null) ? 0 : monthlyBudget.hashCode());
		result = prime * result + ((moresaving == null) ? 0 : moresaving.hashCode());
		result = prime * result + ((national == null) ? 0 : national.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((planReponse == null) ? 0 : planReponse.hashCode());
		result = prime * result + ((prepaidInline == null) ? 0 : prepaidInline.hashCode());
		result = prime * result + ((prepaidTypeFilter == null) ? 0 : prepaidTypeFilter.hashCode());
		result = prime * result + ((rechargeFrequency == null) ? 0 : rechargeFrequency.hashCode());
		result = prime * result + ((requestType == null) ? 0 : requestType.hashCode());
		result = prime * result
				+ ((searchDetailsXtimesCollection == null) ? 0 : searchDetailsXtimesCollection.hashCode());
		result = prime * result + ((searchId == null) ? 0 : searchId.hashCode());
		result = prime * result + ((selectedPlan == null) ? 0 : selectedPlan.hashCode());
		result = prime * result + ((sortBy == null) ? 0 : sortBy.hashCode());
		result = prime * result + ((subcategory == null) ? 0 : subcategory.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchDetailsChild other = (SearchDetailsChild) obj;
		if (actionKey == null) {
			if (other.actionKey != null)
				return false;
		} else if (!actionKey.equals(other.actionKey))
			return false;
		if (actionValue == null) {
			if (other.actionValue != null)
				return false;
		} else if (!actionValue.equals(other.actionValue))
			return false;
		if (autoRenew == null) {
			if (other.autoRenew != null)
				return false;
		} else if (!autoRenew.equals(other.autoRenew))
			return false;
		if (callPlanType == null) {
			if (other.callPlanType != null)
				return false;
		} else if (!callPlanType.equals(other.callPlanType))
			return false;
		if (callbackPlan == null) {
			if (other.callbackPlan != null)
				return false;
		} else if (!callbackPlan.equals(other.callbackPlan))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (compairedPlans == null) {
			if (other.compairedPlans != null)
				return false;
		} else if (!compairedPlans.equals(other.compairedPlans))
			return false;
		if (countries == null) {
			if (other.countries != null)
				return false;
		} else if (!countries.equals(other.countries))
			return false;
		if (creationDatetime == null) {
			if (other.creationDatetime != null)
				return false;
		} else if (!creationDatetime.equals(other.creationDatetime))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (dataOnly == null) {
			if (other.dataOnly != null)
				return false;
		} else if (!dataOnly.equals(other.dataOnly))
			return false;
		if (deviceBrand == null) {
			if (other.deviceBrand != null)
				return false;
		} else if (!deviceBrand.equals(other.deviceBrand))
			return false;
		if (deviceColor == null) {
			if (other.deviceColor != null)
				return false;
		} else if (!deviceColor.equals(other.deviceColor))
			return false;
		if (deviceMemory == null) {
			if (other.deviceMemory != null)
				return false;
		} else if (!deviceMemory.equals(other.deviceMemory))
			return false;
		if (deviceModels == null) {
			if (other.deviceModels != null)
				return false;
		} else if (!deviceModels.equals(other.deviceModels))
			return false;
		if (flexi == null) {
			if (other.flexi != null)
				return false;
		} else if (!flexi.equals(other.flexi))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (international == null) {
			if (other.international != null)
				return false;
		} else if (!international.equals(other.international))
			return false;
		if (isActive != other.isActive)
			return false;
		if (lastModifiedDatetime == null) {
			if (other.lastModifiedDatetime != null)
				return false;
		} else if (!lastModifiedDatetime.equals(other.lastModifiedDatetime))
			return false;
		if (monthlyBudget == null) {
			if (other.monthlyBudget != null)
				return false;
		} else if (!monthlyBudget.equals(other.monthlyBudget))
			return false;
		if (moresaving == null) {
			if (other.moresaving != null)
				return false;
		} else if (!moresaving.equals(other.moresaving))
			return false;
		if (national == null) {
			if (other.national != null)
				return false;
		} else if (!national.equals(other.national))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		if (planReponse == null) {
			if (other.planReponse != null)
				return false;
		} else if (!planReponse.equals(other.planReponse))
			return false;
		if (prepaidInline == null) {
			if (other.prepaidInline != null)
				return false;
		} else if (!prepaidInline.equals(other.prepaidInline))
			return false;
		if (prepaidTypeFilter == null) {
			if (other.prepaidTypeFilter != null)
				return false;
		} else if (!prepaidTypeFilter.equals(other.prepaidTypeFilter))
			return false;
		if (rechargeFrequency == null) {
			if (other.rechargeFrequency != null)
				return false;
		} else if (!rechargeFrequency.equals(other.rechargeFrequency))
			return false;
		if (requestType == null) {
			if (other.requestType != null)
				return false;
		} else if (!requestType.equals(other.requestType))
			return false;
		if (searchDetailsXtimesCollection == null) {
			if (other.searchDetailsXtimesCollection != null)
				return false;
		} else if (!searchDetailsXtimesCollection.equals(other.searchDetailsXtimesCollection))
			return false;
		if (searchId == null) {
			if (other.searchId != null)
				return false;
		} else if (!searchId.equals(other.searchId))
			return false;
		if (selectedPlan == null) {
			if (other.selectedPlan != null)
				return false;
		} else if (!selectedPlan.equals(other.selectedPlan))
			return false;
		if (sortBy == null) {
			if (other.sortBy != null)
				return false;
		} else if (!sortBy.equals(other.sortBy))
			return false;
		if (subcategory == null) {
			if (other.subcategory != null)
				return false;
		} else if (!subcategory.equals(other.subcategory))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}

    
}
