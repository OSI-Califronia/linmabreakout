package de.linma.breakout.data.user;

import org.codehaus.jackson.annotate.JsonProperty;


public class User{

	private String username;
	private String rev;
	private String password;

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.rev = null;
	}

	@JsonProperty("_id")
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

	@JsonProperty("_id")
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
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

	/*
	 * (non-Javadoc)
	 * 
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

	@JsonProperty("_rev")
	public String getRev() {
		return rev;
	}
	
	@JsonProperty("_rev")
	public void setRev(String rev) {
		this.rev = rev;
	}

}