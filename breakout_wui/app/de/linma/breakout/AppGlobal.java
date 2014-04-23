package de.linma.breakout;

import play.Application;
import play.GlobalSettings;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.linma.breakout.controller.IGameController;
import de.linma.breakout.module.PlayAppModule;

/**
 * 
 * @author MBausch
 *
 */
public class AppGlobal extends GlobalSettings {

	public final static Injector injector = Guice.createInjector(new PlayAppModule());
	
	@Override
	public void onStart(Application application) {		
		super.onStart(application);		
       
		IGameController gameController = injector.getInstance(IGameController.class);
		
		// Open Swing GUI of game
//		MainWindow mainWindow = new MainWindow(gameController);                
//		gameController.addObserver(mainWindow.getBpaGameView2D());
//		mainWindow.setVisible(true);
		
    	gameController.initialize();	
	}
	
	@Override
	public <A> A getControllerInstance(Class<A> controllerClass) {
		return injector.getInstance(controllerClass);
	}
	
}
