package org.emn.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.emn.services.UiTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "')'", "'{'", "'}'", "';'", "'open'", "'firefox'", "'chrome'", "'goOn'", "'store'", "'fill'", "'click'", "'verify'", "'select'", "'['", "'='", "']'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUiTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUiTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUiTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUiTest.g"; }



     	private UiTestGrammarAccess grammarAccess;

        public InternalUiTestParser(TokenStream input, UiTestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UiTest";
       	}

       	@Override
       	protected UiTestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUiTest"
    // InternalUiTest.g:64:1: entryRuleUiTest returns [EObject current=null] : iv_ruleUiTest= ruleUiTest EOF ;
    public final EObject entryRuleUiTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiTest = null;


        try {
            // InternalUiTest.g:64:47: (iv_ruleUiTest= ruleUiTest EOF )
            // InternalUiTest.g:65:2: iv_ruleUiTest= ruleUiTest EOF
            {
             newCompositeNode(grammarAccess.getUiTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUiTest=ruleUiTest();

            state._fsp--;

             current =iv_ruleUiTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUiTest"


    // $ANTLR start "ruleUiTest"
    // InternalUiTest.g:71:1: ruleUiTest returns [EObject current=null] : ( ( (lv_functions_0_0= ruleFunction ) )* ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleUiTest() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:77:2: ( ( ( (lv_functions_0_0= ruleFunction ) )* ( (lv_commands_1_0= ruleCommand ) )* ) )
            // InternalUiTest.g:78:2: ( ( (lv_functions_0_0= ruleFunction ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // InternalUiTest.g:78:2: ( ( (lv_functions_0_0= ruleFunction ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            // InternalUiTest.g:79:3: ( (lv_functions_0_0= ruleFunction ) )* ( (lv_commands_1_0= ruleCommand ) )*
            {
            // InternalUiTest.g:79:3: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUiTest.g:80:4: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalUiTest.g:80:4: (lv_functions_0_0= ruleFunction )
            	    // InternalUiTest.g:81:5: lv_functions_0_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getUiTestAccess().getFunctionsFunctionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUiTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_0_0,
            	    						"org.emn.UiTest.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUiTest.g:98:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17||(LA2_0>=20 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUiTest.g:99:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalUiTest.g:99:4: (lv_commands_1_0= ruleCommand )
            	    // InternalUiTest.g:100:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getUiTestAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUiTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_1_0,
            	    						"org.emn.UiTest.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUiTest"


    // $ANTLR start "entryRuleFunction"
    // InternalUiTest.g:121:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalUiTest.g:121:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalUiTest.g:122:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalUiTest.g:128:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariableDefinition ) )* otherlv_4= ')' otherlv_5= '{' ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+ otherlv_7= '}' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_statements_6_1 = null;

        EObject lv_statements_6_2 = null;



        	enterRule();

        try {
            // InternalUiTest.g:134:2: ( (otherlv_0= 'function' ( (lv_name_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariableDefinition ) )* otherlv_4= ')' otherlv_5= '{' ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+ otherlv_7= '}' ) )
            // InternalUiTest.g:135:2: (otherlv_0= 'function' ( (lv_name_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariableDefinition ) )* otherlv_4= ')' otherlv_5= '{' ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+ otherlv_7= '}' )
            {
            // InternalUiTest.g:135:2: (otherlv_0= 'function' ( (lv_name_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariableDefinition ) )* otherlv_4= ')' otherlv_5= '{' ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+ otherlv_7= '}' )
            // InternalUiTest.g:136:3: otherlv_0= 'function' ( (lv_name_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleVariableDefinition ) )* otherlv_4= ')' otherlv_5= '{' ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalUiTest.g:140:3: ( (lv_name_1_0= ruleFunctionName ) )
            // InternalUiTest.g:141:4: (lv_name_1_0= ruleFunctionName )
            {
            // InternalUiTest.g:141:4: (lv_name_1_0= ruleFunctionName )
            // InternalUiTest.g:142:5: lv_name_1_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.emn.UiTest.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUiTest.g:163:3: ( (lv_parameters_3_0= ruleVariableDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUiTest.g:164:4: (lv_parameters_3_0= ruleVariableDefinition )
            	    {
            	    // InternalUiTest.g:164:4: (lv_parameters_3_0= ruleVariableDefinition )
            	    // InternalUiTest.g:165:5: lv_parameters_3_0= ruleVariableDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getParametersVariableDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_3_0=ruleVariableDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"org.emn.UiTest.VariableDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUiTest.g:190:3: ( ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==17||(LA5_0>=20 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUiTest.g:191:4: ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) )
            	    {
            	    // InternalUiTest.g:191:4: ( (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall ) )
            	    // InternalUiTest.g:192:5: (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall )
            	    {
            	    // InternalUiTest.g:192:5: (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall )
            	    int alt4=2;
            	    alt4 = dfa4.predict(input);
            	    switch (alt4) {
            	        case 1 :
            	            // InternalUiTest.g:193:6: lv_statements_6_1= ruleCommand
            	            {

            	            						newCompositeNode(grammarAccess.getFunctionAccess().getStatementsCommandParserRuleCall_6_0_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_statements_6_1=ruleCommand();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_6_1,
            	            							"org.emn.UiTest.Command");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalUiTest.g:209:6: lv_statements_6_2= ruleFunctionCall
            	            {

            	            						newCompositeNode(grammarAccess.getFunctionAccess().getStatementsFunctionCallParserRuleCall_6_0_1());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_statements_6_2=ruleFunctionCall();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_6_2,
            	            							"org.emn.UiTest.FunctionCall");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalUiTest.g:235:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalUiTest.g:235:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalUiTest.g:236:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalUiTest.g:242:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:248:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' ) )
            // InternalUiTest.g:249:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' )
            {
            // InternalUiTest.g:249:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')' )
            // InternalUiTest.g:250:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) )* otherlv_3= ')'
            {
            // InternalUiTest.g:250:3: ( (otherlv_0= RULE_ID ) )
            // InternalUiTest.g:251:4: (otherlv_0= RULE_ID )
            {
            // InternalUiTest.g:251:4: (otherlv_0= RULE_ID )
            // InternalUiTest.g:252:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getNameFunctionNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUiTest.g:267:3: ( (lv_parameters_2_0= ruleParameter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUiTest.g:268:4: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalUiTest.g:268:4: (lv_parameters_2_0= ruleParameter )
            	    // InternalUiTest.g:269:5: lv_parameters_2_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_2_0,
            	    						"org.emn.UiTest.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalUiTest.g:294:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUiTest.g:294:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUiTest.g:295:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUiTest.g:301:1: ruleParameter returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUiTest.g:307:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUiTest.g:308:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUiTest.g:308:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUiTest.g:309:3: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // InternalUiTest.g:309:3: ( (lv_string_0_0= RULE_STRING ) )
                    // InternalUiTest.g:310:4: (lv_string_0_0= RULE_STRING )
                    {
                    // InternalUiTest.g:310:4: (lv_string_0_0= RULE_STRING )
                    // InternalUiTest.g:311:5: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_0_0, grammarAccess.getParameterAccess().getStringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUiTest.g:328:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalUiTest.g:328:3: ( (otherlv_1= RULE_ID ) )
                    // InternalUiTest.g:329:4: (otherlv_1= RULE_ID )
                    {
                    // InternalUiTest.g:329:4: (otherlv_1= RULE_ID )
                    // InternalUiTest.g:330:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getVariableVariableDefinitionCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunctionName"
    // InternalUiTest.g:345:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalUiTest.g:345:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalUiTest.g:346:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalUiTest.g:352:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUiTest.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUiTest.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUiTest.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUiTest.g:360:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUiTest.g:360:3: (lv_name_0_0= RULE_ID )
            // InternalUiTest.g:361:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctionNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleCommand"
    // InternalUiTest.g:380:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalUiTest.g:380:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalUiTest.g:381:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalUiTest.g:387:1: ruleCommand returns [EObject current=null] : ( ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall ) otherlv_8= ';' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_Open_0 = null;

        EObject this_GoOn_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Click_3 = null;

        EObject this_Verify_4 = null;

        EObject this_Store_5 = null;

        EObject this_Select_6 = null;

        EObject this_FunctionCall_7 = null;



        	enterRule();

        try {
            // InternalUiTest.g:393:2: ( ( ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall ) otherlv_8= ';' ) )
            // InternalUiTest.g:394:2: ( ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall ) otherlv_8= ';' )
            {
            // InternalUiTest.g:394:2: ( ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall ) otherlv_8= ';' )
            // InternalUiTest.g:395:3: ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall ) otherlv_8= ';'
            {
            // InternalUiTest.g:395:3: ( (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect ) | this_FunctionCall_7= ruleFunctionCall )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17||(LA9_0>=20 && LA9_0<=25)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUiTest.g:396:4: (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect )
                    {
                    // InternalUiTest.g:396:4: (this_Open_0= ruleOpen | this_GoOn_1= ruleGoOn | this_Fill_2= ruleFill | this_Click_3= ruleClick | this_Verify_4= ruleVerify | this_Store_5= ruleStore | this_Select_6= ruleSelect )
                    int alt8=7;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt8=1;
                        }
                        break;
                    case 20:
                        {
                        alt8=2;
                        }
                        break;
                    case 22:
                        {
                        alt8=3;
                        }
                        break;
                    case 23:
                        {
                        alt8=4;
                        }
                        break;
                    case 24:
                        {
                        alt8=5;
                        }
                        break;
                    case 21:
                        {
                        alt8=6;
                        }
                        break;
                    case 25:
                        {
                        alt8=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalUiTest.g:397:5: this_Open_0= ruleOpen
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getOpenParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_12);
                            this_Open_0=ruleOpen();

                            state._fsp--;


                            					current = this_Open_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalUiTest.g:406:5: this_GoOn_1= ruleGoOn
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getGoOnParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_12);
                            this_GoOn_1=ruleGoOn();

                            state._fsp--;


                            					current = this_GoOn_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalUiTest.g:415:5: this_Fill_2= ruleFill
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getFillParserRuleCall_0_0_2());
                            				
                            pushFollow(FOLLOW_12);
                            this_Fill_2=ruleFill();

                            state._fsp--;


                            					current = this_Fill_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalUiTest.g:424:5: this_Click_3= ruleClick
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getClickParserRuleCall_0_0_3());
                            				
                            pushFollow(FOLLOW_12);
                            this_Click_3=ruleClick();

                            state._fsp--;


                            					current = this_Click_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalUiTest.g:433:5: this_Verify_4= ruleVerify
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getVerifyParserRuleCall_0_0_4());
                            				
                            pushFollow(FOLLOW_12);
                            this_Verify_4=ruleVerify();

                            state._fsp--;


                            					current = this_Verify_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalUiTest.g:442:5: this_Store_5= ruleStore
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getStoreParserRuleCall_0_0_5());
                            				
                            pushFollow(FOLLOW_12);
                            this_Store_5=ruleStore();

                            state._fsp--;


                            					current = this_Store_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalUiTest.g:451:5: this_Select_6= ruleSelect
                            {

                            					newCompositeNode(grammarAccess.getCommandAccess().getSelectParserRuleCall_0_0_6());
                            				
                            pushFollow(FOLLOW_12);
                            this_Select_6=ruleSelect();

                            state._fsp--;


                            					current = this_Select_6;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUiTest.g:461:4: this_FunctionCall_7= ruleFunctionCall
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getFunctionCallParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;


                    				current = this_FunctionCall_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpen"
    // InternalUiTest.g:478:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalUiTest.g:478:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalUiTest.g:479:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalUiTest.g:485:1: ruleOpen returns [EObject current=null] : ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) ) ( (lv_driverPath_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_program_1_1=null;
        Token lv_program_1_2=null;
        Token lv_driverPath_2_0=null;


        	enterRule();

        try {
            // InternalUiTest.g:491:2: ( ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) ) ( (lv_driverPath_2_0= RULE_STRING ) ) ) )
            // InternalUiTest.g:492:2: ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) ) ( (lv_driverPath_2_0= RULE_STRING ) ) )
            {
            // InternalUiTest.g:492:2: ( ( (lv_name_0_0= 'open' ) ) ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) ) ( (lv_driverPath_2_0= RULE_STRING ) ) )
            // InternalUiTest.g:493:3: ( (lv_name_0_0= 'open' ) ) ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) ) ( (lv_driverPath_2_0= RULE_STRING ) )
            {
            // InternalUiTest.g:493:3: ( (lv_name_0_0= 'open' ) )
            // InternalUiTest.g:494:4: (lv_name_0_0= 'open' )
            {
            // InternalUiTest.g:494:4: (lv_name_0_0= 'open' )
            // InternalUiTest.g:495:5: lv_name_0_0= 'open'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOpenAccess().getNameOpenKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "open");
            				

            }


            }

            // InternalUiTest.g:507:3: ( ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) ) )
            // InternalUiTest.g:508:4: ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) )
            {
            // InternalUiTest.g:508:4: ( (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' ) )
            // InternalUiTest.g:509:5: (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' )
            {
            // InternalUiTest.g:509:5: (lv_program_1_1= 'firefox' | lv_program_1_2= 'chrome' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUiTest.g:510:6: lv_program_1_1= 'firefox'
                    {
                    lv_program_1_1=(Token)match(input,18,FOLLOW_14); 

                    						newLeafNode(lv_program_1_1, grammarAccess.getOpenAccess().getProgramFirefoxKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpenRule());
                    						}
                    						setWithLastConsumed(current, "program", lv_program_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUiTest.g:521:6: lv_program_1_2= 'chrome'
                    {
                    lv_program_1_2=(Token)match(input,19,FOLLOW_14); 

                    						newLeafNode(lv_program_1_2, grammarAccess.getOpenAccess().getProgramChromeKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpenRule());
                    						}
                    						setWithLastConsumed(current, "program", lv_program_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUiTest.g:534:3: ( (lv_driverPath_2_0= RULE_STRING ) )
            // InternalUiTest.g:535:4: (lv_driverPath_2_0= RULE_STRING )
            {
            // InternalUiTest.g:535:4: (lv_driverPath_2_0= RULE_STRING )
            // InternalUiTest.g:536:5: lv_driverPath_2_0= RULE_STRING
            {
            lv_driverPath_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_driverPath_2_0, grammarAccess.getOpenAccess().getDriverPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"driverPath",
            						lv_driverPath_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleGoOn"
    // InternalUiTest.g:556:1: entryRuleGoOn returns [EObject current=null] : iv_ruleGoOn= ruleGoOn EOF ;
    public final EObject entryRuleGoOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoOn = null;


        try {
            // InternalUiTest.g:556:45: (iv_ruleGoOn= ruleGoOn EOF )
            // InternalUiTest.g:557:2: iv_ruleGoOn= ruleGoOn EOF
            {
             newCompositeNode(grammarAccess.getGoOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoOn=ruleGoOn();

            state._fsp--;

             current =iv_ruleGoOn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoOn"


    // $ANTLR start "ruleGoOn"
    // InternalUiTest.g:563:1: ruleGoOn returns [EObject current=null] : ( ( (lv_name_0_0= 'goOn' ) ) ( (lv_address_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoOn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_address_1_0=null;


        	enterRule();

        try {
            // InternalUiTest.g:569:2: ( ( ( (lv_name_0_0= 'goOn' ) ) ( (lv_address_1_0= RULE_STRING ) ) ) )
            // InternalUiTest.g:570:2: ( ( (lv_name_0_0= 'goOn' ) ) ( (lv_address_1_0= RULE_STRING ) ) )
            {
            // InternalUiTest.g:570:2: ( ( (lv_name_0_0= 'goOn' ) ) ( (lv_address_1_0= RULE_STRING ) ) )
            // InternalUiTest.g:571:3: ( (lv_name_0_0= 'goOn' ) ) ( (lv_address_1_0= RULE_STRING ) )
            {
            // InternalUiTest.g:571:3: ( (lv_name_0_0= 'goOn' ) )
            // InternalUiTest.g:572:4: (lv_name_0_0= 'goOn' )
            {
            // InternalUiTest.g:572:4: (lv_name_0_0= 'goOn' )
            // InternalUiTest.g:573:5: lv_name_0_0= 'goOn'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGoOnAccess().getNameGoOnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoOnRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "goOn");
            				

            }


            }

            // InternalUiTest.g:585:3: ( (lv_address_1_0= RULE_STRING ) )
            // InternalUiTest.g:586:4: (lv_address_1_0= RULE_STRING )
            {
            // InternalUiTest.g:586:4: (lv_address_1_0= RULE_STRING )
            // InternalUiTest.g:587:5: lv_address_1_0= RULE_STRING
            {
            lv_address_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_address_1_0, grammarAccess.getGoOnAccess().getAddressSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoOnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoOn"


    // $ANTLR start "entryRuleStore"
    // InternalUiTest.g:607:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalUiTest.g:607:46: (iv_ruleStore= ruleStore EOF )
            // InternalUiTest.g:608:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalUiTest.g:614:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_selector_1_0= ruleSelector ) ) ( (lv_key_2_0= ruleVariableDefinition ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_selector_1_0 = null;

        EObject lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:620:2: ( (otherlv_0= 'store' ( (lv_selector_1_0= ruleSelector ) ) ( (lv_key_2_0= ruleVariableDefinition ) ) ) )
            // InternalUiTest.g:621:2: (otherlv_0= 'store' ( (lv_selector_1_0= ruleSelector ) ) ( (lv_key_2_0= ruleVariableDefinition ) ) )
            {
            // InternalUiTest.g:621:2: (otherlv_0= 'store' ( (lv_selector_1_0= ruleSelector ) ) ( (lv_key_2_0= ruleVariableDefinition ) ) )
            // InternalUiTest.g:622:3: otherlv_0= 'store' ( (lv_selector_1_0= ruleSelector ) ) ( (lv_key_2_0= ruleVariableDefinition ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalUiTest.g:626:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalUiTest.g:627:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalUiTest.g:627:4: (lv_selector_1_0= ruleSelector )
            // InternalUiTest.g:628:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.emn.UiTest.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUiTest.g:645:3: ( (lv_key_2_0= ruleVariableDefinition ) )
            // InternalUiTest.g:646:4: (lv_key_2_0= ruleVariableDefinition )
            {
            // InternalUiTest.g:646:4: (lv_key_2_0= ruleVariableDefinition )
            // InternalUiTest.g:647:5: lv_key_2_0= ruleVariableDefinition
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getKeyVariableDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_2_0=ruleVariableDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.emn.UiTest.VariableDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleFill"
    // InternalUiTest.g:668:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalUiTest.g:668:45: (iv_ruleFill= ruleFill EOF )
            // InternalUiTest.g:669:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalUiTest.g:675:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_2_0=null;
        Token otherlv_3=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:681:2: ( (otherlv_0= 'fill' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalUiTest.g:682:2: (otherlv_0= 'fill' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalUiTest.g:682:2: (otherlv_0= 'fill' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUiTest.g:683:3: otherlv_0= 'fill' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalUiTest.g:687:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalUiTest.g:688:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalUiTest.g:688:4: (lv_selector_1_0= ruleSelector )
            // InternalUiTest.g:689:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getFillAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.emn.UiTest.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUiTest.g:706:3: ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUiTest.g:707:4: ( (lv_stringValue_2_0= RULE_STRING ) )
                    {
                    // InternalUiTest.g:707:4: ( (lv_stringValue_2_0= RULE_STRING ) )
                    // InternalUiTest.g:708:5: (lv_stringValue_2_0= RULE_STRING )
                    {
                    // InternalUiTest.g:708:5: (lv_stringValue_2_0= RULE_STRING )
                    // InternalUiTest.g:709:6: lv_stringValue_2_0= RULE_STRING
                    {
                    lv_stringValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_stringValue_2_0, grammarAccess.getFillAccess().getStringValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringValue",
                    							lv_stringValue_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUiTest.g:726:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalUiTest.g:726:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUiTest.g:727:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUiTest.g:727:5: (otherlv_3= RULE_ID )
                    // InternalUiTest.g:728:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getFillAccess().getKeyValueVariableDefinitionCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleClick"
    // InternalUiTest.g:744:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalUiTest.g:744:46: (iv_ruleClick= ruleClick EOF )
            // InternalUiTest.g:745:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalUiTest.g:751:1: ruleClick returns [EObject current=null] : ( ( (lv_name_0_0= 'click' ) ) ( (lv_selector_1_0= ruleSelector ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:757:2: ( ( ( (lv_name_0_0= 'click' ) ) ( (lv_selector_1_0= ruleSelector ) ) ) )
            // InternalUiTest.g:758:2: ( ( (lv_name_0_0= 'click' ) ) ( (lv_selector_1_0= ruleSelector ) ) )
            {
            // InternalUiTest.g:758:2: ( ( (lv_name_0_0= 'click' ) ) ( (lv_selector_1_0= ruleSelector ) ) )
            // InternalUiTest.g:759:3: ( (lv_name_0_0= 'click' ) ) ( (lv_selector_1_0= ruleSelector ) )
            {
            // InternalUiTest.g:759:3: ( (lv_name_0_0= 'click' ) )
            // InternalUiTest.g:760:4: (lv_name_0_0= 'click' )
            {
            // InternalUiTest.g:760:4: (lv_name_0_0= 'click' )
            // InternalUiTest.g:761:5: lv_name_0_0= 'click'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getClickAccess().getNameClickKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "click");
            				

            }


            }

            // InternalUiTest.g:773:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalUiTest.g:774:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalUiTest.g:774:4: (lv_selector_1_0= ruleSelector )
            // InternalUiTest.g:775:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getClickAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.emn.UiTest.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleVerify"
    // InternalUiTest.g:796:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalUiTest.g:796:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalUiTest.g:797:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalUiTest.g:803:1: ruleVerify returns [EObject current=null] : ( ( (lv_name_0_0= 'verify' ) ) ( (lv_selector_1_0= ruleSelector ) ) ( (lv_comparison_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_comparison_2_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:809:2: ( ( ( (lv_name_0_0= 'verify' ) ) ( (lv_selector_1_0= ruleSelector ) ) ( (lv_comparison_2_0= RULE_STRING ) ) ) )
            // InternalUiTest.g:810:2: ( ( (lv_name_0_0= 'verify' ) ) ( (lv_selector_1_0= ruleSelector ) ) ( (lv_comparison_2_0= RULE_STRING ) ) )
            {
            // InternalUiTest.g:810:2: ( ( (lv_name_0_0= 'verify' ) ) ( (lv_selector_1_0= ruleSelector ) ) ( (lv_comparison_2_0= RULE_STRING ) ) )
            // InternalUiTest.g:811:3: ( (lv_name_0_0= 'verify' ) ) ( (lv_selector_1_0= ruleSelector ) ) ( (lv_comparison_2_0= RULE_STRING ) )
            {
            // InternalUiTest.g:811:3: ( (lv_name_0_0= 'verify' ) )
            // InternalUiTest.g:812:4: (lv_name_0_0= 'verify' )
            {
            // InternalUiTest.g:812:4: (lv_name_0_0= 'verify' )
            // InternalUiTest.g:813:5: lv_name_0_0= 'verify'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVerifyAccess().getNameVerifyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifyRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "verify");
            				

            }


            }

            // InternalUiTest.g:825:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalUiTest.g:826:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalUiTest.g:826:4: (lv_selector_1_0= ruleSelector )
            // InternalUiTest.g:827:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.emn.UiTest.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUiTest.g:844:3: ( (lv_comparison_2_0= RULE_STRING ) )
            // InternalUiTest.g:845:4: (lv_comparison_2_0= RULE_STRING )
            {
            // InternalUiTest.g:845:4: (lv_comparison_2_0= RULE_STRING )
            // InternalUiTest.g:846:5: lv_comparison_2_0= RULE_STRING
            {
            lv_comparison_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_comparison_2_0, grammarAccess.getVerifyAccess().getComparisonSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comparison",
            						lv_comparison_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleSelect"
    // InternalUiTest.g:866:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalUiTest.g:866:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalUiTest.g:867:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalUiTest.g:873:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_2_0=null;
        Token otherlv_3=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:879:2: ( (otherlv_0= 'select' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalUiTest.g:880:2: (otherlv_0= 'select' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalUiTest.g:880:2: (otherlv_0= 'select' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUiTest.g:881:3: otherlv_0= 'select' ( (lv_selector_1_0= ruleSelector ) ) ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalUiTest.g:885:3: ( (lv_selector_1_0= ruleSelector ) )
            // InternalUiTest.g:886:4: (lv_selector_1_0= ruleSelector )
            {
            // InternalUiTest.g:886:4: (lv_selector_1_0= ruleSelector )
            // InternalUiTest.g:887:5: lv_selector_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getSelectorSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.emn.UiTest.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUiTest.g:904:3: ( ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUiTest.g:905:4: ( (lv_stringValue_2_0= RULE_STRING ) )
                    {
                    // InternalUiTest.g:905:4: ( (lv_stringValue_2_0= RULE_STRING ) )
                    // InternalUiTest.g:906:5: (lv_stringValue_2_0= RULE_STRING )
                    {
                    // InternalUiTest.g:906:5: (lv_stringValue_2_0= RULE_STRING )
                    // InternalUiTest.g:907:6: lv_stringValue_2_0= RULE_STRING
                    {
                    lv_stringValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_stringValue_2_0, grammarAccess.getSelectAccess().getStringValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringValue",
                    							lv_stringValue_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUiTest.g:924:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalUiTest.g:924:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUiTest.g:925:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUiTest.g:925:5: (otherlv_3= RULE_ID )
                    // InternalUiTest.g:926:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getKeyValueVariableDefinitionCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSelector"
    // InternalUiTest.g:942:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalUiTest.g:942:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalUiTest.g:943:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalUiTest.g:949:1: ruleSelector returns [EObject current=null] : (otherlv_0= '[' ( (lv_attributeName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_attributeValue_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributeName_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeValue_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUiTest.g:955:2: ( (otherlv_0= '[' ( (lv_attributeName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_attributeValue_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // InternalUiTest.g:956:2: (otherlv_0= '[' ( (lv_attributeName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_attributeValue_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // InternalUiTest.g:956:2: (otherlv_0= '[' ( (lv_attributeName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_attributeValue_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // InternalUiTest.g:957:3: otherlv_0= '[' ( (lv_attributeName_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_attributeValue_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalUiTest.g:961:3: ( (lv_attributeName_1_0= RULE_STRING ) )
            // InternalUiTest.g:962:4: (lv_attributeName_1_0= RULE_STRING )
            {
            // InternalUiTest.g:962:4: (lv_attributeName_1_0= RULE_STRING )
            // InternalUiTest.g:963:5: lv_attributeName_1_0= RULE_STRING
            {
            lv_attributeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_attributeName_1_0, grammarAccess.getSelectorAccess().getAttributeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeName",
            						lv_attributeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getEqualsSignKeyword_2());
            		
            // InternalUiTest.g:983:3: ( (lv_attributeValue_3_0= RULE_STRING ) )
            // InternalUiTest.g:984:4: (lv_attributeValue_3_0= RULE_STRING )
            {
            // InternalUiTest.g:984:4: (lv_attributeValue_3_0= RULE_STRING )
            // InternalUiTest.g:985:5: lv_attributeValue_3_0= RULE_STRING
            {
            lv_attributeValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_attributeValue_3_0, grammarAccess.getSelectorAccess().getAttributeValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeValue",
            						lv_attributeValue_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalUiTest.g:1009:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalUiTest.g:1009:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalUiTest.g:1010:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalUiTest.g:1016:1: ruleVariableDefinition returns [EObject current=null] : ( (lv_name_0_0= ruleKEY ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUiTest.g:1022:2: ( ( (lv_name_0_0= ruleKEY ) ) )
            // InternalUiTest.g:1023:2: ( (lv_name_0_0= ruleKEY ) )
            {
            // InternalUiTest.g:1023:2: ( (lv_name_0_0= ruleKEY ) )
            // InternalUiTest.g:1024:3: (lv_name_0_0= ruleKEY )
            {
            // InternalUiTest.g:1024:3: (lv_name_0_0= ruleKEY )
            // InternalUiTest.g:1025:4: lv_name_0_0= ruleKEY
            {

            				newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNameKEYParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleKEY();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.emn.UiTest.KEY");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleKEY"
    // InternalUiTest.g:1045:1: entryRuleKEY returns [String current=null] : iv_ruleKEY= ruleKEY EOF ;
    public final String entryRuleKEY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEY = null;


        try {
            // InternalUiTest.g:1045:43: (iv_ruleKEY= ruleKEY EOF )
            // InternalUiTest.g:1046:2: iv_ruleKEY= ruleKEY EOF
            {
             newCompositeNode(grammarAccess.getKEYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEY=ruleKEY();

            state._fsp--;

             current =iv_ruleKEY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEY"


    // $ANTLR start "ruleKEY"
    // InternalUiTest.g:1052:1: ruleKEY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleKEY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalUiTest.g:1058:2: (this_ID_0= RULE_ID )
            // InternalUiTest.g:1059:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getKEYAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEY"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\14\4\4\1\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\14\3\15\1\31\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\14\uffff\1\1\2\uffff\6\1",
            "",
            "\1\3",
            "\1\5\1\4\7\uffff\1\6",
            "\1\5\1\4\7\uffff\1\6",
            "\1\5\1\4\7\uffff\1\6",
            "\1\7\12\uffff\1\7\1\1\1\7\2\uffff\6\7",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "192:5: (lv_statements_6_1= ruleCommand | lv_statements_6_2= ruleFunctionCall )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003F20812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003F20012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003F20010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003F28010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});

}