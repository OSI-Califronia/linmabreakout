package de.linma.breakout.data.highscore;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import lombok.EqualsAndHashCode;

/**
 * 
 * @author MBausch
 *
 */
@EqualsAndHashCode(of={"userName", "date", "points"})
public class Highscore implements IHighscore, Serializable {

	private static final long serialVersionUID = 8630917657960890160L;

	private String userName;
	private Date date;
	private Integer points;
	
	public Highscore(final String userName, final Integer points) {
		super();
		this.userName = userName;
		this.date = Calendar.getInstance().getTime();
		this.points = points;		
	}
	
	public Highscore(IHighscore modelHighscore) {
		super();
		this.userName = modelHighscore.getUserName();
		this.date = modelHighscore.getDate();
		this.points = modelHighscore.getPoints();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}

	/**
	 * Compares Highscore by points
	 */
	public int compareTo(IHighscore h2) {
		if (h2 == null) {
			return 1;
		}
		
		if (h2.getPoints() == null) {
			return 1; 
		} else {
			return this.points.compareTo(h2.getPoints());
		}
	}
}
