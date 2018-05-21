/**
 */
package PetriNet.util;

import PetriNet.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage
 * @generated
 */
public class PetriNetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PetriNetValidator INSTANCE = new PetriNetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "PetriNet";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PetriNetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PetriNetPackage.PLACE:
				return validatePlace((Place)value, diagnostics, context);
			case PetriNetPackage.ARC:
				return validateArc((Arc)value, diagnostics, context);
			case PetriNetPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case PetriNetPackage.RESEAU_PETRI:
				return validateReseauPetri((ReseauPetri)value, diagnostics, context);
			case PetriNetPackage.PETRI_ELEMENT:
				return validatePetriElement((PetriElement)value, diagnostics, context);
			case PetriNetPackage.NOEUD:
				return validateNoeud((Noeud)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(place, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_differentNames(place, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validateArc_poidsPos(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validateArc_previousNodeinSamePetri(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validateArc_nextNodeinSamePetri(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validateArc_notSameNodeType(arc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the poidsPos constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__POIDS_POS__EEXPRESSION = "poids > 0";

	/**
	 * Validates the poidsPos constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_poidsPos(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.ARC,
				 arc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "poidsPos",
				 ARC__POIDS_POS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the previousNodeinSamePetri constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__PREVIOUS_NODEIN_SAME_PETRI__EEXPRESSION = "self.reseauPetri = self.predecessor.reseauPetri";

	/**
	 * Validates the previousNodeinSamePetri constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_previousNodeinSamePetri(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.ARC,
				 arc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "previousNodeinSamePetri",
				 ARC__PREVIOUS_NODEIN_SAME_PETRI__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nextNodeinSamePetri constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__NEXT_NODEIN_SAME_PETRI__EEXPRESSION = "self.reseauPetri = self.successor.reseauPetri";

	/**
	 * Validates the nextNodeinSamePetri constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_nextNodeinSamePetri(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.ARC,
				 arc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nextNodeinSamePetri",
				 ARC__NEXT_NODEIN_SAME_PETRI__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the notSameNodeType constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__NOT_SAME_NODE_TYPE__EEXPRESSION = "(self.successor.oclIsKindOf(Place) and self.predecessor.oclIsKindOf(Transition))\n" +
		"\t\t\t\t\t\t\t\t\t\tor (self.successor.oclIsKindOf(Transition) and self.predecessor.oclIsKindOf(Place))";

	/**
	 * Validates the notSameNodeType constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_notSameNodeType(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.ARC,
				 arc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notSameNodeType",
				 ARC__NOT_SAME_NODE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_differentNames(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_notExtremity(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notExtremity constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NOT_EXTREMITY__EEXPRESSION = "self.LinksToSuccessors->asSequence()->notEmpty() and self.linksToPredecessors->asSequence()->notEmpty()";

	/**
	 * Validates the notExtremity constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_notExtremity(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notExtremity",
				 TRANSITION__NOT_EXTREMITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReseauPetri(ReseauPetri reseauPetri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reseauPetri, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reseauPetri, diagnostics, context);
		if (result || diagnostics != null) result &= validateReseauPetri_noEmptyName(reseauPetri, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESEAU_PETRI__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Reseau Petri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReseauPetri_noEmptyName(ReseauPetri reseauPetri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.RESEAU_PETRI,
				 reseauPetri,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 RESEAU_PETRI__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriElement(PetriElement petriElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(petriElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(noeud, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_differentNames(noeud, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOEUD__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud_noEmptyName(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.NOEUD,
				 noeud,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 NOEUD__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the differentNames constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOEUD__DIFFERENT_NAMES__EEXPRESSION = "self.reseauPetri.petrielement\n" +
		"\t\t\t->select(p | p.oclIsKindOf(Noeud))\n" +
		"\t\t\t->collect(p | p.oclAsType(Noeud))\n" +
		"\t\t\t->forAll(w1 | w1 = self or w1.name <> self.name)";

	/**
	 * Validates the differentNames constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud_differentNames(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.NOEUD,
				 noeud,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentNames",
				 NOEUD__DIFFERENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PetriNetValidator
