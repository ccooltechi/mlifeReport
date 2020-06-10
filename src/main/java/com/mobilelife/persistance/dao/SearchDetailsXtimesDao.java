package com.mobilelife.persistance.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mobilelife.dbutils.HibernateDAO;
import com.mobilelife.dbutils.HibernateSessionManager;
import com.mobilelife.persistance.entities.SearchDetailsXtimes;

public class SearchDetailsXtimesDao {
	private static Logger logger = LoggerFactory.getLogger(SearchDetailsXtimesDao.class);
	
	
	public SearchDetailsXtimesDao()
	{
		
	}
	
	public List<SearchDetailsXtimes> findAll()
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetailsXtimes> userInfoList = null;
		Query query = session.getNamedQuery("SearchDetailsXtimes.findAll");
		//logger.debug("Size = "+query.list().size());
		userInfoList = (List<SearchDetailsXtimes>)query.list();
		return userInfoList;
	}

	public int findId()
	{
		Session session = HibernateSessionManager.getSession();
		int rid = 0;
		try {
			List<SearchDetailsXtimes> resultList = null;

			String query = "Select * from search_details_xtimes order by id desc limit 2";
			//logger.debug("query in findID in  search_details_xtimes " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetailsXtimes.class, query,"search_details_xtimes");

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


	public void saveData(SearchDetailsXtimes entityObj) {
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

	public List<SearchDetailsXtimes> findBySearchChildId(Integer searchChildId, Session session) {
		List<SearchDetailsXtimes> retVal = null;
		try {
			List<SearchDetailsXtimes> resultList = null;

            String query = "Select * from search_details_xtimes where search_id ="+searchChildId;
			logger.debug("query in findID in  search_details_xtimes " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetailsXtimes.class, query,"search_details_xtimes");

			//logger.debug("findID  in  UserInfo Size = "+resultList.size());
			if ((null!=resultList) && (resultList.size()>0))
			{
				retVal = resultList;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return retVal;
	}

}
