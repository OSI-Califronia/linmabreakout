package de.linma.breakout.data.user.dao.impl.couchDB;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

import org.apache.log4j.Logger;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.UpdateConflictException;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import com.google.inject.Inject;

import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.User;
import de.linma.breakout.data.user.dao.IUserDao;

@NoArgsConstructor
public class UserDaoCouchDB implements IUserDao {
	
	@Inject
	private Logger logger;

	private CouchDbConnector db;

	public UserDaoCouchDB(final String dbUrl, final String dbName) {
		HttpClient client;
		try {
			client = new StdHttpClient.Builder().url(dbUrl).build();
			CouchDbInstance dbInstance = new StdCouchDbInstance(client);
			db = dbInstance.createConnector(dbName, true);
		} catch (MalformedURLException e) {
			
		}
	}

	public List<IUser> getAllUsers() {
		List<IUser> userList = new ArrayList<IUser>();
		for (String id : db.getAllDocIds()) {
			IUser user = getUser(id);
			if (user != null) {
				userList.add(user);
			}
		}
		return userList;
	}

	public IUser getUser(final String username) {
		try {
			return db.get(UserCouchDB.class, username);
		} catch (DocumentNotFoundException e){
			logger.error("Could not get User", e);
			return null;
		}
	}

	public boolean deleteUser(IUser user) {
		UserCouchDB delUser = new UserCouchDB(user);
		
		// check if user object is not of Instance UserCouchDB
		if (!(user instanceof UserCouchDB) || 
			((user instanceof UserCouchDB) && ((UserCouchDB) user).getRev() == null)) {
			UserCouchDB fetchUser = db.get(UserCouchDB.class, user.getUsername());	
			delUser.setRev(fetchUser.getRev());
		}
		try {
			db.delete(delUser.getUsername(), delUser.getRev());
			return true;
			
		} catch (UpdateConflictException e) {
			logger.error("Could not delete User", e);
			return false;
		}
	}

	public User createUser(final String username, final String password) {
		UserCouchDB newUser = new UserCouchDB(username, password);
		try {
			db.create(newUser);
			return newUser;
		} catch (UpdateConflictException e) {
			logger.error("Could not create User", e);
			return null;
		}		
	}
	
	public boolean updateUser(IUser user) {
		UserCouchDB updUser = new UserCouchDB(user);
		
		// check if user object is not of Instance UserCouchDB
		if (!(user instanceof UserCouchDB) || 
			((user instanceof UserCouchDB) && ((UserCouchDB) user).getRev() == null)) {
			UserCouchDB fetchUser = db.get(UserCouchDB.class, user.getUsername());	
			updUser.setRev(fetchUser.getRev());
		}		
		try {
			db.update(updUser);
			
			if (user instanceof UserCouchDB) {
				((UserCouchDB) user).setRev(updUser.getRev());
			}
			
			return true;
			
		} catch (UpdateConflictException e) {
			logger.error("Could not delete User", e);
			return false;
		}
	}

	public void close() {
		// no implementation needed
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.user.dao.IUserDao#setLogger(org.apache.log4j.Logger)
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
