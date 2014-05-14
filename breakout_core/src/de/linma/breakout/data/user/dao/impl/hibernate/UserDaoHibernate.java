package de.linma.breakout.data.user.dao.impl.hibernate;

import java.util.List;

import lombok.NoArgsConstructor;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.google.inject.Inject;

import de.linma.breakout.data.HibernateUtil;
import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.dao.IUserDao;

/**
 * 
 * @author MBausch
 *
 */
@NoArgsConstructor
public class UserDaoHibernate implements IUserDao {
	
	@Inject
	private Logger logger;
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.user.dao.IUserDao#getAllUsers()
	 */
	@SuppressWarnings("unchecked")
	public List<IUser> getAllUsers() {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			
			tx = session.beginTransaction();
			
			Criteria criteria = session.createCriteria(UserHibernate.class);
			List<IUser> userList = criteria.list();
			
			tx.commit();
			
			return userList;
		} catch (HibernateException ex) {
			logger.error("Failed to get User", ex);
						
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
	 * @see de.linma.breakout.data.user.dao.IUserDao#getUser(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public IUser getUser(final String username) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
						
			Criteria criteria = session.createCriteria(UserHibernate.class);
			criteria.add(Restrictions.eq("id", username));
						
			List<? extends IUser> result = criteria.list();
			
			tx.commit();
			
			if (result.size() > 0) {
				return result.get(0);
			}
			return null;
		} catch (HibernateException ex) {
			logger.error("Failed to get User", ex);
			
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
	 * @see de.linma.breakout.data.user.dao.IUserDao#deleteUser(de.linma.breakout.data.user.IUser)
	 */
	public boolean deleteUser(IUser user) {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			session.delete(user);
			
			tx.commit();
			
			return true;
		} catch (HibernateException ex) {
			logger.error("Failed to delete User", ex);
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
	 * @see de.linma.breakout.data.user.dao.IUserDao#createUser(java.lang.String, java.lang.String)
	 */
	public IUser createUser(String username, String password) {
		UserHibernate newUser = new UserHibernate(username, password);
		
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			session.save(newUser);
			
			tx.commit();
			
			return newUser;
		} catch (HibernateException ex) {
			logger.error("Failed to save User", ex);
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
	 * @see de.linma.breakout.data.user.dao.IUserDao#updateUser(de.linma.breakout.data.user.IUser)
	 */
	public boolean updateUser(IUser user) {		
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getInstance().getCurrentSession();
			tx = session.beginTransaction();
			
			session.update(user);
			
			tx.commit();
			
			return true;
		} catch (HibernateException ex) {
			logger.error("Failed to update User", ex);
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

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.user.dao.IUserDao#setLogger(org.apache.log4j.Logger)
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
