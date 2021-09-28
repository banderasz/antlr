// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotLevelMaker.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotLevelMakerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XDIM=1, DIM=2, PLAYER=3, EOS=4, WALL=5, CRATE=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, LSQUARE=11, RSQUARE=12, WS=13, COMMENT=14, LINE_COMMENT=15, 
		INT=16, STRING=17;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_dimStatement = 2, RULE_playerStatement = 3, 
		RULE_wallStatement = 4, RULE_crateStatement = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "dimStatement", "playerStatement", "wallStatement", 
			"crateStatement"
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

	@Override
	public String getGrammarFileName() { return "RobotLevelMaker.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RobotLevelMakerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIM) | (1L << PLAYER) | (1L << WALL) | (1L << CRATE))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public DimStatementContext dimStatement() {
			return getRuleContext(DimStatementContext.class,0);
		}
		public PlayerStatementContext playerStatement() {
			return getRuleContext(PlayerStatementContext.class,0);
		}
		public WallStatementContext wallStatement() {
			return getRuleContext(WallStatementContext.class,0);
		}
		public CrateStatementContext crateStatement() {
			return getRuleContext(CrateStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				dimStatement();
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				playerStatement();
				}
				break;
			case WALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				wallStatement();
				}
				break;
			case CRATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				crateStatement();
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

	public static class DimStatementContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(RobotLevelMakerParser.DIM, 0); }
		public TerminalNode EOS() { return getToken(RobotLevelMakerParser.EOS, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(RobotLevelMakerParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(RobotLevelMakerParser.LSQUARE, i);
		}
		public List<TerminalNode> XDIM() { return getTokens(RobotLevelMakerParser.XDIM); }
		public TerminalNode XDIM(int i) {
			return getToken(RobotLevelMakerParser.XDIM, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(RobotLevelMakerParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(RobotLevelMakerParser.RSQUARE, i);
		}
		public DimStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterDimStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitDimStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitDimStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimStatementContext dimStatement() throws RecognitionException {
		DimStatementContext _localctx = new DimStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dimStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(DIM);
			{
			setState(24);
			match(LSQUARE);
			setState(25);
			match(XDIM);
			setState(26);
			match(RSQUARE);
			}
			{
			setState(28);
			match(LSQUARE);
			setState(29);
			match(XDIM);
			setState(30);
			match(RSQUARE);
			}
			setState(32);
			match(EOS);
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

	public static class PlayerStatementContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(RobotLevelMakerParser.PLAYER, 0); }
		public TerminalNode EOS() { return getToken(RobotLevelMakerParser.EOS, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(RobotLevelMakerParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(RobotLevelMakerParser.LSQUARE, i);
		}
		public List<TerminalNode> XDIM() { return getTokens(RobotLevelMakerParser.XDIM); }
		public TerminalNode XDIM(int i) {
			return getToken(RobotLevelMakerParser.XDIM, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(RobotLevelMakerParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(RobotLevelMakerParser.RSQUARE, i);
		}
		public PlayerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterPlayerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitPlayerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitPlayerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerStatementContext playerStatement() throws RecognitionException {
		PlayerStatementContext _localctx = new PlayerStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_playerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PLAYER);
			{
			setState(35);
			match(LSQUARE);
			setState(36);
			match(XDIM);
			setState(37);
			match(RSQUARE);
			}
			{
			setState(39);
			match(LSQUARE);
			setState(40);
			match(XDIM);
			setState(41);
			match(RSQUARE);
			}
			setState(43);
			match(EOS);
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

	public static class WallStatementContext extends ParserRuleContext {
		public TerminalNode WALL() { return getToken(RobotLevelMakerParser.WALL, 0); }
		public TerminalNode EOS() { return getToken(RobotLevelMakerParser.EOS, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(RobotLevelMakerParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(RobotLevelMakerParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(RobotLevelMakerParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(RobotLevelMakerParser.RSQUARE, i);
		}
		public List<TerminalNode> XDIM() { return getTokens(RobotLevelMakerParser.XDIM); }
		public TerminalNode XDIM(int i) {
			return getToken(RobotLevelMakerParser.XDIM, i);
		}
		public WallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterWallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitWallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitWallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WallStatementContext wallStatement() throws RecognitionException {
		WallStatementContext _localctx = new WallStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(WALL);
			{
			setState(46);
			match(LSQUARE);
			{
			setState(47);
			match(XDIM);
			}
			setState(48);
			match(RSQUARE);
			}
			{
			setState(50);
			match(LSQUARE);
			{
			setState(51);
			match(XDIM);
			}
			setState(52);
			match(RSQUARE);
			}
			setState(54);
			match(EOS);
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

	public static class CrateStatementContext extends ParserRuleContext {
		public TerminalNode CRATE() { return getToken(RobotLevelMakerParser.CRATE, 0); }
		public TerminalNode EOS() { return getToken(RobotLevelMakerParser.EOS, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(RobotLevelMakerParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(RobotLevelMakerParser.LSQUARE, i);
		}
		public List<TerminalNode> XDIM() { return getTokens(RobotLevelMakerParser.XDIM); }
		public TerminalNode XDIM(int i) {
			return getToken(RobotLevelMakerParser.XDIM, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(RobotLevelMakerParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(RobotLevelMakerParser.RSQUARE, i);
		}
		public CrateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).enterCrateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotLevelMakerListener ) ((RobotLevelMakerListener)listener).exitCrateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotLevelMakerVisitor ) return ((RobotLevelMakerVisitor<? extends T>)visitor).visitCrateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateStatementContext crateStatement() throws RecognitionException {
		CrateStatementContext _localctx = new CrateStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CRATE);
			{
			setState(57);
			match(LSQUARE);
			setState(58);
			match(XDIM);
			setState(59);
			match(RSQUARE);
			}
			{
			setState(61);
			match(LSQUARE);
			setState(62);
			match(XDIM);
			setState(63);
			match(RSQUARE);
			}
			setState(65);
			match(EOS);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\2\2C\2\17\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b$\3\2\2\2\n/\3"+
		"\2\2\2\f:\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\30\5\6\4\2\24\30\5\b\5\2\25\30\5\n"+
		"\6\2\26\30\5\f\7\2\27\23\3\2\2\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26\3\2"+
		"\2\2\30\5\3\2\2\2\31\32\7\4\2\2\32\33\7\r\2\2\33\34\7\3\2\2\34\35\7\16"+
		"\2\2\35\36\3\2\2\2\36\37\7\r\2\2\37 \7\3\2\2 !\7\16\2\2!\"\3\2\2\2\"#"+
		"\7\6\2\2#\7\3\2\2\2$%\7\5\2\2%&\7\r\2\2&\'\7\3\2\2\'(\7\16\2\2()\3\2\2"+
		"\2)*\7\r\2\2*+\7\3\2\2+,\7\16\2\2,-\3\2\2\2-.\7\6\2\2.\t\3\2\2\2/\60\7"+
		"\7\2\2\60\61\7\r\2\2\61\62\7\3\2\2\62\63\7\16\2\2\63\64\3\2\2\2\64\65"+
		"\7\r\2\2\65\66\7\3\2\2\66\67\7\16\2\2\678\3\2\2\289\7\6\2\29\13\3\2\2"+
		"\2:;\7\b\2\2;<\7\r\2\2<=\7\3\2\2=>\7\16\2\2>?\3\2\2\2?@\7\r\2\2@A\7\3"+
		"\2\2AB\7\16\2\2BC\3\2\2\2CD\7\6\2\2D\r\3\2\2\2\4\21\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}