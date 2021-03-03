/**
 */
package uk.ac.kcl.inf.modelling.pls.pls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getProductionLineModel()
 * @model
 * @generated
 */
public interface ProductionLineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.pls.pls.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getProductionLineModel_Elements()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<NamedElement> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // ProductionLineModel
