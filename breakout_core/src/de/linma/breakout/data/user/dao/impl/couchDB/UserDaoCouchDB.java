package de.linma.breakout.data.user.dao.impl.couchDB;

import java.net.MalformedURLException;
import java.util.List;

import lombok.NoArgsConstructor;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.User;
import de.linma.breakout.data.user.dao.IUserDao;

@NoArgsConstructor
public class UserDaoCouchDB implements IUserDao {

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
		// TODO Auto-generated method stub
		return null;
	}

	public IUser getUser(final String username) {
		try {
			return db.get(UserCouchDB.class, username);
		} catch (DocumentNotFoundException e){
			return null;
		}
	}

	public boolean deleteUser(IUser user) {
		if (user instanceof UserCouchDB) {
			UserCouchDB couchDBUser = (UserCouchDB) user;
			db.delete(couchDBUser.getUsername(), couchDBUser.getRev());
			// TODO check resultset
			
			return true;
		}
		return false;
	}

	public User createUser(final String username, final String password) {
		UserCouchDB newUser = new UserCouchDB(username, password);
		db.create(newUser);
		return newUser;
	}
	
	public boolean updateUser(IUser user) {
		UserCouchDB updUser = new UserCouchDB(user);
		db.update(updUser);
		return true;
	}

	public void close() {
		// no implementation needed
	}
}
