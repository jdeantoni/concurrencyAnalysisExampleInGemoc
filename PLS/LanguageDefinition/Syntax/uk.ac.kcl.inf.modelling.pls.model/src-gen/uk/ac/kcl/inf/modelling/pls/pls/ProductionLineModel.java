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
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getMachines <em>Machines</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getProductionLineModel()
 * @model
 * @generated
 */
public interface ProductionLineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Machines</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.pls.pls.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getProductionLineModel_Machines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getMachines();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.pls.pls.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#getProductionLineModel_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // ProductionLineModel
