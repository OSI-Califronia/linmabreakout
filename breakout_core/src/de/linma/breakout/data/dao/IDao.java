package de.linma.breakout.data.dao;

import java.util.List;

import de.linma.breakout.data.user.User;

public interface IDao {

	/**
	 * Returns all stored Users.
	 * 
	 * @return List of all Users in the Database
	 */
	List<User> getAllUsers();

	/**
	 * Returns a User from the database, who has the given Username and the password matches.
	 * 
	 * @param username
	 *            Username of the searched user
	 * @param password
	 *            Password of the User
	 * @return User with the given username
	 */
	User getUser(final String username, final String password);

	/**
	 * Delete a given User from a Database. If the User doesn't exists, nothing
	 * happens.
	 * 
	 * @param user
	 *            User who should be deleted
	 */
	void deleteUser(User user);

	/**
	 * Stores a given User in a Database. If a user with the given username
	 * exists, this null will be returned.
	 * 
	 * @param username
	 * @param password
	 * @return Created User
	 */
	User createUser(String username, String password);

	/**
	 * Updates a User in the Database.
	 * 
	 * @param user
	 * @return
	 */
	void updateUser(User user);

	/**
	 * Close the database
	 */
	void close();
}
