package com.mlife.report.pojo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.api.beans.SearchRequest;
import com.mobilelife.api.beans.Search.Country;
import com.mobilelife.api.beans.Search.DeviceFilter;
import com.mobilelife.api.beans.Search.FilterReq;
import com.mobilelife.api.beans.Search.Operator;
import com.mobilelife.persistance.entities.SearchDetails;

public class WriteDataToExcel {

	private static Logger logger = LoggerFactory.getLogger(WriteDataToExcel.class);

	public byte[] writetoexcell(HashMap<String, List<SearchDetails>> responseHM)
	  {
 	   		logger.debug("writetoexcell : Inside ");
	      //Create blank workbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet spreadsheet = workbook.createSheet("Summary");
			Set set = responseHM.entrySet();
			Iterator iterator = set.iterator();

				int countx=0;
			   XSSFRow row = spreadsheet.createRow(countx++);
			   Cell cell = row.createCell(1);
			   cell.setCellValue("Plan Type");
			   cell = row.createCell(2);
			   cell.setCellValue("Search Counts");

			while(iterator.hasNext()) {
	 	       Map.Entry mentry = (Map.Entry)iterator.next();
	 	       List<SearchDetails> searchDetailsList = (List<SearchDetails>)mentry.getValue();
			   row = spreadsheet.createRow(countx++);
			   cell = row.createCell(1);
			   cell.setCellValue(mentry.getKey()+"");
	 	       int count = 0;
	 	       if (null!=searchDetailsList)
	 	    	   count = searchDetailsList.size();
			   cell = row.createCell(2);
			   cell.setCellValue(count);
	 	   		logger.debug("writetoexcell : count "+count);
			}
          
          
			int counter=0;
		      HashMap empinfoMaster = new HashMap();
		      iterator = set.iterator();
	    while(iterator.hasNext()) {
	       Map.Entry mentry = (Map.Entry)iterator.next();
	       List<SearchDetails> searchDetailsList = (List<SearchDetails>)mentry.getValue();
	       int count = 0;
			if (null!=searchDetailsList)
			{
			      Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
				String seperator=",";
				String header = "SearchDate,Authtoken,AppID,Location,Device,BrowserType,Ipaddress,Mobileno,Mobileinfo,Longitude,Latitude,SsoUserID,UserEmail,Category,Country,Nationality,Sortby,SaveFilter,Contract,Data,DataOnly,FilterConstant,FilterType,MonthlyBud,PrepaidInline,SocialData,Dataperpage,PageNumber,AutoRenew,Flexi,International,National,CallPlanType,Countries,DeviceBrand,DeviceColor,DeviceMemory,DeviceModels,Operators,PrepaidTypeFilter,RechargeFrequency";
				String[] headerArray = header.split(",");
				empinfo.put(""+count++, headerArray);
				for (int i=0;i<searchDetailsList.size();i++)
				{
					StringBuilder sheetSB = new StringBuilder();
		    	   SearchDetails searchDetails = searchDetailsList.get(i);
		    	   SearchRequest searchRequest = convertJsonToObject(searchDetails.getSearchRequest());
		    	   if (null!=searchRequest)
		    	   {
		    		   
			    	   sheetSB.append(searchDetails.getCreationDatetime()+"");
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getAuthtoken()).orElse(""));
			    	   sheetSB.append(Optional.ofNullable(seperator+searchRequest.getAppID()).orElse(""));
			    	   if (null!=searchRequest.getUser_info())
			    	   {
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getLocation()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getDevice()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getBrowserType()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getIpaddress()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getMobileno()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getMobileinfo()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getLongitude()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getLatitude()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getSsoUserID()).orElse(""));
				    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getUser_info().getUserEmail()).orElse(""));
			    	   }
			    	   else
			    	   {
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
				    	   sheetSB.append(seperator);
			    	   }
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getCategory()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getCountry()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getNationality()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getSortby()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getSaveFilter()).orElse(""));
			    	   
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getContract()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getData()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getDataOnly()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getFilterConstant()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getFilterType()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getMonthlyBudget()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getPrepaidInline()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getSocialData()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getDataperpage()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getPageNumber()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getAutoRenew()).orElse(""));
	
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getCall_mins().getFlexi()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getCall_mins().getInternational()).orElse(""));
			    	   sheetSB.append(seperator+Optional.ofNullable(searchRequest.getSearch_criteria().getFilters().getCall_mins().getNational()).orElse(""));
			    	   
			    	   try {
				    	   List<FilterReq> filterReqList = searchRequest.getSearch_criteria().getFilters().getCallPlanType().getFilterReq();
				    	   StringBuffer callplantypeFilterSB = new StringBuffer();
				    	   for (FilterReq eachObj : filterReqList)
				    	   {
				    		   callplantypeFilterSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+callplantypeFilterSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
				    	   List<Country> countryList = searchRequest.getSearch_criteria().getFilters().getCountries().getCountry();
				    	   StringBuffer countryListFilterSB = new StringBuffer();
				    	   for (Country eachObj : countryList)
				    	   {
				    		   countryListFilterSB.append(eachObj.getCountryCode()+"|");
				    	   }
				    	   sheetSB.append(seperator+countryListFilterSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
				    	   List<DeviceFilter> deviceFilterList= searchRequest.getSearch_criteria().getFilters().getDeviceBrand().getDeviceFilter();
				    	   StringBuffer deviceBrandSB = new StringBuffer();
				    	   for (DeviceFilter eachObj : deviceFilterList)
				    	   {
				    		   deviceBrandSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+deviceBrandSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
			    		   List<DeviceFilter> deviceFilterList= searchRequest.getSearch_criteria().getFilters().getDeviceColor().getDeviceFilter();
				    	   StringBuffer deviceColorSB = new StringBuffer();
				    	   for (DeviceFilter eachObj : deviceFilterList)
				    	   {
				    		   deviceColorSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+deviceColorSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
			    		   List<DeviceFilter> deviceFilterList= searchRequest.getSearch_criteria().getFilters().getDeviceMemory().getDeviceFilter();
				    	   StringBuffer deviceMemorySB = new StringBuffer();
				    	   for (DeviceFilter eachObj : deviceFilterList)
				    	   {
				    		   deviceMemorySB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+deviceMemorySB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
			    		   List<DeviceFilter> deviceFilterList= searchRequest.getSearch_criteria().getFilters().getDeviceModels().getDeviceFilter();
				    	   StringBuffer deviceModelSB = new StringBuffer();
				    	   for (DeviceFilter eachObj : deviceFilterList)
				    	   {
				    		   deviceModelSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+deviceModelSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
				    	   List<Operator> operatorList = searchRequest.getSearch_criteria().getFilters().getOperators().getOperator();
				    	   StringBuffer operatorSB = new StringBuffer();
				    	   for (Operator eachObj : operatorList)
				    	   {
				    		   operatorSB.append(eachObj.getOperators_name()+"|");
				    	   }
				    	   sheetSB.append(seperator+operatorSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
				    	   List<FilterReq> prepaidTypeList = searchRequest.getSearch_criteria().getFilters().getPrepaidTypeFilter().getFilterReq();
				    	   StringBuffer prepaidSB = new StringBuffer();
				    	   for (FilterReq eachObj : prepaidTypeList)
				    	   {
				    		   prepaidSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+prepaidSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
			    	   try {
				    	   List<FilterReq> rechargeList = searchRequest.getSearch_criteria().getFilters().getRechargeFrequency().getFilterReq();
				    	   StringBuffer rechargeSB = new StringBuffer();
				    	   for (FilterReq eachObj : rechargeList)
				    	   {
				    		   rechargeSB.append(eachObj.getFilter()+"|");
				    	   }
				    	   sheetSB.append(seperator+rechargeSB);
			    	   }catch(Exception ex) {sheetSB.append(seperator);}
	//		    	   sheetSB.append("\"");
	//		    	   logger.debug("SheetSB : "+sheetSB.toString());
						empinfo.put(""+count++, sheetSB.toString().split(","));
		    	   }
		       	}
				empinfoMaster.put((String)mentry.getKey(), empinfo);
			}
	    }

	      //Iterate over data and write to sheet
			Set setx = empinfoMaster.entrySet();
		    Iterator iteratorx = setx.iterator();
		    while(iteratorx.hasNext()) {
		        Map.Entry mentry = (Map.Entry)iteratorx.next();
		        Map < String, Object[] > empinfo = (TreeMap < String, Object[] >)mentry.getValue();
				XSSFSheet spreadsheetx = workbook.createSheet((String)mentry.getKey());

			      Set < String > keyid = empinfo.keySet();
			      int rowid = 0;
			      for (String key : keyid) {
			    	 XSSFRow rowx =  spreadsheetx.createRow(rowid++);
			         Object [] objectArr = empinfo.get(key);
			         int cellid = 0;
			         
			         for (Object obj : objectArr){
			            Cell cellx = rowx.createCell(cellid++);
				    	   logger.debug("Cell Value"+obj);
			            cellx.setCellValue((String)obj);
//			    	   logger.debug("Cell Value"+(String)obj);
			         }
			      }
		    }
	      //Write the workbook in file system
	      ByteArrayOutputStream bos = new ByteArrayOutputStream();
	      try {
	    	  logger.debug("workbook "+bos);
	          workbook.write(bos);
	      } catch (Exception e) {
			e.printStackTrace();
		} finally {
	          try {
				bos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      byte[] returnbytes = bos.toByteArray();	      
	      System.out.println("Writesheet.xlsx written successfully : "+ returnbytes);
   		logger.debug("writetoexcell : going out ");

	      return returnbytes;
	  }

	public SearchRequest convertJsonToObject(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		SearchRequest returnObject = null;
		try {
//			logger.debug("convertJsonToObject jsonString" + jsonString);
			returnObject = mapper.readValue(jsonString, SearchRequest.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnObject;
	}

	  public void writetoexcell() throws Exception
	  {

	      //Create blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook();
	      
	      
	      //Create a blank sheet
	      XSSFSheet spreadsheet = workbook.createSheet( " Employee Info ");

	      //Create row object
	      XSSFRow row;

	      //This data needs to be written (Object[])
	      Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
	      empinfo.put( "1", new Object[] {
	         "EMP ID", "EMP NAME", "DESIGNATION" });
	      
	      empinfo.put( "2", new Object[] {
	         "tp01", "Gopal", "Technical Manager" });
	      
	      empinfo.put( "3", new Object[] {
	         "tp02", "Manisha", "Proof Reader" });
	      
	      empinfo.put( "4", new Object[] {
	         "tp03", "Masthan", "Technical Writer" });
	      
	      empinfo.put( "5", new Object[] {
	         "tp04", "Satish", "Technical Writer" });
	      
	      empinfo.put( "6", new Object[] {
	         "tp05", "Krishna", "Technical Writer" });

	      //Iterate over data and write to sheet
	      Set < String > keyid = empinfo.keySet();
	      int rowid = 0;
	      
	      for (String key : keyid) {
	         row = spreadsheet.createRow(rowid++);
	         Object [] objectArr = empinfo.get(key);
	         int cellid = 0;
	         
	         for (Object obj : objectArr){
	            Cell cell = row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	    	   logger.debug("Cell Value"+(String)obj);
	         }
	      }
	      //Write the workbook in file system
//	      FileOutputStream out = new FileOutputStream(
//	         new File("C:/poiexcel/Writesheet.xlsx"));
	      
//	      workbook.write(out);
//	      out.close();
	      System.out.println("Writesheet.xlsx written successfully");
	  }

	public static void main(String[] args) throws Exception {
		String dateFrom = "03/01/2020";
		String dateTo = "03/03/2020";
	    java.text.DateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy");

        Date daFrom = format.parse(dateFrom);
        Date daTo = format.parse(dateTo);
		 
        Report rpt = new Report();
        HashMap<String, List<SearchDetails>> responseHM = rpt.getSearchRequests(daFrom, daTo);
		byte[] barray = new WriteDataToExcel().writetoexcell(responseHM);
//		new WriteDataToExcel().writetoexcell();
		
	}

}
