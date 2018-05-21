/**
 */
package PetriNet.impl;

import PetriNet.Arc;
import PetriNet.Noeud;
import PetriNet.PetriNetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.impl.NoeudImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link PetriNet.impl.NoeudImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link PetriNet.impl.NoeudImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NoeudImpl extends PetriElementImpl implements Noeud {
	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToPredecessors;

	/**
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToSuccessors;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoeudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.NOEUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getLinksToPredecessors() {
		if (linksToPredecessors == null) {
			linksToPredecessors = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS, PetriNetPackage.ARC__SUCCESSOR);
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getLinksToSuccessors() {
		if (linksToSuccessors == null) {
			linksToSuccessors = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS, PetriNetPackage.ARC__PREDECESSOR);
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.NOEUD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToPredecessors()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToSuccessors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				return ((InternalEList<?>)getLinksToPredecessors()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				return ((InternalEList<?>)getLinksToSuccessors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				return getLinksToPredecessors();
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				return getLinksToSuccessors();
			case PetriNetPackage.NOEUD__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				getLinksToPredecessors().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				getLinksToSuccessors().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetriNetPackage.NOEUD__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				return;
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				return;
			case PetriNetPackage.NOEUD__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__LINKS_TO_PREDECESSORS:
				return linksToPredecessors != null && !linksToPredecessors.isEmpty();
			case PetriNetPackage.NOEUD__LINKS_TO_SUCCESSORS:
				return linksToSuccessors != null && !linksToSuccessors.isEmpty();
			case PetriNetPackage.NOEUD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NoeudImpl
