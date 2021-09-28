// Generated from C:/Users/Andras/Desktop/BME/Elosztott rendszerek laboratórium/ANTLR/robotgame_starter/src/language/controller\RobotController.g4 by ANTLR 4.8
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
public class RobotControllerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, ROTATE=2, EOS=3, LOOP=4, LOG=5, LPAREN=6, RPAREN=7, LCURLY=8, 
		RCURLY=9, WS=10, COMMENT=11, LINE_COMMENT=12, INT=13, STRING=14;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_moveStatement = 2, RULE_rotateStatement = 3, 
		RULE_direction = 4, RULE_loopStatement = 5, RULE_amount = 6, RULE_logStatement = 7, 
		RULE_logMessage = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "moveStatement", "rotateStatement", "direction", 
			"loopStatement", "amount", "logStatement", "logMessage"
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

	@Override
	public String getGrammarFileName() { return "RobotController.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RobotControllerParser(TokenStream input) {
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
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE) | (1L << ROTATE) | (1L << LOOP) | (1L << LOG))) != 0) );
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
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public RotateStatementContext rotateStatement() {
			return getRuleContext(RotateStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LogStatementContext logStatement() {
			return getRuleContext(LogStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				moveStatement();
				}
				break;
			case ROTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				rotateStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				loopStatement();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				logStatement();
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

	public static class MoveStatementContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(RobotControllerParser.MOVE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterMoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitMoveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitMoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(MOVE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(30);
				match(LPAREN);
				setState(31);
				amount();
				setState(32);
				match(RPAREN);
				}
			}

			setState(36);
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

	public static class RotateStatementContext extends ParserRuleContext {
		public TerminalNode ROTATE() { return getToken(RobotControllerParser.ROTATE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public RotateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterRotateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitRotateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitRotateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateStatementContext rotateStatement() throws RecognitionException {
		RotateStatementContext _localctx = new RotateStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rotateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ROTATE);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(39);
				match(LPAREN);
				setState(40);
				direction();
				setState(41);
				match(RPAREN);
				}
			}

			setState(45);
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RobotControllerParser.STRING, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(STRING);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(RobotControllerParser.LOOP, 0); }
		public TerminalNode LCURLY() { return getToken(RobotControllerParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RobotControllerParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LOOP);
			{
			setState(50);
			match(LPAREN);
			setState(51);
			amount();
			setState(52);
			match(RPAREN);
			}
			setState(54);
			match(LCURLY);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				statement();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE) | (1L << ROTATE) | (1L << LOOP) | (1L << LOG))) != 0) );
			setState(60);
			match(RCURLY);
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

	public static class AmountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitAmount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INT);
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

	public static class LogStatementContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(RobotControllerParser.LOG, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public LogMessageContext logMessage() {
			return getRuleContext(LogMessageContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public LogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitLogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogStatementContext logStatement() throws RecognitionException {
		LogStatementContext _localctx = new LogStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LOG);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(65);
				match(LPAREN);
				setState(66);
				logMessage();
				setState(67);
				match(RPAREN);
				}
			}

			setState(71);
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

	public static class LogMessageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RobotControllerParser.STRING, 0); }
		public LogMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterLogMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitLogMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitLogMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogMessageContext logMessage() throws RecognitionException {
		LogMessageContext _localctx = new LogMessageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\tH\n\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2L\2\25"+
		"\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b(\3\2\2\2\n\61\3\2\2\2\f\63\3\2\2"+
		"\2\16@\3\2\2\2\20B\3\2\2\2\22K\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26"+
		"\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\36\5\6\4\2\32"+
		"\36\5\b\5\2\33\36\5\f\7\2\34\36\5\20\t\2\35\31\3\2\2\2\35\32\3\2\2\2\35"+
		"\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37$\7\3\2\2 !\7\b\2\2!\"\5\16\b"+
		"\2\"#\7\t\2\2#%\3\2\2\2$ \3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\5\2\2\'\7\3"+
		"\2\2\2(-\7\4\2\2)*\7\b\2\2*+\5\n\6\2+,\7\t\2\2,.\3\2\2\2-)\3\2\2\2-.\3"+
		"\2\2\2./\3\2\2\2/\60\7\5\2\2\60\t\3\2\2\2\61\62\7\20\2\2\62\13\3\2\2\2"+
		"\63\64\7\6\2\2\64\65\7\b\2\2\65\66\5\16\b\2\66\67\7\t\2\2\678\3\2\2\2"+
		"8:\7\n\2\29;\5\4\3\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2"+
		">?\7\13\2\2?\r\3\2\2\2@A\7\17\2\2A\17\3\2\2\2BG\7\7\2\2CD\7\b\2\2DE\5"+
		"\22\n\2EF\7\t\2\2FH\3\2\2\2GC\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\5\2\2J\21"+
		"\3\2\2\2KL\7\20\2\2L\23\3\2\2\2\b\27\35$-<G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}