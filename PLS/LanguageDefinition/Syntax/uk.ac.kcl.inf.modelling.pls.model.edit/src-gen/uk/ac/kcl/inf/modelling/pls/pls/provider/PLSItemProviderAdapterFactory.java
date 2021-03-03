/**
 */
package uk.ac.kcl.inf.modelling.pls.pls.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.kcl.inf.modelling.pls.pls.util.PLSAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PLSItemProviderAdapterFactory extends PLSAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLSItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineModelItemProvider productionLineModelItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.ProductionLineModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductionLineModelAdapter() {
		if (productionLineModelItemProvider == null) {
			productionLineModelItemProvider = new ProductionLineModelItemProvider(this);
		}

		return productionLineModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineItemProvider machineItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineAdapter() {
		if (machineItemProvider == null) {
			machineItemProvider = new MachineItemProvider(this);
		}

		return machineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Part} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartItemProvider partItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartAdapter() {
		if (partItemProvider == null) {
			partItemProvider = new PartItemProvider(this);
		}

		return partItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorItemProvider conveyorItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Conveyor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConveyorAdapter() {
		if (conveyorItemProvider == null) {
			conveyorItemProvider = new ConveyorItemProvider(this);
		}

		return conveyorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Tray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrayItemProvider trayItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Tray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrayAdapter() {
		if (trayItemProvider == null) {
			trayItemProvider = new TrayItemProvider(this);
		}

		return trayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Hammer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HammerItemProvider hammerItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Hammer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHammerAdapter() {
		if (hammerItemProvider == null) {
			hammerItemProvider = new HammerItemProvider(this);
		}

		return hammerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Head} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadItemProvider headItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Head}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadAdapter() {
		if (headItemProvider == null) {
			headItemProvider = new HeadItemProvider(this);
		}

		return headItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Handle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandleItemProvider handleItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Handle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHandleAdapter() {
		if (handleItemProvider == null) {
			handleItemProvider = new HandleItemProvider(this);
		}

		return handleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Polisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolisherItemProvider polisherItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Polisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolisherAdapter() {
		if (polisherItemProvider == null) {
			polisherItemProvider = new PolisherItemProvider(this);
		}

		return polisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Assembler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblerItemProvider assemblerItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Assembler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblerAdapter() {
		if (assemblerItemProvider == null) {
			assemblerItemProvider = new AssemblerItemProvider(this);
		}

		return assemblerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.Generator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorItemProvider generatorItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorAdapter() {
		if (generatorItemProvider == null) {
			generatorItemProvider = new GeneratorItemProvider(this);
		}

		return generatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.GenHead} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenHeadItemProvider genHeadItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.GenHead}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenHeadAdapter() {
		if (genHeadItemProvider == null) {
			genHeadItemProvider = new GenHeadItemProvider(this);
		}

		return genHeadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.modelling.pls.pls.GenHandle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenHandleItemProvider genHandleItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.modelling.pls.pls.GenHandle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenHandleAdapter() {
		if (genHandleItemProvider == null) {
			genHandleItemProvider = new GenHandleItemProvider(this);
		}

		return genHandleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (productionLineModelItemProvider != null)
			productionLineModelItemProvider.dispose();
		if (machineItemProvider != null)
			machineItemProvider.dispose();
		if (containerItemProvider != null)
			containerItemProvider.dispose();
		if (partItemProvider != null)
			partItemProvider.dispose();
		if (conveyorItemProvider != null)
			conveyorItemProvider.dispose();
		if (trayItemProvider != null)
			trayItemProvider.dispose();
		if (hammerItemProvider != null)
			hammerItemProvider.dispose();
		if (headItemProvider != null)
			headItemProvider.dispose();
		if (handleItemProvider != null)
			handleItemProvider.dispose();
		if (polisherItemProvider != null)
			polisherItemProvider.dispose();
		if (assemblerItemProvider != null)
			assemblerItemProvider.dispose();
		if (generatorItemProvider != null)
			generatorItemProvider.dispose();
		if (genHeadItemProvider != null)
			genHeadItemProvider.dispose();
		if (genHandleItemProvider != null)
			genHandleItemProvider.dispose();
	}

}
