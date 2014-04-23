package de.linma.breakout.module;

import com.google.inject.AbstractModule;

import de.linma.breakout.controller.GameController;
import de.linma.breakout.controller.IGameController;
import de.linma.breakout.data.IPlayGrid;
import de.linma.breakout.data.PlayGrid;
import de.linma.breakout.view.wui.controllers.Application;

/**
 * Module for play Application
 * 
 * @author MBausch
 *
 */
public class PlayAppModule extends AbstractModule {
	
	/**
	 * Constantes for default Gridsize
	 */
	private final static int GRID_DEF_HEIGHT = 500;
	private final static int GRID_DEF_WIDTH = 500;

	@Override
	protected void configure() {
		// playgrid
		bind(IPlayGrid.class).toInstance(new PlayGrid(GRID_DEF_HEIGHT, GRID_DEF_WIDTH));
		
		// gamecontroller
		// check path for injection
		String path = "";
//		if (Play.current().path().getAbsolutePath().startsWith("/app")) {
//			path = "/app/";	
//		}		
		bind(IGameController.class).toInstance(new GameController(path));
		
		// Application Controller
		bind(Application.class).toInstance(new Application());
	}

}
