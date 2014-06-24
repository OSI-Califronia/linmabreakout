package de.linma.breakout.data.highscore;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.google.inject.Inject;

/**
 * Sends an Postrequest to Highscore Server and stores userdata
 * 
 * @author MBausch
 *
 */
public class HighscorePoster extends Thread {
	
	@Inject
	private Logger logger;

	private String serverUrl;
	private String game;
	private String username;
	private Integer score;
		
	public HighscorePoster(final String serverUrl, final String game) {
		super();
		this.serverUrl = serverUrl;
		this.game = game;
	}
	
	public void initialize(final String userName, final Integer score) {
		this.username = userName;
		this.score = score;
	}
	
	public void run() {
		
		DataOutputStream wr = null;
		HttpURLConnection con = null;
		
		try {
			URL postUrl = new URL(serverUrl);
			con = (HttpURLConnection) postUrl.openConnection();
			
			// parameters
			StringBuilder paramsSb = new StringBuilder("{");
			paramsSb.append("\"game\":\""); // game
			paramsSb.append(game);		
			
			paramsSb.append("\",\"player\":\""); // player
			paramsSb.append(username);
			
			paramsSb.append("\",\"score\":\""); // score
			paramsSb.append(Long.valueOf(score));	
			paramsSb.append("\"}");
			
			//add reuqest header
			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Content-Length", String.valueOf(paramsSb.toString().length()));
				 
			// Send post request			
			wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(paramsSb.toString());
			wr.flush();			
	 
			int responseCode = con.getResponseCode();
			logger.log(Level.INFO, "Sending 'POST' request to URL : " + postUrl);
			logger.log(Level.INFO, "Post parameters : " + paramsSb.toString());
			logger.log(Level.INFO, "Response Code : " + responseCode);
			
		} catch (Exception e) {
			logger.log(Level.WARN, "Could not post Highscore to " + serverUrl, e);
			
		} finally {
			if (wr != null) {
				try {
					wr.close();
				} catch (IOException e) {} // ignore exception
			}
			
			if (con != null) {
				con.disconnect();
			}
		}
	}
	
}
