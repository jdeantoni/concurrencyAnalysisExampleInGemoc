/**
 */
package uk.ac.kcl.inf.modelling.pls.pls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.pls.pls.Machine;
import uk.ac.kcl.inf.modelling.pls.pls.PLSPackage;
import uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineModelImpl extends MinimalEObjectImpl.Container implements ProductionLineModel {
	/**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machines;
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<uk.ac.kcl.inf.modelling.pls.pls.Container> containers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLSPackage.Literals.PRODUCTION_LINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Machine> getMachines() {
		if (machines == null) {
			machines = new EObjectContainmentEList<Machine>(Machine.class, this,
					PLSPackage.PRODUCTION_LINE_MODEL__MACHINES);
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<uk.ac.kcl.inf.modelling.pls.pls.Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<uk.ac.kcl.inf.modelling.pls.pls.Container>(
					uk.ac.kcl.inf.modelling.pls.pls.Container.class, this,
					PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PLSPackage.PRODUCTION_LINE_MODEL__MACHINES:
			return ((InternalEList<?>) getMachines()).basicRemove(otherEnd, msgs);
		case PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS:
			return ((InternalEList<?>) getContainers()).basicRemove(otherEnd, msgs);
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
		case PLSPackage.PRODUCTION_LINE_MODEL__MACHINES:
			return getMachines();
		case PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS:
			return getContainers();
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
		case PLSPackage.PRODUCTION_LINE_MODEL__MACHINES:
			getMachines().clear();
			getMachines().addAll((Collection<? extends Machine>) newValue);
			return;
		case PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS:
			getContainers().clear();
			getContainers().addAll((Collection<? extends uk.ac.kcl.inf.modelling.pls.pls.Container>) newValue);
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
		case PLSPackage.PRODUCTION_LINE_MODEL__MACHINES:
			getMachines().clear();
			return;
		case PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS:
			getContainers().clear();
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
		case PLSPackage.PRODUCTION_LINE_MODEL__MACHINES:
			return machines != null && !machines.isEmpty();
		case PLSPackage.PRODUCTION_LINE_MODEL__CONTAINERS:
			return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PLSPackage.PRODUCTION_LINE_MODEL___INITIALIZE:
			initialize();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProductionLineModelImpl
