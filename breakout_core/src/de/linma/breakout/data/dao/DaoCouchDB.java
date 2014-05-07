package de.linma.breakout.data.dao;

import java.net.MalformedURLException;
import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import de.linma.breakout.data.user.User;

public class DaoCouchDB implements IDao {

	private CouchDbConnector db;

	public DaoCouchDB(String dbUrl, String dbName) {
		HttpClient client;
		try {
			client = new StdHttpClient.Builder().url(dbUrl).build();
			CouchDbInstance dbInstance = new StdCouchDbInstance(client);
			db = dbInstance.createConnector(dbName, true);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DaoCouchDB() {
		this("http://lenny2.in.htwg-konstanz.de:5984", "07-breakout1");
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String username, String password) {
		User user;
		try{
			user = db.get(User.class, username);
		}catch (DocumentNotFoundException e){
			return null;
		}
		if(password.equals(user.getPassword())){
			return user;
		}else{
			return null;
		}
	}

	public void deleteUser(User user) {
		db.delete(user.getUsername(), user.getRev());
	}

	public User createUser(String username, String password) {
		if (getUser(username) == null){
			User user = new User(username, password);
			db.create(user);
			return user;
		}else{
			return null;
		}
	}
	
	private User getUser(String username){
		User user;
		try{
			user = db.get(User.class, username);
		}catch (DocumentNotFoundException e){
			return null;
		}
		return user;
	}

	public void updateUser(User user) {
		db.update(user);
	}

	public void close() {
		// TODO Auto-generated method stub
	}

}
