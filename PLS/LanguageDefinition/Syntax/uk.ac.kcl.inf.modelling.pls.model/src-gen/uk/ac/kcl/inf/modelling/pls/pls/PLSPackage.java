/**
 */
package uk.ac.kcl.inf.modelling.pls.pls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSFactory
 * @model kind="package"
 * @generated
 */
public interface PLSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://inf.kcl.ac.uk/models/pls";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PLSPackage eINSTANCE = uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getProductionLineModel()
	 * @generated
	 */
	int PRODUCTION_LINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__MACHINES = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__CONTAINERS = 1;

	/**
	 * The number of structural features of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL___INITIALIZE = 0;

	/**
	 * The number of operations of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.NamedElementImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.MachineImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___WORK = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PartImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getPart()
	 * @generated
	 */
	int PART = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ConveyorImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARTS = CONTAINER__PARTS;

	/**
	 * The feature id for the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__TRAY = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Along</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR___MOVE_ALONG = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.TrayImpl <em>Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.TrayImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getTray()
	 * @generated
	 */
	int TRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__PARTS = CONTAINER__PARTS;

	/**
	 * The number of structural features of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HammerImpl <em>Hammer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HammerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHammer()
	 * @generated
	 */
	int HAMMER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HeadImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HandleImpl <em>Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HandleImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHandle()
	 * @generated
	 */
	int HANDLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.PolisherImpl <em>Polisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PolisherImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getPolisher()
	 * @generated
	 */
	int POLISHER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER___WORK = MACHINE___WORK;

	/**
	 * The number of operations of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.AssemblerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER___WORK = MACHINE___WORK;

	/**
	 * The number of operations of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GeneratorImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___WORK = MACHINE___WORK;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GenHeadImpl <em>Gen Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GenHeadImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenHead()
	 * @generated
	 */
	int GEN_HEAD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__NAME = GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__OUT = GENERATOR__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__IN = GENERATOR__IN;

	/**
	 * The number of structural features of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD___WORK = GENERATOR___WORK;

	/**
	 * The number of operations of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GenHandleImpl <em>Gen Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GenHandleImpl
	 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenHandle()
	 * @generated
	 */
	int GEN_HANDLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__NAME = GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__OUT = GENERATOR__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__IN = GENERATOR__IN;

	/**
	 * The number of structural features of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Work</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE___WORK = GENERATOR___WORK;

	/**
	 * The number of operations of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line Model</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel
	 * @generated
	 */
	EClass getProductionLineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machines</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getMachines()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Machines();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#getContainers()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Containers();

	/**
	 * Returns the meta object for the '{@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel#initialize()
	 * @generated
	 */
	EOperation getProductionLineModel__Initialize();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Machine#getOut()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Out();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Machine#getIn()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_In();

	/**
	 * Returns the meta object for the '{@link uk.ac.kcl.inf.modelling.pls.pls.Machine#work() <em>Work</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Work</em>' operation.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Machine#work()
	 * @generated
	 */
	EOperation getMachine__Work();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.pls.pls.Container#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Container#getParts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Parts();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor#getTray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Conveyor#getTray()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Tray();

	/**
	 * Returns the meta object for the '{@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor#moveAlong() <em>Move Along</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Along</em>' operation.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Conveyor#moveAlong()
	 * @generated
	 */
	EOperation getConveyor__MoveAlong();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Tray
	 * @generated
	 */
	EClass getTray();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Hammer <em>Hammer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hammer</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Hammer
	 * @generated
	 */
	EClass getHammer();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Handle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Handle
	 * @generated
	 */
	EClass getHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Polisher <em>Polisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polisher</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Polisher
	 * @generated
	 */
	EClass getPolisher();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.GenHead <em>Gen Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Head</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.GenHead
	 * @generated
	 */
	EClass getGenHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.GenHandle <em>Gen Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Handle</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.GenHandle
	 * @generated
	 */
	EClass getGenHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.pls.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.pls.pls.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.pls.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PLSFactory getPLSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ProductionLineModelImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getProductionLineModel()
		 * @generated
		 */
		EClass PRODUCTION_LINE_MODEL = eINSTANCE.getProductionLineModel();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__MACHINES = eINSTANCE.getProductionLineModel_Machines();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__CONTAINERS = eINSTANCE.getProductionLineModel_Containers();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCTION_LINE_MODEL___INITIALIZE = eINSTANCE.getProductionLineModel__Initialize();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.MachineImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUT = eINSTANCE.getMachine_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__IN = eINSTANCE.getMachine_In();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACHINE___WORK = eINSTANCE.getMachine__Work();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ContainerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PARTS = eINSTANCE.getContainer_Parts();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PartImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.ConveyorImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Tray</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__TRAY = eINSTANCE.getConveyor_Tray();

		/**
		 * The meta object literal for the '<em><b>Move Along</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVEYOR___MOVE_ALONG = eINSTANCE.getConveyor__MoveAlong();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.TrayImpl <em>Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.TrayImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getTray()
		 * @generated
		 */
		EClass TRAY = eINSTANCE.getTray();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HammerImpl <em>Hammer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HammerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHammer()
		 * @generated
		 */
		EClass HAMMER = eINSTANCE.getHammer();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HeadImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.HandleImpl <em>Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.HandleImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getHandle()
		 * @generated
		 */
		EClass HANDLE = eINSTANCE.getHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.PolisherImpl <em>Polisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PolisherImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getPolisher()
		 * @generated
		 */
		EClass POLISHER = eINSTANCE.getPolisher();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.AssemblerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GeneratorImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GenHeadImpl <em>Gen Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GenHeadImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenHead()
		 * @generated
		 */
		EClass GEN_HEAD = eINSTANCE.getGenHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.GenHandleImpl <em>Gen Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.GenHandleImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getGenHandle()
		 * @generated
		 */
		EClass GEN_HANDLE = eINSTANCE.getGenHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.pls.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.NamedElementImpl
		 * @see uk.ac.kcl.inf.modelling.pls.pls.impl.PLSPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //PLSPackage
