/**
 */
package uk.ac.kcl.inf.modelling.pls.pls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getOut <em>Out</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Conveyor)
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getMachine_Out()
	 * @model
	 * @generated
	 */
	Conveyor getOut();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Conveyor value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Tray)
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getMachine_In()
	 * @model
	 * @generated
	 */
	Tray getIn();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Tray value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void work();

} // Machine
