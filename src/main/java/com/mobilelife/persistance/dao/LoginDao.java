package com.mobilelife.persistance.dao;
import java.util.List;

import org.hibernate.Session;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.mobilelife.dbutils.HibernateDAO;
import com.mobilelife.dbutils.HibernateSessionManager;
import com.mobilelife.persistance.entities.UserAccess;
public class LoginDao {
//	private static Logger logger = LoggerFactory.getLogger(LoginDao.class);

	public static boolean validate(LoginBean bean){
		boolean status=false;
    	UserAccess userAccess =  null;
        Session session = HibernateSessionManager.getSession();
        try
        {
			String username = bean.getEmail();
			String password = bean.getPass();
	        String query = "Select * from user_access where userName ='"+username+"' and password ='"+password+"' and online = 0 ";
	        System.out.println("query in authenticate "+query);
	        List<UserAccess> db_UserAccessList = null;
	        db_UserAccessList = new HibernateDAO().findBySQLQuery(session, UserAccess.class, query, "user_access");
	       
	        if ((null != db_UserAccessList) && (db_UserAccessList.size() > 0)) {
	        	for (int i = 0; i < db_UserAccessList.size(); i++) {
	        		userAccess =  db_UserAccessList.get(i);
	        		System.out.println("getUserName   "+userAccess.getUserName());
	        		status = true;
	        	}
	        }
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.flush();
			session.clear();
			session.close();
		}
    	

		return status;
	}
}
