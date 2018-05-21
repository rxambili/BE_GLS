/**
 */
package simplepdl.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import simplepdl.Allocation;
import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplepdl.SimplepdlPackage
 * @generated
 */
public class SimplepdlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplepdlValidator INSTANCE = new SimplepdlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplepdl";

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
	public SimplepdlValidator() {
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
	  return SimplepdlPackage.eINSTANCE;
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
			case SimplepdlPackage.PROCESS:
				return validateProcess((simplepdl.Process)value, diagnostics, context);
			case SimplepdlPackage.WORK_DEFINITION:
				return validateWorkDefinition((WorkDefinition)value, diagnostics, context);
			case SimplepdlPackage.WORK_SEQUENCE:
				return validateWorkSequence((WorkSequence)value, diagnostics, context);
			case SimplepdlPackage.PROCESS_ELEMENT:
				return validateProcessElement((ProcessElement)value, diagnostics, context);
			case SimplepdlPackage.GUIDANCE:
				return validateGuidance((Guidance)value, diagnostics, context);
			case SimplepdlPackage.RESSOURCE:
				return validateRessource((Ressource)value, diagnostics, context);
			case SimplepdlPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case SimplepdlPackage.WORK_SEQUENCE_TYPE:
				return validateWorkSequenceType((WorkSequenceType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(simplepdl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_noEmptyName(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_noEmptyName(simplepdl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 PROCESS__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkDefinition_differentNames(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkDefinition_noEmptyName(workDefinition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentNames constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_DEFINITION__DIFFERENT_NAMES__EEXPRESSION = "self.process.processElement\n" +
		"\t\t\t->select(p | p.oclIsKindOf(WorkDefinition))\n" +
		"\t\t\t->collect(p | p.oclAsType(WorkDefinition))\n" +
		"\t\t\t->forAll(w1 | w1 = self or w1.name <> self.name)";

	/**
	 * Validates the differentNames constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_differentNames(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_DEFINITION,
				 workDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentNames",
				 WORK_DEFINITION__DIFFERENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_DEFINITION__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_noEmptyName(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_DEFINITION,
				 workDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 WORK_DEFINITION__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkSequence_previousWDinSameProcess(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkSequence_nextWDinSameProcess(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkSequence_nonReflexive(workSequence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the previousWDinSameProcess constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_SEQUENCE__PREVIOUS_WDIN_SAME_PROCESS__EEXPRESSION = "self.process = self.predecessor.process";

	/**
	 * Validates the previousWDinSameProcess constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence_previousWDinSameProcess(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_SEQUENCE,
				 workSequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "previousWDinSameProcess",
				 WORK_SEQUENCE__PREVIOUS_WDIN_SAME_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nextWDinSameProcess constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_SEQUENCE__NEXT_WDIN_SAME_PROCESS__EEXPRESSION = "self.process = self.successor.process";

	/**
	 * Validates the nextWDinSameProcess constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence_nextWDinSameProcess(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_SEQUENCE,
				 workSequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nextWDinSameProcess",
				 WORK_SEQUENCE__NEXT_WDIN_SAME_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nonReflexive constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_SEQUENCE__NON_REFLEXIVE__EEXPRESSION = "self.predecessor <> self.successor";

	/**
	 * Validates the nonReflexive constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence_nonReflexive(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_SEQUENCE,
				 workSequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonReflexive",
				 WORK_SEQUENCE__NON_REFLEXIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessElement(ProcessElement processElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidance(Guidance guidance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ressource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_countPositif(ressource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRessource_differentNames(ressource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the countPositif constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESSOURCE__COUNT_POSITIF__EEXPRESSION = "count >= 0";

	/**
	 * Validates the countPositif constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_countPositif(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.RESSOURCE,
				 ressource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "countPositif",
				 RESSOURCE__COUNT_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the differentNames constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESSOURCE__DIFFERENT_NAMES__EEXPRESSION = "self.process.processElement\n" +
		"\t\t\t->select(p | p.oclIsKindOf(Ressource))\n" +
		"\t\t\t->collect(p | p.oclAsType(Ressource))\n" +
		"\t\t\t->forAll(w1 | w1 = self or w1.name <> self.name)";

	/**
	 * Validates the differentNames constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_differentNames(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.RESSOURCE,
				 ressource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentNames",
				 RESSOURCE__DIFFERENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_nonDepassement(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_neededPositif(allocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonDepassement constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__NON_DEPASSEMENT__EEXPRESSION = "needed <= self.ressource.count";

	/**
	 * Validates the nonDepassement constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_nonDepassement(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonDepassement",
				 ALLOCATION__NON_DEPASSEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the neededPositif constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__NEEDED_POSITIF__EEXPRESSION = "needed >= 0";

	/**
	 * Validates the neededPositif constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_neededPositif(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "neededPositif",
				 ALLOCATION__NEEDED_POSITIF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequenceType(WorkSequenceType workSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //SimplepdlValidator
