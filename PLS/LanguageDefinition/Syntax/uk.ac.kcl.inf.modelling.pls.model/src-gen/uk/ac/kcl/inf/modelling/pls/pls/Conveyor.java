/**
 */
package uk.ac.kcl.inf.modelling.pls.pls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor#getTray <em>Tray</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends Container {
	/**
	 * Returns the value of the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tray</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tray</em>' reference.
	 * @see #setTray(Tray)
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getConveyor_Tray()
	 * @model
	 * @generated
	 */
	Tray getTray();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor#getTray <em>Tray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tray</em>' reference.
	 * @see #getTray()
	 * @generated
	 */
	void setTray(Tray value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveAlong();

} // Conveyor
