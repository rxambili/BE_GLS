/**
 */
package PetriNet.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>PetriNet</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PetriNetTests("PetriNet Tests");
		suite.addTestSuite(PlaceTest.class);
		suite.addTestSuite(ArcTest.class);
		suite.addTestSuite(TransitionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetTests(String name) {
		super(name);
	}

} //PetriNetTests
