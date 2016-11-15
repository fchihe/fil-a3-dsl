/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.Selector#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.emn.uiTest.Selector#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @see org.emn.uiTest.UiTestPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' attribute.
   * @see #setAttributeName(String)
   * @see org.emn.uiTest.UiTestPackage#getSelector_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link org.emn.uiTest.Selector#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

  /**
   * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Value</em>' attribute.
   * @see #setAttributeValue(String)
   * @see org.emn.uiTest.UiTestPackage#getSelector_AttributeValue()
   * @model
   * @generated
   */
  String getAttributeValue();

  /**
   * Sets the value of the '{@link org.emn.uiTest.Selector#getAttributeValue <em>Attribute Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Value</em>' attribute.
   * @see #getAttributeValue()
   * @generated
   */
  void setAttributeValue(String value);

} // Selector
