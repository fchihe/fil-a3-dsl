/*
 * generated by Xtext 2.10.0
 */
package org.emn.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.emn.parser.antlr.internal.InternalUiTestParser;
import org.emn.services.UiTestGrammarAccess;

public class UiTestParser extends AbstractAntlrParser {

	@Inject
	private UiTestGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUiTestParser createParser(XtextTokenStream stream) {
		return new InternalUiTestParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UiTest";
	}

	public UiTestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UiTestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
