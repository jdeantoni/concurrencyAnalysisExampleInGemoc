/**
 */
package org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.Application;
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.SigpmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.impl.SystemImpl#getOwnedApplication <em>Owned Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.System {
	/**
	 * The cached value of the '{@link #getOwnedApplication() <em>Owned Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedApplication()
	 * @generated
	 * @ordered
	 */
	protected Application ownedApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SigpmlPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getOwnedApplication() {
		return ownedApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedApplication(Application newOwnedApplication, NotificationChain msgs) {
		Application oldOwnedApplication = ownedApplication;
		ownedApplication = newOwnedApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SigpmlPackage.SYSTEM__OWNED_APPLICATION, oldOwnedApplication, newOwnedApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedApplication(Application newOwnedApplication) {
		if (newOwnedApplication != ownedApplication) {
			NotificationChain msgs = null;
			if (ownedApplication != null)
				msgs = ((InternalEObject)ownedApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SigpmlPackage.SYSTEM__OWNED_APPLICATION, null, msgs);
			if (newOwnedApplication != null)
				msgs = ((InternalEObject)newOwnedApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SigpmlPackage.SYSTEM__OWNED_APPLICATION, null, msgs);
			msgs = basicSetOwnedApplication(newOwnedApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SigpmlPackage.SYSTEM__OWNED_APPLICATION, newOwnedApplication, newOwnedApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SigpmlPackage.SYSTEM__OWNED_APPLICATION:
				return basicSetOwnedApplication(null, msgs);
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
			case SigpmlPackage.SYSTEM__OWNED_APPLICATION:
				return getOwnedApplication();
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
			case SigpmlPackage.SYSTEM__OWNED_APPLICATION:
				setOwnedApplication((Application)newValue);
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
			case SigpmlPackage.SYSTEM__OWNED_APPLICATION:
				setOwnedApplication((Application)null);
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
			case SigpmlPackage.SYSTEM__OWNED_APPLICATION:
				return ownedApplication != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
