/**
 */
package de.linma.breakout.persistence.impl;

import de.linma.breakout.persistence.PersistencePackage;
import de.linma.breakout.persistence.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.linma.breakout.persistence.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PropertyImpl#isIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PropertyImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNullable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNullable() <em>Is Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNullable()
   * @generated
   * @ordered
   */
  protected boolean isNullable = IS_NULLABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected static final String NULLABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected String nullable = NULLABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PersistencePackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNullable()
  {
    return isNullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNullable(boolean newIsNullable)
  {
    boolean oldIsNullable = isNullable;
    isNullable = newIsNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PROPERTY__IS_NULLABLE, oldIsNullable, isNullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(String newNullable)
  {
    String oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PROPERTY__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PersistencePackage.PROPERTY__NAME:
        return getName();
      case PersistencePackage.PROPERTY__IS_NULLABLE:
        return isIsNullable();
      case PersistencePackage.PROPERTY__NULLABLE:
        return getNullable();
      case PersistencePackage.PROPERTY__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistencePackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case PersistencePackage.PROPERTY__IS_NULLABLE:
        setIsNullable((Boolean)newValue);
        return;
      case PersistencePackage.PROPERTY__NULLABLE:
        setNullable((String)newValue);
        return;
      case PersistencePackage.PROPERTY__TYPE:
        setType((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PersistencePackage.PROPERTY__IS_NULLABLE:
        setIsNullable(IS_NULLABLE_EDEFAULT);
        return;
      case PersistencePackage.PROPERTY__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case PersistencePackage.PROPERTY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PersistencePackage.PROPERTY__IS_NULLABLE:
        return isNullable != IS_NULLABLE_EDEFAULT;
      case PersistencePackage.PROPERTY__NULLABLE:
        return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
      case PersistencePackage.PROPERTY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isNullable: ");
    result.append(isNullable);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
