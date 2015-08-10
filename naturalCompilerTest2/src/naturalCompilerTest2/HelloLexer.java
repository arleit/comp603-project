// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, IDENT=30, NUMBER=31, WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '"
	};
	public static final String[] ruleNames = {
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "IDENT", "NUMBER", "WS"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00b0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\6\37\u00a4\n\37\r\37\16\37\u00a5\3 \6 "+
		"\u00a9\n \r \16 \u00aa\3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\3\5\2\13\f\17\17\""+
		"\"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2"+
		"\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2"+
		"\23Y\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31c\3\2\2\2\33f\3\2\2\2\35h\3\2\2"+
		"\2\37j\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+\u0082"+
		"\3\2\2\2-\u0087\3\2\2\2/\u008a\3\2\2\2\61\u008f\3\2\2\2\63\u0095\3\2\2"+
		"\2\65\u0097\3\2\2\2\67\u009a\3\2\2\29\u009c\3\2\2\2;\u00a0\3\2\2\2=\u00a3"+
		"\3\2\2\2?\u00a8\3\2\2\2A\u00ac\3\2\2\2CD\7.\2\2D\4\3\2\2\2EF\7y\2\2FG"+
		"\7j\2\2GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\6\3\2\2\2KL\7/\2\2L\b\3\2\2\2MN\7"+
		",\2\2N\n\3\2\2\2OP\7*\2\2P\f\3\2\2\2QR\7k\2\2RS\7h\2\2S\16\3\2\2\2TU\7"+
		">\2\2U\20\3\2\2\2VW\7>\2\2WX\7?\2\2X\22\3\2\2\2YZ\7x\2\2Z[\7c\2\2[\\\7"+
		"t\2\2\\\24\3\2\2\2]^\7A\2\2^\26\3\2\2\2_`\7q\2\2`a\7f\2\2ab\7f\2\2b\30"+
		"\3\2\2\2cd\7f\2\2de\7q\2\2e\32\3\2\2\2fg\7\60\2\2g\34\3\2\2\2hi\7+\2\2"+
		"i\36\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7q\2\2mn\7e\2\2no\7g\2\2op\7f\2\2pq\7"+
		"w\2\2qr\7t\2\2rs\7g\2\2s \3\2\2\2tu\7-\2\2u\"\3\2\2\2vw\7?\2\2w$\3\2\2"+
		"\2xy\7=\2\2y&\3\2\2\2z{\7@\2\2{(\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2"+
		"\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081*\3\2\2\2\u0082\u0083\7e\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7n\2\2\u0086,\3\2\2"+
		"\2\u0087\u0088\7<\2\2\u0088\u0089\7?\2\2\u0089.\3\2\2\2\u008a\u008b\7"+
		"v\2\2\u008b\u008c\7j\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\60"+
		"\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7g\2\2\u0091\u0092\7i\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\62\3\2\2\2\u0095\u0096\7\61\2\2"+
		"\u0096\64\3\2\2\2\u0097\u0098\7@\2\2\u0098\u0099\7?\2\2\u0099\66\3\2\2"+
		"\2\u009a\u009b\7%\2\2\u009b8\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7"+
		"p\2\2\u009e\u009f\7f\2\2\u009f:\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1<\3\2"+
		"\2\2\u00a2\u00a4\4c|\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6>\3\2\2\2\u00a7\u00a9\4\62;\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab@\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\b!\2\2\u00afB\3\2\2\2\5\2\u00a5\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}