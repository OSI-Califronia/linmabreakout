package de.linma.breakout.data.highscore.dao.impl.couchDB;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.NoArgsConstructor;
import lombok.Setter;

import org.apache.log4j.Logger;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.UpdateConflictException;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import com.google.inject.Inject;

import de.linma.breakout.data.highscore.IHighscore;
import de.linma.breakout.data.highscore.dao.IHighscoreDao;

@NoArgsConstructor
public class HighscoreDaoCouchDB implements IHighscoreDao {

	@Inject
	@Setter
	private Logger logger;

	private CouchDbConnector db;
	
	public HighscoreDaoCouchDB(final String dbUrl, final String dbName) {
		HttpClient client;
		try {
			client = new StdHttpClient.Builder().url(dbUrl).build();
			CouchDbInstance dbInstance = new StdCouchDbInstance(client);
			db = dbInstance.createConnector(dbName, true);
		} catch (MalformedURLException e) {
			
		}
	}
	
	public List<IHighscore> getSortedHighscore() {
		List<IHighscore> highscoreList = new ArrayList<IHighscore>();
		for (String id : db.getAllDocIds()) {
			IHighscore user = getHighscoreById(id);
			if (user != null) {
				highscoreList.add(user);
			}
		}
		
		Collections.sort(highscoreList);
		
		return highscoreList;
	}
	
	public IHighscore getHighscoreById(final String id) {
		try {
			return db.get(HighscoreCouchDB.class, id);
		} catch (DocumentNotFoundException e){
			logger.error("Could not get Highscore", e);
			return null;
		}
	}

	public boolean addHighscore(String userName, Integer points) {
		HighscoreCouchDB highscoreUser = new HighscoreCouchDB(userName, points);
		try {
			db.create(highscoreUser);
			return true;
		} catch (UpdateConflictException e) {
			logger.error("Could not create Highscore", e);
			return false;
		}		
	}
	
	public boolean clearHighscore() {
		try {
			for (String id : db.getAllDocIds()) {
				IHighscore score = getHighscoreById(id);
				db.delete(score);
			}
			
			return true;
		} catch (UpdateConflictException e) {
			logger.error("Could not clear Highscore", e);
			return false;
		}	
	}

	public void close() {
		// no implementation needed
	}

	
}
