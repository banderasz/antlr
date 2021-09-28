// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotController.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotControllerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, ROTATE=2, EOS=3, LOOP=4, LOG=5, LPAREN=6, RPAREN=7, LCURLY=8, 
		RCURLY=9, WS=10, COMMENT=11, LINE_COMMENT=12, INT=13, STRING=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MOVE", "ROTATE", "EOS", "LOOP", "LOG", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "WS", "COMMENT", "LINE_COMMENT", "INT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'move'", "'rotate'", "';'", "'loop'", "'log'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MOVE", "ROTATE", "EOS", "LOOP", "LOG", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "WS", "COMMENT", "LINE_COMMENT", "INT", "STRING"
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


	public RobotControllerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RobotController.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fG\n\f"+
		"\f\f\16\fJ\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rU\n\r\f\r\16\r"+
		"X\13\r\3\r\3\r\3\16\6\16]\n\16\r\16\16\16^\3\17\3\17\7\17c\n\17\f\17\16"+
		"\17f\13\17\3\17\3\17\3H\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\5\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3"+
		"\2\62;\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5$\3\2\2"+
		"\2\7+\3\2\2\2\t-\3\2\2\2\13\62\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3"+
		"\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27B\3\2\2\2\31P\3\2\2\2\33\\\3\2\2\2\35"+
		"`\3\2\2\2\37 \7o\2\2 !\7q\2\2!\"\7x\2\2\"#\7g\2\2#\4\3\2\2\2$%\7t\2\2"+
		"%&\7q\2\2&\'\7v\2\2\'(\7c\2\2()\7v\2\2)*\7g\2\2*\6\3\2\2\2+,\7=\2\2,\b"+
		"\3\2\2\2-.\7n\2\2./\7q\2\2/\60\7q\2\2\60\61\7r\2\2\61\n\3\2\2\2\62\63"+
		"\7n\2\2\63\64\7q\2\2\64\65\7i\2\2\65\f\3\2\2\2\66\67\7*\2\2\67\16\3\2"+
		"\2\289\7+\2\29\20\3\2\2\2:;\7}\2\2;\22\3\2\2\2<=\7\177\2\2=\24\3\2\2\2"+
		">?\t\2\2\2?@\3\2\2\2@A\b\13\2\2A\26\3\2\2\2BC\7\61\2\2CD\7,\2\2DH\3\2"+
		"\2\2EG\13\2\2\2FE\3\2\2\2GJ\3\2\2\2HI\3\2\2\2HF\3\2\2\2IK\3\2\2\2JH\3"+
		"\2\2\2KL\7,\2\2LM\7\61\2\2MN\3\2\2\2NO\b\f\2\2O\30\3\2\2\2PQ\7\61\2\2"+
		"QR\7\61\2\2RV\3\2\2\2SU\n\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2WY\3\2\2\2XV\3\2\2\2YZ\b\r\2\2Z\32\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]^\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_\34\3\2\2\2`d\7$\2\2ac\n\3\2\2ba\3\2\2\2c"+
		"f\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7$\2\2h\36\3\2\2\2"+
		"\7\2HV^d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}