/*
 * generated by Xtext 2.10.0
 */
package org.emn.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.emn.ide.contentassist.antlr.internal.InternalUiTestParser;
import org.emn.services.UiTestGrammarAccess;

public class UiTestParser extends AbstractContentAssistParser {

	@Inject
	private UiTestGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUiTestParser createParser() {
		InternalUiTestParser result = new InternalUiTestParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFunctionAccess().getStatementsAlternatives_6_0(), "rule__Function__StatementsAlternatives_6_0");
					put(grammarAccess.getCommandAccess().getAlternatives_0(), "rule__Command__Alternatives_0");
					put(grammarAccess.getCommandAccess().getAlternatives_0_0(), "rule__Command__Alternatives_0_0");
					put(grammarAccess.getOpenAccess().getProgramAlternatives_1_0(), "rule__Open__ProgramAlternatives_1_0");
					put(grammarAccess.getFillAccess().getAlternatives_2(), "rule__Fill__Alternatives_2");
					put(grammarAccess.getSelectAccess().getAlternatives_2(), "rule__Select__Alternatives_2");
					put(grammarAccess.getUiTestAccess().getGroup(), "rule__UiTest__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
					put(grammarAccess.getOpenAccess().getGroup(), "rule__Open__Group__0");
					put(grammarAccess.getGoOnAccess().getGroup(), "rule__GoOn__Group__0");
					put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
					put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
					put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getUiTestAccess().getFunctionsAssignment_0(), "rule__UiTest__FunctionsAssignment_0");
					put(grammarAccess.getUiTestAccess().getCommandsAssignment_1(), "rule__UiTest__CommandsAssignment_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_3(), "rule__Function__ParametersAssignment_3");
					put(grammarAccess.getFunctionAccess().getStatementsAssignment_6(), "rule__Function__StatementsAssignment_6");
					put(grammarAccess.getFunctionCallAccess().getNameAssignment_0(), "rule__FunctionCall__NameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getParametersAssignment_2(), "rule__FunctionCall__ParametersAssignment_2");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getOpenAccess().getNameAssignment_0(), "rule__Open__NameAssignment_0");
					put(grammarAccess.getOpenAccess().getProgramAssignment_1(), "rule__Open__ProgramAssignment_1");
					put(grammarAccess.getOpenAccess().getDriverPathAssignment_2(), "rule__Open__DriverPathAssignment_2");
					put(grammarAccess.getGoOnAccess().getNameAssignment_0(), "rule__GoOn__NameAssignment_0");
					put(grammarAccess.getGoOnAccess().getAddressAssignment_1(), "rule__GoOn__AddressAssignment_1");
					put(grammarAccess.getStoreAccess().getSelectorAssignment_1(), "rule__Store__SelectorAssignment_1");
					put(grammarAccess.getStoreAccess().getKeyAssignment_2(), "rule__Store__KeyAssignment_2");
					put(grammarAccess.getFillAccess().getSelectorAssignment_1(), "rule__Fill__SelectorAssignment_1");
					put(grammarAccess.getFillAccess().getStringValueAssignment_2_0(), "rule__Fill__StringValueAssignment_2_0");
					put(grammarAccess.getFillAccess().getKeyValueAssignment_2_1(), "rule__Fill__KeyValueAssignment_2_1");
					put(grammarAccess.getClickAccess().getNameAssignment_0(), "rule__Click__NameAssignment_0");
					put(grammarAccess.getClickAccess().getSelectorAssignment_1(), "rule__Click__SelectorAssignment_1");
					put(grammarAccess.getVerifyAccess().getNameAssignment_0(), "rule__Verify__NameAssignment_0");
					put(grammarAccess.getVerifyAccess().getSelectorAssignment_1(), "rule__Verify__SelectorAssignment_1");
					put(grammarAccess.getVerifyAccess().getComparisonAssignment_2(), "rule__Verify__ComparisonAssignment_2");
					put(grammarAccess.getSelectAccess().getSelectorAssignment_1(), "rule__Select__SelectorAssignment_1");
					put(grammarAccess.getSelectAccess().getStringValueAssignment_2_0(), "rule__Select__StringValueAssignment_2_0");
					put(grammarAccess.getSelectAccess().getKeyValueAssignment_2_1(), "rule__Select__KeyValueAssignment_2_1");
					put(grammarAccess.getSelectorAccess().getAttributeNameAssignment_1(), "rule__Selector__AttributeNameAssignment_1");
					put(grammarAccess.getSelectorAccess().getAttributeValueAssignment_3(), "rule__Selector__AttributeValueAssignment_3");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment(), "rule__VariableDefinition__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalUiTestParser typedParser = (InternalUiTestParser) parser;
			typedParser.entryRuleUiTest();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UiTestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UiTestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
