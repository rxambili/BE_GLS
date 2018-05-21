/**
 */
package PetriNet.impl;

import PetriNet.PetriElement;
import PetriNet.PetriNetPackage;
import PetriNet.ReseauPetri;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.impl.PetriElementImpl#getReseauPetri <em>Reseau Petri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PetriElementImpl extends MinimalEObjectImpl.Container implements PetriElement {
	/**
	 * The cached setting delegate for the '{@link #getReseauPetri() <em>Reseau Petri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReseauPetri()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESEAU_PETRI__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PetriNetPackage.Literals.PETRI_ELEMENT__RESEAU_PETRI).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PETRI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReseauPetri getReseauPetri() {
		return (ReseauPetri)RESEAU_PETRI__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.PETRI_ELEMENT__RESEAU_PETRI:
				return getReseauPetri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PETRI_ELEMENT__RESEAU_PETRI:
				return RESEAU_PETRI__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //PetriElementImpl
