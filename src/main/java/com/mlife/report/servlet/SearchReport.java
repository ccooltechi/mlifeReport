package com.mlife.report.servlet;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mlife.report.pojo.Report;

/**
 * Servlet implementation class SearchReport
 */
public class SearchReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchReport() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dateFrom = request.getParameter("datepickerFrom");
		String dateTo = request.getParameter("datepickerTo");
	    HttpSession session = request.getSession();
		RequestDispatcher rd = null;


	    //java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy");
	    java.text.DateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy");
	    try {
	        //java.util.Date d = df.parse(Date);
	        Date daFrom1 = format.parse(dateFrom);
	        Date daFrom = addHoursToJavaUtilDate(daFrom1,0,0);
	        Date daTo1 = format.parse(dateTo);
	        Date daTo = addHoursToJavaUtilDate(daTo1,23,59);
	        
	        long difference = daTo.getTime() - daFrom.getTime();
		    float daysBetween = (difference / (1000*60*60*24));
		    System.out.println("daysBetween : "+daysBetween);
		    if (daysBetween<=2)
		    {
		        Report rpt = new Report();
		        String filename = daFrom+"-"+daTo+"-SearchedData.xlsx";
		        HashMap responseHm = rpt.getSearchRequestsDetailsHM(daFrom, daTo);
		        
		        String responseStr1 = (String)responseHm.get("SHEET1");
		        String responseStr2 = (String)responseHm.get("SHEET2");
		        XSSFWorkbook workBook = new XSSFWorkbook();
		        workBook = csvToSheet(responseStr1, workBook, "sheet1");
		        workBook = csvToSheet(responseStr2, workBook, "sheet2");
	
		        response.setContentType("application/vnd.ms-excel");
		        String headerKey = "Content-Disposition";
		        String headerValue = String.format("attachment; filename=\"%s\"", filename);
		        response.setHeader(headerKey, headerValue);
		        workBook.write(response.getOutputStream()); // Write workbook to response.
//		        workBook.close();
		    }
		    else
		    {
		    	String message = "Report can be downloaded for only 2 days";
		    	request.getSession().setAttribute("message", message);
		    	response.sendRedirect("index.jsp");
		    }
	    } catch (ParseException ex) {
	        //Logger.getLogger(ReserveServlet.class.getName()).log(Level.SEVERE, null, ex);
	        System.out.println(ex);
	    }		
	    
	}


	public XSSFWorkbook csvToSheet(String cvsString, XSSFWorkbook workBookx, String sheetName) {
		XSSFWorkbook workBook = workBookx;
        XSSFSheet sheet = workBook.createSheet(sheetName);
	    try {
	        String currentLine=null;
	        int RowNum=0;
	        Reader inputString = new StringReader(cvsString);
	        BufferedReader br = new BufferedReader(inputString);
	        while ((currentLine = br.readLine()) != null) {
	            String str[] = currentLine.split(",");
	            RowNum++;
	            XSSFRow currentRow=sheet.createRow(RowNum);
	            for(int i=0;i<str.length;i++){
	                currentRow.createCell(i).setCellValue(str[i]);
	            }
	        }
	        System.out.println("Done");
	    } catch (Exception ex) {
	        System.out.println(ex.getMessage()+"Exception in try");
	    }
        return workBook;
	}
	
	public Date addHoursToJavaUtilDate(Date date, int hours, int mins) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.HOUR_OF_DAY, hours);
	    calendar.add(Calendar.MINUTE, mins);
	    return calendar.getTime();
	}
	
	private InputStream convertStringToInputStream(String responseString) {

        InputStream result = new ByteArrayInputStream(responseString.getBytes(StandardCharsets.UTF_8));
        return result;

    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
