package de.linma.breakout.data.highscore.dao.impl.hibernate;

import java.util.Collections;
import java.util.List;

import lombok.Setter;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.google.inject.Inject;

import de.linma.breakout.data.HibernateUtil;
import de.linma.breakout.data.highscore.IHighscore;
import de.linma.breakout.data.highscore.dao.IHighscoreDao;

public class HighscoreDaoHibernate implements IHighscoreDao {

	@Inject
	@Setter
	private Logger logger;
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#getSortedHighscore()
	 */
	@SuppressWarnings("unchecked")
	public List<IHighscore> getSortedHighscore() {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			
			tx = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(HighscoreHibernate.class);
			List<IHighscore> list = criteria.list();
						
			tx.commit();
			
			Collections.sort(list);
			
			return list;
		} catch (HibernateException ex) {
			logger.error("Failed to get Highscore List", ex);
						
			if (tx != null) {
				try {
					tx.rollback();
				} catch (HibernateException exRb) {	}
			}
			
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#addHighscore(java.lang.String, java.lang.Integer)
	 */
	public boolean addHighscore(String userName, Integer points) {
		HighscoreHibernate newUser = new HighscoreHibernate(userName, points);
		
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			session.save(newUser);
			
			tx.commit();
			
			return true;
		} catch (HibernateException ex) {
			logger.error("Failed to save Highscore", ex);
			if (tx != null) {
				try {
					tx.rollback();
				} catch (HibernateException exRb) {	}
			}
			return false;			
		} 
	}
	
	public boolean clearHighscore() {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("Delete FROM HighscoreHibernate");
			query.executeUpdate();
			
			tx.commit();
			
			return true;
		} catch (HibernateException ex) {
			logger.error("Failed to clear Highscore", ex);
			if (tx != null) {
				try {
					tx.rollback();
				} catch (HibernateException exRb) {	}
			}
			return false;			
		} 
		
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.user.dao.IUserDao#close()
	 */
	public void close() {
		HibernateUtil.getInstance().close();
	}

	
}
