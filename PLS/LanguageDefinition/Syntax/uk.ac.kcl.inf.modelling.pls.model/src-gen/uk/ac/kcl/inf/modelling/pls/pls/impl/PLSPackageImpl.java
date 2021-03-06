/**
 */
package uk.ac.kcl.inf.modelling.pls.pls.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.modelling.pls.pls.Assembler;
import uk.ac.kcl.inf.modelling.pls.pls.Conveyor;
import uk.ac.kcl.inf.modelling.pls.pls.GenHandle;
import uk.ac.kcl.inf.modelling.pls.pls.GenHead;
import uk.ac.kcl.inf.modelling.pls.pls.Generator;
import uk.ac.kcl.inf.modelling.pls.pls.Hammer;
import uk.ac.kcl.inf.modelling.pls.pls.Handle;
import uk.ac.kcl.inf.modelling.pls.pls.Head;
import uk.ac.kcl.inf.modelling.pls.pls.Machine;
import uk.ac.kcl.inf.modelling.pls.pls.NamedElement;
import uk.ac.kcl.inf.modelling.pls.pls.PLSFactory;
import uk.ac.kcl.inf.modelling.pls.pls.PLSPackage;
import uk.ac.kcl.inf.modelling.pls.pls.Part;
import uk.ac.kcl.inf.modelling.pls.pls.Polisher;
import uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel;
import uk.ac.kcl.inf.modelling.pls.pls.Tray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLSPackageImpl extends EPackageImpl implements PLSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hammerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.kcl.inf.modelling.pls.pls.PLSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PLSPackageImpl() {
		super(eNS_URI, PLSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PLSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PLSPackage init() {
		if (isInited)
			return (PLSPackage) EPackage.Registry.INSTANCE.getEPackage(PLSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPLSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PLSPackageImpl thePLSPackage = registeredPLSPackage instanceof PLSPackageImpl
				? (PLSPackageImpl) registeredPLSPackage
				: new PLSPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePLSPackage.createPackageContents();

		// Initialize created meta-data
		thePLSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePLSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PLSPackage.eNS_URI, thePLSPackage);
		return thePLSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductionLineModel() {
		return productionLineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductionLineModel_Machines() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductionLineModel_Containers() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductionLineModel__Initialize() {
		return productionLineModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Out() {
		return (EReference) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_In() {
		return (EReference) machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMachine__Work() {
		return machineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Parts() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConveyor_Tray() {
		return (EReference) conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConveyor__MoveAlong() {
		return conveyorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTray() {
		return trayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHammer() {
		return hammerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHead() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHandle() {
		return handleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolisher() {
		return polisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssembler() {
		return assemblerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenHead() {
		return genHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenHandle() {
		return genHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLSFactory getPLSFactory() {
		return (PLSFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		productionLineModelEClass = createEClass(PRODUCTION_LINE_MODEL);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__MACHINES);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__CONTAINERS);
		createEOperation(productionLineModelEClass, PRODUCTION_LINE_MODEL___INITIALIZE);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__OUT);
		createEReference(machineEClass, MACHINE__IN);
		createEOperation(machineEClass, MACHINE___WORK);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__PARTS);

		partEClass = createEClass(PART);

		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__TRAY);
		createEOperation(conveyorEClass, CONVEYOR___MOVE_ALONG);

		trayEClass = createEClass(TRAY);

		hammerEClass = createEClass(HAMMER);

		headEClass = createEClass(HEAD);

		handleEClass = createEClass(HANDLE);

		polisherEClass = createEClass(POLISHER);

		assemblerEClass = createEClass(ASSEMBLER);

		generatorEClass = createEClass(GENERATOR);

		genHeadEClass = createEClass(GEN_HEAD);

		genHandleEClass = createEClass(GEN_HANDLE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineEClass.getESuperTypes().add(this.getNamedElement());
		containerEClass.getESuperTypes().add(this.getNamedElement());
		partEClass.getESuperTypes().add(this.getNamedElement());
		conveyorEClass.getESuperTypes().add(this.getContainer());
		trayEClass.getESuperTypes().add(this.getContainer());
		hammerEClass.getESuperTypes().add(this.getPart());
		headEClass.getESuperTypes().add(this.getPart());
		handleEClass.getESuperTypes().add(this.getPart());
		polisherEClass.getESuperTypes().add(this.getMachine());
		assemblerEClass.getESuperTypes().add(this.getMachine());
		generatorEClass.getESuperTypes().add(this.getMachine());
		genHeadEClass.getESuperTypes().add(this.getGenerator());
		genHandleEClass.getESuperTypes().add(this.getGenerator());

		// Initialize classes, features, and operations; add parameters
		initEClass(productionLineModelEClass, ProductionLineModel.class, "ProductionLineModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLineModel_Machines(), this.getMachine(), null, "machines", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Containers(), this.getContainer(), null, "containers", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProductionLineModel__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Out(), this.getConveyor(), null, "out", null, 0, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMachine_In(), this.getTray(), null, "in", null, 0, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getMachine__Work(), null, "work", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containerEClass, uk.ac.kcl.inf.modelling.pls.pls.Container.class, "Container", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Parts(), this.getPart(), null, "parts", null, 0, -1,
				uk.ac.kcl.inf.modelling.pls.pls.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Tray(), this.getTray(), null, "tray", null, 0, 1, Conveyor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getConveyor__MoveAlong(), null, "moveAlong", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trayEClass, Tray.class, "Tray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hammerEClass, Hammer.class, "Hammer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handleEClass, Handle.class, "Handle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polisherEClass, Polisher.class, "Polisher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblerEClass, Assembler.class, "Assembler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(genHeadEClass, GenHead.class, "GenHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genHandleEClass, GenHandle.class, "GenHandle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation(getContainer_Parts(), source, new String[] {});
		addAnnotation(partEClass, source, new String[] {});
		addAnnotation(hammerEClass, source, new String[] {});
		addAnnotation(headEClass, source, new String[] {});
		addAnnotation(handleEClass, source, new String[] {});
	}

} //PLSPackageImpl
