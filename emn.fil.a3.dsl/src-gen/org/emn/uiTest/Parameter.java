/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.Parameter#getString <em>String</em>}</li>
 *   <li>{@link org.emn.uiTest.Parameter#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.emn.uiTest.UiTestPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.emn.uiTest.UiTestPackage#getParameter_String()
	 * @model
	 * @generated
	 */
  String getString();

  /**
	 * Sets the value of the '{@link org.emn.uiTest.Parameter#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
  void setString(String value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VariableDefinition)
	 * @see org.emn.uiTest.UiTestPackage#getParameter_Variable()
	 * @model
	 * @generated
	 */
  VariableDefinition getVariable();

  /**
	 * Sets the value of the '{@link org.emn.uiTest.Parameter#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(VariableDefinition value);

} // Parameter
