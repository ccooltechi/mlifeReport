package com.mobilelife.persistance.dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.dbutils.HibernateDAO;
import com.mobilelife.dbutils.HibernateSessionManager;
import com.mobilelife.persistance.entities.SearchDetails;

public class SearchDetailsDao {
	private static Logger logger = LoggerFactory.getLogger(SearchDetailsDao.class);
	
	
	public SearchDetailsDao()
	{
		
	}
	
	public List<SearchDetails> findAll()
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetails> userInfoList = null;
		Query query = session.getNamedQuery("SearchDetails.findAll");
		System.out.println("Size = "+query.list().size());
		userInfoList = (List<SearchDetails>)query.list();
		return userInfoList;
	}

	public List<SearchDetails> findSearchInfoByID(String ssoUserId)
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetails> userInfoList = null;
		Query query = session.getNamedQuery("SearchDetails.findBySsoUserId");
		query.setParameter("ssoUserId", ssoUserId);
		System.out.println("findSearchInfoByID = "+ssoUserId);
		userInfoList = (List<SearchDetails>)query.list();
		return userInfoList;
	}
	
	public int findId()
	{
		Session session = HibernateSessionManager.getSession();
		int rid = 0;
		try {
			List<SearchDetails> resultList = null;

			String query = "Select * from search_details order by id desc limit 2";
			logger.debug("query in findID in  search_details " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetails.class, query,"search_details");

			logger.debug("findID  in  UserInfo Size = "+resultList.size());
			if ((null!=resultList) && (resultList.size()>0))
			{
				rid = resultList.get(0).getId();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.flush();
			session.clear();
			session.close();
			// HibernateSessionManager.closeSession()();
		}
		return rid;
	}


    public List<SearchDetails> searchByCatagory(String catagory, Date fromDt ,Date toDt)
    {
        Session session = HibernateSessionManager.getSession();
        List<SearchDetails> responseList = null;
        try {
            List<SearchDetails> resultList = null;

            String query = "Select * from search_details where searchRequest like '%\"category\":\""+catagory+"\"%' and creation_datetime between '"+fromDt+" 00:00:01' and '"+toDt+" 23:59:59'";
            logger.debug("query in searchByCatagory in  search_details " + query);
            resultList = new HibernateDAO().findBySQLQuery(session, SearchDetails.class, query,"search_details");

            logger.debug("findID  in  UserInfo Size = "+resultList.size());
            if ((null!=resultList) && (resultList.size()>0))
            {
                responseList = resultList;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.flush();
            session.clear();
            session.close();
            // HibernateSessionManager.closeSession()();
        }
        return responseList;
    }

	public void saveData(SearchDetails entityObj) {
		Session session = HibernateSessionManager.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(entityObj);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	
	public static void main(String[] args) {
		SearchDetailsDao searchPlan = new SearchDetailsDao();
	}


}
