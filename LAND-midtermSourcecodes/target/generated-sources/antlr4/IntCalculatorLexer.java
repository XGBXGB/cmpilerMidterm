// Generated from IntCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LIT=1, FLOAT_LIT=2, STRING_LIT=3, CHAR_LIT=4, IDENTIFIER=5, INT_DATA_TYPE=6, 
		FLOAT_DATA_TYPE=7, STRING_DATA_TYPE=8, CHAR_DATA_TYPE=9, VOID_DATA_TYPE=10, 
		FOR_TOKEN=11, WHILE_TOKEN=12, DO_TOKEN=13, IF_TOKEN=14, ELSE_TOKEN=15, 
		RETURN_TOKEN=16, SINGLE_LINE_COMMENT_TOKEN=17, ASSIGNMENT_OPERATOR=18, 
		ADDITION_OPERATOR=19, SUBTRACTION_OPERATOR=20, MULTIPLICATION_OPERATOR=21, 
		DIVISION_OPERATOR=22, MODULUS_OPERATOR=23, INCREMENT_OPERATOR=24, DECREMENT_OPERATOR=25, 
		AND_OPERATOR=26, OR_OPERATOR=27, NOT_OPERATOR=28, NOT_EQUAL_TO_OPERATOR=29, 
		EQUAL_TO_OPERATOR=30, GREATER_THAN_OPERATOR=31, LESS_THAN_OPERATOR=32, 
		GREATER_THAN_EQUAL_TO_OPERATOR=33, LESS_THAN_EQUAL_TO_OPERATOR=34, NULL_TOKEN=35, 
		CONSTANT_TOKEN=36, CONSTANT_DECLARATION=37, TERMINATOR_TOKEN=38, OPEN_PARENTHESIS=39, 
		CLOSE_PARENTHESIS=40, OPEN_BRACE=41, CLOSE_BRACE=42, OPEN_BRACKET=43, 
		CLOSE_BRACKET=44, COMMA_TOKEN=45, WHITESPACE=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "IDENTIFIER", "INT_DATA_TYPE", 
		"FLOAT_DATA_TYPE", "STRING_DATA_TYPE", "CHAR_DATA_TYPE", "VOID_DATA_TYPE", 
		"FOR_TOKEN", "WHILE_TOKEN", "DO_TOKEN", "IF_TOKEN", "ELSE_TOKEN", "RETURN_TOKEN", 
		"SINGLE_LINE_COMMENT_TOKEN", "ASSIGNMENT_OPERATOR", "ADDITION_OPERATOR", 
		"SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", 
		"MODULUS_OPERATOR", "INCREMENT_OPERATOR", "DECREMENT_OPERATOR", "AND_OPERATOR", 
		"OR_OPERATOR", "NOT_OPERATOR", "NOT_EQUAL_TO_OPERATOR", "EQUAL_TO_OPERATOR", 
		"GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "NULL_TOKEN", "CONSTANT_TOKEN", "CONSTANT_DECLARATION", 
		"TERMINATOR_TOKEN", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA_TOKEN", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'float'", "'int'", "'char'", "'string'", 
		"'full'", "'from'", "'thame'", "'dont'", "'then'", "'anne'", "'borrow'", 
		"'*/'", "':'", "'-'", "'+'", "'/'", "'*'", "'%'", "'--'", "'++'", "'&&'", 
		"'||'", "';'", "'::'", "';:'", "':<'", "':>'", "'<'", "'>'", "'something'", 
		"'changing'", null, "'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_LIT", "FLOAT_LIT", "STRING_LIT", "CHAR_LIT", "IDENTIFIER", 
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
	 

	public IntCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IntCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0130\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\5\2a\n\2\3\2\6\2d\n\2\r\2\16\2e\3\3\5\3"+
		"i\n\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\5\3r\n\3\3\3\6\3u\n\3\r\3\16\3v"+
		"\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u0115\n&\f&\16"+
		"&\u0118\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\6/\u012b"+
		"\n/\r/\16/\u012c\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3"+
		"\2\4\4\2--//\5\2\13\f\16\17\"\"\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5h\3\2\2\2\7x\3\2\2\2\t\u0083\3\2\2\2"+
		"\13\u008a\3\2\2\2\r\u0094\3\2\2\2\17\u009a\3\2\2\2\21\u009e\3\2\2\2\23"+
		"\u00a3\3\2\2\2\25\u00aa\3\2\2\2\27\u00af\3\2\2\2\31\u00b4\3\2\2\2\33\u00ba"+
		"\3\2\2\2\35\u00bf\3\2\2\2\37\u00c4\3\2\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2"+
		"\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db"+
		"\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5\3\2"+
		"\2\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2?\u00f3"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0110\3\2\2\2M\u0119\3\2\2\2O\u011b\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0121\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u0127"+
		"\3\2\2\2]\u012a\3\2\2\2_a\t\2\2\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\4\62"+
		";\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\4\3\2\2\2gi\t\2\2\2hg\3\2"+
		"\2\2hi\3\2\2\2im\3\2\2\2jl\4\62;\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2pr\13\2\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\4"+
		"\62;\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\6\3\2\2\2x~\7)\2\2yz\4"+
		"C\\\2z{\4c|\2{}\4\62;\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7)\2\2\u0082\b\3\2\2\2"+
		"\u0083\u0084\7$\2\2\u0084\u0085\4C\\\2\u0085\u0086\4c|\2\u0086\u0087\4"+
		"\62;\2\u0087\u0088\3\2\2\2\u0088\u0089\7$\2\2\u0089\n\3\2\2\2\u008a\u0091"+
		"\4C\\\2\u008b\u008c\4C\\\2\u008c\u008d\4c|\2\u008d\u008e\4\62;\2\u008e"+
		"\u0090\7a\2\2\u008f\u008b\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7v\2\2\u0099\16\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7v\2\2\u009d\20\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\u00a9\7i\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7"+
		"w\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7n\2\2\u00ae\26\3\2\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7o\2\2\u00b3"+
		"\30\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7o\2\2\u00b8\u00b9\7g\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\34\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2"+
		"\u00c3\36\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7"+
		"p\2\2\u00c7\u00c8\7g\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7y\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\7\61\2\2"+
		"\u00d2$\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6"+
		"(\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8*\3\2\2\2\u00d9\u00da\7\61\2\2\u00da"+
		",\3\2\2\2\u00db\u00dc\7,\2\2\u00dc.\3\2\2\2\u00dd\u00de\7\'\2\2\u00de"+
		"\60\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7/\2\2\u00e1\62\3\2\2\2\u00e2"+
		"\u00e3\7-\2\2\u00e3\u00e4\7-\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6"+
		"\u00e7\7(\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7~\2\2\u00e9\u00ea\7~\2\2\u00ea"+
		"8\3\2\2\2\u00eb\u00ec\7=\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\u00ef"+
		"\7<\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7=\2\2\u00f1\u00f2\7<\2\2\u00f2>\3"+
		"\2\2\2\u00f3\u00f4\7<\2\2\u00f4\u00f5\7>\2\2\u00f5@\3\2\2\2\u00f6\u00f7"+
		"\7<\2\2\u00f7\u00f8\7@\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7>\2\2\u00faD\3"+
		"\2\2\2\u00fb\u00fc\7@\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff"+
		"\7q\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7g\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7i\2\2"+
		"\u0106H\3\2\2\2\u0107\u0108\7e\2\2\u0108\u0109\7j\2\2\u0109\u010a\7c\2"+
		"\2\u010a\u010b\7p\2\2\u010b\u010c\7i\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7i\2\2\u010fJ\3\2\2\2\u0110\u0116\4c|\2\u0111\u0112"+
		"\4c|\2\u0112\u0113\7a\2\2\u0113\u0115\4\62;\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117L\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011a\7#\2\2\u011aN\3\2\2\2\u011b\u011c\7*"+
		"\2\2\u011cP\3\2\2\2\u011d\u011e\7+\2\2\u011eR\3\2\2\2\u011f\u0120\7}\2"+
		"\2\u0120T\3\2\2\2\u0121\u0122\7\177\2\2\u0122V\3\2\2\2\u0123\u0124\7]"+
		"\2\2\u0124X\3\2\2\2\u0125\u0126\7_\2\2\u0126Z\3\2\2\2\u0127\u0128\7.\2"+
		"\2\u0128\\\3\2\2\2\u0129\u012b\t\3\2\2\u012a\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\b/\2\2\u012f^\3\2\2\2\r\2`ehmqv~\u0091\u0116\u012c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}