package com.mlife.report.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.persistance.dao.SearchDetailsChildDao;
import com.mobilelife.persistance.dao.SearchDetailsXtimesDao;
import com.mobilelife.persistance.entities.SearchDetails;
import com.mobilelife.persistance.entities.SearchDetailsChild;
import com.mobilelife.persistance.entities.SearchDetailsXtimes;

public class Report {

	private static Logger logger = LoggerFactory.getLogger(Report.class);

	public HashMap getSearchRequestsDetailsHM(Date daFrom, Date daTo)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		String sheet1Str = "";
		String sheet2Str = "";
		SearchDetailsChildDao searchDetailsDao = new SearchDetailsChildDao();
		List<SearchDetailsChild> searchDetails = (searchDetailsDao.fetchReport(new java.sql.Date(daFrom.getTime()), new java.sql.Date(daTo.getTime())));
		sheet1Str= makeSheet1CSV(searchDetails);
		sheet2Str= makeSheet2CSV(searchDetails);
//		System.out.println("sheet2Str : "+sheet2Str);
		hm.put("SHEET1", sheet1Str);
		hm.put("SHEET2", sheet2Str);
		return hm;
	}

	private String makeSheet2CSV(List<SearchDetailsChild> searchDetailsChildList) {
		StringBuffer retValue = new StringBuffer();
		retValue.append("Sheet1 id ,");
		retValue.append("Id ,");
		retValue.append("plan_name ,");
		retValue.append("Data ,");
		retValue.append("Flexi ,");
		retValue.append("National ,");
		retValue.append("InterNational ,");
		retValue.append("Budget ,");
		retValue.append("\n");
		SearchDetailsXtimesDao searchDetailsXtimesDao = new SearchDetailsXtimesDao();
//		Session session = HibernateSessionManager.getSession();
		try {
			if(null!=searchDetailsChildList)
			{
				for (int x=0; x<searchDetailsChildList.size();x++)
				{
					SearchDetailsChild searchDetailsChild = searchDetailsChildList.get(x); 
					Collection<SearchDetailsXtimes> collection =  searchDetailsChild.getSearchDetailsXtimesCollection();
					
	//				List<SearchDetailsXtimes>  searchDetailsXtimesList = searchDetailsXtimesDao.findBySearchChildId(searchDetailsChild.getId(), session);
					if (null!=collection)
					{
	//					for (int i=0; i<collection.size();i++)
						for(SearchDetailsXtimes searchDetailsXtimes : collection) 
						{
	//						SearchDetailsXtimes searchDetailsXtimes = searchDetailsXtimesList.get(i);
							retValue.append(searchDetailsXtimes.getSearchId().getId()+",");
							retValue.append(searchDetailsXtimes.getId()+",");
							retValue.append(searchDetailsXtimes.getPlanName()+",");
							retValue.append(searchDetailsXtimes.getGeneData()+",");
							retValue.append(searchDetailsXtimes.getGeneFlexi()+",");
							retValue.append(searchDetailsXtimes.getGeneNational()+",");
							retValue.append(searchDetailsXtimes.getGeneInterNational()+",");
							retValue.append(searchDetailsXtimes.getGeneBudget()+",");
							retValue.append("\n");
						}
					}
				}
			}
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
//			session.flush();
//			session.clear();
//			session.close();
		}
		return retValue.toString();
	}

	private String makeSheet1CSV(List<SearchDetailsChild> searchDetails1) {
		HashMap<String, String> tokenhm = new HashMap<String, String>();
		StringBuffer retValue = new StringBuffer();
		retValue.append("Token ,");
		retValue.append("status ,");
		retValue.append("Id ,");
		retValue.append("SearchDate ,");
		retValue.append("clientIP ,");
		retValue.append("loggedInUser ,");
		retValue.append("firstName ,");
		retValue.append("lastName ,");
		retValue.append("phone ,");
		retValue.append("RequestType,");
		retValue.append("Category ,");
		retValue.append("Subcategory ,");
		retValue.append("Moresaving ,");
		retValue.append("SortBby ,");
		retValue.append("AutoRenew ,");
		retValue.append("Nationality ,");
		retValue.append("MonthlyBudget ,");
		retValue.append("Data ,");
		retValue.append("DataOnly ,");
		retValue.append("National ,");
		retValue.append("Flexi ,");
		retValue.append("International ,");
		retValue.append("DeviceBrand ,");
		retValue.append("DeviceColor ,");
		retValue.append("DeviceMemory ,");
		retValue.append("DeviceModels ,");
		retValue.append("PrepaidInline ,");
		retValue.append("PrepaidTypeFilter ,");
		retValue.append("RechargeFrequency ,");
		retValue.append("Countries ,");
		retValue.append("CallPlanType ,");
		retValue.append("Operator ,");

		retValue.append("Service(HS),");
		retValue.append("Area(HS),");
		
		retValue.append("action ,");
		retValue.append("result ,");
		retValue.append("Selected Plan ,");
		retValue.append("Compaired Plans ,");
		retValue.append("callback ,");
		retValue.append("bestData ,");
		retValue.append("bestFlexi ,");
		retValue.append("bestNational ,");
		retValue.append("bestInterNational ,");
		retValue.append("bestBudget ,");
		retValue.append("bestSavingMonthly ,");
		retValue.append("bestSavingYearly ,");
		retValue.append("currentOperator ,");
		retValue.append("PlanReponse");
		retValue.append("\n");

		if(null!=searchDetails1)
		{
			String checktoken = "";
			for (int i=0;i<searchDetails1.size();i++)
			{
				SearchDetailsChild searchDetailsChild = searchDetails1.get(i);
				String loggedinuser = confescateMe(searchDetailsChild.getSearchId().getUserEmailid(),"EMAIL"); // searchDetailsChild.getSearchId().getSsoUserId();
//				if ((null!=loggedinuser) && (loggedinuser.equalsIgnoreCase("NA")))
//					loggedinuser = searchDetailsChild.getSearchId().getUserEmailid();
		
				String fname = searchDetailsChild.getSearchId().getFirstName();
				String lname = searchDetailsChild.getSearchId().getLastName();
				String phone = confescateMe(searchDetailsChild.getSearchId().getMobileNo(),"PHONE");
				String action = searchDetailsChild.getActionKey();
				String actionvalue = searchDetailsChild.getActionValue();
				String callback = searchDetailsChild.getCallbackPlan();
				String operator = searchDetailsChild.getOperator();
				operator = operator.replace(",", "|");
				String planresponse = searchDetailsChild.getPlanReponse();
				String planjsonResp = searchDetailsChild.getSearchId().getSearchRequest();
				String areahs = searchDetailsChild.getHomeArea();
				String serviceTSWhs=searchDetailsChild.getHomeServices();
				if ((null!=serviceTSWhs) && (serviceTSWhs.trim().length()>0))
					serviceTSWhs = serviceTSWhs.replace(",", "|");
				
                String defaultStr = "";
				String checktokenX = searchDetailsChild.getToken()+"-"+searchDetailsChild.getRequestType();
				if (tokenhm.containsKey(checktokenX))
                	defaultStr = "";
				else
				{
                	defaultStr = "NEW_REQUEST";
					tokenhm.put(checktokenX, "DONE");
				}
//                if (null!=action)
//                	defaultStr = "USER-ACTION";

				String maxGeneFeatureTagData =searchDetailsChild.getMaxGeneFeatureTagData();
				String maxGeneFeatureTagFlexi =searchDetailsChild.getMaxGeneFeatureTagFlexi();
				String maxGeneFeatureTagNational =searchDetailsChild.getMaxGeneFeatureTagNational();
				String maxGeneFeatureTagInterNational =searchDetailsChild.getMaxGeneFeatureTagInterNational();
				String maxGeneFeatureTagBudget =searchDetailsChild.getMaxGeneFeatureTagBudget();
				String maxGeneFeatureTagSavingFlat =searchDetailsChild.getMaxGeneFeatureTagSavingFlat();
				String maxGeneFeatureTagSavingFlatYearly =searchDetailsChild.getMaxGeneFeatureTagSavingFlatYearly();
				String currentOperator = searchDetailsChild.getCurrentOperator();
				
				retValue.append(searchDetailsChild.getToken()+",");
				retValue.append(defaultStr+",");
				retValue.append(searchDetailsChild.getId()+",");
				retValue.append(searchDetailsChild.getCreationDatetime()+",");
				retValue.append(searchDetailsChild.getSearchId().getIp()+",");
				retValue.append(loggedinuser+",");
				retValue.append(fname+",");
				retValue.append(lname+",");
				retValue.append(phone+",");
				retValue.append(searchDetailsChild.getRequestType()+",");
				retValue.append(searchDetailsChild.getCategory()+",");
				retValue.append(searchDetailsChild.getSubcategory()+",");
				retValue.append(searchDetailsChild.getMoresaving()+",");
				retValue.append(searchDetailsChild.getSortBy()+",");
				retValue.append(searchDetailsChild.getAutoRenew()+",");
				retValue.append(searchDetailsChild.getNationality()+",");
				retValue.append(searchDetailsChild.getMonthlyBudget()+",");
				retValue.append(searchDetailsChild.getData()+",");
				retValue.append(searchDetailsChild.getDataOnly()+",");
				retValue.append(searchDetailsChild.getNational()+",");
				retValue.append(searchDetailsChild.getFlexi()+",");
				retValue.append(searchDetailsChild.getInternational()+",");
				retValue.append(searchDetailsChild.getDeviceBrand()+",");
				retValue.append(searchDetailsChild.getDeviceColor()+",");
				retValue.append(searchDetailsChild.getDeviceMemory()+",");
				retValue.append(searchDetailsChild.getDeviceModels()+",");
				retValue.append(searchDetailsChild.getPrepaidInline()+",");
				retValue.append(searchDetailsChild.getPrepaidTypeFilter()+",");
				retValue.append(searchDetailsChild.getRechargeFrequency()+",");
				retValue.append(searchDetailsChild.getCountries()+",");
				retValue.append(searchDetailsChild.getCallPlanType()+",");
				retValue.append(operator+",");
				retValue.append(serviceTSWhs+",");
				retValue.append(areahs+",");
				retValue.append(action+",");
				retValue.append(actionvalue+",");
				retValue.append(searchDetailsChild.getSelectedPlan()+",");
				retValue.append(searchDetailsChild.getCompairedPlans()+",");
				retValue.append(callback+",");
				retValue.append(maxGeneFeatureTagData+",");
				retValue.append(maxGeneFeatureTagFlexi+",");
				retValue.append(maxGeneFeatureTagNational+",");
				retValue.append(maxGeneFeatureTagInterNational+",");
				retValue.append(maxGeneFeatureTagBudget+",");
				retValue.append(maxGeneFeatureTagSavingFlat+",");
				retValue.append(maxGeneFeatureTagSavingFlatYearly+",");
				retValue.append(currentOperator+",");
				retValue.append(planresponse);
				retValue.append("\n");

			}
		}
		return retValue.toString();
	}

	private String getfilterTypeStr(String planjsonResp) {
		JSONParser parser = new JSONParser();
		String defaultStr ="";
		try {
			JSONObject json = (JSONObject) parser.parse(planjsonResp);
			json = (JSONObject) json.get("search_criteria");
			json = (JSONObject) json.get("filters");
			defaultStr = (String) json.get("filterType");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(defaultStr);
		return defaultStr;
	}

	private List<SearchDetails> mapSearchRequest(List<SearchDetails> searchDetails) {

		List<SearchDetails> searchRequestList = null;
		if (null!=searchDetails)
		{
			searchRequestList = new ArrayList<SearchDetails>();
			for(SearchDetails item : searchDetails){
				searchRequestList.add(item);
			}
		}
		return searchRequestList;
	}

	private String confescateMe(String paramStr, String typex) {
		String retVal  = paramStr;
		logger.debug("paramStr = "+paramStr);
		if ((paramStr.trim().length()>0) && (!paramStr.trim().equalsIgnoreCase("NA")))
		{
			if (typex.equalsIgnoreCase("EMAIL"))
			{
				int atPlace  =paramStr.indexOf("@");
//				String updated = paramStr.substring(atPlace+1,paramStr.length());
				String updated = "***";
				paramStr = paramStr.substring(0,atPlace);
//				for (int i=0;i<3;i++)
//				{
//					updated = updated.replace(updated.charAt(i)+"", "*");
//				}
			    retVal  = paramStr+"@"+updated;
			}	    
			else if (typex.equalsIgnoreCase("PHONE"))
			{
				String updated = paramStr.substring(3,paramStr.length());
				paramStr = paramStr.substring(0,3);
				for (int i=0;i<updated.length()-1;i++)
				{
					updated = updated.replaceFirst(updated.charAt(i)+"", "*");
				}
			    retVal  = paramStr+updated;
			}
		}
		return retVal;
	}


	public static void main(String[] args) {
//		Report rpt = new Report();
		String s = "9930015350";
		String updated = s.substring(3,s.length());
		s = s.substring(0,3);
		for (int i=0;i<updated.length()-1;i++)
		{
			updated = updated.replaceFirst(updated.charAt(i)+"", "*");
		}
		System.out.println(s);
		System.out.println(updated);
	    String retVal  = s+updated;
		System.out.println(retVal);
		
	}

}
