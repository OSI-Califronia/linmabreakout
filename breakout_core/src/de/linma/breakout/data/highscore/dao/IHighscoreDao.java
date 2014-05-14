package de.linma.breakout.data.highscore.dao;

import java.util.List;

import org.apache.log4j.Logger;

import de.linma.breakout.data.highscore.IHighscore;

/**
 * 
 * @author MBausch
 *
 */
public interface IHighscoreDao {
	
	/**
	 * 
	 * @param logger
	 */
	void setLogger(Logger logger);
	
	/**
	 * This method returns a Sorted Highscore List
	 * @return List
	 */
	List<IHighscore> getSortedHighscore();
	
	/**
	 * This method adds a new Highscore to List
	 * @param userName
	 * @param points
	 * @return true worked false not
	 */
	boolean addHighscore(final String userName, final Integer points);
	
	/**
	 * This method clears the whole Highscore List
	 * @return
	 */
	boolean clearHighscore();
	
	/**
	 * Closes the DB resources
	 */
	void close();
}
