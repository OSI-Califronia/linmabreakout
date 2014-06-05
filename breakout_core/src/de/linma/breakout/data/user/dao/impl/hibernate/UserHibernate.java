package de.linma.breakout.data.user.dao.impl.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.User;

/**
 * 
 * @author MBausch
 *
 */
@Entity
@Table(name="breakout1_user")
public class UserHibernate extends User {

	private static final long serialVersionUID = -1485101148535671194L;

	/**
	 *  Default Constructor
	 */
	public UserHibernate(){
		super();
	}
	
	/**
	 * Constructor for cloneing
	 * @param modelUser
	 */
	public UserHibernate(IUser modelUser) {
		super(modelUser);
	}
	
	/**
	 * Default Constructor
	 * @param username
	 * @param password
	 */
	public UserHibernate(final String username, final String password) {
		super(username, password);
	}
	
	@Id
    @Column(name = "id", nullable = false)
	@Override
	public String getUsername() {
		return super.getUsername();
	}
	
	@Override
	public void setUsername(final String username) {
		super.setUsername(username);
	}
	
	@Override
	@Column(name = "password", nullable = false)
	public String getPassword() {
		return super.getPassword();
	}
	
	@Override
	public void setPassword(final String password) {
		super.setPassword(password);
	}
}
