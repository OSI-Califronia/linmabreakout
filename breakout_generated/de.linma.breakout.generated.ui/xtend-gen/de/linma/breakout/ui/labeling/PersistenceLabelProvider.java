/**
 * generated by Xtext
 */
package de.linma.breakout.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class PersistenceLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public PersistenceLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
