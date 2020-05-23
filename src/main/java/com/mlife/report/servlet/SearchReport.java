package com.mlife.report.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
	        Report rpt = new Report();
//	        HashMap<String, List<SearchDetails>> responseHM = rpt.getSearchRequests(daFrom, daTo);
//	        session.setAttribute("reponseHM", responseHM);
//			rd = request.getRequestDispatcher("mobilereport.jsp"); // for now.
//			rd.forward(request, response);
	        String filename = daFrom+"-"+daTo+"-SearchedData.csv";
	        String responseStr = rpt.getSearchRequestsDetails(daFrom, daTo);
	        InputStream inStream = convertStringToInputStream(responseStr);
	        response.setContentType("application/octet-stream");
	        response.setContentLength((int) responseStr.length());
	        
	        String headerKey = "Content-Disposition";
	        String headerValue = String.format("attachment; filename=\"%s\"", filename);
	        response.setHeader(headerKey, headerValue);
	         
	        OutputStream outStream = response.getOutputStream();
	        
	        byte[] buffer = new byte[4096];
	        int bytesRead = -1;
	         
	        while ((bytesRead = inStream.read(buffer)) != -1) {
	            outStream.write(buffer, 0, bytesRead);
	        }
	         
	        inStream.close();
	        outStream.close(); 
	    } catch (ParseException ex) {
	        //Logger.getLogger(ReserveServlet.class.getName()).log(Level.SEVERE, null, ex);
	        System.out.println(ex);
	    }		
	    
//		response.getWriter().append("Served at: ").append(request.getContextPath());
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
