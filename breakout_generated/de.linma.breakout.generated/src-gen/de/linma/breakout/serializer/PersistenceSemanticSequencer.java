package de.linma.breakout.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.linma.breakout.persistence.PersistenceEntity;
import de.linma.breakout.persistence.PersistenceModel;
import de.linma.breakout.persistence.PersistencePackage;
import de.linma.breakout.persistence.Property;
import de.linma.breakout.services.PersistenceGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class PersistenceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PersistenceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PersistencePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PersistencePackage.PERSISTENCE_ENTITY:
				if(context == grammarAccess.getPersistenceEntityRule()) {
					sequence_PersistenceEntity(context, (PersistenceEntity) semanticObject); 
					return; 
				}
				else break;
			case PersistencePackage.PERSISTENCE_MODEL:
				if(context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getPersistenceModelRule()) {
					sequence_PersistenceModel(context, (PersistenceModel) semanticObject); 
					return; 
				}
				else break;
			case PersistencePackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (hasPersistenceName?='persistenceName' persistenceName=STRING)? idProperty=Property property+=Property*)
	 */
	protected void sequence_PersistenceEntity(EObject context, PersistenceEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID persistenceEntities+=PersistenceEntity*)
	 */
	protected void sequence_PersistenceModel(EObject context, PersistenceModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (isNullable?='isNullable' nullable=BOOLEAN)? type=TYPE)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
