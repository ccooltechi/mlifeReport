package com.mlife.report.pojo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.api.beans.SearchRequest;
import com.mobilelife.dbutils.HibernateSessionManager;
import com.mobilelife.persistance.dao.SearchDetailsChildDao;
import com.mobilelife.persistance.dao.SearchDetailsDao;
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
		Session session = HibernateSessionManager.getSession();
		try {
			for (int x=0; x<searchDetailsChildList.size();x++)
			{
				SearchDetailsChild searchDetailsChild = searchDetailsChildList.get(x); 
				List<SearchDetailsXtimes>  searchDetailsXtimesList = searchDetailsXtimesDao.findBySearchChildId(searchDetailsChild.getId(), session);
				if (null!=searchDetailsXtimesList)
				{
					for (int i=0; i<searchDetailsXtimesList.size();i++)
					{
						SearchDetailsXtimes searchDetailsXtimes = searchDetailsXtimesList.get(i);
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
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
			session.flush();
			session.clear();
			session.close();
		}
		return retValue.toString();
	}

	private String makeSheet1CSV(List<SearchDetailsChild> searchDetails1) {
		StringBuffer retValue = new StringBuffer();
		retValue.append("Token ,");
		retValue.append("status ,");
		retValue.append("Id ,");
		retValue.append("SearchDate ,");
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
		retValue.append("Selected Plan ,");
		retValue.append("Compaired Plans ,");
		retValue.append("PlanReponse");
		retValue.append("\n");

		if(null!=searchDetails1)
		{
			String checktoken = "";
			for (int i=0;i<searchDetails1.size();i++)
			{
				SearchDetailsChild searchDetailsChild = searchDetails1.get(i);
				String checktokenX = searchDetailsChild.getToken();
				String loggedinuser = searchDetailsChild.getSearchId().getSsoUserId();
				String fname = searchDetailsChild.getSearchId().getFirstName();
				String lname = searchDetailsChild.getSearchId().getLastName();
				String phone = searchDetailsChild.getSearchId().getMobileNo();
				String operator = searchDetailsChild.getOperator();
				String defaultStr = "";
				operator = operator.replace(",", "|");
				String planresponse = searchDetailsChild.getPlanReponse();
				if (!checktoken.equalsIgnoreCase(checktokenX))
					defaultStr = "DEFAULT";
				
				checktoken = checktokenX;

				retValue.append(searchDetailsChild.getToken()+",");
				retValue.append(defaultStr+",");
				retValue.append(searchDetailsChild.getId()+",");
				retValue.append(searchDetailsChild.getCreationDatetime()+",");
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
				retValue.append(searchDetailsChild.getSelectedPlan()+",");
				retValue.append(searchDetailsChild.getCompairedPlans()+",");
				retValue.append(planresponse);
				retValue.append("\n");

			}
		}
		return retValue.toString();
	}

	private List<SearchDetails> mapSearchRequest(List<SearchDetails> searchDetails) {

		List<SearchDetails> searchRequestList = null;
		if (null!=searchDetails)
		{
			searchRequestList = new ArrayList<SearchDetails>();
			for(SearchDetails item : searchDetails){
//				SearchRequest searchRequest = new SearchRequest();
//				searchRequest = (SearchRequest) convertJsonToObject(item.getSearchRequest(), searchRequest);
				searchRequestList.add(item);
			}
		}
		return searchRequestList;
	}

	private List<SearchRequest> mapSearchRequestOLD(List<SearchDetails> searchDetails) {

		List<SearchRequest> searchRequestList = null;
		if (null!=searchDetails)
		{
			searchRequestList = new ArrayList<SearchRequest>();
			for(SearchDetails item : searchDetails){
				SearchRequest searchRequest = new SearchRequest();
				searchRequest = (SearchRequest) convertJsonToObject(item.getSearchRequest(), searchRequest);
				searchRequestList.add(searchRequest);
			}
		}
		return searchRequestList;
	}

	public Object convertJsonToObject(String jsonString, Object javaObject)
	{
        ObjectMapper mapper = new ObjectMapper();
        Object returnObject = null; 
        try
        {
        	logger.debug("convertJsonToObject jsonString"+jsonString);
        	if (javaObject instanceof SearchRequest)
        		returnObject = mapper.readValue(jsonString, SearchRequest.class);
        }
        catch (JsonGenerationException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }	
        return returnObject;
	}

	public static void main(String[] args) {
		Report rpt = new Report();
	    Calendar calendar1 = Calendar.getInstance();
	    calendar1.add(Calendar.HOUR_OF_DAY, 0);
	    calendar1.add(Calendar.MINUTE, 1);
	    Calendar calendar2 = Calendar.getInstance();
	    calendar2.add(Calendar.HOUR_OF_DAY, 23);
	    calendar2.add(Calendar.MINUTE, 59);
		
        Date daFrom = calendar1.getTime();
        Date daTo = calendar2.getTime(); 

        System.out.println(daFrom+" -- "+calendar1.getTimeInMillis());
        System.out.println(daTo+" -- "+calendar2.getTimeInMillis());
        System.out.println(calendar2.getTimeInMillis() - calendar1.getTimeInMillis());
//		rpt.getSearchRequestsDetailsHM(daFrom, daTo);
	}

}
