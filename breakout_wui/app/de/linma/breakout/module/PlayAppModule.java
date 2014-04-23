package de.linma.breakout.module;

import play.api.Play;

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

	@Override
	protected void configure() {
		// playgrid
		bind(IPlayGrid.class).to(PlayGrid.class);
		
		// gamecontroller
		// check path for injection
		String path = "";
		if (Play.current().path().getAbsolutePath().startsWith("/app")) {
			path = "/app/";	
		}
		
		bind(IGameController.class).toInstance(new GameController(path));
		
		// Application Controller
		bind(Application.class).to(Application.class);
	}

}
