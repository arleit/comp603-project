// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, IDENT=30, NUMBER=31, WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'while'", "'-'", "'*'", "'('", "'if'", "'<'", "'<='", 
		"'var'", "'?'", "'odd'", "'do'", "'.'", "')'", "'procedure'", "'+'", "'='", 
		"';'", "'>'", "'const'", "'call'", "':='", "'then'", "'begin'", "'/'", 
		"'>='", "'#'", "'end'", "'!'", "IDENT", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_condition = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"program", "block", "statement", "condition", "expression", "term", "factor"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); block();
			setState(15); match(T__16);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(HelloParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HelloParser.IDENT, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17); match(T__9);
			setState(18); match(IDENT);
			setState(19); match(T__12);
			setState(20); match(NUMBER);
			setState(21); match(T__11);
			}
			{
			setState(23); match(T__20);
			setState(24); match(IDENT);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(25); match(T__28);
				setState(26); match(IDENT);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(T__11);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(34); match(T__14);
				setState(35); match(IDENT);
				setState(36); match(T__11);
				setState(37); block();
				setState(38); match(T__11);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45); statement();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(47); match(IDENT);
				setState(48); match(T__7);
				setState(49); expression();
				}
				break;
			case T__8:
				{
				setState(50); match(T__8);
				setState(51); match(IDENT);
				}
				break;
			case T__19:
				{
				setState(52); match(T__19);
				setState(53); match(IDENT);
				}
				break;
			case T__0:
				{
				setState(54); match(T__0);
				setState(55); expression();
				}
				break;
			case T__5:
				{
				setState(56); match(T__5);
				setState(57); statement();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(58); match(T__11);
					setState(59); statement();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65); match(T__1);
				}
				break;
			case T__23:
				{
				setState(67); match(T__23);
				setState(68); condition();
				setState(69); match(T__6);
				setState(70); statement();
				}
				break;
			case T__27:
				{
				setState(72); match(T__27);
				setState(73); condition();
				setState(74); match(T__17);
				setState(75); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); match(T__18);
				setState(80); expression();
				}
				break;
			case T__26:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); expression();
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__21) | (1L << T__12) | (1L << T__10) | (1L << T__3) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(83); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(88); term();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__13) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(90); term();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); factor();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__4) {
				{
				{
				setState(100);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(97); match(T__25);
					}
					break;
				case T__4:
					{
					setState(98); match(T__4);
					setState(99); factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(NUMBER);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(T__24);
				setState(110); expression();
				setState(111); match(T__15);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5"+
		"\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\7\3\7\5\7g\n\7\7\7"+
		"i\n\7\f\7\16\7l\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\4\6\2\t\n\23\23\25\25\34\35\4\2\5\5\22\22}\2\20\3\2\2\2\4"+
		"\23\3\2\2\2\6O\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fb\3\2\2\2\16s\3\2\2\2\20"+
		"\21\5\4\3\2\21\22\7\17\2\2\22\3\3\2\2\2\23\24\7\26\2\2\24\25\7 \2\2\25"+
		"\26\7\23\2\2\26\27\7!\2\2\27\30\7\24\2\2\30\31\3\2\2\2\31\32\7\13\2\2"+
		"\32\37\7 \2\2\33\34\7\3\2\2\34\36\7 \2\2\35\33\3\2\2\2\36!\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\24\2\2#,\3\2\2\2$"+
		"%\7\21\2\2%&\7 \2\2&\'\7\24\2\2\'(\5\4\3\2()\7\24\2\2)+\3\2\2\2*$\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\5\6\4\2\60"+
		"\5\3\2\2\2\61\62\7 \2\2\62\63\7\30\2\2\63P\5\n\6\2\64\65\7\27\2\2\65P"+
		"\7 \2\2\66\67\7\f\2\2\67P\7 \2\289\7\37\2\29P\5\n\6\2:;\7\32\2\2;@\5\6"+
		"\4\2<=\7\24\2\2=?\5\6\4\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B@\3\2\2\2CD\7\36\2\2DP\3\2\2\2EF\7\b\2\2FG\5\b\5\2GH\7\31\2\2H"+
		"I\5\6\4\2IP\3\2\2\2JK\7\4\2\2KL\5\b\5\2LM\7\16\2\2MN\5\6\4\2NP\3\2\2\2"+
		"O\61\3\2\2\2O\64\3\2\2\2O\66\3\2\2\2O8\3\2\2\2O:\3\2\2\2OE\3\2\2\2OJ\3"+
		"\2\2\2P\7\3\2\2\2QR\7\r\2\2RX\5\n\6\2ST\5\n\6\2TU\t\2\2\2UV\5\n\6\2VX"+
		"\3\2\2\2WQ\3\2\2\2WS\3\2\2\2X\t\3\2\2\2YZ\t\3\2\2Z_\5\f\7\2[\\\t\3\2\2"+
		"\\^\5\f\7\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2"+
		"\2\2bj\5\16\b\2cg\7\6\2\2de\7\33\2\2eg\5\16\b\2fc\3\2\2\2fd\3\2\2\2gi"+
		"\3\2\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lj\3\2\2\2"+
		"mt\7 \2\2nt\7!\2\2op\7\7\2\2pq\5\n\6\2qr\7\20\2\2rt\3\2\2\2sm\3\2\2\2"+
		"sn\3\2\2\2so\3\2\2\2t\17\3\2\2\2\13\37,@OW_fjs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}