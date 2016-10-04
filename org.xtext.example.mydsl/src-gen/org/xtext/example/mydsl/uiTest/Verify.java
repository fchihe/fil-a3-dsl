/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.uiTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.uiTest.Verify#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.uiTest.UiTestPackage#getVerify()
 * @model
 * @generated
 */
public interface Verify extends Command
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see #setLink(String)
   * @see org.xtext.example.mydsl.uiTest.UiTestPackage#getVerify_Link()
   * @model
   * @generated
   */
  String getLink();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.uiTest.Verify#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see #getLink()
   * @generated
   */
  void setLink(String value);

} // Verify
