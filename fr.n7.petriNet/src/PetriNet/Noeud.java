/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.Noeud#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link PetriNet.Noeud#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link PetriNet.Noeud#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getNoeud()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noEmptyName differentNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noEmptyName='name.size() &gt; 0' differentNames='self.reseauPetri.petrielement\n\t\t\t-&gt;select(p | p.oclIsKindOf(Noeud))\n\t\t\t-&gt;collect(p | p.oclAsType(Noeud))\n\t\t\t-&gt;forAll(w1 | w1 = self or w1.name &lt;&gt; self.name)'"
 * @generated
 */
public interface Noeud extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link PetriNet.Arc#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getNoeud_LinksToPredecessors()
	 * @see PetriNet.Arc#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<Arc> getLinksToPredecessors();

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link PetriNet.Arc#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getNoeud_LinksToSuccessors()
	 * @see PetriNet.Arc#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<Arc> getLinksToSuccessors();

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
	 * @see PetriNet.PetriNetPackage#getNoeud_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PetriNet.Noeud#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Noeud
