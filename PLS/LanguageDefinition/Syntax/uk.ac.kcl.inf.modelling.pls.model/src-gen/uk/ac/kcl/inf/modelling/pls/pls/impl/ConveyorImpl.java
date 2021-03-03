/**
 */
package uk.ac.kcl.inf.modelling.pls.pls.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelling.pls.pls.Conveyor;
import uk.ac.kcl.inf.modelling.pls.pls.PLSPackage;
import uk.ac.kcl.inf.modelling.pls.pls.Tray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ConveyorImpl#getTray <em>Tray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends ContainerImpl implements Conveyor {
	/**
	 * The cached value of the '{@link #getTray() <em>Tray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTray()
	 * @generated
	 * @ordered
	 */
	protected Tray tray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLSPackage.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tray getTray() {
		if (tray != null && tray.eIsProxy()) {
			InternalEObject oldTray = (InternalEObject) tray;
			tray = (Tray) eResolveProxy(oldTray);
			if (tray != oldTray) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLSPackage.CONVEYOR__TRAY, oldTray,
							tray));
			}
		}
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray basicGetTray() {
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTray(Tray newTray) {
		Tray oldTray = tray;
		tray = newTray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLSPackage.CONVEYOR__TRAY, oldTray, tray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveAlong() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PLSPackage.CONVEYOR__TRAY:
			if (resolve)
				return getTray();
			return basicGetTray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PLSPackage.CONVEYOR__TRAY:
			setTray((Tray) newValue);
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
		case PLSPackage.CONVEYOR__TRAY:
			setTray((Tray) null);
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
		case PLSPackage.CONVEYOR__TRAY:
			return tray != null;
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
		case PLSPackage.CONVEYOR___MOVE_ALONG:
			moveAlong();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConveyorImpl
