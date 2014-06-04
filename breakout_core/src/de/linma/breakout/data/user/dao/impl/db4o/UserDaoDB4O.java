package de.linma.breakout.data.user.dao.impl.db4o;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

import org.apache.log4j.Logger;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import com.db4o.query.Predicate;
import com.google.inject.Inject;

import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.User;
import de.linma.breakout.data.user.dao.IUserDao;

/**
 * 
 * @author MBausch
 *
 */
@NoArgsConstructor
public class UserDaoDB4O implements IUserDao {

	@Inject
	private Logger logger;
	
	private ObjectContainer db;

	public UserDaoDB4O(final String dbName) {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dbName);
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#getAllUsers()
	 */
	public List<IUser> getAllUsers() {
		try {
			return db.query(IUser.class);
			
		} catch(Exception ex) {
			logger.error("Failed to load User List ", ex);
			
			return new ArrayList<IUser>();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#deleteUser(de.linma.breakout.data.user.IUser)
	 */
	public boolean deleteUser(IUser user) {
		try {
			db.delete(user);
			db.commit();
		} catch(Exception ex) {
			logger.error("Failed to delete User", ex);
			try {
				db.rollback();
			} catch (Exception exx) {}
			
			return false;
		}
		
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#createUser(de.linma.breakout.data.user.IUser)
	 */
	public IUser createUser(final String username, final String password) {
		IUser newUser = new User(username, password);
		
		return storeUser(newUser);
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#updateUser(de.linma.breakout.data.user.IUser)
	 */
	public boolean updateUser(IUser user) {
		if (storeUser(user) == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * This method stores the User
	 * @param user
	 * @return
	 */
	private IUser storeUser(IUser user) {
		try {		
			db.store(user);
			db.commit();
		} catch(Exception ex) {
			logger.error("Failed to store User", ex);
			try {
				db.rollback();
			} catch (Exception exx) {}
			
			return null;
		}	
			
		return user;
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#close()
	 */
	public void close() {
		db.close();
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.dao.IDao#getUser(java.lang.String)
	 */
	public IUser getUser(final String username) {
		List<IUser> user = null;
		try {
			user = db.query(new Predicate<IUser>() {
	
				private static final long serialVersionUID = 3781569376331673420L;
	
				@Override
				public boolean match(IUser user) {
					return user.getUsername().equals(username);
				}
	
			});
		} catch(Db4oIOException ex) {
			logger.error("Failed to store User", ex);
			System.out.println("Db4oIOException: " + ex.getMessage());
			user = new ArrayList<IUser>();
		} catch (DatabaseClosedException e) {
			System.out.println("DatabaseClosedException: " + e.getMessage());
		}
		
		if (user != null && user.size() > 0) {
			return user.get(0);
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.user.dao.IUserDao#setLogger(org.apache.log4j.Logger)
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
