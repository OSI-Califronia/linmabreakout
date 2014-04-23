package de.linma.breakout;

import play.GlobalSettings;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.linma.breakout.module.PlayAppModule;

/**
 * 
 * @author MBausch
 *
 */
public class AppGlobal extends GlobalSettings {

	public final static Injector injector = Guice.createInjector(new PlayAppModule());
	
	@Override
	public <A> A getControllerInstance(Class<A> controllerClass) {
		return injector.getInstance(controllerClass);
	}
	
}
