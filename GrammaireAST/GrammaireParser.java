// Generated from GrammaireParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaireParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAR=2, RPAR=3, SEMICOLUMN=4, VIRGULE=5, EQUALS=6, AND=7, OR=8, 
		NOT=9, TRUE=10, FALSE=11, EQCIRCUIT=12, END=13, RETURNS=14, DESCR=15, 
		EVAL=16, IDENTIFIANT=17;
	public static final int
		RULE_prog = 0, RULE_circuit = 1, RULE_liste_identifiant = 2, RULE_liste_bool = 3, 
		RULE_bool = 4, RULE_equations = 5, RULE_equation = 6, RULE_expr = 7, RULE_commandes = 8, 
		RULE_commande = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "circuit", "liste_identifiant", "liste_bool", "bool", "equations", 
			"equation", "expr", "commandes", "commande"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "';'", "','", "'='", "'&'", "'|'", "'!'", "'true'", 
			"'false'", "'eq_circuit'", "'end'", "'returns'", "'descr'", "'eval'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LPAR", "RPAR", "SEMICOLUMN", "VIRGULE", "EQUALS", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "EQCIRCUIT", "END", "RETURNS", "DESCR", 
			"EVAL", "IDENTIFIANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammaireParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaireParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CircuitContext circuit() {
			return getRuleContext(CircuitContext.class,0);
		}
		public CommandesContext commandes() {
			return getRuleContext(CommandesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammaireParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			circuit();
			setState(21);
			commandes();
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CircuitContext extends ParserRuleContext {
		public TerminalNode EQCIRCUIT() { return getToken(GrammaireParser.EQCIRCUIT, 0); }
		public List<TerminalNode> LPAR() { return getTokens(GrammaireParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(GrammaireParser.LPAR, i);
		}
		public List<Liste_identifiantContext> liste_identifiant() {
			return getRuleContexts(Liste_identifiantContext.class);
		}
		public Liste_identifiantContext liste_identifiant(int i) {
			return getRuleContext(Liste_identifiantContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(GrammaireParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(GrammaireParser.RPAR, i);
		}
		public TerminalNode RETURNS() { return getToken(GrammaireParser.RETURNS, 0); }
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammaireParser.END, 0); }
		public CircuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circuit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterCircuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitCircuit(this);
		}
	}

	public final CircuitContext circuit() throws RecognitionException {
		CircuitContext _localctx = new CircuitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_circuit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(EQCIRCUIT);
			setState(25);
			match(LPAR);
			setState(26);
			liste_identifiant();
			setState(27);
			match(RPAR);
			setState(28);
			match(RETURNS);
			setState(29);
			match(LPAR);
			setState(30);
			liste_identifiant();
			setState(31);
			match(RPAR);
			setState(32);
			equations();
			setState(33);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Liste_identifiantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIANT() { return getToken(GrammaireParser.IDENTIFIANT, 0); }
		public TerminalNode VIRGULE() { return getToken(GrammaireParser.VIRGULE, 0); }
		public Liste_identifiantContext liste_identifiant() {
			return getRuleContext(Liste_identifiantContext.class,0);
		}
		public Liste_identifiantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_identifiant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterListe_identifiant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitListe_identifiant(this);
		}
	}

	public final Liste_identifiantContext liste_identifiant() throws RecognitionException {
		Liste_identifiantContext _localctx = new Liste_identifiantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_liste_identifiant);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(IDENTIFIANT);
				setState(36);
				match(VIRGULE);
				setState(37);
				liste_identifiant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(IDENTIFIANT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Liste_boolContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode VIRGULE() { return getToken(GrammaireParser.VIRGULE, 0); }
		public Liste_boolContext liste_bool() {
			return getRuleContext(Liste_boolContext.class,0);
		}
		public Liste_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterListe_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitListe_bool(this);
		}
	}

	public final Liste_boolContext liste_bool() throws RecognitionException {
		Liste_boolContext _localctx = new Liste_boolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liste_bool);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				bool();
				setState(42);
				match(VIRGULE);
				setState(43);
				liste_bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				bool();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GrammaireParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammaireParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationsContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public EquationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterEquations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitEquations(this);
		}
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equations);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				equation();
				setState(51);
				equations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				equation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIANT() { return getToken(GrammaireParser.IDENTIFIANT, 0); }
		public TerminalNode EQUALS() { return getToken(GrammaireParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(GrammaireParser.SEMICOLUMN, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIANT);
			setState(57);
			match(EQUALS);
			setState(58);
			expr(0);
			setState(59);
			match(SEMICOLUMN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GrammaireParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(GrammaireParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammaireParser.RPAR, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(GrammaireParser.IDENTIFIANT, 0); }
		public TerminalNode AND() { return getToken(GrammaireParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammaireParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(62);
				match(NOT);
				setState(63);
				expr(3);
				}
				break;
			case LPAR:
				{
				setState(64);
				match(LPAR);
				setState(65);
				expr(0);
				setState(66);
				match(RPAR);
				}
				break;
			case IDENTIFIANT:
				{
				setState(68);
				match(IDENTIFIANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						match(AND);
						setState(73);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						match(OR);
						setState(76);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CommandesContext extends ParserRuleContext {
		public CommandeContext commande() {
			return getRuleContext(CommandeContext.class,0);
		}
		public CommandesContext commandes() {
			return getRuleContext(CommandesContext.class,0);
		}
		public CommandesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterCommandes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitCommandes(this);
		}
	}

	public final CommandesContext commandes() throws RecognitionException {
		CommandesContext _localctx = new CommandesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commandes);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				commande();
				setState(83);
				commandes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				commande();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandeContext extends ParserRuleContext {
		public TerminalNode DESCR() { return getToken(GrammaireParser.DESCR, 0); }
		public TerminalNode LPAR() { return getToken(GrammaireParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammaireParser.RPAR, 0); }
		public TerminalNode EVAL() { return getToken(GrammaireParser.EVAL, 0); }
		public Liste_boolContext liste_bool() {
			return getRuleContext(Liste_boolContext.class,0);
		}
		public CommandeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commande; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).enterCommande(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaireParserListener ) ((GrammaireParserListener)listener).exitCommande(this);
		}
	}

	public final CommandeContext commande() throws RecognitionException {
		CommandeContext _localctx = new CommandeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commande);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(DESCR);
				setState(89);
				match(LPAR);
				setState(90);
				match(RPAR);
				}
				break;
			case EVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(EVAL);
				setState(92);
				match(LPAR);
				setState(93);
				liste_bool();
				setState(94);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\79\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tH\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\3\n\3\n\3\n\3\n\5\nY\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13c\n\13\3\13\2\3\20\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\3\3\2\f\r\2c\2\26\3\2\2\2\4\32\3\2\2\2\6)\3\2"+
		"\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20G\3\2\2\2\22X"+
		"\3\2\2\2\24b\3\2\2\2\26\27\5\4\3\2\27\30\5\22\n\2\30\31\7\2\2\3\31\3\3"+
		"\2\2\2\32\33\7\16\2\2\33\34\7\4\2\2\34\35\5\6\4\2\35\36\7\5\2\2\36\37"+
		"\7\20\2\2\37 \7\4\2\2 !\5\6\4\2!\"\7\5\2\2\"#\5\f\7\2#$\7\17\2\2$\5\3"+
		"\2\2\2%&\7\23\2\2&\'\7\7\2\2\'*\5\6\4\2(*\7\23\2\2)%\3\2\2\2)(\3\2\2\2"+
		"*\7\3\2\2\2+,\5\n\6\2,-\7\7\2\2-.\5\b\5\2.\61\3\2\2\2/\61\5\n\6\2\60+"+
		"\3\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62\63\t\2\2\2\63\13\3\2\2\2\64\65\5"+
		"\16\b\2\65\66\5\f\7\2\669\3\2\2\2\679\5\16\b\28\64\3\2\2\28\67\3\2\2\2"+
		"9\r\3\2\2\2:;\7\23\2\2;<\7\b\2\2<=\5\20\t\2=>\7\6\2\2>\17\3\2\2\2?@\b"+
		"\t\1\2@A\7\13\2\2AH\5\20\t\5BC\7\4\2\2CD\5\20\t\2DE\7\5\2\2EH\3\2\2\2"+
		"FH\7\23\2\2G?\3\2\2\2GB\3\2\2\2GF\3\2\2\2HQ\3\2\2\2IJ\f\7\2\2JK\7\t\2"+
		"\2KP\5\20\t\bLM\f\6\2\2MN\7\n\2\2NP\5\20\t\7OI\3\2\2\2OL\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2R\21\3\2\2\2SQ\3\2\2\2TU\5\24\13\2UV\5\22\n\2"+
		"VY\3\2\2\2WY\5\24\13\2XT\3\2\2\2XW\3\2\2\2Y\23\3\2\2\2Z[\7\21\2\2[\\\7"+
		"\4\2\2\\c\7\5\2\2]^\7\22\2\2^_\7\4\2\2_`\5\b\5\2`a\7\5\2\2ac\3\2\2\2b"+
		"Z\3\2\2\2b]\3\2\2\2c\25\3\2\2\2\n)\608GOQXb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}