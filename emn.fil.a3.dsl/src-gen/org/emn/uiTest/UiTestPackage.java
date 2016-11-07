/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emn.uiTest.UiTestFactory
 * @model kind="package"
 * @generated
 */
public interface UiTestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uiTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emn.org/UiTest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uiTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UiTestPackage eINSTANCE = org.emn.uiTest.impl.UiTestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.UiTestImpl <em>Ui Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.UiTestImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getUiTest()
   * @generated
   */
  int UI_TEST = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_TEST__FUNCTIONS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_TEST__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Ui Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.FunctionImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.CommandImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 4;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.FunctionCallImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMETERS = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.FunctionNameImpl <em>Function Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.FunctionNameImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunctionName()
   * @generated
   */
  int FUNCTION_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.OpenImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__PROGRAM = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.GoOnImpl <em>Go On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.GoOnImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getGoOn()
   * @generated
   */
  int GO_ON = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_ON__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_ON__ADDRESS = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Go On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_ON_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.StoreImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getStore()
   * @generated
   */
  int STORE = 7;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__SELECTOR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__KEY = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.FillImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getFill()
   * @generated
   */
  int FILL = 8;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__SELECTOR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__STRING_VALUE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Key Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__KEY_VALUE = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.ClickImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getClick()
   * @generated
   */
  int CLICK = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__SELECTOR = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.VerifyImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__SELECTOR = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.SelectorImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 11;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__ATTRIBUTE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.emn.uiTest.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emn.uiTest.impl.VariableDefinitionImpl
   * @see org.emn.uiTest.impl.UiTestPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.emn.uiTest.UiTest <em>Ui Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Test</em>'.
   * @see org.emn.uiTest.UiTest
   * @generated
   */
  EClass getUiTest();

  /**
   * Returns the meta object for the containment reference list '{@link org.emn.uiTest.UiTest#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.emn.uiTest.UiTest#getFunctions()
   * @see #getUiTest()
   * @generated
   */
  EReference getUiTest_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.emn.uiTest.UiTest#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.emn.uiTest.UiTest#getCommands()
   * @see #getUiTest()
   * @generated
   */
  EReference getUiTest_Commands();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.emn.uiTest.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.emn.uiTest.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.emn.uiTest.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.emn.uiTest.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.emn.uiTest.Function#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.emn.uiTest.Function#getStatements()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Statements();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.emn.uiTest.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.emn.uiTest.FunctionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.emn.uiTest.FunctionCall#getName()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.emn.uiTest.FunctionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.emn.uiTest.FunctionCall#getParameters()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Name</em>'.
   * @see org.emn.uiTest.FunctionName
   * @generated
   */
  EClass getFunctionName();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.FunctionName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.FunctionName#getName()
   * @see #getFunctionName()
   * @generated
   */
  EAttribute getFunctionName_Name();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.emn.uiTest.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open</em>'.
   * @see org.emn.uiTest.Open
   * @generated
   */
  EClass getOpen();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Open#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.Open#getName()
   * @see #getOpen()
   * @generated
   */
  EAttribute getOpen_Name();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Open#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Program</em>'.
   * @see org.emn.uiTest.Open#getProgram()
   * @see #getOpen()
   * @generated
   */
  EAttribute getOpen_Program();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.GoOn <em>Go On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go On</em>'.
   * @see org.emn.uiTest.GoOn
   * @generated
   */
  EClass getGoOn();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.GoOn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.GoOn#getName()
   * @see #getGoOn()
   * @generated
   */
  EAttribute getGoOn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.GoOn#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.emn.uiTest.GoOn#getAddress()
   * @see #getGoOn()
   * @generated
   */
  EAttribute getGoOn_Address();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see org.emn.uiTest.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Store#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.emn.uiTest.Store#getSelector()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Selector();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Store#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.emn.uiTest.Store#getKey()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Key();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see org.emn.uiTest.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Fill#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.emn.uiTest.Fill#getSelector()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Selector();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Fill#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see org.emn.uiTest.Fill#getStringValue()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_StringValue();

  /**
   * Returns the meta object for the reference '{@link org.emn.uiTest.Fill#getKeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key Value</em>'.
   * @see org.emn.uiTest.Fill#getKeyValue()
   * @see #getFill()
   * @generated
   */
  EReference getFill_KeyValue();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click</em>'.
   * @see org.emn.uiTest.Click
   * @generated
   */
  EClass getClick();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Click#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.Click#getName()
   * @see #getClick()
   * @generated
   */
  EAttribute getClick_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Click#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.emn.uiTest.Click#getSelector()
   * @see #getClick()
   * @generated
   */
  EReference getClick_Selector();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify</em>'.
   * @see org.emn.uiTest.Verify
   * @generated
   */
  EClass getVerify();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Verify#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.Verify#getName()
   * @see #getVerify()
   * @generated
   */
  EAttribute getVerify_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.emn.uiTest.Verify#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.emn.uiTest.Verify#getSelector()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_Selector();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see org.emn.uiTest.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Selector#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see org.emn.uiTest.Selector#getAttributeName()
   * @see #getSelector()
   * @generated
   */
  EAttribute getSelector_AttributeName();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.Selector#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Value</em>'.
   * @see org.emn.uiTest.Selector#getAttributeValue()
   * @see #getSelector()
   * @generated
   */
  EAttribute getSelector_AttributeValue();

  /**
   * Returns the meta object for class '{@link org.emn.uiTest.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see org.emn.uiTest.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.emn.uiTest.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emn.uiTest.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UiTestFactory getUiTestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.UiTestImpl <em>Ui Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.UiTestImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getUiTest()
     * @generated
     */
    EClass UI_TEST = eINSTANCE.getUiTest();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_TEST__FUNCTIONS = eINSTANCE.getUiTest_Functions();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_TEST__COMMANDS = eINSTANCE.getUiTest_Commands();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.FunctionImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__STATEMENTS = eINSTANCE.getFunction_Statements();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.FunctionCallImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.FunctionNameImpl <em>Function Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.FunctionNameImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getFunctionName()
     * @generated
     */
    EClass FUNCTION_NAME = eINSTANCE.getFunctionName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_NAME__NAME = eINSTANCE.getFunctionName_Name();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.CommandImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.OpenImpl <em>Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.OpenImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getOpen()
     * @generated
     */
    EClass OPEN = eINSTANCE.getOpen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN__NAME = eINSTANCE.getOpen_Name();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN__PROGRAM = eINSTANCE.getOpen_Program();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.GoOnImpl <em>Go On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.GoOnImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getGoOn()
     * @generated
     */
    EClass GO_ON = eINSTANCE.getGoOn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_ON__NAME = eINSTANCE.getGoOn_Name();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_ON__ADDRESS = eINSTANCE.getGoOn_Address();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.StoreImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getStore()
     * @generated
     */
    EClass STORE = eINSTANCE.getStore();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__SELECTOR = eINSTANCE.getStore_Selector();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__KEY = eINSTANCE.getStore_Key();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.FillImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__SELECTOR = eINSTANCE.getFill_Selector();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__STRING_VALUE = eINSTANCE.getFill_StringValue();

    /**
     * The meta object literal for the '<em><b>Key Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__KEY_VALUE = eINSTANCE.getFill_KeyValue();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.ClickImpl <em>Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.ClickImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getClick()
     * @generated
     */
    EClass CLICK = eINSTANCE.getClick();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLICK__NAME = eINSTANCE.getClick_Name();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__SELECTOR = eINSTANCE.getClick_Selector();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.VerifyImpl <em>Verify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.VerifyImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getVerify()
     * @generated
     */
    EClass VERIFY = eINSTANCE.getVerify();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFY__NAME = eINSTANCE.getVerify_Name();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__SELECTOR = eINSTANCE.getVerify_Selector();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.SelectorImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__ATTRIBUTE_NAME = eINSTANCE.getSelector_AttributeName();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__ATTRIBUTE_VALUE = eINSTANCE.getSelector_AttributeValue();

    /**
     * The meta object literal for the '{@link org.emn.uiTest.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emn.uiTest.impl.VariableDefinitionImpl
     * @see org.emn.uiTest.impl.UiTestPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NAME = eINSTANCE.getVariableDefinition_Name();

  }

} //UiTestPackage