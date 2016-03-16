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
		RULE_perform_op2 = 28, RULE_perform_op3 = 29, RULE_add_sub = 30, RULE_mul_div = 31, 
		RULE_cond_op = 32, RULE_expression = 33, RULE_more_expressions = 34, RULE_code_block = 35, 
		RULE_printing = 36;
	public static final String[] ruleNames = {
		"data_type", "literal", "digit_literal", "characters_literal", "return_type", 
		"constant_declaration", "var", "variable_declaration", "more_variable_declaration", 
		"array", "assignment_declaration", "assignment_array", "assignment", "assignment_line", 
		"function_declaration", "function_declaration_parameters_type", "function_declaration_parameters", 
		"function_declaration_more_parameters", "function_call", "function_call_parameters_type", 
		"function_call_parameters", "function_call_line", "conditional", "conditional_continue", 
		"wloop", "dloop", "floop", "perform_op", "perform_op2", "perform_op3", 
		"add_sub", "mul_div", "cond_op", "expression", "more_expressions", "code_block", 
		"printing"
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
			setState(82);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((Data_typeContext)_localctx).INT_DATA_TYPE = match(INT_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).INT_DATA_TYPE!=null?((Data_typeContext)_localctx).INT_DATA_TYPE.getText():null);
				}
				break;
			case FLOAT_DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((Data_typeContext)_localctx).FLOAT_DATA_TYPE = match(FLOAT_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).FLOAT_DATA_TYPE!=null?((Data_typeContext)_localctx).FLOAT_DATA_TYPE.getText():null);
				}
				break;
			case STRING_DATA_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				((Data_typeContext)_localctx).STRING_DATA_TYPE = match(STRING_DATA_TYPE);
				((Data_typeContext)_localctx).s =  (((Data_typeContext)_localctx).STRING_DATA_TYPE!=null?((Data_typeContext)_localctx).STRING_DATA_TYPE.getText():null);
				}
				break;
			case CHAR_DATA_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
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
			setState(88);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((LiteralContext)_localctx).digit_literal = digit_literal();

															((LiteralContext)_localctx).o =  ((LiteralContext)_localctx).digit_literal.o;
														
				}
				break;
			case STRING_LIT:
			case CHAR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				characters_literal();
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
			setState(94);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((Digit_literalContext)_localctx).INT_LIT = match(INT_LIT);

													((Digit_literalContext)_localctx).o = Integer.parseInt((((Digit_literalContext)_localctx).INT_LIT!=null?((Digit_literalContext)_localctx).INT_LIT.getText():null));
												
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==STRING_LIT || _la==CHAR_LIT) ) {
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

	public static class Return_typeContext extends ParserRuleContext {
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
			setState(100);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				data_type();
				}
				break;
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(VOID_DATA_TYPE);
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
			setState(102);
			match(CONSTANT_TOKEN);
			setState(103);
			match(IDENTIFIER);
			setState(104);
			literal();
			setState(105);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((VarContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VarContext)_localctx).s =  (((VarContext)_localctx).IDENTIFIER!=null?((VarContext)_localctx).IDENTIFIER.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(113);
				var();
				setState(114);
				more_variable_declaration(((Variable_declarationContext)_localctx).data_type.s);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(117);
				assignment_declaration(((Variable_declarationContext)_localctx).data_type.s);
				setState(118);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(COMMA_TOKEN);
				setState(123);
				var();
				setState(124);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(COMMA_TOKEN);
				setState(127);
				assignment_declaration(_localctx.dataType);
				setState(128);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(OPEN_BRACKET);
			setState(135);
			expression();
			setState(136);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				assignment(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
			setState(142);
			array();
			setState(143);
			match(ASSIGNMENT_OPERATOR);
			setState(144);
			match(OPEN_BRACE);
			setState(145);
			expression();
			setState(146);
			more_expressions();
			setState(147);
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
			setState(149);
			((AssignmentContext)_localctx).var = var();
			setState(150);
			match(ASSIGNMENT_OPERATOR);
			setState(151);
			((AssignmentContext)_localctx).expression = expression();

											if(_localctx.dataType.equals("float")){
												//todo if expression instanceof int else throw
												memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("int")){
												memory.put(((AssignmentContext)_localctx).var.s, new Float((float)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("unknown type")){
												if(memory.get(((AssignmentContext)_localctx).var.s)==null){
													/*throw exception*/
												}else{
													if(memory.get(((AssignmentContext)_localctx).var.s) instanceof Integer){
														memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
													}else{
														memory.put(((AssignmentContext)_localctx).var.s, new Float((float)((AssignmentContext)_localctx).expression.o));
													} 
												}
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

	public static class Assignment_lineContext extends ParserRuleContext {
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
			setState(154);
			var();
			setState(155);
			match(ASSIGNMENT_OPERATOR);
			setState(156);
			expression();
			setState(157);
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

	public static class Function_declarationContext extends ParserRuleContext {
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
			setState(159);
			return_type();
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(OPEN_PARENTHESIS);
			setState(162);
			function_declaration_parameters_type();
			setState(163);
			match(CLOSE_PARENTHESIS);
			setState(164);
			match(OPEN_BRACE);
			setState(165);
			code_block();
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
			setState(170);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
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
			setState(172);
			return_type();
			setState(173);
			match(IDENTIFIER);
			setState(174);
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
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
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
			setState(181);
			switch (_input.LA(1)) {
			case COMMA_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(COMMA_TOKEN);
				setState(177);
				function_declaration_parameters();
				setState(178);
				function_declaration_more_parameters();
				}
				break;
			case TERMINATOR_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(TERMINATOR_TOKEN);
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
			setState(183);
			match(IDENTIFIER);
			setState(184);
			match(OPEN_PARENTHESIS);
			setState(185);
			function_call_parameters_type();
			setState(186);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
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
			setState(192);
			expression();
			setState(193);
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
			setState(195);
			function_call();
			setState(196);
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
			setState(198);
			match(IF_TOKEN);
			setState(199);
			match(OPEN_PARENTHESIS);
			setState(200);
			expression();
			setState(201);
			match(CLOSE_PARENTHESIS);
			setState(202);
			match(OPEN_BRACE);
			setState(203);
			code_block();
			setState(204);
			match(CLOSE_BRACE);
			setState(205);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ELSE_TOKEN);
				setState(208);
				conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ELSE_TOKEN);
				setState(210);
				match(OPEN_BRACE);
				setState(211);
				code_block();
				setState(212);
				match(CLOSE_BRACE);
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
			setState(216);
			match(WHILE_TOKEN);
			setState(217);
			match(OPEN_PARENTHESIS);
			setState(218);
			expression();
			setState(219);
			match(CLOSE_PARENTHESIS);
			setState(220);
			match(OPEN_BRACE);
			setState(221);
			code_block();
			setState(222);
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
			setState(224);
			match(DO_TOKEN);
			setState(225);
			match(OPEN_BRACE);
			setState(226);
			code_block();
			setState(227);
			match(CLOSE_BRACE);
			setState(228);
			match(WHILE_TOKEN);
			setState(229);
			match(OPEN_PARENTHESIS);
			setState(230);
			expression();
			setState(231);
			match(CLOSE_PARENTHESIS);
			setState(232);
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
			setState(234);
			match(FOR_TOKEN);
			setState(235);
			match(OPEN_PARENTHESIS);
			setState(236);
			expression();
			setState(237);
			match(TERMINATOR_TOKEN);
			setState(238);
			expression();
			setState(239);
			match(TERMINATOR_TOKEN);
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

	public static class Perform_opContext extends ParserRuleContext {
		public int value;
		public Perform_opContext n1;
		public Perform_op2Context n;
		public Perform_op2Context n2;
		public Add_subContext op;
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
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
		return perform_op(0);
	}

	private Perform_opContext perform_op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perform_opContext _localctx = new Perform_opContext(_ctx, _parentState);
		Perform_opContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_perform_op, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			((Perform_opContext)_localctx).n = perform_op2(0);
			((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Perform_opContext(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
						setState(250);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(251);
						((Perform_opContext)_localctx).n2 = perform_op2(0);
						 
						          								if((((Perform_opContext)_localctx).n2!=null?_input.getText(((Perform_opContext)_localctx).n2.start,((Perform_opContext)_localctx).n2.stop):null).startsWith("+") || (((Perform_opContext)_localctx).n2!=null?_input.getText(((Perform_opContext)_localctx).n2.start,((Perform_opContext)_localctx).n2.stop):null).startsWith("-"))
						          								{
						          									((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value + ((Perform_opContext)_localctx).n2.value;
						          									if(((Perform_opContext)_localctx).n1.value > 0 && ((Perform_opContext)_localctx).n2.value > 0 && _localctx.value < 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}
						          									if(((Perform_opContext)_localctx).n1.value < 0 && ((Perform_opContext)_localctx).n2.value < 0 && _localctx.value > 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}
						          								} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
						          							   
						}
						break;
					case 2:
						{
						_localctx = new Perform_opContext(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
						setState(254);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(255);
						((Perform_opContext)_localctx).op = add_sub();
						setState(256);
						((Perform_opContext)_localctx).n2 = perform_op2(0);

						          							 		if((((Perform_opContext)_localctx).op!=null?_input.getText(((Perform_opContext)_localctx).op.start,((Perform_opContext)_localctx).op.stop):null).equalsIgnoreCase("+")){
						          										((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value + ((Perform_opContext)_localctx).n2.value;
						          										if(((Perform_opContext)_localctx).n1.value > 0 && ((Perform_opContext)_localctx).n2.value > 0 && _localctx.value < 0){
						          											throw new ArithmeticException("Value out of range for integer");
						          										}
						          										if(((Perform_opContext)_localctx).n1.value < 0 && ((Perform_opContext)_localctx).n2.value < 0 && _localctx.value > 0){
						          											throw new ArithmeticException("Value out of range for integer");
						          										}
						          										} else{
						          										if(((Perform_opContext)_localctx).n1.value < ((Perform_opContext)_localctx).n2.value && ((Perform_opContext)_localctx).n2.value > 0 && _localctx.value > 0){
						          											throw new ArithmeticException("Value out of range for integer");
						          										}
						          											((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value - ((Perform_opContext)_localctx).n2.value;
						          										}
						          									
						          							 	
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Perform_op2Context extends ParserRuleContext {
		public int value;
		public Perform_op2Context n1;
		public Perform_op3Context w;
		public Mul_divContext op;
		public Perform_op3Context n2;
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
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
			setState(265);
			((Perform_op2Context)_localctx).w = perform_op3();

													((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).w.value;
												
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op2Context(_parentctx, _parentState);
					_localctx.n1 = _prevctx;
					_localctx.n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op2);
					setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					((Perform_op2Context)_localctx).op = mul_div();
					setState(270);
					((Perform_op2Context)_localctx).n2 = perform_op3();

					          									if((((Perform_op2Context)_localctx).op!=null?_input.getText(((Perform_op2Context)_localctx).op.start,((Perform_op2Context)_localctx).op.stop):null).equalsIgnoreCase("*")){
					          										((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n1.value * ((Perform_op2Context)_localctx).n2.value;
					          										if(((Perform_op2Context)_localctx).n1.value > 0 && ((Perform_op2Context)_localctx).n2.value > 0 && _localctx.value < 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op2Context)_localctx).n1.value < 0 && ((Perform_op2Context)_localctx).n2.value < 0 && _localctx.value < 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op2Context)_localctx).n1.value > 0 && ((Perform_op2Context)_localctx).n2.value < 0 && _localctx.value > 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          										if(((Perform_op2Context)_localctx).n1.value < 0 && ((Perform_op2Context)_localctx).n2.value > 0 && _localctx.value > 0){
					          											throw new ArithmeticException("Value out of range for integer");
					          										}
					          									} else if((((Perform_op2Context)_localctx).op!=null?_input.getText(((Perform_op2Context)_localctx).op.start,((Perform_op2Context)_localctx).op.stop):null).equalsIgnoreCase("/")){
					          											((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n1.value / ((Perform_op2Context)_localctx).n2.value;
					          									} else {
					          										((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n1.value % ((Perform_op2Context)_localctx).n2.value;
					          									}
					          									
					          								
					}
					} 
				}
				setState(277);
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
		public int value;
		public Perform_opContext c;
		public Token n;
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public TerminalNode INT_LIT() { return getToken(LandParser.INT_LIT, 0); }
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
		Perform_op3Context _localctx = new Perform_op3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_perform_op3);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(OPEN_PARENTHESIS);
				setState(279);
				((Perform_op3Context)_localctx).c = perform_op(0);
				setState(280);
				match(CLOSE_PARENTHESIS);

													((Perform_op3Context)_localctx).value =  ((Perform_op3Context)_localctx).c.value;
											    
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Perform_op3Context)_localctx).n = match(INT_LIT);

											    	((Perform_op3Context)_localctx).value = Integer.parseInt((((Perform_op3Context)_localctx).n!=null?((Perform_op3Context)_localctx).n.getText():null));
											    
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
		enterRule(_localctx, 60, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 62, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 64, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public Token IDENTIFIER;
		public LiteralContext literal;
		public Perform_opContext perform_op;
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
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
		enterRule(_localctx, 66, RULE_expression);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				((ExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);

																((ExpressionContext)_localctx).type = 1;
																((ExpressionContext)_localctx).o =  (((ExpressionContext)_localctx).IDENTIFIER!=null?((ExpressionContext)_localctx).IDENTIFIER.getText():null);
															
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((ExpressionContext)_localctx).literal = literal();

																((ExpressionContext)_localctx).type =  2;
																((ExpressionContext)_localctx).o =  ((ExpressionContext)_localctx).literal.o;
															
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				((ExpressionContext)_localctx).perform_op = perform_op(0);

																((ExpressionContext)_localctx).o = ((ExpressionContext)_localctx).perform_op.value;
																((ExpressionContext)_localctx).type =  3;
															
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
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
		enterRule(_localctx, 68, RULE_more_expressions);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case COMMA_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(COMMA_TOKEN);
				setState(307);
				expression();
				setState(308);
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
		enterRule(_localctx, 70, RULE_code_block);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				variable_declaration();
				setState(314);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				function_declaration();
				setState(317);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				assignment_line();
				setState(320);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				function_call_line();
				setState(323);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				conditional();
				setState(326);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				wloop();
				setState(329);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				floop();
				setState(332);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				dloop();
				setState(335);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(337);
				printing();
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
		enterRule(_localctx, 72, RULE_printing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__0);
			setState(342);
			match(OPEN_PARENTHESIS);
			setState(343);
			((PrintingContext)_localctx).expression = expression();
			setState(344);
			match(CLOSE_PARENTHESIS);
			setState(345);
			match(TERMINATOR_TOKEN);
				if(((PrintingContext)_localctx).expression.type == 1){
							System.out.println(memory.get((String)((PrintingContext)_localctx).expression.o));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return perform_op_sempred((Perform_opContext)_localctx, predIndex);
		case 28:
			return perform_op2_sempred((Perform_op2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean perform_op_sempred(Perform_opContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op2_sempred(Perform_op2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u015f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2U\n\2\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\6"+
		"\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00ad\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\5\25\u00c1\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00d9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0106\n\35\f\35\16\35\u0109\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0114\n\36\f\36\16\36\u0117\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0120\n\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0133\n#\3$\3$\3$\3$\3$\5$\u013a"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u0156\n%\3&\3&\3&\3&\3&\3&\3&\3&\2\48:\'\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2\6\7\3"+
		"\2\26\27\3\2\30\32\3\2 %\u015b\2T\3\2\2\2\4Z\3\2\2\2\6`\3\2\2\2\bb\3\2"+
		"\2\2\nf\3\2\2\2\fh\3\2\2\2\16p\3\2\2\2\20z\3\2\2\2\22\u0085\3\2\2\2\24"+
		"\u0087\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0097\3\2\2\2\34\u009c"+
		"\3\2\2\2\36\u00a1\3\2\2\2 \u00ac\3\2\2\2\"\u00ae\3\2\2\2$\u00b7\3\2\2"+
		"\2&\u00b9\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\u00c5\3\2\2\2.\u00c8"+
		"\3\2\2\2\60\u00d8\3\2\2\2\62\u00da\3\2\2\2\64\u00e2\3\2\2\2\66\u00ec\3"+
		"\2\2\28\u00f8\3\2\2\2:\u010a\3\2\2\2<\u011f\3\2\2\2>\u0121\3\2\2\2@\u0123"+
		"\3\2\2\2B\u0125\3\2\2\2D\u0132\3\2\2\2F\u0139\3\2\2\2H\u0155\3\2\2\2J"+
		"\u0157\3\2\2\2LM\7\t\2\2MU\b\2\1\2NO\7\n\2\2OU\b\2\1\2PQ\7\13\2\2QU\b"+
		"\2\1\2RS\7\f\2\2SU\b\2\1\2TL\3\2\2\2TN\3\2\2\2TP\3\2\2\2TR\3\2\2\2U\3"+
		"\3\2\2\2VW\5\6\4\2WX\b\3\1\2X[\3\2\2\2Y[\5\b\5\2ZV\3\2\2\2ZY\3\2\2\2["+
		"\5\3\2\2\2\\]\7\4\2\2]a\b\4\1\2^_\7\5\2\2_a\b\4\1\2`\\\3\2\2\2`^\3\2\2"+
		"\2a\7\3\2\2\2bc\t\2\2\2c\t\3\2\2\2dg\5\2\2\2eg\7\r\2\2fd\3\2\2\2fe\3\2"+
		"\2\2g\13\3\2\2\2hi\7\'\2\2ij\7\b\2\2jk\5\4\3\2kl\7)\2\2l\r\3\2\2\2mn\7"+
		"\b\2\2nq\b\b\1\2oq\5\24\13\2pm\3\2\2\2po\3\2\2\2q\17\3\2\2\2rs\5\2\2\2"+
		"st\5\16\b\2tu\5\22\n\2u{\3\2\2\2vw\5\2\2\2wx\5\26\f\2xy\5\22\n\2y{\3\2"+
		"\2\2zr\3\2\2\2zv\3\2\2\2{\21\3\2\2\2|}\7\60\2\2}~\5\16\b\2~\177\5\22\n"+
		"\2\177\u0086\3\2\2\2\u0080\u0081\7\60\2\2\u0081\u0082\5\26\f\2\u0082\u0083"+
		"\5\22\n\2\u0083\u0086\3\2\2\2\u0084\u0086\7)\2\2\u0085|\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0084\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\7\b\2"+
		"\2\u0088\u0089\7.\2\2\u0089\u008a\5D#\2\u008a\u008b\7/\2\2\u008b\25\3"+
		"\2\2\2\u008c\u008f\5\32\16\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\5\24\13\2\u0091\u0092"+
		"\7\25\2\2\u0092\u0093\7,\2\2\u0093\u0094\5D#\2\u0094\u0095\5F$\2\u0095"+
		"\u0096\7-\2\2\u0096\31\3\2\2\2\u0097\u0098\5\16\b\2\u0098\u0099\7\25\2"+
		"\2\u0099\u009a\5D#\2\u009a\u009b\b\16\1\2\u009b\33\3\2\2\2\u009c\u009d"+
		"\5\16\b\2\u009d\u009e\7\25\2\2\u009e\u009f\5D#\2\u009f\u00a0\7)\2\2\u00a0"+
		"\35\3\2\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\7*\2\2"+
		"\u00a4\u00a5\5 \21\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8"+
		"\5H%\2\u00a8\u00a9\7-\2\2\u00a9\37\3\2\2\2\u00aa\u00ad\5\"\22\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad!\3\2\2\2"+
		"\u00ae\u00af\5\n\6\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\5$\23\2\u00b1#\3"+
		"\2\2\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\5$\23\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b8\7)\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\7*\2\2\u00bb\u00bc"+
		"\5(\25\2\u00bc\u00bd\7+\2\2\u00bd\'\3\2\2\2\u00be\u00c1\5*\26\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1)\3\2\2\2"+
		"\u00c2\u00c3\5D#\2\u00c3\u00c4\5F$\2\u00c4+\3\2\2\2\u00c5\u00c6\5&\24"+
		"\2\u00c6\u00c7\7)\2\2\u00c7-\3\2\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca"+
		"\7*\2\2\u00ca\u00cb\5D#\2\u00cb\u00cc\7+\2\2\u00cc\u00cd\7,\2\2\u00cd"+
		"\u00ce\5H%\2\u00ce\u00cf\7-\2\2\u00cf\u00d0\5\60\31\2\u00d0/\3\2\2\2\u00d1"+
		"\u00d2\7\22\2\2\u00d2\u00d9\5.\30\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\7"+
		",\2\2\u00d5\u00d6\5H%\2\u00d6\u00d7\7-\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d1"+
		"\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\61\3\2\2\2\u00da\u00db\7\17\2\2\u00db"+
		"\u00dc\7*\2\2\u00dc\u00dd\5D#\2\u00dd\u00de\7+\2\2\u00de\u00df\7,\2\2"+
		"\u00df\u00e0\5H%\2\u00e0\u00e1\7-\2\2\u00e1\63\3\2\2\2\u00e2\u00e3\7\20"+
		"\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\5H%\2\u00e5\u00e6\7-\2\2\u00e6\u00e7"+
		"\7\17\2\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\5D#\2\u00e9\u00ea\7+\2\2\u00ea"+
		"\u00eb\7)\2\2\u00eb\65\3\2\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7*\2\2"+
		"\u00ee\u00ef\5D#\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\5D#\2\u00f1\u00f2\7"+
		")\2\2\u00f2\u00f3\5D#\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f6"+
		"\5H%\2\u00f6\u00f7\7-\2\2\u00f7\67\3\2\2\2\u00f8\u00f9\b\35\1\2\u00f9"+
		"\u00fa\5:\36\2\u00fa\u00fb\b\35\1\2\u00fb\u0107\3\2\2\2\u00fc\u00fd\f"+
		"\5\2\2\u00fd\u00fe\5:\36\2\u00fe\u00ff\b\35\1\2\u00ff\u0106\3\2\2\2\u0100"+
		"\u0101\f\4\2\2\u0101\u0102\5> \2\u0102\u0103\5:\36\2\u0103\u0104\b\35"+
		"\1\2\u0104\u0106\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u01089\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u010a\u010b\b\36\1\2\u010b\u010c\5<\37\2\u010c\u010d"+
		"\b\36\1\2\u010d\u0115\3\2\2\2\u010e\u010f\f\4\2\2\u010f\u0110\5@!\2\u0110"+
		"\u0111\5<\37\2\u0111\u0112\b\36\1\2\u0112\u0114\3\2\2\2\u0113\u010e\3"+
		"\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		";\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a\58\35\2\u011a"+
		"\u011b\7+\2\2\u011b\u011c\b\37\1\2\u011c\u0120\3\2\2\2\u011d\u011e\7\4"+
		"\2\2\u011e\u0120\b\37\1\2\u011f\u0118\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"=\3\2\2\2\u0121\u0122\t\3\2\2\u0122?\3\2\2\2\u0123\u0124\t\4\2\2\u0124"+
		"A\3\2\2\2\u0125\u0126\t\5\2\2\u0126C\3\2\2\2\u0127\u0128\7\b\2\2\u0128"+
		"\u0133\b#\1\2\u0129\u012a\5\4\3\2\u012a\u012b\b#\1\2\u012b\u0133\3\2\2"+
		"\2\u012c\u0133\5&\24\2\u012d\u012e\58\35\2\u012e\u012f\b#\1\2\u012f\u0133"+
		"\3\2\2\2\u0130\u0133\5\32\16\2\u0131\u0133\3\2\2\2\u0132\u0127\3\2\2\2"+
		"\u0132\u0129\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133E\3\2\2\2\u0134\u0135\7\60\2\2\u0135"+
		"\u0136\5D#\2\u0136\u0137\5F$\2\u0137\u013a\3\2\2\2\u0138\u013a\3\2\2\2"+
		"\u0139\u0134\3\2\2\2\u0139\u0138\3\2\2\2\u013aG\3\2\2\2\u013b\u013c\5"+
		"\20\t\2\u013c\u013d\5H%\2\u013d\u0156\3\2\2\2\u013e\u013f\5\36\20\2\u013f"+
		"\u0140\5H%\2\u0140\u0156\3\2\2\2\u0141\u0142\5\34\17\2\u0142\u0143\5H"+
		"%\2\u0143\u0156\3\2\2\2\u0144\u0145\5,\27\2\u0145\u0146\5H%\2\u0146\u0156"+
		"\3\2\2\2\u0147\u0148\5.\30\2\u0148\u0149\5H%\2\u0149\u0156\3\2\2\2\u014a"+
		"\u014b\5\62\32\2\u014b\u014c\5H%\2\u014c\u0156\3\2\2\2\u014d\u014e\5\66"+
		"\34\2\u014e\u014f\5H%\2\u014f\u0156\3\2\2\2\u0150\u0151\5\64\33\2\u0151"+
		"\u0152\5H%\2\u0152\u0156\3\2\2\2\u0153\u0156\5J&\2\u0154\u0156\b%\1\2"+
		"\u0155\u013b\3\2\2\2\u0155\u013e\3\2\2\2\u0155\u0141\3\2\2\2\u0155\u0144"+
		"\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u014d\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156I\3\2\2\2"+
		"\u0157\u0158\7\3\2\2\u0158\u0159\7*\2\2\u0159\u015a\5D#\2\u015a\u015b"+
		"\7+\2\2\u015b\u015c\7)\2\2\u015c\u015d\b&\1\2\u015dK\3\2\2\2\25TZ`fpz"+
		"\u0085\u008e\u00ac\u00b7\u00c0\u00d8\u0105\u0107\u0115\u011f\u0132\u0139"+
		"\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}