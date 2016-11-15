/*
 * generated by Xtext 2.10.0
 */
package org.emn.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UiTestGrammarAccess extends AbstractGrammarElementFinder {
	
	public class UiTestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.UiTest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunctionsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFunctionsFunctionParserRuleCall_0_0 = (RuleCall)cFunctionsAssignment_0.eContents().get(0);
		private final Assignment cCommandsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_1_0 = (RuleCall)cCommandsAssignment_1.eContents().get(0);
		
		//UiTest:
		//	functions+=Function* commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//functions+=Function* commands+=Command*
		public Group getGroup() { return cGroup; }
		
		//functions+=Function*
		public Assignment getFunctionsAssignment_0() { return cFunctionsAssignment_0; }
		
		//Function
		public RuleCall getFunctionsFunctionParserRuleCall_0_0() { return cFunctionsFunctionParserRuleCall_0_0; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment_1() { return cCommandsAssignment_1; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_1_0() { return cCommandsCommandParserRuleCall_1_0; }
	}
	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Function");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFunctionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFunctionNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParametersVariableDefinitionParserRuleCall_3_0 = (RuleCall)cParametersAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStatementsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final Alternatives cStatementsAlternatives_6_0 = (Alternatives)cStatementsAssignment_6.eContents().get(0);
		private final RuleCall cStatementsCommandParserRuleCall_6_0_0 = (RuleCall)cStatementsAlternatives_6_0.eContents().get(0);
		private final RuleCall cStatementsFunctionCallParserRuleCall_6_0_1 = (RuleCall)cStatementsAlternatives_6_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Function:
		//	'function' name=FunctionName '(' parameters+=VariableDefinition* ')' '{' statements+=(Command | FunctionCall)+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'function' name=FunctionName '(' parameters+=VariableDefinition* ')' '{' statements+=(Command | FunctionCall)+ '}'
		public Group getGroup() { return cGroup; }
		
		//'function'
		public Keyword getFunctionKeyword_0() { return cFunctionKeyword_0; }
		
		//name=FunctionName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//FunctionName
		public RuleCall getNameFunctionNameParserRuleCall_1_0() { return cNameFunctionNameParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//parameters+=VariableDefinition*
		public Assignment getParametersAssignment_3() { return cParametersAssignment_3; }
		
		//VariableDefinition
		public RuleCall getParametersVariableDefinitionParserRuleCall_3_0() { return cParametersVariableDefinitionParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//statements+=(Command | FunctionCall)+
		public Assignment getStatementsAssignment_6() { return cStatementsAssignment_6; }
		
		//(Command | FunctionCall)
		public Alternatives getStatementsAlternatives_6_0() { return cStatementsAlternatives_6_0; }
		
		//Command
		public RuleCall getStatementsCommandParserRuleCall_6_0_0() { return cStatementsCommandParserRuleCall_6_0_0; }
		
		//FunctionCall
		public RuleCall getStatementsFunctionCallParserRuleCall_6_0_1() { return cStatementsFunctionCallParserRuleCall_6_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class FunctionCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.FunctionCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameFunctionNameCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameFunctionNameIDTerminalRuleCall_0_0_1 = (RuleCall)cNameFunctionNameCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParametersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParametersSTRINGTerminalRuleCall_2_0 = (RuleCall)cParametersAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FunctionCall:
		//	name=[FunctionName] '(' parameters+=STRING* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=[FunctionName] '(' parameters+=STRING* ')'
		public Group getGroup() { return cGroup; }
		
		//name=[FunctionName]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[FunctionName]
		public CrossReference getNameFunctionNameCrossReference_0_0() { return cNameFunctionNameCrossReference_0_0; }
		
		//ID
		public RuleCall getNameFunctionNameIDTerminalRuleCall_0_0_1() { return cNameFunctionNameIDTerminalRuleCall_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//parameters+=STRING*
		public Assignment getParametersAssignment_2() { return cParametersAssignment_2; }
		
		//STRING
		public RuleCall getParametersSTRINGTerminalRuleCall_2_0() { return cParametersSTRINGTerminalRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class FunctionNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.FunctionName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//FunctionName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cAlternatives_0.eContents().get(0);
		private final RuleCall cOpenParserRuleCall_0_0_0 = (RuleCall)cAlternatives_0_0.eContents().get(0);
		private final RuleCall cGoOnParserRuleCall_0_0_1 = (RuleCall)cAlternatives_0_0.eContents().get(1);
		private final RuleCall cFillParserRuleCall_0_0_2 = (RuleCall)cAlternatives_0_0.eContents().get(2);
		private final RuleCall cClickParserRuleCall_0_0_3 = (RuleCall)cAlternatives_0_0.eContents().get(3);
		private final RuleCall cVerifyParserRuleCall_0_0_4 = (RuleCall)cAlternatives_0_0.eContents().get(4);
		private final RuleCall cStoreParserRuleCall_0_0_5 = (RuleCall)cAlternatives_0_0.eContents().get(5);
		private final RuleCall cSelectParserRuleCall_0_0_6 = (RuleCall)cAlternatives_0_0.eContents().get(6);
		private final RuleCall cFunctionCallParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Command:
		//	((Open | GoOn | Fill | Click | Verify | Store | Select) | FunctionCall) ';';
		@Override public ParserRule getRule() { return rule; }
		
		//((Open | GoOn | Fill | Click | Verify | Store | Select) | FunctionCall) ';'
		public Group getGroup() { return cGroup; }
		
		//((Open | GoOn | Fill | Click | Verify | Store | Select) | FunctionCall)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//(Open | GoOn | Fill | Click | Verify | Store | Select)
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }
		
		//Open
		public RuleCall getOpenParserRuleCall_0_0_0() { return cOpenParserRuleCall_0_0_0; }
		
		//GoOn
		public RuleCall getGoOnParserRuleCall_0_0_1() { return cGoOnParserRuleCall_0_0_1; }
		
		//Fill
		public RuleCall getFillParserRuleCall_0_0_2() { return cFillParserRuleCall_0_0_2; }
		
		//Click
		public RuleCall getClickParserRuleCall_0_0_3() { return cClickParserRuleCall_0_0_3; }
		
		//Verify
		public RuleCall getVerifyParserRuleCall_0_0_4() { return cVerifyParserRuleCall_0_0_4; }
		
		//Store
		public RuleCall getStoreParserRuleCall_0_0_5() { return cStoreParserRuleCall_0_0_5; }
		
		//Select
		public RuleCall getSelectParserRuleCall_0_0_6() { return cSelectParserRuleCall_0_0_6; }
		
		//FunctionCall
		public RuleCall getFunctionCallParserRuleCall_0_1() { return cFunctionCallParserRuleCall_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class OpenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Open");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameOpenKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cProgramAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProgramSTRINGTerminalRuleCall_1_0 = (RuleCall)cProgramAssignment_1.eContents().get(0);
		
		//Open:
		//	name='open' program=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name='open' program=STRING
		public Group getGroup() { return cGroup; }
		
		//name='open'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'open'
		public Keyword getNameOpenKeyword_0_0() { return cNameOpenKeyword_0_0; }
		
		//program=STRING
		public Assignment getProgramAssignment_1() { return cProgramAssignment_1; }
		
		//STRING
		public RuleCall getProgramSTRINGTerminalRuleCall_1_0() { return cProgramSTRINGTerminalRuleCall_1_0; }
	}
	public class GoOnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.GoOn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameGoOnKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cAddressAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAddressSTRINGTerminalRuleCall_1_0 = (RuleCall)cAddressAssignment_1.eContents().get(0);
		
		//GoOn:
		//	name='goOn' address=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name='goOn' address=STRING
		public Group getGroup() { return cGroup; }
		
		//name='goOn'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'goOn'
		public Keyword getNameGoOnKeyword_0_0() { return cNameGoOnKeyword_0_0; }
		
		//address=STRING
		public Assignment getAddressAssignment_1() { return cAddressAssignment_1; }
		
		//STRING
		public RuleCall getAddressSTRINGTerminalRuleCall_1_0() { return cAddressSTRINGTerminalRuleCall_1_0; }
	}
	public class StoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Store");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0 = (RuleCall)cSelectorAssignment_1.eContents().get(0);
		private final Assignment cKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKeyVariableDefinitionParserRuleCall_2_0 = (RuleCall)cKeyAssignment_2.eContents().get(0);
		
		//Store:
		//	'store' selector=Selector key=VariableDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//'store' selector=Selector key=VariableDefinition
		public Group getGroup() { return cGroup; }
		
		//'store'
		public Keyword getStoreKeyword_0() { return cStoreKeyword_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1() { return cSelectorAssignment_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0() { return cSelectorSelectorParserRuleCall_1_0; }
		
		//key=VariableDefinition
		public Assignment getKeyAssignment_2() { return cKeyAssignment_2; }
		
		//VariableDefinition
		public RuleCall getKeyVariableDefinitionParserRuleCall_2_0() { return cKeyVariableDefinitionParserRuleCall_2_0; }
	}
	public class FillElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Fill");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFillKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0 = (RuleCall)cSelectorAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Fill:
		//	'fill' selector=Selector value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//'fill' selector=Selector value=Value
		public Group getGroup() { return cGroup; }
		
		//'fill'
		public Keyword getFillKeyword_0() { return cFillKeyword_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1() { return cSelectorAssignment_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0() { return cSelectorSelectorParserRuleCall_1_0; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ClickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Click");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameClickKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cSelectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0 = (RuleCall)cSelectorAssignment_1.eContents().get(0);
		
		//Click:
		//	name='click' selector=Selector;
		@Override public ParserRule getRule() { return rule; }
		
		//name='click' selector=Selector
		public Group getGroup() { return cGroup; }
		
		//name='click'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'click'
		public Keyword getNameClickKeyword_0_0() { return cNameClickKeyword_0_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1() { return cSelectorAssignment_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0() { return cSelectorSelectorParserRuleCall_1_0; }
	}
	public class VerifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Verify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameVerifyKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Assignment cSelectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0 = (RuleCall)cSelectorAssignment_1.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Verify:
		//	name='verify' selector=Selector STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name='verify' selector=Selector STRING
		public Group getGroup() { return cGroup; }
		
		//name='verify'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'verify'
		public Keyword getNameVerifyKeyword_0_0() { return cNameVerifyKeyword_0_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1() { return cSelectorAssignment_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0() { return cSelectorSelectorParserRuleCall_1_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
	}
	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSelectorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSelectorSelectorParserRuleCall_1_0 = (RuleCall)cSelectorAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Select:
		//	'select' selector=Selector value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//'select' selector=Selector value=Value
		public Group getGroup() { return cGroup; }
		
		//'select'
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//selector=Selector
		public Assignment getSelectorAssignment_1() { return cSelectorAssignment_1; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_1_0() { return cSelectorSelectorParserRuleCall_1_0; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class SelectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Selector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttributeNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributeNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cAttributeNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cAttributeValueAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Selector:
		//	'[' attributeName=STRING '=' attributeValue=STRING ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' attributeName=STRING '=' attributeValue=STRING ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//attributeName=STRING
		public Assignment getAttributeNameAssignment_1() { return cAttributeNameAssignment_1; }
		
		//STRING
		public RuleCall getAttributeNameSTRINGTerminalRuleCall_1_0() { return cAttributeNameSTRINGTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//attributeValue=STRING
		public Assignment getAttributeValueAssignment_3() { return cAttributeValueAssignment_3; }
		
		//STRING
		public RuleCall getAttributeValueSTRINGTerminalRuleCall_3_0() { return cAttributeValueSTRINGTerminalRuleCall_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStringValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStringValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cStringValueAssignment_0.eContents().get(0);
		private final Assignment cKeyValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cKeyValueVariableDefinitionCrossReference_1_0 = (CrossReference)cKeyValueAssignment_1.eContents().get(0);
		private final RuleCall cKeyValueVariableDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cKeyValueVariableDefinitionCrossReference_1_0.eContents().get(1);
		
		//Value:
		//	stringValue=STRING | keyValue=[VariableDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//stringValue=STRING | keyValue=[VariableDefinition]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//stringValue=STRING
		public Assignment getStringValueAssignment_0() { return cStringValueAssignment_0; }
		
		//STRING
		public RuleCall getStringValueSTRINGTerminalRuleCall_0_0() { return cStringValueSTRINGTerminalRuleCall_0_0; }
		
		//keyValue=[VariableDefinition]
		public Assignment getKeyValueAssignment_1() { return cKeyValueAssignment_1; }
		
		//[VariableDefinition]
		public CrossReference getKeyValueVariableDefinitionCrossReference_1_0() { return cKeyValueVariableDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getKeyValueVariableDefinitionIDTerminalRuleCall_1_0_1() { return cKeyValueVariableDefinitionIDTerminalRuleCall_1_0_1; }
	}
	public class VariableDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.VariableDefinition");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameKEYParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//VariableDefinition:
		//	name=KEY;
		@Override public ParserRule getRule() { return rule; }
		
		//name=KEY
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//KEY
		public RuleCall getNameKEYParserRuleCall_0() { return cNameKEYParserRuleCall_0; }
	}
	public class KEYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.emn.UiTest.KEY");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//KEY:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final UiTestElements pUiTest;
	private final FunctionElements pFunction;
	private final FunctionCallElements pFunctionCall;
	private final FunctionNameElements pFunctionName;
	private final CommandElements pCommand;
	private final OpenElements pOpen;
	private final GoOnElements pGoOn;
	private final StoreElements pStore;
	private final FillElements pFill;
	private final ClickElements pClick;
	private final VerifyElements pVerify;
	private final SelectElements pSelect;
	private final SelectorElements pSelector;
	private final ValueElements pValue;
	private final VariableDefinitionElements pVariableDefinition;
	private final KEYElements pKEY;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UiTestGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pUiTest = new UiTestElements();
		this.pFunction = new FunctionElements();
		this.pFunctionCall = new FunctionCallElements();
		this.pFunctionName = new FunctionNameElements();
		this.pCommand = new CommandElements();
		this.pOpen = new OpenElements();
		this.pGoOn = new GoOnElements();
		this.pStore = new StoreElements();
		this.pFill = new FillElements();
		this.pClick = new ClickElements();
		this.pVerify = new VerifyElements();
		this.pSelect = new SelectElements();
		this.pSelector = new SelectorElements();
		this.pValue = new ValueElements();
		this.pVariableDefinition = new VariableDefinitionElements();
		this.pKEY = new KEYElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.emn.UiTest".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//UiTest:
	//	functions+=Function* commands+=Command*;
	public UiTestElements getUiTestAccess() {
		return pUiTest;
	}
	
	public ParserRule getUiTestRule() {
		return getUiTestAccess().getRule();
	}
	
	//Function:
	//	'function' name=FunctionName '(' parameters+=VariableDefinition* ')' '{' statements+=(Command | FunctionCall)+ '}';
	public FunctionElements getFunctionAccess() {
		return pFunction;
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//FunctionCall:
	//	name=[FunctionName] '(' parameters+=STRING* ')';
	public FunctionCallElements getFunctionCallAccess() {
		return pFunctionCall;
	}
	
	public ParserRule getFunctionCallRule() {
		return getFunctionCallAccess().getRule();
	}
	
	//FunctionName:
	//	name=ID;
	public FunctionNameElements getFunctionNameAccess() {
		return pFunctionName;
	}
	
	public ParserRule getFunctionNameRule() {
		return getFunctionNameAccess().getRule();
	}
	
	//Command:
	//	((Open | GoOn | Fill | Click | Verify | Store | Select) | FunctionCall) ';';
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Open:
	//	name='open' program=STRING;
	public OpenElements getOpenAccess() {
		return pOpen;
	}
	
	public ParserRule getOpenRule() {
		return getOpenAccess().getRule();
	}
	
	//GoOn:
	//	name='goOn' address=STRING;
	public GoOnElements getGoOnAccess() {
		return pGoOn;
	}
	
	public ParserRule getGoOnRule() {
		return getGoOnAccess().getRule();
	}
	
	//Store:
	//	'store' selector=Selector key=VariableDefinition;
	public StoreElements getStoreAccess() {
		return pStore;
	}
	
	public ParserRule getStoreRule() {
		return getStoreAccess().getRule();
	}
	
	//Fill:
	//	'fill' selector=Selector value=Value;
	public FillElements getFillAccess() {
		return pFill;
	}
	
	public ParserRule getFillRule() {
		return getFillAccess().getRule();
	}
	
	//Click:
	//	name='click' selector=Selector;
	public ClickElements getClickAccess() {
		return pClick;
	}
	
	public ParserRule getClickRule() {
		return getClickAccess().getRule();
	}
	
	//Verify:
	//	name='verify' selector=Selector STRING;
	public VerifyElements getVerifyAccess() {
		return pVerify;
	}
	
	public ParserRule getVerifyRule() {
		return getVerifyAccess().getRule();
	}
	
	//Select:
	//	'select' selector=Selector value=Value;
	public SelectElements getSelectAccess() {
		return pSelect;
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}
	
	//Selector:
	//	'[' attributeName=STRING '=' attributeValue=STRING ']';
	public SelectorElements getSelectorAccess() {
		return pSelector;
	}
	
	public ParserRule getSelectorRule() {
		return getSelectorAccess().getRule();
	}
	
	//Value:
	//	stringValue=STRING | keyValue=[VariableDefinition];
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//VariableDefinition:
	//	name=KEY;
	public VariableDefinitionElements getVariableDefinitionAccess() {
		return pVariableDefinition;
	}
	
	public ParserRule getVariableDefinitionRule() {
		return getVariableDefinitionAccess().getRule();
	}
	
	//KEY:
	//	ID;
	public KEYElements getKEYAccess() {
		return pKEY;
	}
	
	public ParserRule getKEYRule() {
		return getKEYAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
