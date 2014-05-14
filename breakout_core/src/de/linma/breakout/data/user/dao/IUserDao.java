package de.linma.breakout.data.user.dao;

import java.util.List;

import org.apache.log4j.Logger;

import de.linma.breakout.data.user.IUser;

/**
 * 
 * @author MBausch
 *
 */
public interface IUserDao {
	
	/**
	 * This method sets the logger
	 * @param logger
	 */
	void setLogger(Logger logger);

	/**
	 * Returns all stored Users.
	 * 
	 * @return List of all Users in the Database
	 */
	List<IUser> getAllUsers();

	/**
	 * Returns a User from the database, who has the given Username and the password matches.
	 * 
	 * @param username
	 *            Username of the searched user
	 *            
	 * @return User with the given username
	 */
	IUser getUser(final String username);

	/**
	 * Delete a given User from a Database. If the User doesn't exists, nothing
	 * happens.
	 * 
	 * @param user
	 *            User who should be deleted
	 */
	boolean deleteUser(IUser user);

	/**
	 * Stores a given User in a Database. If a user with the given username
	 * exists, this null will be returned.
	 * 
	 * @return Created User
	 */
	IUser createUser(final String username, final String password);

	/**
	 * Updates a User in the Database.
	 * 
	 * @param user
	 * @return
	 */
	boolean updateUser(IUser user);

	/**
	 * Close the database
	 */
	void close();
}
