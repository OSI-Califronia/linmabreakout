/**
 */
package de.linma.breakout.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.linma.breakout.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "persistence";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.linma.de/breakout/Persistence";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "persistence";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistencePackage eINSTANCE = de.linma.breakout.persistence.impl.PersistencePackageImpl.init();

  /**
   * The meta object id for the '{@link de.linma.breakout.persistence.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.linma.breakout.persistence.impl.ModelImpl
   * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.linma.breakout.persistence.impl.PersistenceModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.linma.breakout.persistence.impl.PersistenceModelImpl
   * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getPersistenceModel()
   * @generated
   */
  int PERSISTENCE_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Persistence Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL__PERSISTENCE_ENTITIES = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.linma.breakout.persistence.impl.PersistenceEntityImpl
   * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getPersistenceEntity()
   * @generated
   */
  int PERSISTENCE_ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Has Persistence Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME = 1;

  /**
   * The feature id for the '<em><b>Persistence Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__PERSISTENCE_NAME = 2;

  /**
   * The feature id for the '<em><b>Id Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__ID_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.linma.breakout.persistence.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.linma.breakout.persistence.impl.PropertyImpl
   * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IS_NULLABLE = 1;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NULLABLE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link de.linma.breakout.persistence.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.linma.breakout.persistence.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link de.linma.breakout.persistence.PersistenceModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.linma.breakout.persistence.PersistenceModel
   * @generated
   */
  EClass getPersistenceModel();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.PersistenceModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.linma.breakout.persistence.PersistenceModel#getName()
   * @see #getPersistenceModel()
   * @generated
   */
  EAttribute getPersistenceModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.linma.breakout.persistence.PersistenceModel#getPersistenceEntities <em>Persistence Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persistence Entities</em>'.
   * @see de.linma.breakout.persistence.PersistenceModel#getPersistenceEntities()
   * @see #getPersistenceModel()
   * @generated
   */
  EReference getPersistenceModel_PersistenceEntities();

  /**
   * Returns the meta object for class '{@link de.linma.breakout.persistence.PersistenceEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity
   * @generated
   */
  EClass getPersistenceEntity();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.PersistenceEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity#getName()
   * @see #getPersistenceEntity()
   * @generated
   */
  EAttribute getPersistenceEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.PersistenceEntity#isHasPersistenceName <em>Has Persistence Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Persistence Name</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity#isHasPersistenceName()
   * @see #getPersistenceEntity()
   * @generated
   */
  EAttribute getPersistenceEntity_HasPersistenceName();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.PersistenceEntity#getPersistenceName <em>Persistence Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistence Name</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity#getPersistenceName()
   * @see #getPersistenceEntity()
   * @generated
   */
  EAttribute getPersistenceEntity_PersistenceName();

  /**
   * Returns the meta object for the containment reference '{@link de.linma.breakout.persistence.PersistenceEntity#getIdProperty <em>Id Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id Property</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity#getIdProperty()
   * @see #getPersistenceEntity()
   * @generated
   */
  EReference getPersistenceEntity_IdProperty();

  /**
   * Returns the meta object for the containment reference list '{@link de.linma.breakout.persistence.PersistenceEntity#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see de.linma.breakout.persistence.PersistenceEntity#getProperty()
   * @see #getPersistenceEntity()
   * @generated
   */
  EReference getPersistenceEntity_Property();

  /**
   * Returns the meta object for class '{@link de.linma.breakout.persistence.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.linma.breakout.persistence.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.linma.breakout.persistence.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.Property#isIsNullable <em>Is Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Nullable</em>'.
   * @see de.linma.breakout.persistence.Property#isIsNullable()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsNullable();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.Property#getNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see de.linma.breakout.persistence.Property#getNullable()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Nullable();

  /**
   * Returns the meta object for the attribute '{@link de.linma.breakout.persistence.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.linma.breakout.persistence.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PersistenceFactory getPersistenceFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.linma.breakout.persistence.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.linma.breakout.persistence.impl.ModelImpl
     * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link de.linma.breakout.persistence.impl.PersistenceModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.linma.breakout.persistence.impl.PersistenceModelImpl
     * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getPersistenceModel()
     * @generated
     */
    EClass PERSISTENCE_MODEL = eINSTANCE.getPersistenceModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_MODEL__NAME = eINSTANCE.getPersistenceModel_Name();

    /**
     * The meta object literal for the '<em><b>Persistence Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_MODEL__PERSISTENCE_ENTITIES = eINSTANCE.getPersistenceModel_PersistenceEntities();

    /**
     * The meta object literal for the '{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.linma.breakout.persistence.impl.PersistenceEntityImpl
     * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getPersistenceEntity()
     * @generated
     */
    EClass PERSISTENCE_ENTITY = eINSTANCE.getPersistenceEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_ENTITY__NAME = eINSTANCE.getPersistenceEntity_Name();

    /**
     * The meta object literal for the '<em><b>Has Persistence Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME = eINSTANCE.getPersistenceEntity_HasPersistenceName();

    /**
     * The meta object literal for the '<em><b>Persistence Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_ENTITY__PERSISTENCE_NAME = eINSTANCE.getPersistenceEntity_PersistenceName();

    /**
     * The meta object literal for the '<em><b>Id Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_ENTITY__ID_PROPERTY = eINSTANCE.getPersistenceEntity_IdProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_ENTITY__PROPERTY = eINSTANCE.getPersistenceEntity_Property();

    /**
     * The meta object literal for the '{@link de.linma.breakout.persistence.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.linma.breakout.persistence.impl.PropertyImpl
     * @see de.linma.breakout.persistence.impl.PersistencePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IS_NULLABLE = eINSTANCE.getProperty_IsNullable();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NULLABLE = eINSTANCE.getProperty_Nullable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

  }

} //PersistencePackage
