package de.linma.breakout.view.wui.controllers;

import java.io.File;

import play.api.templates.Html;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.WebSocket;

import com.google.gson.Gson;

import de.linma.breakout.communication.GAME_STATE;
import de.linma.breakout.communication.IGameObserver;
import de.linma.breakout.communication.MENU_ITEM;
import de.linma.breakout.controller.IGameController;
import de.linma.breakout.controller.IGameController.PLAYER_INPUT;

/**
 * Manages a WebSocket connection to a client.
 * Receives events from webbrowser and send game content to the client.
 */
public class GameWebSocket extends WebSocket<String> implements IGameObserver{
	
	private Gson gson;
	private play.mvc.WebSocket.In<String> in;
	private play.mvc.WebSocket.Out<String> out;
		
	private IGameController gameController;
	
	public GameWebSocket(IGameController gameController) {
		super();
		this.gson = new Gson();
		this.gameController = gameController;
	}
	
	public void updateRepaintPlayGrid() {	}  // not required
 
	public void updateOnResize() { }  // not required
	
	
	/**
	 * Notifies client of changed game state (JSON-formatted)
	 */
	public void updateGameState(GAME_STATE state) {
		out.write("STATE:" + state);
		
		// level selection Menu
		if (gameController.getState() == GAME_STATE.MENU_LEVEL_SEL) {			
			out.write("LEVEL:" + gson.toJson(gameController.getLevelList()));
		}
	}

	/**
	 * Sends menu items to client (JSON-formatted)
	 */
	public void updateGameMenu(MENU_ITEM[] menuItems, String title) {	
		System.out.println("updateGameMenu");
	
		out.write("MENU:" + gson.toJson(HtmlHelper.getMenu(menuItems, title)));
	}

	/**
	 * Sends the rendered play grid to the client.  (HTML)
	 */
	public void updateGameFrame() {
		if (gameController.getState() != GAME_STATE.RUNNING) {
			return;
		}
		
		Html playGrid = de.linma.breakout.view.wui.views.html.gamegrid.render(
				gameController.getGridSize().width,
				gameController.getGridSize().height,
				HtmlHelper.getBricks(gameController), 
				HtmlHelper.getBalls(gameController));
		
		out.write("GRID:" + playGrid.body());	
	}


	/**
	 * Handles incoming events from webbrowser
	 */
	public void onReady(play.mvc.WebSocket.In<String> in, play.mvc.WebSocket.Out<String> out) {
		
		// handler for incoming messages
		in.onMessage(new Callback<String>() {
			public void invoke(String event) throws Throwable {
				// process key Input
				if (event.startsWith("key:"))  {
					String key = event.substring(event.indexOf(":") +1);
					GameWebSocket.this.gameController.processGameInput(PLAYER_INPUT.valueOf(key));					
				}
				
				// process menu Input
				if (event.startsWith("menu:")) {
					Integer index =  Integer.valueOf(event.substring(event.indexOf(":") +1));
					GameWebSocket.this.gameController.processMenuInput(MENU_ITEM.values()[index]);
				}
				
				// process level select
				if (event.startsWith("level:")) {
					String file = event.substring(event.indexOf(":") +1);
					GameWebSocket.this.gameController.loadLevel(new File(file));
					GameWebSocket.this.gameController.processMenuInput(MENU_ITEM.MNU_CONTINUE);
				}
			}			
		});
		
		// handler when browser/tab is closed
		in.onClose(new Callback0() {
			public void invoke() throws Throwable {
				GameWebSocket.this.gameController.removeObserver(GameWebSocket.this);
			}
		});
		
		this.out = out;
		this.in = in;
		
		// add this client to the observers of the running game
		GameWebSocket.this.gameController.addObserver(GameWebSocket.this);
		
		// Send the current state of the game to the client
		// so that the client can show a menu that appeared before the connection was established.
		initFirstFrame();
	}

	
	private void initFirstFrame() {
		if (this.gameController.getState() != GAME_STATE.RUNNING) {
			updateGameState(GAME_STATE.MENU_MAIN);
			updateGameMenu(gameController.getGameMenu().getMenuItems(), gameController.getGameMenu().getTitle());
		}
	}
	
	
}
