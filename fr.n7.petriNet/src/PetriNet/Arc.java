/**
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.Arc#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link PetriNet.Arc#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link PetriNet.Arc#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link PetriNet.Arc#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getArc()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='poidsPos previousNodeinSamePetri nextNodeinSamePetri notSameNodeType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot poidsPos='poids &gt; 0' previousNodeinSamePetri='self.reseauPetri = self.predecessor.reseauPetri' nextNodeinSamePetri='self.reseauPetri = self.successor.reseauPetri' notSameNodeType='(self.successor.oclIsKindOf(Place) and self.predecessor.oclIsKindOf(Transition))\n\t\t\t\t\t\t\t\t\t\tor (self.successor.oclIsKindOf(Transition) and self.predecessor.oclIsKindOf(Place))'"
 * @generated
 */
public interface Arc extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Noeud#getLinksToPredecessors <em>Links To Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Noeud)
	 * @see PetriNet.PetriNetPackage#getArc_Successor()
	 * @see PetriNet.Noeud#getLinksToPredecessors
	 * @model opposite="linksToPredecessors" required="true"
	 * @generated
	 */
	Noeud getSuccessor();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Noeud value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Noeud#getLinksToSuccessors <em>Links To Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Noeud)
	 * @see PetriNet.PetriNetPackage#getArc_Predecessor()
	 * @see PetriNet.Noeud#getLinksToSuccessors
	 * @model opposite="LinksToSuccessors" required="true"
	 * @generated
	 */
	Noeud getPredecessor();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Noeud value);

	/**
	 * Returns the value of the '<em><b>Is Read Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Arc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Arc</em>' attribute.
	 * @see #setIsReadArc(boolean)
	 * @see PetriNet.PetriNetPackage#getArc_IsReadArc()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReadArc();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#isIsReadArc <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Arc</em>' attribute.
	 * @see #isIsReadArc()
	 * @generated
	 */
	void setIsReadArc(boolean value);

	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(int)
	 * @see PetriNet.PetriNetPackage#getArc_Poids()
	 * @model required="true"
	 * @generated
	 */
	int getPoids();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(int value);

} // Arc
