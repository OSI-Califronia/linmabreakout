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

	private final static Injector injector = Guice.createInjector(new PlayAppModule());
	
	/**
	 * This method returns the Injector of the App
	 * @return
	 */
	public static final Injector getAppInjector() {
		return injector;
	}
	
	/*
	 * (non-Javadoc)
	 * @see play.GlobalSettings#onStart(play.Application)
	 */
	@Override
	public void onStart(Application application) {		
		super.onStart(application);		
       
//		IGameController gameController = injector.getInstance(IGameController.class);
		
		// Open Swing GUI of game
//		MainWindow mainWindow = new MainWindow(gameController);                
//		gameController.addObserver(mainWindow.getBpaGameView2D());
//		mainWindow.setVisible(true);
		
//    	gameController.initialize();	
	}
	
	/*
	 * (non-Javadoc)
	 * @see play.GlobalSettings#getControllerInstance(java.lang.Class)
	 */
	@Override
	public <A> A getControllerInstance(Class<A> controllerClass) {
		return injector.getInstance(controllerClass);
	}
	
	
	
}
