/*
 * generated by Xtext
 */
package fr.irisa.models.program.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.irisa.models.program.services.ProgramGrammarAccess;

public class ProgramParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ProgramGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.irisa.models.program.parser.antlr.internal.InternalProgramParser createParser(XtextTokenStream stream) {
		return new fr.irisa.models.program.parser.antlr.internal.InternalProgramParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public ProgramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}