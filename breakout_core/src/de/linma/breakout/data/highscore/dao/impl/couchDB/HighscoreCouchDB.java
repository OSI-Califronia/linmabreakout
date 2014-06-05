package de.linma.breakout.data.highscore.dao.impl.couchDB;

import lombok.NoArgsConstructor;

import org.codehaus.jackson.annotate.JsonProperty;

import de.linma.breakout.data.highscore.Highscore;
import de.linma.breakout.data.highscore.IHighscore;

/**
 * 
 * @author MBausch
 *
 */
@NoArgsConstructor
public class HighscoreCouchDB extends Highscore {

	private static final long serialVersionUID = 463710480859416549L;
	
	private String id;
	private String rev;
	
	public HighscoreCouchDB(IHighscore modelHighscore) {
		super(modelHighscore);
		
		if (modelHighscore instanceof HighscoreCouchDB) {
			this.rev = ((HighscoreCouchDB) modelHighscore).getRev();
			this.id = ((HighscoreCouchDB) modelHighscore).getId();
		}
		
	}
	
	public HighscoreCouchDB(String userName, Integer points) {
		super(userName, points);
	}

	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
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
