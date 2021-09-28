// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotLevelMaker.g4 by ANTLR 4.8
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
public class RobotLevelMakerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XDIM=1, DIM=2, PLAYER=3, EOS=4, WALL=5, CRATE=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, LSQUARE=11, RSQUARE=12, WS=13, COMMENT=14, LINE_COMMENT=15, 
		INT=16, STRING=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"XDIM", "DIM", "PLAYER", "EOS", "WALL", "CRATE", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "WS", "COMMENT", "LINE_COMMENT", 
			"INT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'DIM'", "'PLAYER'", "';'", "'WALL'", "'CRATE'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "XDIM", "DIM", "PLAYER", "EOS", "WALL", "CRATE", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LSQUARE", "RSQUARE", "WS", "COMMENT", "LINE_COMMENT", 
			"INT", "STRING"
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


	public RobotLevelMakerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RobotLevelMaker.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17T\n\17\f\17"+
		"\16\17W\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20b\n\20"+
		"\f\20\16\20e\13\20\3\20\3\20\3\21\6\21j\n\21\r\21\16\21k\3\21\3\21\3\21"+
		"\6\21q\n\21\r\21\16\21r\5\21u\n\21\3\22\3\22\7\22y\n\22\f\22\16\22|\13"+
		"\22\3\22\3\22\3U\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\3\2\62;\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7+\3\2\2\2\t\62\3\2\2"+
		"\2\13\64\3\2\2\2\r9\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3"+
		"\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35O\3\2\2\2\37]\3\2\2\2!t\3"+
		"\2\2\2#v\3\2\2\2%&\5!\21\2&\4\3\2\2\2\'(\7F\2\2()\7K\2\2)*\7O\2\2*\6\3"+
		"\2\2\2+,\7R\2\2,-\7N\2\2-.\7C\2\2./\7[\2\2/\60\7G\2\2\60\61\7T\2\2\61"+
		"\b\3\2\2\2\62\63\7=\2\2\63\n\3\2\2\2\64\65\7Y\2\2\65\66\7C\2\2\66\67\7"+
		"N\2\2\678\7N\2\28\f\3\2\2\29:\7E\2\2:;\7T\2\2;<\7C\2\2<=\7V\2\2=>\7G\2"+
		"\2>\16\3\2\2\2?@\7*\2\2@\20\3\2\2\2AB\7+\2\2B\22\3\2\2\2CD\7}\2\2D\24"+
		"\3\2\2\2EF\7\177\2\2F\26\3\2\2\2GH\7]\2\2H\30\3\2\2\2IJ\7_\2\2J\32\3\2"+
		"\2\2KL\t\2\2\2LM\3\2\2\2MN\b\16\2\2N\34\3\2\2\2OP\7\61\2\2PQ\7,\2\2QU"+
		"\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2"+
		"WU\3\2\2\2XY\7,\2\2YZ\7\61\2\2Z[\3\2\2\2[\\\b\17\2\2\\\36\3\2\2\2]^\7"+
		"\61\2\2^_\7\61\2\2_c\3\2\2\2`b\n\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2c"+
		"d\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\20\2\2g \3\2\2\2hj\t\4\2\2ih\3\2\2\2"+
		"jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lu\3\2\2\2mn\t\4\2\2np\7/\2\2oq\t\4\2\2"+
		"po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2ti\3\2\2\2tm\3\2\2\2"+
		"u\"\3\2\2\2vz\7$\2\2wy\n\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~$\3\2\2\2\t\2Uckrtz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}