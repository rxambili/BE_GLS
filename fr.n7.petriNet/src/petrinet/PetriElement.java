/**
 */
package PetriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.PetriElement#getReseauPetri <em>Reseau Petri</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getPetriElement()
 * @model abstract="true"
 * @generated
 */
public interface PetriElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Reseau Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reseau Petri</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau Petri</em>' reference.
	 * @see PetriNet.PetriNetPackage#getPetriElement_ReseauPetri()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='ReseauPetri.allInstances()\n\t\t\t\t-&gt;select(p | p.petrielement-&gt;includes(self))\n\t\t\t\t-&gt;asSequence()-&gt;first()'"
	 * @generated
	 */
	ReseauPetri getReseauPetri();

} // PetriElement
