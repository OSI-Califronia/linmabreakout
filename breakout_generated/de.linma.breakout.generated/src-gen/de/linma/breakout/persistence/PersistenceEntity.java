/**
 */
package de.linma.breakout.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.linma.breakout.persistence.PersistenceEntity#getName <em>Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.PersistenceEntity#isHasPersistenceName <em>Has Persistence Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.PersistenceEntity#getPersistenceName <em>Persistence Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.PersistenceEntity#getIdProperty <em>Id Property</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.PersistenceEntity#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity()
 * @model
 * @generated
 */
public interface PersistenceEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.PersistenceEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Has Persistence Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Persistence Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Persistence Name</em>' attribute.
   * @see #setHasPersistenceName(boolean)
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity_HasPersistenceName()
   * @model
   * @generated
   */
  boolean isHasPersistenceName();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.PersistenceEntity#isHasPersistenceName <em>Has Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Persistence Name</em>' attribute.
   * @see #isHasPersistenceName()
   * @generated
   */
  void setHasPersistenceName(boolean value);

  /**
   * Returns the value of the '<em><b>Persistence Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistence Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistence Name</em>' attribute.
   * @see #setPersistenceName(String)
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity_PersistenceName()
   * @model
   * @generated
   */
  String getPersistenceName();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.PersistenceEntity#getPersistenceName <em>Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistence Name</em>' attribute.
   * @see #getPersistenceName()
   * @generated
   */
  void setPersistenceName(String value);

  /**
   * Returns the value of the '<em><b>Id Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Property</em>' containment reference.
   * @see #setIdProperty(Property)
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity_IdProperty()
   * @model containment="true"
   * @generated
   */
  Property getIdProperty();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.PersistenceEntity#getIdProperty <em>Id Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Property</em>' containment reference.
   * @see #getIdProperty()
   * @generated
   */
  void setIdProperty(Property value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link de.linma.breakout.persistence.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceEntity_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

} // PersistenceEntity
