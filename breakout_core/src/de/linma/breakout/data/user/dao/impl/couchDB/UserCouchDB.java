package de.linma.breakout.data.user.dao.impl.couchDB;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.NoArgsConstructor;
import de.linma.breakout.data.user.IUser;
import de.linma.breakout.data.user.User;

/**
 * 
 * @author MBausch
 *
 */
@NoArgsConstructor
public class UserCouchDB extends User {

	private static final long serialVersionUID = -6800307501087281150L;
	
	private String rev;
	
	public UserCouchDB(IUser modelUser) {
		super(modelUser);
	}
	
	/**
	 * Default Constructor
	 * @param username
	 * @param password
	 */
	public UserCouchDB(final String username, final String password) {
		super(username, password);
		this.rev = null;
	}
	
	@JsonProperty("_id")
	@Override
	public String getUsername() {
		return super.getUsername();
	}
	
	@JsonProperty("_id")
	@Override
	public void setUsername(final String username) {
		super.setUsername(username);
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
