/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest.tests;

import junit.textui.TestRunner;

import org.emn.uiTest.Fill;
import org.emn.uiTest.UiTestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FillTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FillTest.class);
	}

	/**
	 * Constructs a new Fill test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fill test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fill getFixture() {
		return (Fill)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiTestFactory.eINSTANCE.createFill());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FillTest
