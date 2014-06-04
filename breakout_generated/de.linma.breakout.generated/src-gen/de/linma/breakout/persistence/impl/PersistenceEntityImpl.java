/**
 */
package de.linma.breakout.persistence.impl;

import de.linma.breakout.persistence.PersistenceEntity;
import de.linma.breakout.persistence.PersistencePackage;
import de.linma.breakout.persistence.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl#isHasPersistenceName <em>Has Persistence Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl#getPersistenceName <em>Persistence Name</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl#getIdProperty <em>Id Property</em>}</li>
 *   <li>{@link de.linma.breakout.persistence.impl.PersistenceEntityImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceEntityImpl extends MinimalEObjectImpl.Container implements PersistenceEntity
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
   * The default value of the '{@link #isHasPersistenceName() <em>Has Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPersistenceName()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_PERSISTENCE_NAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasPersistenceName() <em>Has Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPersistenceName()
   * @generated
   * @ordered
   */
  protected boolean hasPersistenceName = HAS_PERSISTENCE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPersistenceName() <em>Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistenceName()
   * @generated
   * @ordered
   */
  protected static final String PERSISTENCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersistenceName() <em>Persistence Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistenceName()
   * @generated
   * @ordered
   */
  protected String persistenceName = PERSISTENCE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdProperty() <em>Id Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdProperty()
   * @generated
   * @ordered
   */
  protected Property idProperty;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersistenceEntityImpl()
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
    return PersistencePackage.Literals.PERSISTENCE_ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasPersistenceName()
  {
    return hasPersistenceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPersistenceName(boolean newHasPersistenceName)
  {
    boolean oldHasPersistenceName = hasPersistenceName;
    hasPersistenceName = newHasPersistenceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME, oldHasPersistenceName, hasPersistenceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersistenceName()
  {
    return persistenceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistenceName(String newPersistenceName)
  {
    String oldPersistenceName = persistenceName;
    persistenceName = newPersistenceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_ENTITY__PERSISTENCE_NAME, oldPersistenceName, persistenceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getIdProperty()
  {
    return idProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdProperty(Property newIdProperty, NotificationChain msgs)
  {
    Property oldIdProperty = idProperty;
    idProperty = newIdProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY, oldIdProperty, newIdProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdProperty(Property newIdProperty)
  {
    if (newIdProperty != idProperty)
    {
      NotificationChain msgs = null;
      if (idProperty != null)
        msgs = ((InternalEObject)idProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY, null, msgs);
      if (newIdProperty != null)
        msgs = ((InternalEObject)newIdProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY, null, msgs);
      msgs = basicSetIdProperty(newIdProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY, newIdProperty, newIdProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty()
  {
    if (property == null)
    {
      property = new EObjectContainmentEList<Property>(Property.class, this, PersistencePackage.PERSISTENCE_ENTITY__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY:
        return basicSetIdProperty(null, msgs);
      case PersistencePackage.PERSISTENCE_ENTITY__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PersistencePackage.PERSISTENCE_ENTITY__NAME:
        return getName();
      case PersistencePackage.PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME:
        return isHasPersistenceName();
      case PersistencePackage.PERSISTENCE_ENTITY__PERSISTENCE_NAME:
        return getPersistenceName();
      case PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY:
        return getIdProperty();
      case PersistencePackage.PERSISTENCE_ENTITY__PROPERTY:
        return getProperty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistencePackage.PERSISTENCE_ENTITY__NAME:
        setName((String)newValue);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME:
        setHasPersistenceName((Boolean)newValue);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__PERSISTENCE_NAME:
        setPersistenceName((String)newValue);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY:
        setIdProperty((Property)newValue);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
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
      case PersistencePackage.PERSISTENCE_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME:
        setHasPersistenceName(HAS_PERSISTENCE_NAME_EDEFAULT);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__PERSISTENCE_NAME:
        setPersistenceName(PERSISTENCE_NAME_EDEFAULT);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY:
        setIdProperty((Property)null);
        return;
      case PersistencePackage.PERSISTENCE_ENTITY__PROPERTY:
        getProperty().clear();
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
      case PersistencePackage.PERSISTENCE_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PersistencePackage.PERSISTENCE_ENTITY__HAS_PERSISTENCE_NAME:
        return hasPersistenceName != HAS_PERSISTENCE_NAME_EDEFAULT;
      case PersistencePackage.PERSISTENCE_ENTITY__PERSISTENCE_NAME:
        return PERSISTENCE_NAME_EDEFAULT == null ? persistenceName != null : !PERSISTENCE_NAME_EDEFAULT.equals(persistenceName);
      case PersistencePackage.PERSISTENCE_ENTITY__ID_PROPERTY:
        return idProperty != null;
      case PersistencePackage.PERSISTENCE_ENTITY__PROPERTY:
        return property != null && !property.isEmpty();
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
    result.append(", hasPersistenceName: ");
    result.append(hasPersistenceName);
    result.append(", persistenceName: ");
    result.append(persistenceName);
    result.append(')');
    return result.toString();
  }

} //PersistenceEntityImpl
