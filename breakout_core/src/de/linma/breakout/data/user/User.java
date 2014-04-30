package de.linma.breakout.data.user;

import javax.persistence.Id;

public class User {
	
	private static User user = null;

	@Id
	private String username;
	
	private String password;	
	
	public User() {
		super();
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		if (username == null) {
			return "";
		}
		return username;
	}
	
	public String getPassword() {
		if (password == null) {
			return "";
		}
		return password;
	}	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static User findByUsername(String username) {
		if (user == null) {
			user = new User("luma", "lülü");
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
}