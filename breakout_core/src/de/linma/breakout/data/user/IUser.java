package de.linma.breakout.data.user;

/**
 * Interface for Persistence User
 * @author MBausch
 *
 */
public interface IUser {

	public String getUsername();
	
	public void setUsername(String username);
	
	public String getPassword();
	
	public void setPassword(String password);
		
	public int hashCode();
	
	public boolean equals(Object obj);
}
