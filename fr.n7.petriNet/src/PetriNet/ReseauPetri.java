/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reseau Petri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.ReseauPetri#getName <em>Name</em>}</li>
 *   <li>{@link PetriNet.ReseauPetri#getPetrielement <em>Petrielement</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getReseauPetri()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noEmptyName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noEmptyName='name.size() &gt; 0'"
 * @generated
 */
public interface ReseauPetri extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PetriNet.PetriNetPackage#getReseauPetri_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PetriNet.ReseauPetri#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petrielement</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.PetriElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrielement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrielement</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getReseauPetri_Petrielement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PetriElement> getPetrielement();

} // ReseauPetri
