/*
 * generated by Xtext 2.10.0
 */
package org.emn.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.emn.services.UiTestGrammarAccess;
import org.emn.uiTest.Click;
import org.emn.uiTest.Fill;
import org.emn.uiTest.Function;
import org.emn.uiTest.FunctionCall;
import org.emn.uiTest.FunctionName;
import org.emn.uiTest.GoOn;
import org.emn.uiTest.Open;
import org.emn.uiTest.Selector;
import org.emn.uiTest.Store;
import org.emn.uiTest.UiTest;
import org.emn.uiTest.UiTestPackage;
import org.emn.uiTest.VariableDefinition;
import org.emn.uiTest.Verify;

@SuppressWarnings("all")
public class UiTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UiTestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UiTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UiTestPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case UiTestPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case UiTestPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case UiTestPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case UiTestPackage.FUNCTION_NAME:
				sequence_FunctionName(context, (FunctionName) semanticObject); 
				return; 
			case UiTestPackage.GO_ON:
				sequence_GoOn(context, (GoOn) semanticObject); 
				return; 
			case UiTestPackage.OPEN:
				sequence_Open(context, (Open) semanticObject); 
				return; 
			case UiTestPackage.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			case UiTestPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case UiTestPackage.UI_TEST:
				sequence_UiTest(context, (UiTest) semanticObject); 
				return; 
			case UiTestPackage.VARIABLE_DEFINITION:
				sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
				return; 
			case UiTestPackage.VERIFY:
				sequence_Verify(context, (Verify) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     (name='click' selector=Selector)
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.CLICK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.CLICK__NAME));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.CLICK__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.CLICK__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getNameClickKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getClickAccess().getSelectorSelectorParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (selector=Selector (stringValue=STRING | keyValue=[VariableDefinition|ID]))
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionCall returns FunctionCall
	 *     Command returns FunctionCall
	 *
	 * Constraint:
	 *     (name=[FunctionName|ID] parameters+=STRING*)
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionName returns FunctionName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FunctionName(ISerializationContext context, FunctionName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.FUNCTION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.FUNCTION_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=FunctionName parameters+=VariableDefinition* (statements+=Command | statements+=FunctionCall)+)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns GoOn
	 *     GoOn returns GoOn
	 *
	 * Constraint:
	 *     (name='goOn' address=STRING)
	 */
	protected void sequence_GoOn(ISerializationContext context, GoOn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.GO_ON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.GO_ON__NAME));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.GO_ON__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.GO_ON__ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoOnAccess().getNameGoOnKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGoOnAccess().getAddressSTRINGTerminalRuleCall_1_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Open
	 *     Open returns Open
	 *
	 * Constraint:
	 *     (name='open' program=STRING)
	 */
	protected void sequence_Open(ISerializationContext context, Open semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.OPEN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.OPEN__NAME));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.OPEN__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.OPEN__PROGRAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpenAccess().getNameOpenKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOpenAccess().getProgramSTRINGTerminalRuleCall_1_0(), semanticObject.getProgram());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     (attributeName=STRING attributeValue=STRING)
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.SELECTOR__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.SELECTOR__ATTRIBUTE_NAME));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.SELECTOR__ATTRIBUTE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.SELECTOR__ATTRIBUTE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectorAccess().getAttributeNameSTRINGTerminalRuleCall_1_0(), semanticObject.getAttributeName());
		feeder.accept(grammarAccess.getSelectorAccess().getAttributeValueSTRINGTerminalRuleCall_3_0(), semanticObject.getAttributeValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (selector=Selector key=VariableDefinition)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.STORE__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.STORE__SELECTOR));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.STORE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.STORE__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getSelectorSelectorParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.accept(grammarAccess.getStoreAccess().getKeyVariableDefinitionParserRuleCall_2_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UiTest returns UiTest
	 *
	 * Constraint:
	 *     ((functions+=Function+ commands+=Command+) | commands+=Command+)?
	 */
	protected void sequence_UiTest(ISerializationContext context, UiTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableDefinition returns VariableDefinition
	 *
	 * Constraint:
	 *     name=KEY
	 */
	protected void sequence_VariableDefinition(ISerializationContext context, VariableDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.VARIABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.VARIABLE_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDefinitionAccess().getNameKEYParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Verify
	 *     Verify returns Verify
	 *
	 * Constraint:
	 *     (name='verify' selector=Selector)
	 */
	protected void sequence_Verify(ISerializationContext context, Verify semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.VERIFY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.VERIFY__NAME));
			if (transientValues.isValueTransient(semanticObject, UiTestPackage.Literals.VERIFY__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiTestPackage.Literals.VERIFY__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifyAccess().getNameVerifyKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
}