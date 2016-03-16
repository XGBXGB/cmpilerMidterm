// Generated from Land.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_LIT=2, FLOAT_LIT=3, STRING_LIT=4, CHAR_LIT=5, IDENTIFIER=6, 
		INT_DATA_TYPE=7, FLOAT_DATA_TYPE=8, STRING_DATA_TYPE=9, CHAR_DATA_TYPE=10, 
		VOID_DATA_TYPE=11, FOR_TOKEN=12, WHILE_TOKEN=13, DO_TOKEN=14, IF_TOKEN=15, 
		ELSE_TOKEN=16, RETURN_TOKEN=17, SINGLE_LINE_COMMENT_TOKEN=18, ASSIGNMENT_OPERATOR=19, 
		ADDITION_OPERATOR=20, SUBTRACTION_OPERATOR=21, MULTIPLICATION_OPERATOR=22, 
		DIVISION_OPERATOR=23, MODULUS_OPERATOR=24, INCREMENT_OPERATOR=25, DECREMENT_OPERATOR=26, 
		AND_OPERATOR=27, OR_OPERATOR=28, NOT_OPERATOR=29, NOT_EQUAL_TO_OPERATOR=30, 
		EQUAL_TO_OPERATOR=31, GREATER_THAN_OPERATOR=32, LESS_THAN_OPERATOR=33, 
		GREATER_THAN_EQUAL_TO_OPERATOR=34, LESS_THAN_EQUAL_TO_OPERATOR=35, NULL_TOKEN=36, 
		CONSTANT_TOKEN=37, CONSTANT_DECLARATION=38, TERMINATOR_TOKEN=39, OPEN_PARENTHESIS=40, 
		CLOSE_PARENTHESIS=41, OPEN_BRACE=42, CLOSE_BRACE=43, OPEN_BRACKET=44, 
		CLOSE_BRACKET=45, COMMA_TOKEN=46, WHITESPACE=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "INT_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "IDENTIFIER", 
		"INT_DATA_TYPE", "FLOAT_DATA_TYPE", "STRING_DATA_TYPE", "CHAR_DATA_TYPE", 
		"VOID_DATA_TYPE", "FOR_TOKEN", "WHILE_TOKEN", "DO_TOKEN", "IF_TOKEN", 
		"ELSE_TOKEN", "RETURN_TOKEN", "SINGLE_LINE_COMMENT_TOKEN", "ASSIGNMENT_OPERATOR", 
		"ADDITION_OPERATOR", "SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"DIVISION_OPERATOR", "MODULUS_OPERATOR", "INCREMENT_OPERATOR", "DECREMENT_OPERATOR", 
		"AND_OPERATOR", "OR_OPERATOR", "NOT_OPERATOR", "NOT_EQUAL_TO_OPERATOR", 
		"EQUAL_TO_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "NULL_TOKEN", "CONSTANT_TOKEN", "CONSTANT_DECLARATION", 
		"TERMINATOR_TOKEN", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_TOKEN", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'scan'", null, null, null, null, null, "'float'", "'int'", "'char'", 
		"'string'", "'full'", "'from'", "'thame'", "'dont'", "'then'", "'anne'", 
		"'borrow'", "'*/'", "':'", "'-'", "'+'", "'/'", "'*'", "'%'", "'--'", 
		"'++'", "'&&'", "'||'", "';'", "'::'", "';:'", "':<'", "':>'", "'<'", 
		"'>'", "'something'", "'changing'", null, "'!'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INT_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "IDENTIFIER", 
		"INT_DATA_TYPE", "FLOAT_DATA_TYPE", "STRING_DATA_TYPE", "CHAR_DATA_TYPE", 
		"VOID_DATA_TYPE", "FOR_TOKEN", "WHILE_TOKEN", "DO_TOKEN", "IF_TOKEN", 
		"ELSE_TOKEN", "RETURN_TOKEN", "SINGLE_LINE_COMMENT_TOKEN", "ASSIGNMENT_OPERATOR", 
		"ADDITION_OPERATOR", "SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"DIVISION_OPERATOR", "MODULUS_OPERATOR", "INCREMENT_OPERATOR", "DECREMENT_OPERATOR", 
		"AND_OPERATOR", "OR_OPERATOR", "NOT_OPERATOR", "NOT_EQUAL_TO_OPERATOR", 
		"EQUAL_TO_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "NULL_TOKEN", "CONSTANT_TOKEN", "CONSTANT_DECLARATION", 
		"TERMINATOR_TOKEN", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_TOKEN", "WHITESPACE"
	};
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
	 	public void recover(LexerNoViableAltException e){
	 		String text = _input.getText(Interval.of(_tokenStartCharIndex,_input.index()));
	   /*throw new RuntimeException("Syntax error at position "+_tokenStartCharPositionInLine+" '"+text+"'");*/
	 		/*throw new RuntimeException("Syntax error! Unable to compute for the answer.");*/
	 		throw new RuntimeException("Lexical error! Unable to compute for the answer.\n");
	 	}	
	 

	public LandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Land.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			INT_LIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			FLOAT_LIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			STRING_LIT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INT_LIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("INT HERE");
			break;
		}
	}
	private void FLOAT_LIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("Float HERE");
			break;
		}
	}
	private void STRING_LIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("String HERE");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\5\3h\n\3\3"+
		"\3\6\3k\n\3\r\3\16\3l\3\3\3\3\3\4\5\4r\n\4\3\4\7\4u\n\4\f\4\16\4x\13\4"+
		"\3\4\5\4{\n\4\3\4\6\4~\n\4\r\4\16\4\177\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0088"+
		"\n\5\f\5\16\5\u008b\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u011e\n\'\f\'\16\'\u0121\13\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0134\n\60\r\60\16"+
		"\60\u0135\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3"+
		"\2\4\4\2--//\5\2\13\f\16\17\"\"\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5g\3\2\2\2\7q\3\2\2\2\t\u0083"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0096\3\2\2\2\17\u009d\3\2\2\2\21\u00a3\3"+
		"\2\2\2\23\u00a7\3\2\2\2\25\u00ac\3\2\2\2\27\u00b3\3\2\2\2\31\u00b8\3\2"+
		"\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2\2\2\37\u00c8\3\2\2\2!\u00cd\3\2\2\2"+
		"#\u00d2\3\2\2\2%\u00d9\3\2\2\2\'\u00dc\3\2\2\2)\u00de\3\2\2\2+\u00e0\3"+
		"\2\2\2-\u00e2\3\2\2\2/\u00e4\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2\2"+
		"\65\u00eb\3\2\2\2\67\u00ee\3\2\2\29\u00f1\3\2\2\2;\u00f4\3\2\2\2=\u00f6"+
		"\3\2\2\2?\u00f9\3\2\2\2A\u00fc\3\2\2\2C\u00ff\3\2\2\2E\u0102\3\2\2\2G"+
		"\u0104\3\2\2\2I\u0106\3\2\2\2K\u0110\3\2\2\2M\u0119\3\2\2\2O\u0122\3\2"+
		"\2\2Q\u0124\3\2\2\2S\u0126\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c"+
		"\3\2\2\2[\u012e\3\2\2\2]\u0130\3\2\2\2_\u0133\3\2\2\2ab\7u\2\2bc\7e\2"+
		"\2cd\7c\2\2de\7p\2\2e\4\3\2\2\2fh\t\2\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2"+
		"\2ik\4\62;\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\3\2"+
		"\2o\6\3\2\2\2pr\t\2\2\2qp\3\2\2\2qr\3\2\2\2rv\3\2\2\2su\4\62;\2ts\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\7\60\2\2zy\3"+
		"\2\2\2z{\3\2\2\2{}\3\2\2\2|~\4\62;\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\4\3\2\u0082\b\3"+
		"\2\2\2\u0083\u0089\7)\2\2\u0084\u0085\4C\\\2\u0085\u0086\4c|\2\u0086\u0088"+
		"\4\62;\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7)"+
		"\2\2\u008d\u008e\b\5\4\2\u008e\n\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0091"+
		"\4C\\\2\u0091\u0092\4c|\2\u0092\u0093\4\62;\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\7$\2\2\u0095\f\3\2\2\2\u0096\u009a\4C\\\2\u0097\u0099\4c|\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\16\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f"+
		"\7n\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\20\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\22\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7i\2\2"+
		"\u00b2\26\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7n\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7o\2\2\u00bc\32\3\2\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7o\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7j\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc \3\2\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\"\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t"+
		"\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7y\2\2\u00d8$\3"+
		"\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db\7\61\2\2\u00db&\3\2\2\2\u00dc\u00dd"+
		"\7<\2\2\u00dd(\3\2\2\2\u00de\u00df\7/\2\2\u00df*\3\2\2\2\u00e0\u00e1\7"+
		"-\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7"+
		",\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7\62\3\2\2\2\u00e8\u00e9"+
		"\7/\2\2\u00e9\u00ea\7/\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed"+
		"\7-\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7(\2\2\u00f08"+
		"\3\2\2\2\u00f1\u00f2\7~\2\2\u00f2\u00f3\7~\2\2\u00f3:\3\2\2\2\u00f4\u00f5"+
		"\7=\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7<\2\2\u00f7\u00f8\7<\2\2\u00f8>\3"+
		"\2\2\2\u00f9\u00fa\7=\2\2\u00fa\u00fb\7<\2\2\u00fb@\3\2\2\2\u00fc\u00fd"+
		"\7<\2\2\u00fd\u00fe\7>\2\2\u00feB\3\2\2\2\u00ff\u0100\7<\2\2\u0100\u0101"+
		"\7@\2\2\u0101D\3\2\2\2\u0102\u0103\7>\2\2\u0103F\3\2\2\2\u0104\u0105\7"+
		"@\2\2\u0105H\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7q\2\2\u0108\u0109"+
		"\7o\2\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b\u010c\7j\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f\7i\2\2\u010fJ\3\2\2\2\u0110"+
		"\u0111\7e\2\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2\2\u0113\u0114\7p\2\2"+
		"\u0114\u0115\7i\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118"+
		"\7i\2\2\u0118L\3\2\2\2\u0119\u011f\4c|\2\u011a\u011b\4c|\2\u011b\u011c"+
		"\7a\2\2\u011c\u011e\4\62;\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120N\3\2\2\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0123\7#\2\2\u0123P\3\2\2\2\u0124\u0125\7*\2\2\u0125R\3\2\2\2\u0126"+
		"\u0127\7+\2\2\u0127T\3\2\2\2\u0128\u0129\7}\2\2\u0129V\3\2\2\2\u012a\u012b"+
		"\7\177\2\2\u012bX\3\2\2\2\u012c\u012d\7]\2\2\u012dZ\3\2\2\2\u012e\u012f"+
		"\7_\2\2\u012f\\\3\2\2\2\u0130\u0131\7.\2\2\u0131^\3\2\2\2\u0132\u0134"+
		"\t\3\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b\60\5\2\u0138`\3\2\2\2"+
		"\r\2glqvz\177\u0089\u009a\u011f\u0135\6\3\3\2\3\4\3\3\5\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}