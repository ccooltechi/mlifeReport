package com.mobilelife.persistance.dao;

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
		//logger.debug("Size = "+query.list().size());
		userInfoList = (List<SearchDetails>)query.list();
		return userInfoList;
	}

	public List<SearchDetails> findSearchInfoByID(String ssoUserId)
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetails> userInfoList = null;
		Query query = session.getNamedQuery("SearchDetails.findBySsoUserId");
		query.setParameter("ssoUserId", ssoUserId);
		//logger.debug("findSearchInfoByID = "+ssoUserId);
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
			//logger.debug("query in findID in  search_details " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetails.class, query,"search_details");

			//logger.debug("findID  in  UserInfo Size = "+resultList.size());
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

	public List<SearchDetails> findAllByDate(String dt1, String dt2)
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetails> resultListx = null;
		try {
			List<SearchDetails> resultList = null;
			String query = "Select * from search_details where is_active=1 and creation_datetime between  '"+dt1+"' and '"+dt2+"'";
			//logger.debug("query in findID in  search_details " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetails.class, query,"search_details");

			//logger.debug("findID  in  UserInfo Size = "+resultList.size());
			if ((null!=resultList) && (resultList.size()>0))
			{
				resultListx = resultList;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.flush();
			session.clear();
			session.close();
			// HibernateSessionManager.closeSession()();
		}
		return resultListx;
	}

	public SearchDetails findAllById(Integer searchid)
	{
		Session session = HibernateSessionManager.getSession();
		SearchDetails resultListx = null;
		try {
			List<SearchDetails> resultList = null;
			String query = "Select * from search_details where searchid ="+searchid;
			//logger.debug("query in findID in  search_details " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetails.class, query,"search_details");

			//logger.debug("findID  in  UserInfo Size = "+resultList.size());
			if ((null!=resultList) && (resultList.size()>0))
			{
				resultListx = resultList.get(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.flush();
			session.clear();
			session.close();
			// HibernateSessionManager.closeSession()();
		}
		return resultListx;
	}

	public boolean saveData(SearchDetails entityObj) {
		Session session = HibernateSessionManager.getSession();
		boolean retVal = false;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(entityObj);
			tx.commit();
			retVal = true;
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
			retVal = false;
		} finally {
			session.close();
		}
		return retVal;
	}

	public void updateData(SearchDetails entityObj) {
		Session session = HibernateSessionManager.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(entityObj);
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
