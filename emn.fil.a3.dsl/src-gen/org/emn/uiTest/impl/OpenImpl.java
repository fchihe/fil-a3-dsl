/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emn.uiTest.Open;
import org.emn.uiTest.UiTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.impl.OpenImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emn.uiTest.impl.OpenImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.emn.uiTest.impl.OpenImpl#getDriverPath <em>Driver Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenImpl extends CommandImpl implements Open
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
	 * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
  protected static final String PROGRAM_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
  protected String program = PROGRAM_EDEFAULT;

  /**
	 * The default value of the '{@link #getDriverPath() <em>Driver Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDriverPath()
	 * @generated
	 * @ordered
	 */
  protected static final String DRIVER_PATH_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDriverPath() <em>Driver Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDriverPath()
	 * @generated
	 * @ordered
	 */
  protected String driverPath = DRIVER_PATH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OpenImpl()
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
		return UiTestPackage.Literals.OPEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiTestPackage.OPEN__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getProgram()
  {
		return program;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProgram(String newProgram)
  {
		String oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiTestPackage.OPEN__PROGRAM, oldProgram, program));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDriverPath()
  {
		return driverPath;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDriverPath(String newDriverPath)
  {
		String oldDriverPath = driverPath;
		driverPath = newDriverPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiTestPackage.OPEN__DRIVER_PATH, oldDriverPath, driverPath));
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
			case UiTestPackage.OPEN__NAME:
				return getName();
			case UiTestPackage.OPEN__PROGRAM:
				return getProgram();
			case UiTestPackage.OPEN__DRIVER_PATH:
				return getDriverPath();
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
		switch (featureID) {
			case UiTestPackage.OPEN__NAME:
				setName((String)newValue);
				return;
			case UiTestPackage.OPEN__PROGRAM:
				setProgram((String)newValue);
				return;
			case UiTestPackage.OPEN__DRIVER_PATH:
				setDriverPath((String)newValue);
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
			case UiTestPackage.OPEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiTestPackage.OPEN__PROGRAM:
				setProgram(PROGRAM_EDEFAULT);
				return;
			case UiTestPackage.OPEN__DRIVER_PATH:
				setDriverPath(DRIVER_PATH_EDEFAULT);
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
			case UiTestPackage.OPEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiTestPackage.OPEN__PROGRAM:
				return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
			case UiTestPackage.OPEN__DRIVER_PATH:
				return DRIVER_PATH_EDEFAULT == null ? driverPath != null : !DRIVER_PATH_EDEFAULT.equals(driverPath);
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
		result.append(", program: ");
		result.append(program);
		result.append(", driverPath: ");
		result.append(driverPath);
		result.append(')');
		return result.toString();
	}

} //OpenImpl
