// Generated from Land.g4 by ANTLR 4.5.2

 	import java.util.HashMap;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LandParser extends Parser {
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
	public static final int
		RULE_data_type = 0, RULE_literal = 1, RULE_digit_literal = 2, RULE_characters_literal = 3, 
		RULE_return_type = 4, RULE_constant_declaration = 5, RULE_var = 6, RULE_variable_declaration = 7, 
		RULE_more_variable_declaration = 8, RULE_array = 9, RULE_assignment_declaration = 10, 
		RULE_assignment_array = 11, RULE_assignment = 12, RULE_assignment_line = 13, 
		RULE_function_declaration = 14, RULE_function_declaration_parameters_type = 15, 
		RULE_function_declaration_parameters = 16, RULE_function_declaration_more_parameters = 17, 
		RULE_function_call = 18, RULE_function_call_parameters_type = 19, RULE_function_call_parameters = 20, 
		RULE_function_call_line = 21, RULE_conditional = 22, RULE_conditional_continue = 23, 
		RULE_wloop = 24, RULE_dloop = 25, RULE_floop = 26, RULE_perform_op = 27, 
		RULE_perform_op2 = 28, RULE_perform_op3 = 29, RULE_perform_op4 = 30, RULE_perform_op5 = 31, 
		RULE_perform_op6 = 32, RULE_perform_op7 = 33, RULE_add_sub = 34, RULE_mul_div = 35, 
		RULE_cond_op = 36, RULE_expression = 37, RULE_more_expressions = 38, RULE_code_block = 39, 
		RULE_printing = 40, RULE_return_line = 41;
	public static final String[] ruleNames = {
		"data_type", "literal", "digit_literal", "characters_literal", "return_type", 
		"constant_declaration", "var", "variable_declaration", "more_variable_declaration", 
		"array", "assignment_declaration", "assignment_array", "assignment", "assignment_line", 
		"function_declaration", "function_declaration_parameters_type", "function_declaration_parameters", 
		"function_declaration_more_parameters", "function_call", "function_call_parameters_type", 
		"function_call_parameters", "function_call_line", "conditional", "conditional_continue", 
		"wloop", "dloop", "floop", "perform_op", "perform_op2", "perform_op3", 
		"perform_op4", "perform_op5", "perform_op6", "perform_op7", "add_sub", 
		"mul_div", "cond_op", "expression", "more_expressions", "code_block", 
		"printing", "return_line"
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
	public String getGrammarFileName() { return "Land.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	 	HashMap memory = new HashMap();
	 
	public LandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Data_typeContext extends ParserRuleContext {
		public String s;
		public Token INT_DATA_TYPE;
		public Token FLOAT_DATA_TYPE;
		public Token STRING_DATA_TYPE;
		public Token CHAR_DATA_TYPE;
		public TerminalNode INT_DATA_TYPE() { return getToken(LandParser.INT_DATA_TYPE, 0); }
		public TerminalNode FLOAT_DATA_TYPE() { return getToken(LandParser.FLOAT_DATA_TYPE, 0); }
		public TerminalNode STRING_DATA_TYPE() { return getToken(LandParser.STRING_DATA_TYPE, 0); }
		public TerminalNode CHAR_DATA_TYPE() { return getToken(LandParser.CHAR_DATA_TYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_data_type);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((Data_typeContext)_localctx).INT_DATA_TYPE = match(INT_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).INT_DATA_TYPE!=null?((Data_typeContext)_localctx).INT_DATA_TYPE.getText():null);
				}
				break;
			case FLOAT_DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((Data_typeContext)_localctx).FLOAT_DATA_TYPE = match(FLOAT_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).FLOAT_DATA_TYPE!=null?((Data_typeContext)_localctx).FLOAT_DATA_TYPE.getText():null);
				}
				break;
			case STRING_DATA_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((Data_typeContext)_localctx).STRING_DATA_TYPE = match(STRING_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).STRING_DATA_TYPE!=null?((Data_typeContext)_localctx).STRING_DATA_TYPE.getText():null);
				}
				break;
			case CHAR_DATA_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				((Data_typeContext)_localctx).CHAR_DATA_TYPE = match(CHAR_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).CHAR_DATA_TYPE!=null?((Data_typeContext)_localctx).CHAR_DATA_TYPE.getText():null);
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

	public static class LiteralContext extends ParserRuleContext {
		public Object o;
		public Digit_literalContext digit_literal;
		public Characters_literalContext characters_literal;
		public Digit_literalContext digit_literal() {
			return getRuleContext(Digit_literalContext.class,0);
		}
		public Characters_literalContext characters_literal() {
			return getRuleContext(Characters_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((LiteralContext)_localctx).digit_literal = digit_literal();

												((LiteralContext)_localctx).o =  ((LiteralContext)_localctx).digit_literal.o;
											
				}
				break;
			case STRING_LIT:
			case CHAR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((LiteralContext)_localctx).characters_literal = characters_literal();

												((LiteralContext)_localctx).o =  ((LiteralContext)_localctx).characters_literal.o;
											
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

	public static class Digit_literalContext extends ParserRuleContext {
		public Object o;
		public Token INT_LIT;
		public Token FLOAT_LIT;
		public TerminalNode INT_LIT() { return getToken(LandParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(LandParser.FLOAT_LIT, 0); }
		public Digit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterDigit_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitDigit_literal(this);
		}
	}

	public final Digit_literalContext digit_literal() throws RecognitionException {
		Digit_literalContext _localctx = new Digit_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_digit_literal);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((Digit_literalContext)_localctx).INT_LIT = match(INT_LIT);

													((Digit_literalContext)_localctx).o = Integer.parseInt((((Digit_literalContext)_localctx).INT_LIT!=null?((Digit_literalContext)_localctx).INT_LIT.getText():null));
												
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((Digit_literalContext)_localctx).FLOAT_LIT = match(FLOAT_LIT);

													((Digit_literalContext)_localctx).o = Float.parseFloat((((Digit_literalContext)_localctx).FLOAT_LIT!=null?((Digit_literalContext)_localctx).FLOAT_LIT.getText():null));
												
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

	public static class Characters_literalContext extends ParserRuleContext {
		public Object o;
		public Token STRING_LIT;
		public Token CHAR_LIT;
		public TerminalNode STRING_LIT() { return getToken(LandParser.STRING_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(LandParser.CHAR_LIT, 0); }
		public Characters_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterCharacters_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitCharacters_literal(this);
		}
	}

	public final Characters_literalContext characters_literal() throws RecognitionException {
		Characters_literalContext _localctx = new Characters_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_characters_literal);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((Characters_literalContext)_localctx).STRING_LIT = match(STRING_LIT);

													((Characters_literalContext)_localctx).o =  (((Characters_literalContext)_localctx).STRING_LIT!=null?((Characters_literalContext)_localctx).STRING_LIT.getText():null).replace("'", "");
												
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((Characters_literalContext)_localctx).CHAR_LIT = match(CHAR_LIT);

											 		((Characters_literalContext)_localctx).o =  (((Characters_literalContext)_localctx).CHAR_LIT!=null?((Characters_literalContext)_localctx).CHAR_LIT.getText():null).replace("\"", "");
											 	
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

	public static class Return_typeContext extends ParserRuleContext {
		public String returnType;
		public Data_typeContext data_type;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID_DATA_TYPE() { return getToken(LandParser.VOID_DATA_TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_type);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((Return_typeContext)_localctx).data_type = data_type();
				((Return_typeContext)_localctx).returnType =  ((Return_typeContext)_localctx).data_type.s;
				}
				break;
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(VOID_DATA_TYPE);
				((Return_typeContext)_localctx).returnType =  "full";
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT_TOKEN() { return getToken(LandParser.CONSTANT_TOKEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CONSTANT_TOKEN);
			setState(122);
			match(IDENTIFIER);
			setState(123);
			literal();
			setState(124);
			match(TERMINATOR_TOKEN);
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

	public static class VarContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((VarContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VarContext)_localctx).s =  (((VarContext)_localctx).IDENTIFIER!=null?((VarContext)_localctx).IDENTIFIER.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				array();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public More_variable_declarationContext more_variable_declaration() {
			return getRuleContext(More_variable_declarationContext.class,0);
		}
		public Assignment_declarationContext assignment_declaration() {
			return getRuleContext(Assignment_declarationContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(132);
				var();
				setState(133);
				more_variable_declaration(((Variable_declarationContext)_localctx).data_type.s);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(136);
				assignment_declaration(((Variable_declarationContext)_localctx).data_type.s);
				setState(137);
				more_variable_declaration(((Variable_declarationContext)_localctx).data_type.s);
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

	public static class More_variable_declarationContext extends ParserRuleContext {
		public String dataType;
		public TerminalNode COMMA_TOKEN() { return getToken(LandParser.COMMA_TOKEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public More_variable_declarationContext more_variable_declaration() {
			return getRuleContext(More_variable_declarationContext.class,0);
		}
		public Assignment_declarationContext assignment_declaration() {
			return getRuleContext(Assignment_declarationContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public More_variable_declarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public More_variable_declarationContext(ParserRuleContext parent, int invokingState, String dataType) {
			super(parent, invokingState);
			this.dataType = dataType;
		}
		@Override public int getRuleIndex() { return RULE_more_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterMore_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitMore_variable_declaration(this);
		}
	}

	public final More_variable_declarationContext more_variable_declaration(String dataType) throws RecognitionException {
		More_variable_declarationContext _localctx = new More_variable_declarationContext(_ctx, getState(), dataType);
		enterRule(_localctx, 16, RULE_more_variable_declaration);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(COMMA_TOKEN);
				setState(142);
				var();
				setState(143);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(COMMA_TOKEN);
				setState(146);
				assignment_declaration(_localctx.dataType);
				setState(147);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(TERMINATOR_TOKEN);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(LandParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LandParser.CLOSE_BRACKET, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IDENTIFIER);
			setState(153);
			match(OPEN_BRACKET);
			setState(154);
			expression();
			setState(155);
			match(CLOSE_BRACKET);
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

	public static class Assignment_declarationContext extends ParserRuleContext {
		public String dataType;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Assignment_arrayContext assignment_array() {
			return getRuleContext(Assignment_arrayContext.class,0);
		}
		public Assignment_declarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_declarationContext(ParserRuleContext parent, int invokingState, String dataType) {
			super(parent, invokingState);
			this.dataType = dataType;
		}
		@Override public int getRuleIndex() { return RULE_assignment_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterAssignment_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitAssignment_declaration(this);
		}
	}

	public final Assignment_declarationContext assignment_declaration(String dataType) throws RecognitionException {
		Assignment_declarationContext _localctx = new Assignment_declarationContext(_ctx, getState(), dataType);
		enterRule(_localctx, 20, RULE_assignment_declaration);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				assignment(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				assignment_array();
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

	public static class Assignment_arrayContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(LandParser.ASSIGNMENT_OPERATOR, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_expressionsContext more_expressions() {
			return getRuleContext(More_expressionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public Assignment_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterAssignment_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitAssignment_array(this);
		}
	}

	public final Assignment_arrayContext assignment_array() throws RecognitionException {
		Assignment_arrayContext _localctx = new Assignment_arrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			array();
			setState(162);
			match(ASSIGNMENT_OPERATOR);
			setState(163);
			match(OPEN_BRACE);
			setState(164);
			expression();
			setState(165);
			more_expressions();
			setState(166);
			match(CLOSE_BRACE);
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

	public static class AssignmentContext extends ParserRuleContext {
		public String dataType;
		public VarContext var;
		public ExpressionContext expression;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(LandParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignmentContext(ParserRuleContext parent, int invokingState, String dataType) {
			super(parent, invokingState);
			this.dataType = dataType;
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment(String dataType) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), dataType);
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((AssignmentContext)_localctx).var = var();
			setState(169);
			match(ASSIGNMENT_OPERATOR);
			setState(170);
			((AssignmentContext)_localctx).expression = expression();

											/*if(_localctx.dataType.equals("float")){
												//todo if expression instanceof int else throw
												memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("int")){
												memory.put(((AssignmentContext)_localctx).var.s, new Float((float)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("char")){
												memory.put(((AssignmentContext)_localctx).var.s, new String((String)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("unknown type")){
												if(memory.get(((AssignmentContext)_localctx).var.s)==null){
												}else{
													if(memory.get(((AssignmentContext)_localctx).var.s) instanceof Integer){
														memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
													}else{
														memory.put(((AssignmentContext)_localctx).var.s, new Float((float)((AssignmentContext)_localctx).expression.o));
													} 
												}
											}
										*/
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

	public static class Assignment_lineContext extends ParserRuleContext {
		public VarContext var;
		public ExpressionContext expression;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(LandParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public Assignment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterAssignment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitAssignment_line(this);
		}
	}

	public final Assignment_lineContext assignment_line() throws RecognitionException {
		Assignment_lineContext _localctx = new Assignment_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Assignment_lineContext)_localctx).var = var();
			setState(174);
			match(ASSIGNMENT_OPERATOR);
			setState(175);
			((Assignment_lineContext)_localctx).expression = expression();
			setState(176);
			match(TERMINATOR_TOKEN);

							/*	if(memory.get(((Assignment_lineContext)_localctx).var.s)==null){
								}else{
									if(memory.get(((Assignment_lineContext)_localctx).var.s) instanceof Integer){
										memory.put(((Assignment_lineContext)_localctx).var.s, new Integer((int)((Assignment_lineContext)_localctx).expression.o));
									}else{
										memory.put(((Assignment_lineContext)_localctx).var.s, new Float((float)((Assignment_lineContext)_localctx).expression.o));
									} 
								}		
							*/
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Return_typeContext return_type;
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public Function_declaration_parameters_typeContext function_declaration_parameters_type() {
			return getRuleContext(Function_declaration_parameters_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Return_lineContext return_line() {
			return getRuleContext(Return_lineContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((Function_declarationContext)_localctx).return_type = return_type();
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(OPEN_PARENTHESIS);
			setState(182);
			function_declaration_parameters_type();
			setState(183);
			match(CLOSE_PARENTHESIS);
			setState(184);
			match(OPEN_BRACE);
			setState(185);
			code_block();
			setState(186);
			return_line(((Function_declarationContext)_localctx).return_type.returnType);
			setState(187);
			match(CLOSE_BRACE);
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

	public static class Function_declaration_parameters_typeContext extends ParserRuleContext {
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public Function_declaration_parameters_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_declaration_parameters_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_declaration_parameters_type(this);
		}
	}

	public final Function_declaration_parameters_typeContext function_declaration_parameters_type() throws RecognitionException {
		Function_declaration_parameters_typeContext _localctx = new Function_declaration_parameters_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_declaration_parameters_type);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				function_declaration_parameters();
				}
				break;
			case CLOSE_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_declaration_parametersContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public Function_declaration_more_parametersContext function_declaration_more_parameters() {
			return getRuleContext(Function_declaration_more_parametersContext.class,0);
		}
		public Function_declaration_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_declaration_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_declaration_parameters(this);
		}
	}

	public final Function_declaration_parametersContext function_declaration_parameters() throws RecognitionException {
		Function_declaration_parametersContext _localctx = new Function_declaration_parametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_declaration_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			return_type();
			setState(194);
			match(IDENTIFIER);
			setState(195);
			function_declaration_more_parameters();
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

	public static class Function_declaration_more_parametersContext extends ParserRuleContext {
		public TerminalNode COMMA_TOKEN() { return getToken(LandParser.COMMA_TOKEN, 0); }
		public Function_declaration_parametersContext function_declaration_parameters() {
			return getRuleContext(Function_declaration_parametersContext.class,0);
		}
		public Function_declaration_more_parametersContext function_declaration_more_parameters() {
			return getRuleContext(Function_declaration_more_parametersContext.class,0);
		}
		public Function_declaration_more_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_more_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_declaration_more_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_declaration_more_parameters(this);
		}
	}

	public final Function_declaration_more_parametersContext function_declaration_more_parameters() throws RecognitionException {
		Function_declaration_more_parametersContext _localctx = new Function_declaration_more_parametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_declaration_more_parameters);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(COMMA_TOKEN);
				setState(198);
				function_declaration_parameters();
				setState(199);
				function_declaration_more_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public Function_call_parameters_typeContext function_call_parameters_type() {
			return getRuleContext(Function_call_parameters_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(OPEN_PARENTHESIS);
			setState(206);
			function_call_parameters_type();
			setState(207);
			match(CLOSE_PARENTHESIS);
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

	public static class Function_call_parameters_typeContext extends ParserRuleContext {
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_call_parameters_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameters_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_call_parameters_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_call_parameters_type(this);
		}
	}

	public final Function_call_parameters_typeContext function_call_parameters_type() throws RecognitionException {
		Function_call_parameters_typeContext _localctx = new Function_call_parameters_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call_parameters_type);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				function_call_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_call_parametersContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_expressionsContext more_expressions() {
			return getRuleContext(More_expressionsContext.class,0);
		}
		public Function_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_call_parameters(this);
		}
	}

	public final Function_call_parametersContext function_call_parameters() throws RecognitionException {
		Function_call_parametersContext _localctx = new Function_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression();
			setState(214);
			more_expressions();
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

	public static class Function_call_lineContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public Function_call_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFunction_call_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFunction_call_line(this);
		}
	}

	public final Function_call_lineContext function_call_line() throws RecognitionException {
		Function_call_lineContext _localctx = new Function_call_lineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			function_call();
			setState(217);
			match(TERMINATOR_TOKEN);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(LandParser.IF_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public Conditional_continueContext conditional_continue() {
			return getRuleContext(Conditional_continueContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IF_TOKEN);
			setState(220);
			match(OPEN_PARENTHESIS);
			setState(221);
			expression();
			setState(222);
			match(CLOSE_PARENTHESIS);
			setState(223);
			match(OPEN_BRACE);
			setState(224);
			code_block();
			setState(225);
			match(CLOSE_BRACE);
			setState(226);
			conditional_continue();
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

	public static class Conditional_continueContext extends ParserRuleContext {
		public TerminalNode ELSE_TOKEN() { return getToken(LandParser.ELSE_TOKEN, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public Conditional_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterConditional_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitConditional_continue(this);
		}
	}

	public final Conditional_continueContext conditional_continue() throws RecognitionException {
		Conditional_continueContext _localctx = new Conditional_continueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional_continue);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ELSE_TOKEN);
				setState(229);
				conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ELSE_TOKEN);
				setState(231);
				match(OPEN_BRACE);
				setState(232);
				code_block();
				setState(233);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class WloopContext extends ParserRuleContext {
		public TerminalNode WHILE_TOKEN() { return getToken(LandParser.WHILE_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public WloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterWloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitWloop(this);
		}
	}

	public final WloopContext wloop() throws RecognitionException {
		WloopContext _localctx = new WloopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(WHILE_TOKEN);
			setState(239);
			match(OPEN_PARENTHESIS);
			setState(240);
			expression();
			setState(241);
			match(CLOSE_PARENTHESIS);
			setState(242);
			match(OPEN_BRACE);
			setState(243);
			code_block();
			setState(244);
			match(CLOSE_BRACE);
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

	public static class DloopContext extends ParserRuleContext {
		public TerminalNode DO_TOKEN() { return getToken(LandParser.DO_TOKEN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public TerminalNode WHILE_TOKEN() { return getToken(LandParser.WHILE_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public DloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterDloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitDloop(this);
		}
	}

	public final DloopContext dloop() throws RecognitionException {
		DloopContext _localctx = new DloopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DO_TOKEN);
			setState(247);
			match(OPEN_BRACE);
			setState(248);
			code_block();
			setState(249);
			match(CLOSE_BRACE);
			setState(250);
			match(WHILE_TOKEN);
			setState(251);
			match(OPEN_PARENTHESIS);
			setState(252);
			expression();
			setState(253);
			match(CLOSE_PARENTHESIS);
			setState(254);
			match(TERMINATOR_TOKEN);
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

	public static class FloopContext extends ParserRuleContext {
		public TerminalNode FOR_TOKEN() { return getToken(LandParser.FOR_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TERMINATOR_TOKEN() { return getTokens(LandParser.TERMINATOR_TOKEN); }
		public TerminalNode TERMINATOR_TOKEN(int i) {
			return getToken(LandParser.TERMINATOR_TOKEN, i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public FloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterFloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitFloop(this);
		}
	}

	public final FloopContext floop() throws RecognitionException {
		FloopContext _localctx = new FloopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FOR_TOKEN);
			setState(257);
			match(OPEN_PARENTHESIS);
			setState(258);
			expression();
			setState(259);
			match(TERMINATOR_TOKEN);
			setState(260);
			expression();
			setState(261);
			match(TERMINATOR_TOKEN);
			setState(262);
			expression();
			setState(263);
			match(CLOSE_PARENTHESIS);
			setState(264);
			match(OPEN_BRACE);
			setState(265);
			code_block();
			setState(266);
			match(CLOSE_BRACE);
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

	public static class Perform_opContext extends ParserRuleContext {
		public Object value;
		public TerminalNode NOT_OPERATOR() { return getToken(LandParser.NOT_OPERATOR, 0); }
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public Perform_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op(this);
		}
	}

	public final Perform_opContext perform_op() throws RecognitionException {
		Perform_opContext _localctx = new Perform_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_perform_op);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case NOT_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NOT_OPERATOR);
				setState(269);
				perform_op2(0);
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
			case IDENTIFIER:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				perform_op2(0);
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

	public static class Perform_op2Context extends ParserRuleContext {
		public Object value;
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public TerminalNode OR_OPERATOR() { return getToken(LandParser.OR_OPERATOR, 0); }
		public Perform_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op2(this);
		}
	}

	public final Perform_op2Context perform_op2() throws RecognitionException {
		return perform_op2(0);
	}

	private Perform_op2Context perform_op2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_op2Context _localctx = new Perform_op2Context(_ctx, _parentState);
		Perform_op2Context _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_perform_op2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			perform_op3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op2);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277);
					match(OR_OPERATOR);
					setState(278);
					perform_op3(0);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Perform_op3Context extends ParserRuleContext {
		public Object value;
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public TerminalNode AND_OPERATOR() { return getToken(LandParser.AND_OPERATOR, 0); }
		public Perform_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op3(this);
		}
	}

	public final Perform_op3Context perform_op3() throws RecognitionException {
		return perform_op3(0);
	}

	private Perform_op3Context perform_op3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_op3Context _localctx = new Perform_op3Context(_ctx, _parentState);
		Perform_op3Context _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_perform_op3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			perform_op4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op3);
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288);
					match(AND_OPERATOR);
					setState(289);
					perform_op4(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Perform_op4Context extends ParserRuleContext {
		public Object value;
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Perform_op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op4(this);
		}
	}

	public final Perform_op4Context perform_op4() throws RecognitionException {
		return perform_op4(0);
	}

	private Perform_op4Context perform_op4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_op4Context _localctx = new Perform_op4Context(_ctx, _parentState);
		Perform_op4Context _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_perform_op4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296);
			perform_op5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op4);
					setState(298);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(299);
					cond_op();
					setState(300);
					perform_op5(0);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Perform_op5Context extends ParserRuleContext {
		public Object value;
		public Perform_op5Context n1;
		public Perform_op6Context n;
		public Perform_op6Context n2;
		public Add_subContext op;
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public Perform_op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op5(this);
		}
	}

	public final Perform_op5Context perform_op5() throws RecognitionException {
		return perform_op5(0);
	}

	private Perform_op5Context perform_op5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_op5Context _localctx = new Perform_op5Context(_ctx, _parentState);
		Perform_op5Context _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_perform_op5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			((Perform_op5Context)_localctx).n = perform_op6(0);
			/*$value = $n.value;*/
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Perform_op5Context(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(311);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(312);
						((Perform_op5Context)_localctx).n2 = perform_op6(0);
						 System.out.println("n1n2: "+(((Perform_op5Context)_localctx).n1!=null?_input.getText(((Perform_op5Context)_localctx).n1.start,((Perform_op5Context)_localctx).n1.stop):null)+" "+(((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null));
						          								/*if((((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null).startsWith("+") || (((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null).startsWith("-"))
						          								{
						          									if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float)
						          										((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value + (float)((Perform_op5Context)_localctx).n2.value;
						          									else
						          										((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;*/
						          									/*if(((Perform_op5Context)_localctx).n1.value > 0 && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value < 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}else{
						          										((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;
						          									}
						          									if(((Perform_op5Context)_localctx).n1.value < 0 && ((Perform_op5Context)_localctx).n2.value < 0 && _localctx.value > 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}*/
						          								/*} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");*/
						          							   
						}
						break;
					case 2:
						{
						_localctx = new Perform_op5Context(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						((Perform_op5Context)_localctx).op = add_sub();
						setState(317);
						((Perform_op5Context)_localctx).n2 = perform_op6(0);
						System.out.println("n1addsubn2: "+(((Perform_op5Context)_localctx).n1!=null?_input.getText(((Perform_op5Context)_localctx).n1.start,((Perform_op5Context)_localctx).n1.stop):null)+" "+(((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null));
						          							 		/*System.out.println((((Perform_op5Context)_localctx).n1!=null?_input.getText(((Perform_op5Context)_localctx).n1.start,((Perform_op5Context)_localctx).n1.stop):null)+" WENT HERE +++--- "+(((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null));
						          							 		if((((Perform_op5Context)_localctx).op!=null?_input.getText(((Perform_op5Context)_localctx).op.start,((Perform_op5Context)_localctx).op.stop):null).equalsIgnoreCase("+")){
						          							 			if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float){
						          											((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value + (float)((Perform_op5Context)_localctx).n2.value;*/
						          											/*if(((Perform_op5Context)_localctx).n1.value > 0 && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value < 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}
						          											if(((Perform_op5Context)_localctx).n1.value < 0 && ((Perform_op5Context)_localctx).n2.value < 0 && _localctx.value > 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}
						          											} else{
						          											if(((Perform_op5Context)_localctx).n1.value < ((Perform_op5Context)_localctx).n2.value && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value > 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}*/
						          											
						          										/*}else{
						          											((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;*/
						          											/*if(((Perform_op5Context)_localctx).n1.value > 0 && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value < 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}
						          											if(((Perform_op5Context)_localctx).n1.value < 0 && ((Perform_op5Context)_localctx).n2.value < 0 && _localctx.value > 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}
						          											} else{
						          											if(((Perform_op5Context)_localctx).n1.value < ((Perform_op5Context)_localctx).n2.value && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value > 0){
						          												throw new ArithmeticException("Value out of range for integer");
						          											}*/
						          											
						          									/* }
						          									}else{
						          										if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float){
						          											((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value - (float)((Perform_op5Context)_localctx).n2.value;
						          										}else{
						          											((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value - (int)((Perform_op5Context)_localctx).n2.value;
						          										}
						          									}
						          									
						          							 	*/
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Perform_op6Context extends ParserRuleContext {
		public Object value;
		public Perform_op6Context n1;
		public Perform_op7Context w;
		public Mul_divContext op;
		public Perform_op7Context n2;
		public Perform_op7Context perform_op7() {
			return getRuleContext(Perform_op7Context.class,0);
		}
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public Perform_op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op6(this);
		}
	}

	public final Perform_op6Context perform_op6() throws RecognitionException {
		return perform_op6(0);
	}

	private Perform_op6Context perform_op6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_op6Context _localctx = new Perform_op6Context(_ctx, _parentState);
		Perform_op6Context _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_perform_op6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			((Perform_op6Context)_localctx).w = perform_op7();

													/*((Perform_op6Context)_localctx).value =  ((Perform_op6Context)_localctx).w.value;*/
												
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op6Context(_parentctx, _parentState);
					_localctx.n1 = _prevctx;
					_localctx.n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op6);
					setState(329);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(330);
					((Perform_op6Context)_localctx).op = mul_div();
					setState(331);
					((Perform_op6Context)_localctx).n2 = perform_op7();

					          									/*if((((Perform_op6Context)_localctx).op!=null?_input.getText(((Perform_op6Context)_localctx).op.start,((Perform_op6Context)_localctx).op.stop):null).equalsIgnoreCase("*")){
					          										if(((Perform_op6Context)_localctx).n1.value instanceof Float || ((Perform_op6Context)_localctx).n2.value instanceof Float){
					          											((Perform_op6Context)_localctx).value =  (float)((Perform_op6Context)_localctx).n1.value * (float)((Perform_op6Context)_localctx).n2.value;
					          										}
					          										else{
					          											((Perform_op6Context)_localctx).value =  (int)((Perform_op6Context)_localctx).n1.value * (int)((Perform_op6Context)_localctx).n2.value;
					          										}*/
					          										/*if(((Perform_op6Context)_localctx).n1.value > 0 && ((Perform_op6Context)_localctx).n2.value > 0 && _localctx.value < 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op6Context)_localctx).n1.value < 0 && ((Perform_op6Context)_localctx).n2.value < 0 && _localctx.value < 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op6Context)_localctx).n1.value > 0 && ((Perform_op6Context)_localctx).n2.value < 0 && _localctx.value > 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op6Context)_localctx).n1.value < 0 && ((Perform_op6Context)_localctx).n2.value > 0 && _localctx.value > 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}*/
					          									/*} else if((((Perform_op6Context)_localctx).op!=null?_input.getText(((Perform_op6Context)_localctx).op.start,((Perform_op6Context)_localctx).op.stop):null).equalsIgnoreCase("/")){
					          											if(((Perform_op6Context)_localctx).n1.value instanceof Float || ((Perform_op6Context)_localctx).n2.value instanceof Float){
					          											((Perform_op6Context)_localctx).value =  (float)((Perform_op6Context)_localctx).n1.value / (float)((Perform_op6Context)_localctx).n2.value;
					          										}
					          										else{
					          											((Perform_op6Context)_localctx).value =  (int)((Perform_op6Context)_localctx).n1.value / (int)((Perform_op6Context)_localctx).n2.value;
					          										}
					          									} else {
					          										if(((Perform_op6Context)_localctx).n1.value instanceof Float || ((Perform_op6Context)_localctx).n2.value instanceof Float){
					          											((Perform_op6Context)_localctx).value =  (float)((Perform_op6Context)_localctx).n1.value % (float)((Perform_op6Context)_localctx).n2.value;
					          										}
					          										else{
					          											((Perform_op6Context)_localctx).value =  (int)((Perform_op6Context)_localctx).n1.value % (int)((Perform_op6Context)_localctx).n2.value;
					          										}
					          									}
					          									
					          								 */
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Perform_op7Context extends ParserRuleContext {
		public Object value;
		public Perform_opContext c;
		public Function_callContext n5;
		public Token n1;
		public Token n2;
		public Token n4;
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(LandParser.FLOAT_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(LandParser.INT_LIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public Perform_op7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPerform_op7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPerform_op7(this);
		}
	}

	public final Perform_op7Context perform_op7() throws RecognitionException {
		Perform_op7Context _localctx = new Perform_op7Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_perform_op7);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(OPEN_PARENTHESIS);
				setState(340);
				((Perform_op7Context)_localctx).c = perform_op();
				setState(341);
				match(CLOSE_PARENTHESIS);

													/*((Perform_op7Context)_localctx).value =  ((Perform_op7Context)_localctx).c.value;*/
											    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				((Perform_op7Context)_localctx).n5 = function_call();

											    	
											    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				((Perform_op7Context)_localctx).n1 = match(FLOAT_LIT);

											    	/*((Perform_op7Context)_localctx).value = Float.parseFloat((((Perform_op7Context)_localctx).n1!=null?((Perform_op7Context)_localctx).n1.getText():null));*/
											    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				((Perform_op7Context)_localctx).n2 = match(INT_LIT);

											    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				((Perform_op7Context)_localctx).n4 = match(IDENTIFIER);

											    	/*((Perform_op7Context)_localctx).value =  memory.get((((Perform_op7Context)_localctx).n4!=null?((Perform_op7Context)_localctx).n4.getText():null));*/
											    
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

	public static class Add_subContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(LandParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(LandParser.SUBTRACTION_OPERATOR, 0); }
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Mul_divContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(LandParser.MULTIPLICATION_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(LandParser.DIVISION_OPERATOR, 0); }
		public TerminalNode MODULUS_OPERATOR() { return getToken(LandParser.MODULUS_OPERATOR, 0); }
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitMul_div(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION_OPERATOR) | (1L << DIVISION_OPERATOR) | (1L << MODULUS_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(LandParser.NOT_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(LandParser.EQUAL_TO_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(LandParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(LandParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(LandParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(LandParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Object o;
		public int type;
		public Perform_opContext perform_op;
		public LiteralContext literal;
		public VarContext var;
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				((ExpressionContext)_localctx).perform_op = perform_op();

														/*	((ExpressionContext)_localctx).o = ((ExpressionContext)_localctx).perform_op.value;
															((ExpressionContext)_localctx).type =  1;*/
														
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				((ExpressionContext)_localctx).literal = literal();

															/*((ExpressionContext)_localctx).type =  2;
															((ExpressionContext)_localctx).o =  ((ExpressionContext)_localctx).literal.o;*/
														
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				((ExpressionContext)_localctx).var = var();

															/*((ExpressionContext)_localctx).type = 3;
															((ExpressionContext)_localctx).o =  memory.get(((ExpressionContext)_localctx).var.s);*/
														
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				assignment("unknown type");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class More_expressionsContext extends ParserRuleContext {
		public TerminalNode COMMA_TOKEN() { return getToken(LandParser.COMMA_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public More_expressionsContext more_expressions() {
			return getRuleContext(More_expressionsContext.class,0);
		}
		public More_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterMore_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitMore_expressions(this);
		}
	}

	public final More_expressionsContext more_expressions() throws RecognitionException {
		More_expressionsContext _localctx = new More_expressionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_more_expressions);
		try {
			setState(380);
			switch (_input.LA(1)) {
			case COMMA_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(COMMA_TOKEN);
				setState(376);
				expression();
				setState(377);
				more_expressions();
				}
				break;
			case CLOSE_PARENTHESIS:
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Code_blockContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Assignment_lineContext assignment_line() {
			return getRuleContext(Assignment_lineContext.class,0);
		}
		public Function_call_lineContext function_call_line() {
			return getRuleContext(Function_call_lineContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public WloopContext wloop() {
			return getRuleContext(WloopContext.class,0);
		}
		public FloopContext floop() {
			return getRuleContext(FloopContext.class,0);
		}
		public DloopContext dloop() {
			return getRuleContext(DloopContext.class,0);
		}
		public PrintingContext printing() {
			return getRuleContext(PrintingContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_code_block);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				variable_declaration();
				setState(383);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				function_declaration();
				setState(386);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				assignment_line();
				setState(389);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				function_call_line();
				setState(392);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				conditional();
				setState(395);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(397);
				wloop();
				setState(398);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				floop();
				setState(401);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(403);
				dloop();
				setState(404);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(406);
				printing();
				setState(407);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				System.out.println("CRAPSILON");
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

	public static class PrintingContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public PrintingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterPrinting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitPrinting(this);
		}
	}

	public final PrintingContext printing() throws RecognitionException {
		PrintingContext _localctx = new PrintingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_printing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__0);
			setState(413);
			match(OPEN_PARENTHESIS);
			setState(414);
			((PrintingContext)_localctx).expression = expression();
			setState(415);
			match(CLOSE_PARENTHESIS);
			setState(416);
			match(TERMINATOR_TOKEN);
				/*System.out.println("type: "+((PrintingContext)_localctx).expression.type);
						if(((PrintingContext)_localctx).expression.type == 3){
						System.out.println("FUCKING WEW");
							System.out.println(memory.get((String)((PrintingContext)_localctx).expression.o));
							System.out.println("FUCKING WEW");
						}else if(((PrintingContext)_localctx).expression.type == 2){
							System.out.println(((PrintingContext)_localctx).expression.o);
						}*/
						
					
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

	public static class Return_lineContext extends ParserRuleContext {
		public String s;
		public TerminalNode RETURN_TOKEN() { return getToken(LandParser.RETURN_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public Return_lineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Return_lineContext(ParserRuleContext parent, int invokingState, String s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_return_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).enterReturn_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LandListener ) ((LandListener)listener).exitReturn_line(this);
		}
	}

	public final Return_lineContext return_line(String s) throws RecognitionException {
		Return_lineContext _localctx = new Return_lineContext(_ctx, getState(), s);
		enterRule(_localctx, 82, RULE_return_line);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case RETURN_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(RETURN_TOKEN);
				setState(420);
				expression();
				setState(421);
				match(TERMINATOR_TOKEN);

									 	if(_localctx.s.equals("full")){
									 		//throw exception
									 	}
									 
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return perform_op2_sempred((Perform_op2Context)_localctx, predIndex);
		case 29:
			return perform_op3_sempred((Perform_op3Context)_localctx, predIndex);
		case 30:
			return perform_op4_sempred((Perform_op4Context)_localctx, predIndex);
		case 31:
			return perform_op5_sempred((Perform_op5Context)_localctx, predIndex);
		case 32:
			return perform_op6_sempred((Perform_op6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean perform_op2_sempred(Perform_op2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op3_sempred(Perform_op3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op4_sempred(Perform_op4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op5_sempred(Perform_op5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op6_sempred(Perform_op6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u01ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2_\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3g\n"+
		"\3\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a2\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21"+
		"\u00c2\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cd\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00d6\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u0112\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u011a\n\36\f\36\16"+
		"\36\u011d\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0125\n\37\f\37\16"+
		"\37\u0128\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u0131\n \f \16 \u0134\13 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0143\n!\f!\16!\u0146\13!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0151\n\"\f\"\16\"\u0154\13\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0164\n#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0178\n\'\3(\3(\3("+
		"\3(\3(\5(\u017f\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u019d\n)\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\5+\u01ac\n+\3+\2\7:<>@B,\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\5\3\2\26\27\3\2\30\32"+
		"\3\2 %\u01af\2^\3\2\2\2\4f\3\2\2\2\6l\3\2\2\2\br\3\2\2\2\ny\3\2\2\2\f"+
		"{\3\2\2\2\16\u0083\3\2\2\2\20\u008d\3\2\2\2\22\u0098\3\2\2\2\24\u009a"+
		"\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00aa\3\2\2\2\34\u00af\3"+
		"\2\2\2\36\u00b5\3\2\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$\u00cc\3\2\2\2"+
		"&\u00ce\3\2\2\2(\u00d5\3\2\2\2*\u00d7\3\2\2\2,\u00da\3\2\2\2.\u00dd\3"+
		"\2\2\2\60\u00ee\3\2\2\2\62\u00f0\3\2\2\2\64\u00f8\3\2\2\2\66\u0102\3\2"+
		"\2\28\u0111\3\2\2\2:\u0113\3\2\2\2<\u011e\3\2\2\2>\u0129\3\2\2\2@\u0135"+
		"\3\2\2\2B\u0147\3\2\2\2D\u0163\3\2\2\2F\u0165\3\2\2\2H\u0167\3\2\2\2J"+
		"\u0169\3\2\2\2L\u0177\3\2\2\2N\u017e\3\2\2\2P\u019c\3\2\2\2R\u019e\3\2"+
		"\2\2T\u01ab\3\2\2\2VW\7\t\2\2W_\b\2\1\2XY\7\n\2\2Y_\b\2\1\2Z[\7\13\2\2"+
		"[_\b\2\1\2\\]\7\f\2\2]_\b\2\1\2^V\3\2\2\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2"+
		"\2_\3\3\2\2\2`a\5\6\4\2ab\b\3\1\2bg\3\2\2\2cd\5\b\5\2de\b\3\1\2eg\3\2"+
		"\2\2f`\3\2\2\2fc\3\2\2\2g\5\3\2\2\2hi\7\4\2\2im\b\4\1\2jk\7\5\2\2km\b"+
		"\4\1\2lh\3\2\2\2lj\3\2\2\2m\7\3\2\2\2no\7\6\2\2os\b\5\1\2pq\7\7\2\2qs"+
		"\b\5\1\2rn\3\2\2\2rp\3\2\2\2s\t\3\2\2\2tu\5\2\2\2uv\b\6\1\2vz\3\2\2\2"+
		"wx\7\r\2\2xz\b\6\1\2yt\3\2\2\2yw\3\2\2\2z\13\3\2\2\2{|\7\'\2\2|}\7\b\2"+
		"\2}~\5\4\3\2~\177\7)\2\2\177\r\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0084"+
		"\b\b\1\2\u0082\u0084\5\24\13\2\u0083\u0080\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\17\3\2\2\2\u0085\u0086\5\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088"+
		"\5\22\n\2\u0088\u008e\3\2\2\2\u0089\u008a\5\2\2\2\u008a\u008b\5\26\f\2"+
		"\u008b\u008c\5\22\n\2\u008c\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089"+
		"\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090\7\60\2\2\u0090\u0091\5\16\b\2\u0091"+
		"\u0092\5\22\n\2\u0092\u0099\3\2\2\2\u0093\u0094\7\60\2\2\u0094\u0095\5"+
		"\26\f\2\u0095\u0096\5\22\n\2\u0096\u0099\3\2\2\2\u0097\u0099\7)\2\2\u0098"+
		"\u008f\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099\23\3\2\2"+
		"\2\u009a\u009b\7\b\2\2\u009b\u009c\7.\2\2\u009c\u009d\5L\'\2\u009d\u009e"+
		"\7/\2\2\u009e\25\3\2\2\2\u009f\u00a2\5\32\16\2\u00a0\u00a2\5\30\r\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5\24\13"+
		"\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\5L\'\2\u00a7\u00a8"+
		"\5N(\2\u00a8\u00a9\7-\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\5\16\b\2\u00ab"+
		"\u00ac\7\25\2\2\u00ac\u00ad\5L\'\2\u00ad\u00ae\b\16\1\2\u00ae\33\3\2\2"+
		"\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\5L\'\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00b4\b\17\1\2\u00b4\35\3\2\2\2\u00b5\u00b6\5\n\6"+
		"\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba"+
		"\7+\2\2\u00ba\u00bb\7,\2\2\u00bb\u00bc\5P)\2\u00bc\u00bd\5T+\2\u00bd\u00be"+
		"\7-\2\2\u00be\37\3\2\2\2\u00bf\u00c2\5\"\22\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c4\5\n\6\2"+
		"\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5$\23\2\u00c6#\3\2\2\2\u00c7\u00c8\7"+
		"\60\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\5$\23\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd%\3\2\2\2"+
		"\u00ce\u00cf\7\b\2\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2"+
		"\7+\2\2\u00d2\'\3\2\2\2\u00d3\u00d6\5*\26\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d8\5L\'\2\u00d8"+
		"\u00d9\5N(\2\u00d9+\3\2\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7)\2\2\u00dc"+
		"-\3\2\2\2\u00dd\u00de\7\21\2\2\u00de\u00df\7*\2\2\u00df\u00e0\5L\'\2\u00e0"+
		"\u00e1\7+\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3\5P)\2\u00e3\u00e4\7-\2\2"+
		"\u00e4\u00e5\5\60\31\2\u00e5/\3\2\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00ef"+
		"\5.\30\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\5P)\2\u00eb"+
		"\u00ec\7-\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2"+
		"\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\61\3\2\2\2\u00f0\u00f1"+
		"\7\17\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\5L\'\2\u00f3\u00f4\7+\2\2\u00f4"+
		"\u00f5\7,\2\2\u00f5\u00f6\5P)\2\u00f6\u00f7\7-\2\2\u00f7\63\3\2\2\2\u00f8"+
		"\u00f9\7\20\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fb\5P)\2\u00fb\u00fc\7-\2"+
		"\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\7*\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100"+
		"\7+\2\2\u0100\u0101\7)\2\2\u0101\65\3\2\2\2\u0102\u0103\7\16\2\2\u0103"+
		"\u0104\7*\2\2\u0104\u0105\5L\'\2\u0105\u0106\7)\2\2\u0106\u0107\5L\'\2"+
		"\u0107\u0108\7)\2\2\u0108\u0109\5L\'\2\u0109\u010a\7+\2\2\u010a\u010b"+
		"\7,\2\2\u010b\u010c\5P)\2\u010c\u010d\7-\2\2\u010d\67\3\2\2\2\u010e\u010f"+
		"\7\37\2\2\u010f\u0112\5:\36\2\u0110\u0112\5:\36\2\u0111\u010e\3\2\2\2"+
		"\u0111\u0110\3\2\2\2\u01129\3\2\2\2\u0113\u0114\b\36\1\2\u0114\u0115\5"+
		"<\37\2\u0115\u011b\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\7\36\2\2\u0118"+
		"\u011a\5<\37\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c;\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f"+
		"\b\37\1\2\u011f\u0120\5> \2\u0120\u0126\3\2\2\2\u0121\u0122\f\4\2\2\u0122"+
		"\u0123\7\35\2\2\u0123\u0125\5> \2\u0124\u0121\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127=\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012a\b \1\2\u012a\u012b\5@!\2\u012b\u0132\3\2\2\2\u012c"+
		"\u012d\f\4\2\2\u012d\u012e\5J&\2\u012e\u012f\5@!\2\u012f\u0131\3\2\2\2"+
		"\u0130\u012c\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133?\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b!\1\2\u0136\u0137"+
		"\5B\"\2\u0137\u0138\b!\1\2\u0138\u0144\3\2\2\2\u0139\u013a\f\5\2\2\u013a"+
		"\u013b\5B\"\2\u013b\u013c\b!\1\2\u013c\u0143\3\2\2\2\u013d\u013e\f\4\2"+
		"\2\u013e\u013f\5F$\2\u013f\u0140\5B\"\2\u0140\u0141\b!\1\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013d\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145A\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0147\u0148\b\"\1\2\u0148\u0149\5D#\2\u0149\u014a\b\"\1\2\u014a\u0152"+
		"\3\2\2\2\u014b\u014c\f\4\2\2\u014c\u014d\5H%\2\u014d\u014e\5D#\2\u014e"+
		"\u014f\b\"\1\2\u014f\u0151\3\2\2\2\u0150\u014b\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153C\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0156\7*\2\2\u0156\u0157\58\35\2\u0157\u0158\7+\2\2\u0158"+
		"\u0159\b#\1\2\u0159\u0164\3\2\2\2\u015a\u015b\5&\24\2\u015b\u015c\b#\1"+
		"\2\u015c\u0164\3\2\2\2\u015d\u015e\7\5\2\2\u015e\u0164\b#\1\2\u015f\u0160"+
		"\7\4\2\2\u0160\u0164\b#\1\2\u0161\u0162\7\b\2\2\u0162\u0164\b#\1\2\u0163"+
		"\u0155\3\2\2\2\u0163\u015a\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015f\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164E\3\2\2\2\u0165\u0166\t\2\2\2\u0166G\3\2"+
		"\2\2\u0167\u0168\t\3\2\2\u0168I\3\2\2\2\u0169\u016a\t\4\2\2\u016aK\3\2"+
		"\2\2\u016b\u016c\58\35\2\u016c\u016d\b\'\1\2\u016d\u0178\3\2\2\2\u016e"+
		"\u016f\5\4\3\2\u016f\u0170\b\'\1\2\u0170\u0178\3\2\2\2\u0171\u0178\5&"+
		"\24\2\u0172\u0173\5\16\b\2\u0173\u0174\b\'\1\2\u0174\u0178\3\2\2\2\u0175"+
		"\u0178\5\32\16\2\u0176\u0178\3\2\2\2\u0177\u016b\3\2\2\2\u0177\u016e\3"+
		"\2\2\2\u0177\u0171\3\2\2\2\u0177\u0172\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0178M\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017b\5L\'\2"+
		"\u017b\u017c\5N(\2\u017c\u017f\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0179"+
		"\3\2\2\2\u017e\u017d\3\2\2\2\u017fO\3\2\2\2\u0180\u0181\5\20\t\2\u0181"+
		"\u0182\5P)\2\u0182\u019d\3\2\2\2\u0183\u0184\5\36\20\2\u0184\u0185\5P"+
		")\2\u0185\u019d\3\2\2\2\u0186\u0187\5\34\17\2\u0187\u0188\5P)\2\u0188"+
		"\u019d\3\2\2\2\u0189\u018a\5,\27\2\u018a\u018b\5P)\2\u018b\u019d\3\2\2"+
		"\2\u018c\u018d\5.\30\2\u018d\u018e\5P)\2\u018e\u019d\3\2\2\2\u018f\u0190"+
		"\5\62\32\2\u0190\u0191\5P)\2\u0191\u019d\3\2\2\2\u0192\u0193\5\66\34\2"+
		"\u0193\u0194\5P)\2\u0194\u019d\3\2\2\2\u0195\u0196\5\64\33\2\u0196\u0197"+
		"\5P)\2\u0197\u019d\3\2\2\2\u0198\u0199\5R*\2\u0199\u019a\5P)\2\u019a\u019d"+
		"\3\2\2\2\u019b\u019d\b)\1\2\u019c\u0180\3\2\2\2\u019c\u0183\3\2\2\2\u019c"+
		"\u0186\3\2\2\2\u019c\u0189\3\2\2\2\u019c\u018c\3\2\2\2\u019c\u018f\3\2"+
		"\2\2\u019c\u0192\3\2\2\2\u019c\u0195\3\2\2\2\u019c\u0198\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019dQ\3\2\2\2\u019e\u019f\7\3\2\2\u019f\u01a0\7*\2\2\u01a0"+
		"\u01a1\5L\'\2\u01a1\u01a2\7+\2\2\u01a2\u01a3\7)\2\2\u01a3\u01a4\b*\1\2"+
		"\u01a4S\3\2\2\2\u01a5\u01a6\7\23\2\2\u01a6\u01a7\5L\'\2\u01a7\u01a8\7"+
		")\2\2\u01a8\u01a9\b+\1\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a5\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acU\3\2\2\2\33^flry\u0083\u008d"+
		"\u0098\u00a1\u00c1\u00cc\u00d5\u00ee\u0111\u011b\u0126\u0132\u0142\u0144"+
		"\u0152\u0163\u0177\u017e\u019c\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}