/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.emn.uiTest.FunctionCall;
import org.emn.uiTest.FunctionName;
import org.emn.uiTest.UiTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.impl.FunctionCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emn.uiTest.impl.FunctionCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends CommandImpl implements FunctionCall
{
  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected FunctionName name;

  /**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
  protected EList<String> parameters;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FunctionCallImpl()
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
		return UiTestPackage.Literals.FUNCTION_CALL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionName getName()
  {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (FunctionName)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiTestPackage.FUNCTION_CALL__NAME, oldName, name));
			}
		}
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionName basicGetName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(FunctionName newName)
  {
		FunctionName oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiTestPackage.FUNCTION_CALL__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getParameters()
  {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, UiTestPackage.FUNCTION_CALL__PARAMETERS);
		}
		return parameters;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case UiTestPackage.FUNCTION_CALL__NAME:
				if (resolve) return getName();
				return basicGetName();
			case UiTestPackage.FUNCTION_CALL__PARAMETERS:
				return getParameters();
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
		switch (featureID) {
			case UiTestPackage.FUNCTION_CALL__NAME:
				setName((FunctionName)newValue);
				return;
			case UiTestPackage.FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
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
		switch (featureID) {
			case UiTestPackage.FUNCTION_CALL__NAME:
				setName((FunctionName)null);
				return;
			case UiTestPackage.FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
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
		switch (featureID) {
			case UiTestPackage.FUNCTION_CALL__NAME:
				return name != null;
			case UiTestPackage.FUNCTION_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //FunctionCallImpl
