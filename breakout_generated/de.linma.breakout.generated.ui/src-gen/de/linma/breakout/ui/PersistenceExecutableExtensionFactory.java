/*
 * generated by Xtext
 */
package de.linma.breakout.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.linma.breakout.ui.internal.PersistenceActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PersistenceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PersistenceActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PersistenceActivator.getInstance().getInjector(PersistenceActivator.DE_LINMA_BREAKOUT_PERSISTENCE);
	}
	
}