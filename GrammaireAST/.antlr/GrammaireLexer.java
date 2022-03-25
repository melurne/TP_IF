// Generated from /home/maxence/TP_IF/GrammaireAST/GrammaireLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAR=2, RPAR=3, SEMICOLUMN=4, VIRGULE=5, EQUALS=6, AND=7, OR=8, 
		NOT=9, TRUE=10, FALSE=11, EQCIRCUIT=12, END=13, RETURNS=14, DESCR=15, 
		EVAL=16, IDENTIFIANT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LPAR", "RPAR", "SEMICOLUMN", "VIRGULE", "EQUALS", "AND", "OR", 
			"NOT", "TRUE", "FALSE", "EQCIRCUIT", "END", "RETURNS", "DESCR", "EVAL", 
			"IDENTIFIANT"
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


	public GrammaireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammaireLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22l\n\22\f\22\16\22o\13\22\2\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23\3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\2q\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"&\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2"+
		"\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25<\3\2\2\2\27A\3\2\2\2\31G\3"+
		"\2\2\2\33R\3\2\2\2\35V\3\2\2\2\37^\3\2\2\2!d\3\2\2\2#i\3\2\2\2%\'\t\2"+
		"\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\b\2\2\2+\4\3"+
		"\2\2\2,-\7*\2\2-\6\3\2\2\2./\7+\2\2/\b\3\2\2\2\60\61\7=\2\2\61\n\3\2\2"+
		"\2\62\63\7.\2\2\63\f\3\2\2\2\64\65\7?\2\2\65\16\3\2\2\2\66\67\7(\2\2\67"+
		"\20\3\2\2\289\7~\2\29\22\3\2\2\2:;\7#\2\2;\24\3\2\2\2<=\7v\2\2=>\7t\2"+
		"\2>?\7w\2\2?@\7g\2\2@\26\3\2\2\2AB\7h\2\2BC\7c\2\2CD\7n\2\2DE\7u\2\2E"+
		"F\7g\2\2F\30\3\2\2\2GH\7g\2\2HI\7s\2\2IJ\7a\2\2JK\7e\2\2KL\7k\2\2LM\7"+
		"t\2\2MN\7e\2\2NO\7w\2\2OP\7k\2\2PQ\7v\2\2Q\32\3\2\2\2RS\7g\2\2ST\7p\2"+
		"\2TU\7f\2\2U\34\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7v\2\2YZ\7w\2\2Z[\7t\2\2["+
		"\\\7p\2\2\\]\7u\2\2]\36\3\2\2\2^_\7f\2\2_`\7g\2\2`a\7u\2\2ab\7e\2\2bc"+
		"\7t\2\2c \3\2\2\2de\7g\2\2ef\7x\2\2fg\7c\2\2gh\7n\2\2h\"\3\2\2\2im\t\3"+
		"\2\2jl\t\4\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n$\3\2\2\2om\3\2"+
		"\2\2\5\2(m\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}