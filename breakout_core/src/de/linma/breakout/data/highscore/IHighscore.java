package de.linma.breakout.data.highscore;

import java.util.Date;

public interface IHighscore extends Comparable<IHighscore> {

	/**
	 * @return the Username ID
	 */
	public String getUserName();
	
	/**
	 * @param userName ID
	 */
	void setUserName(String userName);
		
	/**
	 * @return the Date of Insertion
	 */
	Date getDate();
	
	/**
	 * @param date
	 */
	void setDate(Date date);
	
	/**
	 * @return the points
	 */
	Integer getPoints();
	
	/**
	 * @param points
	 */
	void setPoints(Integer points);
	
}
