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
		case 0:
			INT_LIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			FLOAT_LIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0132\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\5\2a\n\2\3\2\6\2d\n\2\r\2\16\2e\3\2\3\2"+
		"\3\3\5\3k\n\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\5\3t\n\3\3\3\6\3w\n\3\r"+
		"\3\16\3x\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u0092\n\6\f\6\16\6\u0095"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u0117"+
		"\n&\f&\16&\u011a\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\6/\u012d\n/\r/\16/\u012e\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60\3\2\4\4\2--//\5\2\13\f\16\17\"\"\u013b\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5j\3\2\2\2\7|\3\2\2\2\t"+
		"\u0088\3\2\2\2\13\u008f\3\2\2\2\r\u0096\3\2\2\2\17\u009c\3\2\2\2\21\u00a0"+
		"\3\2\2\2\23\u00a5\3\2\2\2\25\u00ac\3\2\2\2\27\u00b1\3\2\2\2\31\u00b6\3"+
		"\2\2\2\33\u00bc\3\2\2\2\35\u00c1\3\2\2\2\37\u00c6\3\2\2\2!\u00cb\3\2\2"+
		"\2#\u00d2\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db"+
		"\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e4\3\2\2"+
		"\2\65\u00e7\3\2\2\2\67\u00ea\3\2\2\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f2"+
		"\3\2\2\2?\u00f5\3\2\2\2A\u00f8\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G"+
		"\u00ff\3\2\2\2I\u0109\3\2\2\2K\u0112\3\2\2\2M\u011b\3\2\2\2O\u011d\3\2"+
		"\2\2Q\u011f\3\2\2\2S\u0121\3\2\2\2U\u0123\3\2\2\2W\u0125\3\2\2\2Y\u0127"+
		"\3\2\2\2[\u0129\3\2\2\2]\u012c\3\2\2\2_a\t\2\2\2`_\3\2\2\2`a\3\2\2\2a"+
		"c\3\2\2\2bd\4\62;\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\b\2\2\2h\4\3\2\2\2ik\t\2\2\2ji\3\2\2\2jk\3\2\2\2ko\3\2\2\2ln\4\62;"+
		"\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\7\60"+
		"\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\4\62;\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2yz\3\2\2\2z{\b\3\3\2{\6\3\2\2\2|\u0082\7)\2\2}~\4C\\\2~"+
		"\177\4c|\2\177\u0081\4\62;\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7)\2\2\u0086\u0087\b\4\4\2\u0087\b\3\2\2\2\u0088\u0089"+
		"\7$\2\2\u0089\u008a\4C\\\2\u008a\u008b\4c|\2\u008b\u008c\4\62;\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\7$\2\2\u008e\n\3\2\2\2\u008f\u0093\4C\\\2\u0090"+
		"\u0092\4c|\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\f\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7h\2\2\u0097\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7v\2\2\u009b\16\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7v\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7j\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2"+
		"\u00aa\u00ab\7i\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7"+
		"w\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7n\2\2\u00b0\26\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7o\2\2\u00b5"+
		"\30\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7o\2\2\u00ba\u00bb\7g\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\34\3\2\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\36\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7"+
		"p\2\2\u00c9\u00ca\7g\2\2\u00ca \3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd"+
		"\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7y\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7\61\2\2"+
		"\u00d4$\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8"+
		"(\3\2\2\2\u00d9\u00da\7-\2\2\u00da*\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc"+
		",\3\2\2\2\u00dd\u00de\7,\2\2\u00de.\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0"+
		"\60\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2\u00e3\7/\2\2\u00e3\62\3\2\2\2\u00e4"+
		"\u00e5\7-\2\2\u00e5\u00e6\7-\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7(\2\2\u00e8"+
		"\u00e9\7(\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec\7~\2\2\u00ec"+
		"8\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0\u00f1"+
		"\7<\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3\u00f4\7<\2\2\u00f4>\3"+
		"\2\2\2\u00f5\u00f6\7<\2\2\u00f6\u00f7\7>\2\2\u00f7@\3\2\2\2\u00f8\u00f9"+
		"\7<\2\2\u00f9\u00fa\7@\2\2\u00faB\3\2\2\2\u00fb\u00fc\7>\2\2\u00fcD\3"+
		"\2\2\2\u00fd\u00fe\7@\2\2\u00feF\3\2\2\2\u00ff\u0100\7u\2\2\u0100\u0101"+
		"\7q\2\2\u0101\u0102\7o\2\2\u0102\u0103\7g\2\2\u0103\u0104\7v\2\2\u0104"+
		"\u0105\7j\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2"+
		"\u0108H\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7j\2\2\u010b\u010c\7c\2"+
		"\2\u010c\u010d\7p\2\2\u010d\u010e\7i\2\2\u010e\u010f\7k\2\2\u010f\u0110"+
		"\7p\2\2\u0110\u0111\7i\2\2\u0111J\3\2\2\2\u0112\u0118\4c|\2\u0113\u0114"+
		"\4c|\2\u0114\u0115\7a\2\2\u0115\u0117\4\62;\2\u0116\u0113\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119L\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011c\7#\2\2\u011cN\3\2\2\2\u011d\u011e\7*"+
		"\2\2\u011eP\3\2\2\2\u011f\u0120\7+\2\2\u0120R\3\2\2\2\u0121\u0122\7}\2"+
		"\2\u0122T\3\2\2\2\u0123\u0124\7\177\2\2\u0124V\3\2\2\2\u0125\u0126\7]"+
		"\2\2\u0126X\3\2\2\2\u0127\u0128\7_\2\2\u0128Z\3\2\2\2\u0129\u012a\7.\2"+
		"\2\u012a\\\3\2\2\2\u012b\u012d\t\3\2\2\u012c\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b/\5\2\u0131^\3\2\2\2\r\2`ejosx\u0082\u0093\u0118\u012e\6\3\2\2"+
		"\3\3\3\3\4\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}