package com.mlife.report.pojo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.api.beans.SearchRequest;
import com.mobilelife.persistance.dao.SearchDetailsChildDao;
import com.mobilelife.persistance.dao.SearchDetailsDao;
import com.mobilelife.persistance.entities.SearchDetails;
import com.mobilelife.persistance.entities.SearchDetailsChild;

public class Report {

	private static Logger logger = LoggerFactory.getLogger(Report.class);

	public HashMap<String, List<SearchDetails>> getSearchRequests(Date daFrom, Date daTo)
	{
		HashMap<String, List<SearchDetails>> responseHM = new HashMap<String, List<SearchDetails>>();
		SearchDetailsDao searchDetailsDao = new SearchDetailsDao();
		List<SearchDetails> SearchDetails1 = (searchDetailsDao.searchByCatagory("1", new java.sql.Date(daFrom.getTime()), new java.sql.Date(daTo.getTime())));
		List<SearchDetails> SearchDetails2 = (searchDetailsDao.searchByCatagory("2", new java.sql.Date(daFrom.getTime()), new java.sql.Date(daTo.getTime())));
		List<SearchDetails> SearchDetails7 = (searchDetailsDao.searchByCatagory("7", new java.sql.Date(daFrom.getTime()), new java.sql.Date(daTo.getTime())));

//		List<SearchRequest> searchRequestList1= mapSearchRequest(SearchDetails1);
//		List<SearchRequest> searchRequestList2= mapSearchRequest(SearchDetails1);
//		List<SearchRequest> searchRequestList7= mapSearchRequest(SearchDetails1);

		List<SearchDetails> searchRequestList1= mapSearchRequest(SearchDetails1);
		List<SearchDetails> searchRequestList2= mapSearchRequest(SearchDetails2);
		List<SearchDetails> searchRequestList7= mapSearchRequest(SearchDetails7);
		
		responseHM.put("Postpaid", searchRequestList1);
		responseHM.put("Prepaid", searchRequestList2);
		responseHM.put("MobileSim", searchRequestList7);
		return responseHM;
	}

	public String getSearchRequestsDetails(Date daFrom, Date daTo)
	{
		String responseStr = "";
		SearchDetailsChildDao searchDetailsDao = new SearchDetailsChildDao();
		List<SearchDetailsChild> SearchDetails1 = (searchDetailsDao.fetchReport("1", new java.sql.Date(daFrom.getTime()), new java.sql.Date(daTo.getTime())));
		responseStr= makeCSV(SearchDetails1);
		return responseStr;
	}

	private String makeCSV(List<SearchDetailsChild> searchDetails1) {
		StringBuffer retValue = new StringBuffer();
		retValue.append("Token ,");
		retValue.append("status ,");
		retValue.append("Id ,");
		retValue.append("SearchDate ,");
		retValue.append("RequestType,");
		retValue.append("Category ,");
		retValue.append("Subcategory ,");
		retValue.append("Moresaving ,");
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
		retValue.append("PlanReponse");
		retValue.append("\n");

		if(null!=searchDetails1)
		{
			String checktoken = "";
			for (int i=0;i<searchDetails1.size();i++)
			{
				SearchDetailsChild searchDetailsChild = searchDetails1.get(i);
				String checktokenX = searchDetailsChild.getToken();
				retValue.append(searchDetailsChild.getToken()+",");
				if (!checktoken.equalsIgnoreCase(checktokenX))
					retValue.append("DEFAULT,");
				else
					retValue.append(",");
				checktoken = checktokenX;
				retValue.append(searchDetailsChild.getId()+",");
				retValue.append(searchDetailsChild.getCreationDatetime()+",");
				retValue.append(searchDetailsChild.getRequestType()+",");
				retValue.append(searchDetailsChild.getCategory()+",");
				retValue.append(searchDetailsChild.getSubcategory()+",");
				retValue.append(searchDetailsChild.getMoresaving()+",");
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
				String operator = searchDetailsChild.getOperator();
				operator = operator.replace(",", "|");
				retValue.append(operator+",");
				String planresponse = searchDetailsChild.getPlanReponse();
//				planresponse = planresponse.replace(",", "|");
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
//		rpt.getSearchRequests();
	}

}
