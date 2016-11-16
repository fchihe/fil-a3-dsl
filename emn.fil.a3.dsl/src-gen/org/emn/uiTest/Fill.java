/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emn.uiTest.Fill#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.emn.uiTest.Fill#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.emn.uiTest.Fill#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 *
 * @see org.emn.uiTest.UiTestPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends Command
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(Selector)
   * @see org.emn.uiTest.UiTestPackage#getFill_Selector()
   * @model containment="true"
   * @generated
   */
  Selector getSelector();

  /**
   * Sets the value of the '{@link org.emn.uiTest.Fill#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(Selector value);

  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see org.emn.uiTest.UiTestPackage#getFill_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link org.emn.uiTest.Fill#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Key Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value</em>' reference.
   * @see #setKeyValue(VariableDefinition)
   * @see org.emn.uiTest.UiTestPackage#getFill_KeyValue()
   * @model
   * @generated
   */
  VariableDefinition getKeyValue();

  /**
   * Sets the value of the '{@link org.emn.uiTest.Fill#getKeyValue <em>Key Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Value</em>' reference.
   * @see #getKeyValue()
   * @generated
   */
  void setKeyValue(VariableDefinition value);

} // Fill
