/**
 * generated by Xtext 2.10.0
 */
package org.emn.uiTest.provider;

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

import org.emn.uiTest.util.UiTestAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UiTestItemProviderAdapterFactory extends UiTestAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public UiTestItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.UiTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiTestItemProvider uiTestItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.UiTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUiTestAdapter() {
		if (uiTestItemProvider == null) {
			uiTestItemProvider = new UiTestItemProvider(this);
		}

		return uiTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.FunctionCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallItemProvider functionCallItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallAdapter() {
		if (functionCallItemProvider == null) {
			functionCallItemProvider = new FunctionCallItemProvider(this);
		}

		return functionCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.FunctionName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionNameItemProvider functionNameItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.FunctionName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionNameAdapter() {
		if (functionNameItemProvider == null) {
			functionNameItemProvider = new FunctionNameItemProvider(this);
		}

		return functionNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Open} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenItemProvider openItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Open}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenAdapter() {
		if (openItemProvider == null) {
			openItemProvider = new OpenItemProvider(this);
		}

		return openItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.GoOn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoOnItemProvider goOnItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.GoOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoOnAdapter() {
		if (goOnItemProvider == null) {
			goOnItemProvider = new GoOnItemProvider(this);
		}

		return goOnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Store} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreItemProvider storeItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Store}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreAdapter() {
		if (storeItemProvider == null) {
			storeItemProvider = new StoreItemProvider(this);
		}

		return storeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Fill} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillItemProvider fillItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Fill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFillAdapter() {
		if (fillItemProvider == null) {
			fillItemProvider = new FillItemProvider(this);
		}

		return fillItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Click} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickItemProvider clickItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Click}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickAdapter() {
		if (clickItemProvider == null) {
			clickItemProvider = new ClickItemProvider(this);
		}

		return clickItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Verify} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifyItemProvider verifyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Verify}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerifyAdapter() {
		if (verifyItemProvider == null) {
			verifyItemProvider = new VerifyItemProvider(this);
		}

		return verifyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.Selector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectorItemProvider selectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectorAdapter() {
		if (selectorItemProvider == null) {
			selectorItemProvider = new SelectorItemProvider(this);
		}

		return selectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emn.uiTest.VariableDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDefinitionItemProvider variableDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emn.uiTest.VariableDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDefinitionAdapter() {
		if (variableDefinitionItemProvider == null) {
			variableDefinitionItemProvider = new VariableDefinitionItemProvider(this);
		}

		return variableDefinitionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (uiTestItemProvider != null) uiTestItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (functionCallItemProvider != null) functionCallItemProvider.dispose();
		if (functionNameItemProvider != null) functionNameItemProvider.dispose();
		if (commandItemProvider != null) commandItemProvider.dispose();
		if (openItemProvider != null) openItemProvider.dispose();
		if (goOnItemProvider != null) goOnItemProvider.dispose();
		if (storeItemProvider != null) storeItemProvider.dispose();
		if (fillItemProvider != null) fillItemProvider.dispose();
		if (clickItemProvider != null) clickItemProvider.dispose();
		if (verifyItemProvider != null) verifyItemProvider.dispose();
		if (selectorItemProvider != null) selectorItemProvider.dispose();
		if (variableDefinitionItemProvider != null) variableDefinitionItemProvider.dispose();
	}

}