package de.linma.breakout.data.highscore.dao.impl.db4o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Setter;

import org.apache.log4j.Logger;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.google.inject.Inject;

import de.linma.breakout.data.highscore.Highscore;
import de.linma.breakout.data.highscore.IHighscore;
import de.linma.breakout.data.highscore.dao.IHighscoreDao;

public class HighscoreDaoDB4O implements IHighscoreDao {

	@Inject
	@Setter
	private Logger logger;
	
	private ObjectContainer db;

	public HighscoreDaoDB4O(final String dbName) {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dbName);
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#getSortedHighscore()
	 */
	public List<IHighscore> getSortedHighscore() {
		try {
			List<IHighscore> resultList = db.query(IHighscore.class);
			
			List<IHighscore> sortList = new ArrayList<IHighscore>(resultList);
						
			Collections.sort(sortList);
			
			return sortList;
		} catch(Exception ex) {
			logger.error("Failed to load Highscore List ", ex);
			
			return new ArrayList<IHighscore>();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#addHighscore(java.lang.String, java.lang.Integer)
	 */
	public boolean addHighscore(final String userName, final Integer points) {		
		IHighscore newHighscore = new Highscore(userName, points);
		try {		
			db.store(newHighscore);
			db.commit();
			
			return true;
		} catch(Exception ex) {
			logger.error("Failed to store Highscore", ex);
			try {
				db.rollback();
			} catch (Exception exx) {}
			
			return false;
		}	
	}

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#clearHighscore()
	 */
	public boolean clearHighscore() {
		try {
			for (IHighscore delObj : db.query(IHighscore.class)) {
				db.delete(delObj);
			}			
			
			db.commit();
		} catch(Exception ex) {
			logger.error("Failed to clear Highscore", ex);
			try {
				db.rollback();
			} catch (Exception exx) {}
			
			return false;
		}
		
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.highscore.dao.IHighscoreDao#close()
	 */
	public void close() {
		db.close();
	}
}
