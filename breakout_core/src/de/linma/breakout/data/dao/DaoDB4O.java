package de.linma.breakout.data.dao;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.linma.breakout.data.user.User;

public class DaoDB4O implements IDao {

	private ObjectContainer db;

	public DaoDB4O(String dbName) {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dbName);
	}

	public DaoDB4O() {
		this("users.db4o");
	}

	public List<User> getAllUsers() {
		List<User> allUsers = db.query(User.class);
		return allUsers;
	}

	public User getUser(final String username, final String password) {
		List<User> user = db.query(new Predicate<User>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 3781569376331673420L;

			@Override
			public boolean match(User user) {
				if(user.getUsername().equals(username) && user.getPassword().equals(password)){
					return true;
				}else{
					return false;
				}
			}

		});
		if (user.size() > 0) {
			return user.get(0);
		} else {
			return null;
		}
	}

	public void deleteUser(User user) {
		db.delete(user);
		db.commit();
	}

	public User createUser(String username, String password) {
		User existingUser = getUser(username);
		if(existingUser != null){
			return null;
		}
		User newUser = new User(username, password);
		db.store(newUser);
		db.commit();
		return newUser;
	}
	
	public void updateUser(User user) {
		db.store(user);
		db.commit();
	}

	public void close() {
		db.commit();
		db.close();
	}
	
	private User getUser(final String username){
		List<User> user = db.query(new Predicate<User>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 3781569376331673420L;

			@Override
			public boolean match(User user) {
				if(user.getUsername().equals(username)){
					return true;
				}else{
					return false;
				}
			}

		});
		if (user.size() > 0) {
			return user.get(0);
		} else {
			return null;
		}
	}

}
