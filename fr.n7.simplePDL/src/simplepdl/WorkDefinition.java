/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getWorkDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentNames noEmptyName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentNames='self.process.processElement\n\t\t\t-&gt;select(p | p.oclIsKindOf(WorkDefinition))\n\t\t\t-&gt;collect(p | p.oclAsType(WorkDefinition))\n\t\t\t-&gt;forAll(w1 | w1 = self or w1.name &lt;&gt; self.name)' noEmptyName='name.size() &gt; 0'"
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToPredecessors()
	 * @see simplepdl.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessors();

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToSuccessors()
	 * @see simplepdl.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessors();

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
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.WorkDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.Allocation}.
	 * It is bidirectional and its opposite is '{@link simplepdl.Allocation#getWorkdefinition <em>Workdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Allocation()
	 * @see simplepdl.Allocation#getWorkdefinition
	 * @model opposite="workdefinition" containment="true"
	 * @generated
	 */
	EList<Allocation> getAllocation();

} // WorkDefinition
