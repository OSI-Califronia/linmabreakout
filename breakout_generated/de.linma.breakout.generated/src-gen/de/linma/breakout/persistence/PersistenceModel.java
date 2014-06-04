/**
 */
package de.linma.breakout.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.linma.breakout.persistence.PersistenceModel#getName <em>Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.PersistenceModel#getPersistenceEntities <em>Persistence Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceModel()
 * @model
 * @generated
 */
public interface PersistenceModel extends Model
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
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.linma.breakout.persistence.PersistenceModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Persistence Entities</b></em>' containment reference list.
   * The list contents are of type {@link de.linma.breakout.persistence.PersistenceEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistence Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistence Entities</em>' containment reference list.
   * @see de.linma.breakout.persistence.PersistencePackage#getPersistenceModel_PersistenceEntities()
   * @model containment="true"
   * @generated
   */
  EList<PersistenceEntity> getPersistenceEntities();

} // PersistenceModel
