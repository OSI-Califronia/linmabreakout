/**
 */
package de.linma.breakout.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.linma.breakout.persistence.Property#getName <em>Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.Property#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.Property#getNullable <em>Nullable</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.Property#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.linma.breakout.persistence.PersistencePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
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
   * @see de.linma.breakout.persistence.PersistencePackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Nullable</em>' attribute.
   * @see #setIsNullable(boolean)
   * @see de.linma.breakout.persistence.PersistencePackage#getProperty_IsNullable()
   * @model
   * @generated
   */
  boolean isIsNullable();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.Property#isIsNullable <em>Is Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Nullable</em>' attribute.
   * @see #isIsNullable()
   * @generated
   */
  void setIsNullable(boolean value);

  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(String)
   * @see de.linma.breakout.persistence.PersistencePackage#getProperty_Nullable()
   * @model
   * @generated
   */
  String getNullable();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.Property#getNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #getNullable()
   * @generated
   */
  void setNullable(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.linma.breakout.persistence.PersistencePackage#getProperty_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.Property#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Property
