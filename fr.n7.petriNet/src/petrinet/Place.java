/**
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.Place#getJeton <em>Jeton</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Noeud {
	/**
	 * Returns the value of the '<em><b>Jeton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jeton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeton</em>' attribute.
	 * @see #setJeton(int)
	 * @see PetriNet.PetriNetPackage#getPlace_Jeton()
	 * @model required="true"
	 * @generated
	 */
	int getJeton();

	/**
	 * Sets the value of the '{@link PetriNet.Place#getJeton <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jeton</em>' attribute.
	 * @see #getJeton()
	 * @generated
	 */
	void setJeton(int value);

} // Place
