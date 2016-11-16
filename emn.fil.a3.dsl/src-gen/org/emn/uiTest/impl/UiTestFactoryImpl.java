/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emn.uiTest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiTestFactoryImpl extends EFactoryImpl implements UiTestFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static UiTestFactory init()
  {
		try {
			UiTestFactory theUiTestFactory = (UiTestFactory)EPackage.Registry.INSTANCE.getEFactory(UiTestPackage.eNS_URI);
			if (theUiTestFactory != null) {
				return theUiTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiTestFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UiTestFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case UiTestPackage.UI_TEST: return createUiTest();
			case UiTestPackage.FUNCTION: return createFunction();
			case UiTestPackage.FUNCTION_CALL: return createFunctionCall();
			case UiTestPackage.FUNCTION_NAME: return createFunctionName();
			case UiTestPackage.COMMAND: return createCommand();
			case UiTestPackage.OPEN: return createOpen();
			case UiTestPackage.GO_ON: return createGoOn();
			case UiTestPackage.STORE: return createStore();
			case UiTestPackage.FILL: return createFill();
			case UiTestPackage.CLICK: return createClick();
			case UiTestPackage.VERIFY: return createVerify();
			case UiTestPackage.SELECT: return createSelect();
			case UiTestPackage.SELECTOR: return createSelector();
			case UiTestPackage.VARIABLE_DEFINITION: return createVariableDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UiTest createUiTest()
  {
		UiTestImpl uiTest = new UiTestImpl();
		return uiTest;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Function createFunction()
  {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionCall createFunctionCall()
  {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FunctionName createFunctionName()
  {
		FunctionNameImpl functionName = new FunctionNameImpl();
		return functionName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Command createCommand()
  {
		CommandImpl command = new CommandImpl();
		return command;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Open createOpen()
  {
		OpenImpl open = new OpenImpl();
		return open;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GoOn createGoOn()
  {
		GoOnImpl goOn = new GoOnImpl();
		return goOn;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Store createStore()
  {
		StoreImpl store = new StoreImpl();
		return store;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Fill createFill()
  {
		FillImpl fill = new FillImpl();
		return fill;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Click createClick()
  {
		ClickImpl click = new ClickImpl();
		return click;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Verify createVerify()
  {
		VerifyImpl verify = new VerifyImpl();
		return verify;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Select createSelect()
  {
		SelectImpl select = new SelectImpl();
		return select;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Selector createSelector()
  {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableDefinition createVariableDefinition()
  {
		VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
		return variableDefinition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UiTestPackage getUiTestPackage()
  {
		return (UiTestPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static UiTestPackage getPackage()
  {
		return UiTestPackage.eINSTANCE;
	}

} //UiTestFactoryImpl
