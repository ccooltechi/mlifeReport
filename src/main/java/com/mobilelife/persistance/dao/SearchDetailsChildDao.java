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
import com.mobilelife.persistance.entities.SearchDetailsChild;

public class SearchDetailsChildDao {
	private static Logger logger = LoggerFactory.getLogger(SearchDetailsChildDao.class);
	
	
	public SearchDetailsChildDao()
	{
		
	}
	
	public List<SearchDetailsChild> findAll()
	{
		Session session = HibernateSessionManager.getSession();
		List<SearchDetailsChild> userInfoList = null;
		Query query = session.getNamedQuery("SearchDetailsChild.findAll");
		System.out.println("Size = "+query.list().size());
		userInfoList = (List<SearchDetailsChild>)query.list();
		return userInfoList;
	}

	public int findId()
	{
		Session session = HibernateSessionManager.getSession();
		int rid = 0;
		try {
			List<SearchDetailsChild> resultList = null;

			String query = "Select * from search_details_child order by id desc limit 2";
			logger.debug("query in findID in  search_details " + query);
			resultList = new HibernateDAO().findBySQLQuery(session, SearchDetailsChild.class, query,"search_details_child");

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

    public List<SearchDetailsChild> fetchReport(String catagory, Date fromDt ,Date toDt)
    {
        Session session = HibernateSessionManager.getSession();
        List<SearchDetailsChild> responseList = null;
        try {
            List<SearchDetailsChild> resultList = null;

            String query = "Select * from search_details_child where creation_datetime between '"+fromDt+" 00:00:01' and '"+toDt+" 23:59:59' order by creation_datetime";
            logger.debug("query in fetchReport in  search_details " + query);
            resultList = new HibernateDAO().findBySQLQuery(session, SearchDetailsChild.class, query,"search_details_child");

            logger.debug("findID  in  fetchReport Size = "+resultList.size());
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


	public void saveData(SearchDetailsChild entityObj) {
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

}
