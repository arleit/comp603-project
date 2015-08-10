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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'buys'", "'dog'", "'chases'", "'a'", "'thinks'", "'hungry'", 
		"'big'", "'the'", "'car'", "'eats'", "'cat'", "'quick'", "'house'", "'sleeps'"
	};
	public static final int
		RULE_sent = 0, RULE_nounPhr = 1, RULE_verbPhr = 2, RULE_art = 3, RULE_adj = 4, 
		RULE_noun = 5, RULE_tranVrb = 6, RULE_intranVrb = 7;
	public static final String[] ruleNames = {
		"sent", "nounPhr", "verbPhr", "art", "adj", "noun", "tranVrb", "intranVrb"
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
	public static class SentContext extends ParserRuleContext {
		public NounPhrContext nounPhr() {
			return getRuleContext(NounPhrContext.class,0);
		}
		public VerbPhrContext verbPhr() {
			return getRuleContext(VerbPhrContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); nounPhr();
			setState(17); verbPhr();
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

	public static class NounPhrContext extends ParserRuleContext {
		public ArtContext art() {
			return getRuleContext(ArtContext.class,0);
		}
		public AdjContext adj() {
			return getRuleContext(AdjContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public NounPhrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNounPhr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhrContext nounPhr() throws RecognitionException {
		NounPhrContext _localctx = new NounPhrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nounPhr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); art();
			setState(20); adj();
			setState(21); noun();
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

	public static class VerbPhrContext extends ParserRuleContext {
		public TranVrbContext tranVrb() {
			return getRuleContext(TranVrbContext.class,0);
		}
		public NounPhrContext nounPhr() {
			return getRuleContext(NounPhrContext.class,0);
		}
		public IntranVrbContext intranVrb() {
			return getRuleContext(IntranVrbContext.class,0);
		}
		public VerbPhrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVerbPhr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhrContext verbPhr() throws RecognitionException {
		VerbPhrContext _localctx = new VerbPhrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_verbPhr);
		try {
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); tranVrb();
				setState(24); nounPhr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); intranVrb();
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

	public static class ArtContext extends ParserRuleContext {
		public ArtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_art; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitArt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArtContext art() throws RecognitionException {
		ArtContext _localctx = new ArtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_art);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AdjContext extends ParserRuleContext {
		public AdjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAdj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjContext adj() throws RecognitionException {
		AdjContext _localctx = new AdjContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_adj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NounContext extends ParserRuleContext {
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__5) | (1L << T__3) | (1L << T__1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TranVrbContext extends ParserRuleContext {
		public TranVrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tranVrb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTranVrb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranVrbContext tranVrb() throws RecognitionException {
		TranVrbContext _localctx = new TranVrbContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tranVrb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__11) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IntranVrbContext extends ParserRuleContext {
		public IntranVrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intranVrb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIntranVrb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntranVrbContext intranVrb() throws RecognitionException {
		IntranVrbContext _localctx = new IntranVrbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intranVrb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__4) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\7\4\2\6\6\n\n\4\2\b\t\16\16\6\2\4"+
		"\4\13\13\r\r\17\17\5\2\3\3\5\5\f\f\5\2\7\7\f\f\20\20\"\2\22\3\2\2\2\4"+
		"\25\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2"+
		"\2\20\'\3\2\2\2\22\23\5\4\3\2\23\24\5\6\4\2\24\3\3\2\2\2\25\26\5\b\5\2"+
		"\26\27\5\n\6\2\27\30\5\f\7\2\30\5\3\2\2\2\31\32\5\16\b\2\32\33\5\4\3\2"+
		"\33\36\3\2\2\2\34\36\5\20\t\2\35\31\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2\2"+
		"\37 \t\2\2\2 \t\3\2\2\2!\"\t\3\2\2\"\13\3\2\2\2#$\t\4\2\2$\r\3\2\2\2%"+
		"&\t\5\2\2&\17\3\2\2\2\'(\t\6\2\2(\21\3\2\2\2\3\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}