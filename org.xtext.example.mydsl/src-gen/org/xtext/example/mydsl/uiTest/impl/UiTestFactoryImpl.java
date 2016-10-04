/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.uiTest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.uiTest.*;

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
    try
    {
      UiTestFactory theUiTestFactory = (UiTestFactory)EPackage.Registry.INSTANCE.getEFactory(UiTestPackage.eNS_URI);
      if (theUiTestFactory != null)
      {
        return theUiTestFactory;
      }
    }
    catch (Exception exception)
    {
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
    switch (eClass.getClassifierID())
    {
      case UiTestPackage.MODEL: return createModel();
      case UiTestPackage.COMMAND: return createCommand();
      case UiTestPackage.OPEN: return createOpen();
      case UiTestPackage.GO_ON: return createGoOn();
      case UiTestPackage.FILL: return createFill();
      case UiTestPackage.SELECT: return createSelect();
      case UiTestPackage.CLICK: return createClick();
      case UiTestPackage.VERIFY: return createVerify();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
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