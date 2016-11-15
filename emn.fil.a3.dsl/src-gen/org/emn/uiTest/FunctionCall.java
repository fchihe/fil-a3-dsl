/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.FunctionCall#getName <em>Name</em>}</li>
 *   <li>{@link org.emn.uiTest.FunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.emn.uiTest.UiTestPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Command
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(FunctionName)
   * @see org.emn.uiTest.UiTestPackage#getFunctionCall_Name()
   * @model
   * @generated
   */
  FunctionName getName();

  /**
   * Sets the value of the '{@link org.emn.uiTest.FunctionCall#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(FunctionName value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see org.emn.uiTest.UiTestPackage#getFunctionCall_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

} // FunctionCall
