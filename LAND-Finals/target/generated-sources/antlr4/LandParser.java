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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitDigit_literal(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCharacters_literal(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
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
		public VarContext var;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(132);
				((Variable_declarationContext)_localctx).var = var();
				setState(133);
				more_variable_declaration(((Variable_declarationContext)_localctx).data_type.s);

										if(((Variable_declarationContext)_localctx).data_type.s.equals("float")){
											//todo if expression instanceof int else throw
											memory.put(((Variable_declarationContext)_localctx).var.s, new Integer(0));
										}else if(((Variable_declarationContext)_localctx).data_type.s.equals("int")){
											memory.put(((Variable_declarationContext)_localctx).var.s, new Float(0));
										}else if(((Variable_declarationContext)_localctx).data_type.s.equals("char")){
											memory.put(((Variable_declarationContext)_localctx).var.s, new String(""));
										}else if(((Variable_declarationContext)_localctx).data_type.s.equals("string")){
											memory.put(((Variable_declarationContext)_localctx).var.s, new Character('\0'));
										}
									
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((Variable_declarationContext)_localctx).data_type = data_type();
				setState(137);
				assignment_declaration(((Variable_declarationContext)_localctx).data_type.s);
				setState(138);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMore_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_variable_declarationContext more_variable_declaration(String dataType) throws RecognitionException {
		More_variable_declarationContext _localctx = new More_variable_declarationContext(_ctx, getState(), dataType);
		enterRule(_localctx, 16, RULE_more_variable_declaration);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(COMMA_TOKEN);
				setState(143);
				var();
				setState(144);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(COMMA_TOKEN);
				setState(147);
				assignment_declaration(_localctx.dataType);
				setState(148);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IDENTIFIER);
			setState(154);
			match(OPEN_BRACKET);
			setState(155);
			expression();
			setState(156);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitAssignment_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_declarationContext assignment_declaration(String dataType) throws RecognitionException {
		Assignment_declarationContext _localctx = new Assignment_declarationContext(_ctx, getState(), dataType);
		enterRule(_localctx, 20, RULE_assignment_declaration);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				assignment(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitAssignment_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_arrayContext assignment_array() throws RecognitionException {
		Assignment_arrayContext _localctx = new Assignment_arrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			array();
			setState(163);
			match(ASSIGNMENT_OPERATOR);
			setState(164);
			match(OPEN_BRACE);
			setState(165);
			expression();
			setState(166);
			more_expressions();
			setState(167);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment(String dataType) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), dataType);
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((AssignmentContext)_localctx).var = var();
			setState(170);
			match(ASSIGNMENT_OPERATOR);
			setState(171);
			((AssignmentContext)_localctx).expression = expression();

											if(_localctx.dataType.equals("float")){
												//todo if expression instanceof int else throw
												if(!(((AssignmentContext)_localctx).expression.o instanceof Integer))
													throw new RuntimeException("expression not a float");
												memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("int")){
												if(!(((AssignmentContext)_localctx).expression.o instanceof Float))
													throw new RuntimeException("expression not an integer");
												memory.put(((AssignmentContext)_localctx).var.s, new Float((float)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("char")){
												memory.put(((AssignmentContext)_localctx).var.s, new String((String)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("string")){
												memory.put(((AssignmentContext)_localctx).var.s, new Character((char)((AssignmentContext)_localctx).expression.o));
											}else if(_localctx.dataType.equals("unknown type")){
												if(memory.get(((AssignmentContext)_localctx).var.s)==null){
												}else{
													if(memory.get(((AssignmentContext)_localctx).var.s) instanceof Integer){
														System.out.println("ASSIGNING INT");
														memory.put(((AssignmentContext)_localctx).var.s, new Integer((int)((AssignmentContext)_localctx).expression.o));
													}else{
														System.out.println("ASSIGNING FLOAT");
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public Assignment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitAssignment_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_lineContext assignment_line() throws RecognitionException {
		Assignment_lineContext _localctx = new Assignment_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			assignment("unknown type");
			setState(175);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((Function_declarationContext)_localctx).return_type = return_type();
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(OPEN_PARENTHESIS);
			setState(180);
			function_declaration_parameters_type();
			setState(181);
			match(CLOSE_PARENTHESIS);
			setState(182);
			match(OPEN_BRACE);
			setState(183);
			code_block();
			setState(184);
			return_line(((Function_declarationContext)_localctx).return_type.returnType);
			setState(185);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_declaration_parameters_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_parameters_typeContext function_declaration_parameters_type() throws RecognitionException {
		Function_declaration_parameters_typeContext _localctx = new Function_declaration_parameters_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_declaration_parameters_type);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_declaration_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_parametersContext function_declaration_parameters() throws RecognitionException {
		Function_declaration_parametersContext _localctx = new Function_declaration_parametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_declaration_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			return_type();
			setState(192);
			match(IDENTIFIER);
			setState(193);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_declaration_more_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_more_parametersContext function_declaration_more_parameters() throws RecognitionException {
		Function_declaration_more_parametersContext _localctx = new Function_declaration_more_parametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_declaration_more_parameters);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(COMMA_TOKEN);
				setState(196);
				function_declaration_parameters();
				setState(197);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(OPEN_PARENTHESIS);
			setState(204);
			function_call_parameters_type();
			setState(205);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_call_parameters_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_parameters_typeContext function_call_parameters_type() throws RecognitionException {
		Function_call_parameters_typeContext _localctx = new Function_call_parameters_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call_parameters_type);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_call_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_parametersContext function_call_parameters() throws RecognitionException {
		Function_call_parametersContext _localctx = new Function_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expression();
			setState(212);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFunction_call_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_lineContext function_call_line() throws RecognitionException {
		Function_call_lineContext _localctx = new Function_call_lineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			function_call();
			setState(215);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IF_TOKEN);
			setState(218);
			match(OPEN_PARENTHESIS);
			setState(219);
			expression();
			setState(220);
			match(CLOSE_PARENTHESIS);
			setState(221);
			match(OPEN_BRACE);
			setState(222);
			code_block();
			setState(223);
			match(CLOSE_BRACE);
			setState(224);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitConditional_continue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_continueContext conditional_continue() throws RecognitionException {
		Conditional_continueContext _localctx = new Conditional_continueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional_continue);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ELSE_TOKEN);
				setState(227);
				conditional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(ELSE_TOKEN);
				setState(229);
				match(OPEN_BRACE);
				setState(230);
				code_block();
				setState(231);
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
		public ExpressionContext e1;
		public TerminalNode WHILE_TOKEN() { return getToken(LandParser.WHILE_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(LandParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wloop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitWloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WloopContext wloop() throws RecognitionException {
		WloopContext _localctx = new WloopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wloop);

		        int mark;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WHILE_TOKEN);
			setState(237);
			match(OPEN_PARENTHESIS);
			setState(238);
			((WloopContext)_localctx).e1 = expression();
			setState(239);
			match(CLOSE_PARENTHESIS);
			setState(240);
			match(OPEN_BRACE);
			mark = _input.index();
			setState(242);
			code_block();

			        if ((boolean)((WloopContext)_localctx).e1.o) {
			        	System.out.println("FUCK FUCK FUCK: "+mark);
			            _input.seek(mark);
			        }else{
			        	_input.release(mark);
			        }
			    
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitDloop(this);
			else return visitor.visitChildren(this);
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
		public ExpressionContext n1;
		public ExpressionContext e1;
		public TerminalNode FOR_TOKEN() { return getToken(LandParser.FOR_TOKEN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(LandParser.OPEN_PARENTHESIS, 0); }
		public List<TerminalNode> TERMINATOR_TOKEN() { return getTokens(LandParser.TERMINATOR_TOKEN); }
		public TerminalNode TERMINATOR_TOKEN(int i) {
			return getToken(LandParser.TERMINATOR_TOKEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloopContext floop() throws RecognitionException {
		FloopContext _localctx = new FloopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floop);

		        String c = "";
		        int mark = _input.mark();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FOR_TOKEN);
			setState(257);
			match(OPEN_PARENTHESIS);
			setState(258);
			((FloopContext)_localctx).n1 = expression();
			setState(259);
			match(TERMINATOR_TOKEN);
			setState(260);
			((FloopContext)_localctx).e1 = expression();
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

			        if ((boolean)((FloopContext)_localctx).e1.o) {
			            _input.seek(mark);
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
		public Perform_op2Context n3;
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public TerminalNode OR_OPERATOR() { return getToken(LandParser.OR_OPERATOR, 0); }
		public Perform_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op(this);
			else return visitor.visitChildren(this);
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
			setState(270);
			((Perform_opContext)_localctx).n3 = perform_op2(0);
			((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n3.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_opContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					match(OR_OPERATOR);
					setState(275);
					perform_op2(0);
					}
					} 
				}
				setState(280);
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
		public Object value;
		public Perform_op3Context n3;
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public TerminalNode AND_OPERATOR() { return getToken(LandParser.AND_OPERATOR, 0); }
		public Perform_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op2(this);
			else return visitor.visitChildren(this);
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
			setState(282);
			((Perform_op2Context)_localctx).n3 = perform_op3();
			((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n3.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
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
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					match(AND_OPERATOR);
					setState(287);
					perform_op3();
					}
					} 
				}
				setState(292);
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
		public Perform_op4Context n3;
		public TerminalNode NOT_OPERATOR() { return getToken(LandParser.NOT_OPERATOR, 0); }
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public Perform_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_op3Context perform_op3() throws RecognitionException {
		Perform_op3Context _localctx = new Perform_op3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_perform_op3);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case NOT_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(NOT_OPERATOR);
				setState(294);
				perform_op3();
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
			case IDENTIFIER:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((Perform_op3Context)_localctx).n3 = perform_op4(0);
				((Perform_op3Context)_localctx).value =  ((Perform_op3Context)_localctx).n3.value; 
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

	public static class Perform_op4Context extends ParserRuleContext {
		public Object value;
		public Perform_op4Context n1;
		public Perform_op5Context n3;
		public Cond_opContext cond_op;
		public Perform_op5Context n2;
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public Perform_op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op4(this);
			else return visitor.visitChildren(this);
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
			setState(301);
			((Perform_op4Context)_localctx).n3 = perform_op5(0);
			((Perform_op4Context)_localctx).value =  ((Perform_op4Context)_localctx).n3.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_op4Context(_parentctx, _parentState);
					_localctx.n1 = _prevctx;
					_localctx.n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op4);
					setState(304);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(305);
					((Perform_op4Context)_localctx).cond_op = cond_op();
					setState(306);
					((Perform_op4Context)_localctx).n2 = perform_op5(0);

					          										float v1, v2;
					          										if(((Perform_op4Context)_localctx).n1.value instanceof Float){
					          											v1 = (float) ((Perform_op4Context)_localctx).n1.value;
					          										}else{
					          											v1 = 1.0f * (int) ((Perform_op4Context)_localctx).n1.value;
					          										}
					          										if(((Perform_op4Context)_localctx).n2.value instanceof Float){
					          											v2 = (float) ((Perform_op4Context)_localctx).n2.value;
					          										}else{
					          											v2 = 1.0f * (int) ((Perform_op4Context)_localctx).n2.value;
					          										}
					          											
					          										if((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals("::")){
					          											if(v1 != v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										} 
					          										else if((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals(";:")){
					          											if(v1 == v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										}
					          										else if((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals(":<")){
					          											if(v1 > v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										}
					          										else if((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals(":>")){
					          											if(v1 < v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										}
					          										else if((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals("<")){
					          											if(v1 >= v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										}
					          										else if ((((Perform_op4Context)_localctx).cond_op!=null?_input.getText(((Perform_op4Context)_localctx).cond_op.start,((Perform_op4Context)_localctx).cond_op.stop):null).equals(">")){
					          											if(v1 <= v2)
					          												((Perform_op4Context)_localctx).value =  true;
					          											else
					          												((Perform_op4Context)_localctx).value =  false;
					          										}
					          									
					}
					} 
				}
				setState(313);
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
		public Perform_op6Context n3;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op5(this);
			else return visitor.visitChildren(this);
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
			setState(315);
			((Perform_op5Context)_localctx).n3 = perform_op6(0);
			((Perform_op5Context)_localctx).value =  ((Perform_op5Context)_localctx).n3.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Perform_op5Context(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						((Perform_op5Context)_localctx).n2 = perform_op6(0);
						 
						          								if((((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null).startsWith("+") || (((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null).startsWith("-"))
						          								{
						          									if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float)
						          										((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value + (float)((Perform_op5Context)_localctx).n2.value;
						          									else{
						          										System.out.println(((Perform_op5Context)_localctx).n1.value+" "+((Perform_op5Context)_localctx).n2.value);
						          										((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;
						          										
						          									}
						          									/*if(((Perform_op5Context)_localctx).n1.value > 0 && ((Perform_op5Context)_localctx).n2.value > 0 && _localctx.value < 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}else{
						          										((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;
						          									}
						          									if(((Perform_op5Context)_localctx).n1.value < 0 && ((Perform_op5Context)_localctx).n2.value < 0 && _localctx.value > 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}*/
						          								} else throw new RuntimeException("Syntax Error! Unable to compute for the answer.\n");
						          							   
						}
						break;
					case 2:
						{
						_localctx = new Perform_op5Context(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						((Perform_op5Context)_localctx).op = add_sub();
						setState(324);
						((Perform_op5Context)_localctx).n2 = perform_op6(0);

						          							 		System.out.println((((Perform_op5Context)_localctx).n1!=null?_input.getText(((Perform_op5Context)_localctx).n1.start,((Perform_op5Context)_localctx).n1.stop):null)+" WENT HERE +++--- "+(((Perform_op5Context)_localctx).n2!=null?_input.getText(((Perform_op5Context)_localctx).n2.start,((Perform_op5Context)_localctx).n2.stop):null));
						          							 		if((((Perform_op5Context)_localctx).op!=null?_input.getText(((Perform_op5Context)_localctx).op.start,((Perform_op5Context)_localctx).op.stop):null).equalsIgnoreCase("+")){
						          							 			if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float){
						          											((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value + (float)((Perform_op5Context)_localctx).n2.value;
						          											
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
						          											
						          										}else{
						          											System.out.println(((Perform_op5Context)_localctx).n1.value+" "+((Perform_op5Context)_localctx).n2.value);
						          											((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value + (int)((Perform_op5Context)_localctx).n2.value;
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
						          											
						          									 }
						          									}else{
						          										if(((Perform_op5Context)_localctx).n1.value instanceof Float || ((Perform_op5Context)_localctx).n2.value instanceof Float){
						          											((Perform_op5Context)_localctx).value =  (float)((Perform_op5Context)_localctx).n1.value - (float)((Perform_op5Context)_localctx).n2.value;
						          										}else{
						          											((Perform_op5Context)_localctx).value =  (int)((Perform_op5Context)_localctx).n1.value - (int)((Perform_op5Context)_localctx).n2.value;
						          										}
						          									}
						          									
						          							 	
						}
						break;
					}
					} 
				}
				setState(331);
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
		public Perform_op7Context n3;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op6(this);
			else return visitor.visitChildren(this);
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
			setState(333);
			((Perform_op6Context)_localctx).n3 = perform_op7();
			((Perform_op6Context)_localctx).value =  ((Perform_op6Context)_localctx).n3.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
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
					setState(336);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(337);
					((Perform_op6Context)_localctx).op = mul_div();
					setState(338);
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
				setState(345);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerform_op7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_op7Context perform_op7() throws RecognitionException {
		Perform_op7Context _localctx = new Perform_op7Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_perform_op7);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(OPEN_PARENTHESIS);
				setState(347);
				((Perform_op7Context)_localctx).c = perform_op(0);
				setState(348);
				match(CLOSE_PARENTHESIS);

													/*((Perform_op7Context)_localctx).value =  ((Perform_op7Context)_localctx).c.value;*/
											    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				((Perform_op7Context)_localctx).n5 = function_call();

											    	
											    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				((Perform_op7Context)_localctx).n1 = match(FLOAT_LIT);

											    	((Perform_op7Context)_localctx).value = Float.parseFloat((((Perform_op7Context)_localctx).n1!=null?((Perform_op7Context)_localctx).n1.getText():null));
											    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				((Perform_op7Context)_localctx).n2 = match(INT_LIT);

											    	((Perform_op7Context)_localctx).value = Integer.parseInt((((Perform_op7Context)_localctx).n2!=null?((Perform_op7Context)_localctx).n2.getText():null));
											    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				((Perform_op7Context)_localctx).n4 = match(IDENTIFIER);

											    	((Perform_op7Context)_localctx).value =  memory.get((((Perform_op7Context)_localctx).n4!=null?((Perform_op7Context)_localctx).n4.getText():null));
											    
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitAdd_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMul_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((ExpressionContext)_localctx).perform_op = perform_op(0);

															((ExpressionContext)_localctx).o = ((ExpressionContext)_localctx).perform_op.value;
															((ExpressionContext)_localctx).type =  1;
														
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				((ExpressionContext)_localctx).literal = literal();

															((ExpressionContext)_localctx).type =  2;
															((ExpressionContext)_localctx).o =  ((ExpressionContext)_localctx).literal.o;
														
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				((ExpressionContext)_localctx).var = var();

															((ExpressionContext)_localctx).type = 3;
															((ExpressionContext)_localctx).o =  memory.get(((ExpressionContext)_localctx).var.s);
														
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMore_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_expressionsContext more_expressions() throws RecognitionException {
		More_expressionsContext _localctx = new More_expressionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_more_expressions);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case COMMA_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(COMMA_TOKEN);
				setState(383);
				expression();
				setState(384);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_code_block);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				variable_declaration();
				setState(390);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				function_declaration();
				setState(393);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				assignment_line();
				setState(396);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				function_call_line();
				setState(399);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				conditional();
				setState(402);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				wloop();
				setState(405);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				floop();
				setState(408);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				dloop();
				setState(411);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				printing();
				setState(414);
				code_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPrinting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintingContext printing() throws RecognitionException {
		PrintingContext _localctx = new PrintingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_printing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__0);
			setState(420);
			match(OPEN_PARENTHESIS);
			setState(421);
			((PrintingContext)_localctx).expression = expression();
			setState(422);
			match(CLOSE_PARENTHESIS);
			setState(423);
			match(TERMINATOR_TOKEN);
				System.out.println("type: "+((PrintingContext)_localctx).expression.type);
						if(((PrintingContext)_localctx).expression.type == 3){
							System.out.println("VAL: "+memory.get((String)((PrintingContext)_localctx).expression.o));
						}else if(((PrintingContext)_localctx).expression.type == 1){
							System.out.println("from performop"+((PrintingContext)_localctx).expression.o);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitReturn_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_lineContext return_line(String s) throws RecognitionException {
		Return_lineContext _localctx = new Return_lineContext(_ctx, getState(), s);
		enterRule(_localctx, 82, RULE_return_line);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case RETURN_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(RETURN_TOKEN);
				setState(427);
				expression();
				setState(428);
				match(TERMINATOR_TOKEN);

									 	if(_localctx.s.equals("full")){
									 		throw new RuntimeException("Should not have return statement");
									 	}
									 
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{

									 	if(!_localctx.s.equals("full")){
									 		throw new RuntimeException("Should have return statement");
									 	}
									 
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
		case 27:
			return perform_op_sempred((Perform_opContext)_localctx, predIndex);
		case 28:
			return perform_op2_sempred((Perform_op2Context)_localctx, predIndex);
		case 30:
			return perform_op4_sempred((Perform_op4Context)_localctx, predIndex);
		case 31:
			return perform_op5_sempred((Perform_op5Context)_localctx, predIndex);
		case 32:
			return perform_op6_sempred((Perform_op6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean perform_op_sempred(Perform_opContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean perform_op2_sempred(Perform_op2Context _localctx, int predIndex) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2_\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3g\n"+
		"\3\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a3\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00c0\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cb\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00ed\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0117\n\35\f\35\16\35\u011a\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0123\n\36\f\36\16\36\u0126\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u012d\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0138"+
		"\n \f \16 \u013b\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u014a\n"+
		"!\f!\16!\u014d\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0158\n\"\f"+
		"\"\16\"\u015b\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u016b"+
		"\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u017f\n\'\3(\3(\3(\3(\3(\5(\u0186\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01a4\n)\3"+
		"*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01b3\n+\3+\2\78:>@B,\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2"+
		"\5\3\2\26\27\3\2\30\32\3\2 %\u01b6\2^\3\2\2\2\4f\3\2\2\2\6l\3\2\2\2\b"+
		"r\3\2\2\2\ny\3\2\2\2\f{\3\2\2\2\16\u0083\3\2\2\2\20\u008e\3\2\2\2\22\u0099"+
		"\3\2\2\2\24\u009b\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00ab\3"+
		"\2\2\2\34\u00b0\3\2\2\2\36\u00b3\3\2\2\2 \u00bf\3\2\2\2\"\u00c1\3\2\2"+
		"\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d3\3\2\2\2*\u00d5\3\2\2\2,\u00d8"+
		"\3\2\2\2.\u00db\3\2\2\2\60\u00ec\3\2\2\2\62\u00ee\3\2\2\2\64\u00f8\3\2"+
		"\2\2\66\u0102\3\2\2\28\u010f\3\2\2\2:\u011b\3\2\2\2<\u012c\3\2\2\2>\u012e"+
		"\3\2\2\2@\u013c\3\2\2\2B\u014e\3\2\2\2D\u016a\3\2\2\2F\u016c\3\2\2\2H"+
		"\u016e\3\2\2\2J\u0170\3\2\2\2L\u017e\3\2\2\2N\u0185\3\2\2\2P\u01a3\3\2"+
		"\2\2R\u01a5\3\2\2\2T\u01b2\3\2\2\2VW\7\t\2\2W_\b\2\1\2XY\7\n\2\2Y_\b\2"+
		"\1\2Z[\7\13\2\2[_\b\2\1\2\\]\7\f\2\2]_\b\2\1\2^V\3\2\2\2^X\3\2\2\2^Z\3"+
		"\2\2\2^\\\3\2\2\2_\3\3\2\2\2`a\5\6\4\2ab\b\3\1\2bg\3\2\2\2cd\5\b\5\2d"+
		"e\b\3\1\2eg\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\5\3\2\2\2hi\7\4\2\2im\b\4\1\2"+
		"jk\7\5\2\2km\b\4\1\2lh\3\2\2\2lj\3\2\2\2m\7\3\2\2\2no\7\6\2\2os\b\5\1"+
		"\2pq\7\7\2\2qs\b\5\1\2rn\3\2\2\2rp\3\2\2\2s\t\3\2\2\2tu\5\2\2\2uv\b\6"+
		"\1\2vz\3\2\2\2wx\7\r\2\2xz\b\6\1\2yt\3\2\2\2yw\3\2\2\2z\13\3\2\2\2{|\7"+
		"\'\2\2|}\7\b\2\2}~\5\4\3\2~\177\7)\2\2\177\r\3\2\2\2\u0080\u0081\7\b\2"+
		"\2\u0081\u0084\b\b\1\2\u0082\u0084\5\24\13\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\5\2\2\2\u0086\u0087\5\16\b"+
		"\2\u0087\u0088\5\22\n\2\u0088\u0089\b\t\1\2\u0089\u008f\3\2\2\2\u008a"+
		"\u008b\5\2\2\2\u008b\u008c\5\26\f\2\u008c\u008d\5\22\n\2\u008d\u008f\3"+
		"\2\2\2\u008e\u0085\3\2\2\2\u008e\u008a\3\2\2\2\u008f\21\3\2\2\2\u0090"+
		"\u0091\7\60\2\2\u0091\u0092\5\16\b\2\u0092\u0093\5\22\n\2\u0093\u009a"+
		"\3\2\2\2\u0094\u0095\7\60\2\2\u0095\u0096\5\26\f\2\u0096\u0097\5\22\n"+
		"\2\u0097\u009a\3\2\2\2\u0098\u009a\7)\2\2\u0099\u0090\3\2\2\2\u0099\u0094"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\23\3\2\2\2\u009b\u009c\7\b\2\2\u009c"+
		"\u009d\7.\2\2\u009d\u009e\5L\'\2\u009e\u009f\7/\2\2\u009f\25\3\2\2\2\u00a0"+
		"\u00a3\5\32\16\2\u00a1\u00a3\5\30\r\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\25\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7\u00a8\5L\'\2\u00a8\u00a9\5N(\2\u00a9\u00aa\7-\2\2"+
		"\u00aa\31\3\2\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae"+
		"\5L\'\2\u00ae\u00af\b\16\1\2\u00af\33\3\2\2\2\u00b0\u00b1\5\32\16\2\u00b1"+
		"\u00b2\7)\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\7\b\2\2"+
		"\u00b5\u00b6\7*\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7+\2\2\u00b8\u00b9"+
		"\7,\2\2\u00b9\u00ba\5P)\2\u00ba\u00bb\5T+\2\u00bb\u00bc\7-\2\2\u00bc\37"+
		"\3\2\2\2\u00bd\u00c0\5\"\22\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\7"+
		"\b\2\2\u00c3\u00c4\5$\23\2\u00c4#\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7"+
		"\5\"\22\2\u00c7\u00c8\5$\23\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\3\2\2\2"+
		"\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7"+
		"\b\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\7+\2\2\u00d0"+
		"\'\3\2\2\2\u00d1\u00d4\5*\26\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4)\3\2\2\2\u00d5\u00d6\5L\'\2\u00d6\u00d7\5N"+
		"(\2\u00d7+\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7)\2\2\u00da-\3\2\2"+
		"\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\7*\2\2\u00dd\u00de\5L\'\2\u00de\u00df"+
		"\7+\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\5P)\2\u00e1\u00e2\7-\2\2\u00e2"+
		"\u00e3\5\60\31\2\u00e3/\3\2\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00ed\5.\30"+
		"\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\5P)\2\u00e9\u00ea"+
		"\7-\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00e6\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\61\3\2\2\2\u00ee\u00ef\7\17\2"+
		"\2\u00ef\u00f0\7*\2\2\u00f0\u00f1\5L\'\2\u00f1\u00f2\7+\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3\u00f4\b\32\1\2\u00f4\u00f5\5P)\2\u00f5\u00f6\b\32\1\2\u00f6"+
		"\u00f7\7-\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\7,\2\2"+
		"\u00fa\u00fb\5P)\2\u00fb\u00fc\7-\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe"+
		"\7*\2\2\u00fe\u00ff\5L\'\2\u00ff\u0100\7+\2\2\u0100\u0101\7)\2\2\u0101"+
		"\65\3\2\2\2\u0102\u0103\7\16\2\2\u0103\u0104\7*\2\2\u0104\u0105\5L\'\2"+
		"\u0105\u0106\7)\2\2\u0106\u0107\5L\'\2\u0107\u0108\7)\2\2\u0108\u0109"+
		"\5L\'\2\u0109\u010a\7+\2\2\u010a\u010b\7,\2\2\u010b\u010c\5P)\2\u010c"+
		"\u010d\7-\2\2\u010d\u010e\b\34\1\2\u010e\67\3\2\2\2\u010f\u0110\b\35\1"+
		"\2\u0110\u0111\5:\36\2\u0111\u0112\b\35\1\2\u0112\u0118\3\2\2\2\u0113"+
		"\u0114\f\4\2\2\u0114\u0115\7\36\2\2\u0115\u0117\5:\36\2\u0116\u0113\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"9\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\36\1\2\u011c\u011d\5<\37\2"+
		"\u011d\u011e\b\36\1\2\u011e\u0124\3\2\2\2\u011f\u0120\f\4\2\2\u0120\u0121"+
		"\7\35\2\2\u0121\u0123\5<\37\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125;\3\2\2\2\u0126\u0124\3"+
		"\2\2\2\u0127\u0128\7\37\2\2\u0128\u012d\5<\37\2\u0129\u012a\5> \2\u012a"+
		"\u012b\b\37\1\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0129\3"+
		"\2\2\2\u012d=\3\2\2\2\u012e\u012f\b \1\2\u012f\u0130\5@!\2\u0130\u0131"+
		"\b \1\2\u0131\u0139\3\2\2\2\u0132\u0133\f\4\2\2\u0133\u0134\5J&\2\u0134"+
		"\u0135\5@!\2\u0135\u0136\b \1\2\u0136\u0138\3\2\2\2\u0137\u0132\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a?"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\b!\1\2\u013d\u013e\5B\"\2\u013e"+
		"\u013f\b!\1\2\u013f\u014b\3\2\2\2\u0140\u0141\f\5\2\2\u0141\u0142\5B\""+
		"\2\u0142\u0143\b!\1\2\u0143\u014a\3\2\2\2\u0144\u0145\f\4\2\2\u0145\u0146"+
		"\5F$\2\u0146\u0147\5B\"\2\u0147\u0148\b!\1\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0140\3\2\2\2\u0149\u0144\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014cA\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\b\"\1\2\u014f\u0150\5D#\2\u0150\u0151\b\"\1\2\u0151\u0159\3\2\2\2\u0152"+
		"\u0153\f\4\2\2\u0153\u0154\5H%\2\u0154\u0155\5D#\2\u0155\u0156\b\"\1\2"+
		"\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015aC\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7*\2\2\u015d\u015e\58\35\2\u015e\u015f\7+\2\2\u015f\u0160\b#\1"+
		"\2\u0160\u016b\3\2\2\2\u0161\u0162\5&\24\2\u0162\u0163\b#\1\2\u0163\u016b"+
		"\3\2\2\2\u0164\u0165\7\5\2\2\u0165\u016b\b#\1\2\u0166\u0167\7\4\2\2\u0167"+
		"\u016b\b#\1\2\u0168\u0169\7\b\2\2\u0169\u016b\b#\1\2\u016a\u015c\3\2\2"+
		"\2\u016a\u0161\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016bE\3\2\2\2\u016c\u016d\t\2\2\2\u016dG\3\2\2\2\u016e\u016f"+
		"\t\3\2\2\u016fI\3\2\2\2\u0170\u0171\t\4\2\2\u0171K\3\2\2\2\u0172\u0173"+
		"\58\35\2\u0173\u0174\b\'\1\2\u0174\u017f\3\2\2\2\u0175\u0176\5\4\3\2\u0176"+
		"\u0177\b\'\1\2\u0177\u017f\3\2\2\2\u0178\u017f\5&\24\2\u0179\u017a\5\16"+
		"\b\2\u017a\u017b\b\'\1\2\u017b\u017f\3\2\2\2\u017c\u017f\5\32\16\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0172\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u0178\3\2"+
		"\2\2\u017e\u0179\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"M\3\2\2\2\u0180\u0181\7\60\2\2\u0181\u0182\5L\'\2\u0182\u0183\5N(\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2"+
		"\2\2\u0186O\3\2\2\2\u0187\u0188\5\20\t\2\u0188\u0189\5P)\2\u0189\u01a4"+
		"\3\2\2\2\u018a\u018b\5\36\20\2\u018b\u018c\5P)\2\u018c\u01a4\3\2\2\2\u018d"+
		"\u018e\5\34\17\2\u018e\u018f\5P)\2\u018f\u01a4\3\2\2\2\u0190\u0191\5,"+
		"\27\2\u0191\u0192\5P)\2\u0192\u01a4\3\2\2\2\u0193\u0194\5.\30\2\u0194"+
		"\u0195\5P)\2\u0195\u01a4\3\2\2\2\u0196\u0197\5\62\32\2\u0197\u0198\5P"+
		")\2\u0198\u01a4\3\2\2\2\u0199\u019a\5\66\34\2\u019a\u019b\5P)\2\u019b"+
		"\u01a4\3\2\2\2\u019c\u019d\5\64\33\2\u019d\u019e\5P)\2\u019e\u01a4\3\2"+
		"\2\2\u019f\u01a0\5R*\2\u01a0\u01a1\5P)\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4"+
		"\b)\1\2\u01a3\u0187\3\2\2\2\u01a3\u018a\3\2\2\2\u01a3\u018d\3\2\2\2\u01a3"+
		"\u0190\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u0199\3\2"+
		"\2\2\u01a3\u019c\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"Q\3\2\2\2\u01a5\u01a6\7\3\2\2\u01a6\u01a7\7*\2\2\u01a7\u01a8\5L\'\2\u01a8"+
		"\u01a9\7+\2\2\u01a9\u01aa\7)\2\2\u01aa\u01ab\b*\1\2\u01abS\3\2\2\2\u01ac"+
		"\u01ad\7\23\2\2\u01ad\u01ae\5L\'\2\u01ae\u01af\7)\2\2\u01af\u01b0\b+\1"+
		"\2\u01b0\u01b3\3\2\2\2\u01b1\u01b3\b+\1\2\u01b2\u01ac\3\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3U\3\2\2\2\33^flry\u0083\u008e\u0099\u00a2\u00bf\u00ca\u00d3"+
		"\u00ec\u0118\u0124\u012c\u0139\u0149\u014b\u0159\u016a\u017e\u0185\u01a3"+
		"\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}