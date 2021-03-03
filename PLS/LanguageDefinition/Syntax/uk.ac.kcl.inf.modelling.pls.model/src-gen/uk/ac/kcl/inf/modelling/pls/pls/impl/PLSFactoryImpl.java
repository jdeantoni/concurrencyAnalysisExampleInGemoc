/**
 */
package uk.ac.kcl.inf.modelling.pls.pls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.modelling.pls.pls.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLSFactoryImpl extends EFactoryImpl implements PLSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PLSFactory init() {
		try {
			PLSFactory thePLSFactory = (PLSFactory) EPackage.Registry.INSTANCE.getEFactory(PLSPackage.eNS_URI);
			if (thePLSFactory != null) {
				return thePLSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PLSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PLSPackage.PRODUCTION_LINE_MODEL:
			return createProductionLineModel();
		case PLSPackage.MACHINE:
			return createMachine();
		case PLSPackage.CONTAINER:
			return createContainer();
		case PLSPackage.PART:
			return createPart();
		case PLSPackage.CONVEYOR:
			return createConveyor();
		case PLSPackage.TRAY:
			return createTray();
		case PLSPackage.HAMMER:
			return createHammer();
		case PLSPackage.HEAD:
			return createHead();
		case PLSPackage.HANDLE:
			return createHandle();
		case PLSPackage.POLISHER:
			return createPolisher();
		case PLSPackage.ASSEMBLER:
			return createAssembler();
		case PLSPackage.GENERATOR:
			return createGenerator();
		case PLSPackage.GEN_HEAD:
			return createGenHead();
		case PLSPackage.GEN_HANDLE:
			return createGenHandle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductionLineModel createProductionLineModel() {
		ProductionLineModelImpl productionLineModel = new ProductionLineModelImpl();
		return productionLineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public uk.ac.kcl.inf.modelling.pls.pls.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tray createTray() {
		TrayImpl tray = new TrayImpl();
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hammer createHammer() {
		HammerImpl hammer = new HammerImpl();
		return hammer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Handle createHandle() {
		HandleImpl handle = new HandleImpl();
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polisher createPolisher() {
		PolisherImpl polisher = new PolisherImpl();
		return polisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenHead createGenHead() {
		GenHeadImpl genHead = new GenHeadImpl();
		return genHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenHandle createGenHandle() {
		GenHandleImpl genHandle = new GenHandleImpl();
		return genHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLSPackage getPLSPackage() {
		return (PLSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PLSPackage getPackage() {
		return PLSPackage.eINSTANCE;
	}

} //PLSFactoryImpl
