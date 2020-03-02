package com.mlife.report.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.persistance.dao.SearchDetailsDao;
import com.mobilelife.persistance.entities.SearchDetails;

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

//	private List<SearchRequest> mapSearchRequestOLD(List<SearchDetails> searchDetails) {
//
//		List<SearchRequest> searchRequestList = null;
//		if (null!=searchDetails)
//		{
//			searchRequestList = new ArrayList<SearchRequest>();
//			for(SearchDetails item : searchDetails){
//				SearchRequest searchRequest = new SearchRequest();
//				searchRequest = (SearchRequest) convertJsonToObject(item.getSearchRequest(), searchRequest);
//				searchRequestList.add(searchRequest);
//			}
//		}
//		return searchRequestList;
//	}
//
	public static void main(String[] args) {
		Report rpt = new Report();
//		rpt.getSearchRequests();
	}

}
