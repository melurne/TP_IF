// Generated from /home/maxence/TP_IF/GrammaireAST/GrammaireParser.g4 by ANTLR 4.8

	import circuits.*;

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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

	EquationCircuit circ = new EquationCircuit();
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
		public Liste_identifiantContext entrees;
		public Liste_identifiantContext sorties;
		public TerminalNode EQCIRCUIT() { return getToken(GrammaireParser.EQCIRCUIT, 0); }
		public List<TerminalNode> LPAR() { return getTokens(GrammaireParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(GrammaireParser.LPAR, i);
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
		public List<Liste_identifiantContext> liste_identifiant() {
			return getRuleContexts(Liste_identifiantContext.class);
		}
		public Liste_identifiantContext liste_identifiant(int i) {
			return getRuleContext(Liste_identifiantContext.class,i);
		}
		public CircuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circuit; }
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
			((CircuitContext)_localctx).entrees = liste_identifiant();
			setState(27);
			match(RPAR);
			setState(28);
			match(RETURNS);
			setState(29);
			match(LPAR);
			setState(30);
			((CircuitContext)_localctx).sorties = liste_identifiant();
			setState(31);
			match(RPAR);

					circ.setInputs(((CircuitContext)_localctx).entrees.ids);
					circ.setOutputs(((CircuitContext)_localctx).sorties.ids);
				
			setState(33);
			equations();
			setState(34);
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
		public List<String> ids;
		public Token IDENTIFIANT;
		public Liste_identifiantContext id_1;
		public TerminalNode IDENTIFIANT() { return getToken(GrammaireParser.IDENTIFIANT, 0); }
		public TerminalNode VIRGULE() { return getToken(GrammaireParser.VIRGULE, 0); }
		public Liste_identifiantContext liste_identifiant() {
			return getRuleContext(Liste_identifiantContext.class,0);
		}
		public Liste_identifiantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_identifiant; }
	}

	public final Liste_identifiantContext liste_identifiant() throws RecognitionException {
		Liste_identifiantContext _localctx = new Liste_identifiantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_liste_identifiant);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((Liste_identifiantContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(37);
				match(VIRGULE);
				setState(38);
				((Liste_identifiantContext)_localctx).id_1 = liste_identifiant();

							((Liste_identifiantContext)_localctx).id_1.ids.add(((Liste_identifiantContext)_localctx).IDENTIFIANT.getText());
							((Liste_identifiantContext)_localctx).ids =  ((Liste_identifiantContext)_localctx).id_1.ids;
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((Liste_identifiantContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

							((Liste_identifiantContext)_localctx).ids =  new ArrayList<String>();
							_localctx.ids.add(((Liste_identifiantContext)_localctx).IDENTIFIANT.getText());
						
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
		public List<Boolean> liste;
		public BoolContext b;
		public Liste_boolContext l_1;
		public TerminalNode VIRGULE() { return getToken(GrammaireParser.VIRGULE, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Liste_boolContext liste_bool() {
			return getRuleContext(Liste_boolContext.class,0);
		}
		public Liste_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_bool; }
	}

	public final Liste_boolContext liste_bool() throws RecognitionException {
		Liste_boolContext _localctx = new Liste_boolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liste_bool);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((Liste_boolContext)_localctx).b = bool();
				setState(46);
				match(VIRGULE);
				setState(47);
				((Liste_boolContext)_localctx).l_1 = liste_bool();

						((Liste_boolContext)_localctx).l_1.liste.add(((Liste_boolContext)_localctx).b.b);
						((Liste_boolContext)_localctx).liste =  ((Liste_boolContext)_localctx).l_1.liste;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((Liste_boolContext)_localctx).b = bool();

						((Liste_boolContext)_localctx).liste =  new ArrayList<Boolean>();
						_localctx.liste.add(((Liste_boolContext)_localctx).b.b);
					
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
		public Boolean b;
		public TerminalNode TRUE() { return getToken(GrammaireParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammaireParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(TRUE);
				((BoolContext)_localctx).b =  true;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(FALSE);
				((BoolContext)_localctx).b =  false;
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
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equations);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				equation();
				setState(62);
				equations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		public Token IDENTIFIANT;
		public ExprContext expr;
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
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((EquationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(68);
			match(EQUALS);
			setState(69);
			((EquationContext)_localctx).expr = expr(0);
			setState(70);
			match(SEMICOLUMN);

					circ.getOutput(((EquationContext)_localctx).IDENTIFIANT.getText()).setIn(((EquationContext)_localctx).expr.c);
				
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
		public Composant c;
		public ExprContext e1;
		public ExprContext e;
		public Token IDENTIFIANT;
		public ExprContext e2;
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
		public TerminalNode TRUE() { return getToken(GrammaireParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammaireParser.FALSE, 0); }
		public TerminalNode AND() { return getToken(GrammaireParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammaireParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(74);
				match(NOT);
				setState(75);
				((ExprContext)_localctx).e = expr(5);
				((ExprContext)_localctx).c =  new Not(); ((Not)(_localctx.c)).setIn(((ExprContext)_localctx).e.c); circ.addComposant(_localctx.c);
				}
				break;
			case LPAR:
				{
				setState(78);
				match(LPAR);
				setState(79);
				((ExprContext)_localctx).e = expr(0);
				setState(80);
				match(RPAR);
				((ExprContext)_localctx).c =  ((ExprContext)_localctx).e.c;
				}
				break;
			case IDENTIFIANT:
				{
				setState(83);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 ((ExprContext)_localctx).c =  circ.getInput(((ExprContext)_localctx).IDENTIFIANT.getText()); 
				}
				break;
			case TRUE:
				{
				setState(85);
				match(TRUE);
				 ((ExprContext)_localctx).c =  new Interrupteur(""); ((Interrupteur)(_localctx.c)).on(); 
				}
				break;
			case FALSE:
				{
				setState(87);
				match(FALSE);
				 ((ExprContext)_localctx).c =  new Interrupteur(""); ((Interrupteur)(_localctx.c)).off(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						match(AND);
						setState(93);
						((ExprContext)_localctx).e2 = expr(8);
						((ExprContext)_localctx).c =  new And(); ((And)(_localctx.c)).setIn1(((ExprContext)_localctx).e1.c); ((And)(_localctx.c)).setIn2(((ExprContext)_localctx).e2.c); circ.addComposant(_localctx.c);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(97);
						match(OR);
						setState(98);
						((ExprContext)_localctx).e2 = expr(7);
						((ExprContext)_localctx).c =  new Or(); ((Or)(_localctx.c)).setIn1(((ExprContext)_localctx).e1.c); ((Or)(_localctx.c)).setIn2(((ExprContext)_localctx).e2.c); circ.addComposant(_localctx.c);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	}

	public final CommandesContext commandes() throws RecognitionException {
		CommandesContext _localctx = new CommandesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commandes);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				commande();
				setState(107);
				commandes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
		public Liste_boolContext l;
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
	}

	public final CommandeContext commande() throws RecognitionException {
		CommandeContext _localctx = new CommandeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commande);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(DESCR);
				setState(113);
				match(LPAR);
				setState(114);
				match(RPAR);
				circ.descr();
				}
				break;
			case EVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(EVAL);
				setState(117);
				match(LPAR);
				setState(118);
				((CommandeContext)_localctx).l = liste_bool();
				setState(119);
				match(RPAR);
				circ.eval(((CommandeContext)_localctx).l.liste);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\58\n\5\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\5\7D\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\\\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\th\n\t\f\t"+
		"\16\tk\13\t\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13}\n\13\3\13\2\3\20\f\2\4\6\b\n\f\16\20\22\24\2\2\2"+
		"\u0080\2\26\3\2\2\2\4\32\3\2\2\2\6-\3\2\2\2\b\67\3\2\2\2\n=\3\2\2\2\f"+
		"C\3\2\2\2\16E\3\2\2\2\20[\3\2\2\2\22p\3\2\2\2\24|\3\2\2\2\26\27\5\4\3"+
		"\2\27\30\5\22\n\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\7\16\2\2\33\34\7\4"+
		"\2\2\34\35\5\6\4\2\35\36\7\5\2\2\36\37\7\20\2\2\37 \7\4\2\2 !\5\6\4\2"+
		"!\"\7\5\2\2\"#\b\3\1\2#$\5\f\7\2$%\7\17\2\2%\5\3\2\2\2&\'\7\23\2\2\'("+
		"\7\7\2\2()\5\6\4\2)*\b\4\1\2*.\3\2\2\2+,\7\23\2\2,.\b\4\1\2-&\3\2\2\2"+
		"-+\3\2\2\2.\7\3\2\2\2/\60\5\n\6\2\60\61\7\7\2\2\61\62\5\b\5\2\62\63\b"+
		"\5\1\2\638\3\2\2\2\64\65\5\n\6\2\65\66\b\5\1\2\668\3\2\2\2\67/\3\2\2\2"+
		"\67\64\3\2\2\28\t\3\2\2\29:\7\f\2\2:>\b\6\1\2;<\7\r\2\2<>\b\6\1\2=9\3"+
		"\2\2\2=;\3\2\2\2>\13\3\2\2\2?@\5\16\b\2@A\5\f\7\2AD\3\2\2\2BD\5\16\b\2"+
		"C?\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\7\23\2\2FG\7\b\2\2GH\5\20\t\2HI\7\6"+
		"\2\2IJ\b\b\1\2J\17\3\2\2\2KL\b\t\1\2LM\7\13\2\2MN\5\20\t\7NO\b\t\1\2O"+
		"\\\3\2\2\2PQ\7\4\2\2QR\5\20\t\2RS\7\5\2\2ST\b\t\1\2T\\\3\2\2\2UV\7\23"+
		"\2\2V\\\b\t\1\2WX\7\f\2\2X\\\b\t\1\2YZ\7\r\2\2Z\\\b\t\1\2[K\3\2\2\2[P"+
		"\3\2\2\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\i\3\2\2\2]^\f\t\2\2^_\7\t\2\2"+
		"_`\5\20\t\n`a\b\t\1\2ah\3\2\2\2bc\f\b\2\2cd\7\n\2\2de\5\20\t\tef\b\t\1"+
		"\2fh\3\2\2\2g]\3\2\2\2gb\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\21\3\2"+
		"\2\2ki\3\2\2\2lm\5\24\13\2mn\5\22\n\2nq\3\2\2\2oq\5\24\13\2pl\3\2\2\2"+
		"po\3\2\2\2q\23\3\2\2\2rs\7\21\2\2st\7\4\2\2tu\7\5\2\2u}\b\13\1\2vw\7\22"+
		"\2\2wx\7\4\2\2xy\5\b\5\2yz\7\5\2\2z{\b\13\1\2{}\3\2\2\2|r\3\2\2\2|v\3"+
		"\2\2\2}\25\3\2\2\2\13-\67=C[gip|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}