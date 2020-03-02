package com.mlife.report.servlet;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mlife.report.pojo.Report;
import com.mlife.report.pojo.WriteDataToExcel;
import com.mobilelife.api.beans.SearchRequest;
import com.mobilelife.persistance.entities.SearchDetails;

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
		String destination = "";
		if (request.getParameter("search") != null) {
	    	destination = "";
	    } else if (request.getParameter("download") != null) {
	    	destination = "download";
	    }

	    //java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy");
	    java.text.DateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy");
	    try {
	        //java.util.Date d = df.parse(Date);
	        Date daFrom1 = format.parse(dateFrom);
	        Date daFrom = addHoursToJavaUtilDate(daFrom1,0,0);
	        Date daTo1 = format.parse(dateTo);
	        Date daTo = addHoursToJavaUtilDate(daTo1,23,59);
	        Report rpt = new Report();
	        HashMap<String, List<SearchDetails>> responseHM = rpt.getSearchRequests(daFrom, daTo);
	        if (destination.equalsIgnoreCase("download"))
	        {
				try {
					byte[] barray = new WriteDataToExcel().writetoexcell(responseHM);
					response.setContentType("application/vnd.ms-excel; charset=UTF-8");
		            response.setHeader("Pragma", "public");
		            response.setHeader("Cache-Control", "no-store");
		            response.addHeader("Cache-Control", "max-age=0");					
		    		response.setHeader("Content-Disposition", "attachment; filename="+dateFrom+"_"+dateTo+".xlsx");
//		    		PrintWriter out = response.getWriter();
		    		ServletOutputStream out = response.getOutputStream();
		    		InputStream inputStream = new ByteArrayInputStream(barray);
		            
		    		int i;   	  
		    		while ((i=inputStream.read()) != -1) {  
		    			out.write(i);   
		    		}   
		    		inputStream.close();   
		    		out.flush();
		    		out.close();
		    	} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	        else
	        {
		        session.setAttribute("reponseHM", responseHM);
				rd = request.getRequestDispatcher("mobilereport.jsp"); // for now.
				rd.forward(request, response);
	        }
	    } catch (ParseException ex) {
	        //Logger.getLogger(ReserveServlet.class.getName()).log(Level.SEVERE, null, ex);
	        System.out.println(ex);
	    }		
	}

	public Date addHoursToJavaUtilDate(Date date, int hours, int mins) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.HOUR_OF_DAY, hours);
	    calendar.add(Calendar.MINUTE, mins);
	    return calendar.getTime();
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
