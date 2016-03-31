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
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	 
		public Data_typeContext() { }
		public void copyFrom(Data_typeContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class FloatDataTypeContext extends Data_typeContext {
		public TerminalNode FLOAT_DATA_TYPE() { return getToken(LandParser.FLOAT_DATA_TYPE, 0); }
		public FloatDataTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFloatDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDatatypeContext extends Data_typeContext {
		public TerminalNode INT_DATA_TYPE() { return getToken(LandParser.INT_DATA_TYPE, 0); }
		public IntDatatypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitIntDatatype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDatatypeContext extends Data_typeContext {
		public TerminalNode STRING_DATA_TYPE() { return getToken(LandParser.STRING_DATA_TYPE, 0); }
		public StringDatatypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitStringDatatype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharDataTypeContext extends Data_typeContext {
		public TerminalNode CHAR_DATA_TYPE() { return getToken(LandParser.CHAR_DATA_TYPE, 0); }
		public CharDataTypeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCharDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_data_type);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
				_localctx = new IntDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(INT_DATA_TYPE);
				}
				break;
			case FLOAT_DATA_TYPE:
				_localctx = new FloatDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(FLOAT_DATA_TYPE);
				}
				break;
			case STRING_DATA_TYPE:
				_localctx = new StringDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(STRING_DATA_TYPE);
				}
				break;
			case CHAR_DATA_TYPE:
				_localctx = new CharDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(CHAR_DATA_TYPE);
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
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
			this.o = ctx.o;
		}
	}
	public static class DigitLiteralContext extends LiteralContext {
		public Digit_literalContext digit_literal() {
			return getRuleContext(Digit_literalContext.class,0);
		}
		public DigitLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitDigitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharactersLiteralContext extends LiteralContext {
		public Characters_literalContext characters_literal() {
			return getRuleContext(Characters_literalContext.class,0);
		}
		public CharactersLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCharactersLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				_localctx = new DigitLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				digit_literal();
				}
				break;
			case STRING_LIT:
			case CHAR_LIT:
				_localctx = new CharactersLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
		public Digit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_literal; }
	 
		public Digit_literalContext() { }
		public void copyFrom(Digit_literalContext ctx) {
			super.copyFrom(ctx);
			this.o = ctx.o;
		}
	}
	public static class IntLiteralContext extends Digit_literalContext {
		public TerminalNode INT_LIT() { return getToken(LandParser.INT_LIT, 0); }
		public IntLiteralContext(Digit_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends Digit_literalContext {
		public TerminalNode FLOAT_LIT() { return getToken(LandParser.FLOAT_LIT, 0); }
		public FloatLiteralContext(Digit_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_literalContext digit_literal() throws RecognitionException {
		Digit_literalContext _localctx = new Digit_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_digit_literal);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case INT_LIT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT_LIT);
				}
				break;
			case FLOAT_LIT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(FLOAT_LIT);
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
		public Characters_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters_literal; }
	 
		public Characters_literalContext() { }
		public void copyFrom(Characters_literalContext ctx) {
			super.copyFrom(ctx);
			this.o = ctx.o;
		}
	}
	public static class StringLiteralContext extends Characters_literalContext {
		public TerminalNode STRING_LIT() { return getToken(LandParser.STRING_LIT, 0); }
		public StringLiteralContext(Characters_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends Characters_literalContext {
		public TerminalNode CHAR_LIT() { return getToken(LandParser.CHAR_LIT, 0); }
		public CharLiteralContext(Characters_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Characters_literalContext characters_literal() throws RecognitionException {
		Characters_literalContext _localctx = new Characters_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_characters_literal);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case STRING_LIT:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(STRING_LIT);
				}
				break;
			case CHAR_LIT:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(CHAR_LIT);
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
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	 
		public Return_typeContext() { }
		public void copyFrom(Return_typeContext ctx) {
			super.copyFrom(ctx);
			this.returnType = ctx.returnType;
		}
	}
	public static class DataTypeContext extends Return_typeContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DataTypeContext(Return_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidTypeContext extends Return_typeContext {
		public TerminalNode VOID_DATA_TYPE() { return getToken(LandParser.VOID_DATA_TYPE, 0); }
		public VoidTypeContext(Return_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_type);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
				_localctx = new DataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				data_type();
				}
				break;
			case VOID_DATA_TYPE:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
			setState(106);
			match(CONSTANT_TOKEN);
			setState(107);
			match(IDENTIFIER);
			setState(108);
			literal();
			setState(109);
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
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class ArrayIdentifierContext extends VarContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayIdentifierContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitArrayIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdentifierContext extends VarContext {
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public VarIdentifierContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ArrayIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationAloneContext extends Variable_declarationContext {
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
		public VariableDeclarationAloneContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVariableDeclarationAlone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationWithAssignmentContext extends Variable_declarationContext {
		public Data_typeContext data_type;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Assignment_declarationContext assignment_declaration() {
			return getRuleContext(Assignment_declarationContext.class,0);
		}
		public More_variable_declarationContext more_variable_declaration() {
			return getRuleContext(More_variable_declarationContext.class,0);
		}
		public VariableDeclarationWithAssignmentContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitVariableDeclarationWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationAloneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((VariableDeclarationAloneContext)_localctx).data_type = data_type();
				setState(116);
				var();
				setState(117);
				more_variable_declaration(((VariableDeclarationAloneContext)_localctx).data_type.s);
				}
				break;
			case 2:
				_localctx = new VariableDeclarationWithAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((VariableDeclarationWithAssignmentContext)_localctx).data_type = data_type();
				setState(120);
				assignment_declaration(((VariableDeclarationWithAssignmentContext)_localctx).data_type.s);
				setState(121);
				more_variable_declaration(((VariableDeclarationWithAssignmentContext)_localctx).data_type.s);
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
		public More_variable_declarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public More_variable_declarationContext(ParserRuleContext parent, int invokingState, String dataType) {
			super(parent, invokingState);
			this.dataType = dataType;
		}
		@Override public int getRuleIndex() { return RULE_more_variable_declaration; }
	 
		public More_variable_declarationContext() { }
		public void copyFrom(More_variable_declarationContext ctx) {
			super.copyFrom(ctx);
			this.dataType = ctx.dataType;
		}
	}
	public static class MoreVarableDec3Context extends More_variable_declarationContext {
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public MoreVarableDec3Context(More_variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMoreVarableDec3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreVarableDec2Context extends More_variable_declarationContext {
		public TerminalNode COMMA_TOKEN() { return getToken(LandParser.COMMA_TOKEN, 0); }
		public Assignment_declarationContext assignment_declaration() {
			return getRuleContext(Assignment_declarationContext.class,0);
		}
		public More_variable_declarationContext more_variable_declaration() {
			return getRuleContext(More_variable_declarationContext.class,0);
		}
		public MoreVarableDec2Context(More_variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMoreVarableDec2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreVarableDec1Context extends More_variable_declarationContext {
		public TerminalNode COMMA_TOKEN() { return getToken(LandParser.COMMA_TOKEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public More_variable_declarationContext more_variable_declaration() {
			return getRuleContext(More_variable_declarationContext.class,0);
		}
		public MoreVarableDec1Context(More_variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitMoreVarableDec1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_variable_declarationContext more_variable_declaration(String dataType) throws RecognitionException {
		More_variable_declarationContext _localctx = new More_variable_declarationContext(_ctx, getState(), dataType);
		enterRule(_localctx, 16, RULE_more_variable_declaration);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MoreVarableDec1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(COMMA_TOKEN);
				setState(126);
				var();
				setState(127);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 2:
				_localctx = new MoreVarableDec2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(COMMA_TOKEN);
				setState(130);
				assignment_declaration(_localctx.dataType);
				setState(131);
				more_variable_declaration(_localctx.dataType);
				}
				break;
			case 3:
				_localctx = new MoreVarableDec3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(OPEN_BRACKET);
			setState(138);
			expression();
			setState(139);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				assignment(_localctx.dataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
			setState(145);
			array();
			setState(146);
			match(ASSIGNMENT_OPERATOR);
			setState(147);
			match(OPEN_BRACE);
			setState(148);
			expression();
			setState(149);
			more_expressions();
			setState(150);
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
			setState(152);
			var();
			setState(153);
			match(ASSIGNMENT_OPERATOR);
			setState(154);
			expression();
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
			setState(156);
			assignment("unknown type");
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
			setState(159);
			((Function_declarationContext)_localctx).return_type = return_type();
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
			return_line(((Function_declarationContext)_localctx).return_type.returnType);
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
			setState(171);
			switch (_input.LA(1)) {
			case INT_DATA_TYPE:
			case FLOAT_DATA_TYPE:
			case STRING_DATA_TYPE:
			case CHAR_DATA_TYPE:
			case VOID_DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
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
			setState(173);
			return_type();
			setState(174);
			match(IDENTIFIER);
			setState(175);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(COMMA_TOKEN);
				setState(178);
				function_declaration_parameters();
				setState(179);
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
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(OPEN_PARENTHESIS);
			setState(186);
			function_call_parameters_type();
			setState(187);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
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
			setState(193);
			expression();
			setState(194);
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
			setState(196);
			function_call();
			setState(197);
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
			setState(199);
			match(IF_TOKEN);
			setState(200);
			match(OPEN_PARENTHESIS);
			setState(201);
			expression();
			setState(202);
			match(CLOSE_PARENTHESIS);
			setState(203);
			match(OPEN_BRACE);
			setState(204);
			code_block();
			setState(205);
			match(CLOSE_BRACE);
			setState(206);
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
		public Conditional_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_continue; }
	 
		public Conditional_continueContext() { }
		public void copyFrom(Conditional_continueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueElseIfContext extends Conditional_continueContext {
		public TerminalNode ELSE_TOKEN() { return getToken(LandParser.ELSE_TOKEN, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ContinueElseIfContext(Conditional_continueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitContinueElseIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueElseContext extends Conditional_continueContext {
		public TerminalNode ELSE_TOKEN() { return getToken(LandParser.ELSE_TOKEN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LandParser.OPEN_BRACE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LandParser.CLOSE_BRACE, 0); }
		public ContinueElseContext(Conditional_continueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitContinueElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueEpsilonContext extends Conditional_continueContext {
		public ContinueEpsilonContext(Conditional_continueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitContinueEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_continueContext conditional_continue() throws RecognitionException {
		Conditional_continueContext _localctx = new Conditional_continueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional_continue);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ContinueElseIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ELSE_TOKEN);
				setState(209);
				conditional();
				}
				break;
			case 2:
				_localctx = new ContinueElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ELSE_TOKEN);
				setState(211);
				match(OPEN_BRACE);
				setState(212);
				code_block();
				setState(213);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				_localctx = new ContinueEpsilonContext(_localctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE_TOKEN);
			setState(219);
			match(OPEN_PARENTHESIS);
			setState(220);
			((WloopContext)_localctx).e1 = expression();
			setState(221);
			match(CLOSE_PARENTHESIS);
			setState(222);
			match(OPEN_BRACE);
			setState(223);
			code_block();
			setState(224);
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
			setState(226);
			match(DO_TOKEN);
			setState(227);
			match(OPEN_BRACE);
			setState(228);
			code_block();
			setState(229);
			match(CLOSE_BRACE);
			setState(230);
			match(WHILE_TOKEN);
			setState(231);
			match(OPEN_PARENTHESIS);
			setState(232);
			expression();
			setState(233);
			match(CLOSE_PARENTHESIS);
			setState(234);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FOR_TOKEN);
			setState(237);
			match(OPEN_PARENTHESIS);
			setState(238);
			((FloopContext)_localctx).n1 = expression();
			setState(239);
			match(TERMINATOR_TOKEN);
			setState(240);
			((FloopContext)_localctx).e1 = expression();
			setState(241);
			match(TERMINATOR_TOKEN);
			setState(242);
			expression();
			setState(243);
			match(CLOSE_PARENTHESIS);
			setState(244);
			match(OPEN_BRACE);
			setState(245);
			code_block();
			setState(246);
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
		public Perform_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op; }
	 
		public Perform_opContext() { }
		public void copyFrom(Perform_opContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp_1Context extends Perform_opContext {
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public TerminalNode OR_OPERATOR() { return getToken(LandParser.OR_OPERATOR, 0); }
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public PerformOp_1Context(Perform_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp_2Context extends Perform_opContext {
		public Perform_op2Context n3;
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public PerformOp_2Context(Perform_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp_2(this);
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
			_localctx = new PerformOp_2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249);
			((PerformOp_2Context)_localctx).n3 = perform_op2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PerformOp_1Context(new Perform_opContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					match(OR_OPERATOR);
					setState(253);
					perform_op2(0);
					}
					} 
				}
				setState(258);
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
		public Perform_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op2; }
	 
		public Perform_op2Context() { }
		public void copyFrom(Perform_op2Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp2_2Context extends Perform_op2Context {
		public Perform_op3Context n3;
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public PerformOp2_2Context(Perform_op2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp2_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp2_1Context extends Perform_op2Context {
		public Perform_op2Context perform_op2() {
			return getRuleContext(Perform_op2Context.class,0);
		}
		public TerminalNode AND_OPERATOR() { return getToken(LandParser.AND_OPERATOR, 0); }
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public PerformOp2_1Context(Perform_op2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp2_1(this);
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
			_localctx = new PerformOp2_2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(260);
			((PerformOp2_2Context)_localctx).n3 = perform_op3();
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PerformOp2_1Context(new Perform_op2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op2);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					match(AND_OPERATOR);
					setState(264);
					perform_op3();
					}
					} 
				}
				setState(269);
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
		public Perform_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op3; }
	 
		public Perform_op3Context() { }
		public void copyFrom(Perform_op3Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp3_1Context extends Perform_op3Context {
		public TerminalNode NOT_OPERATOR() { return getToken(LandParser.NOT_OPERATOR, 0); }
		public Perform_op3Context perform_op3() {
			return getRuleContext(Perform_op3Context.class,0);
		}
		public PerformOp3_1Context(Perform_op3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp3_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp3_2Context extends Perform_op3Context {
		public Perform_op4Context n3;
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public PerformOp3_2Context(Perform_op3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp3_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_op3Context perform_op3() throws RecognitionException {
		Perform_op3Context _localctx = new Perform_op3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_perform_op3);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case NOT_OPERATOR:
				_localctx = new PerformOp3_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(NOT_OPERATOR);
				setState(271);
				perform_op3();
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
			case IDENTIFIER:
			case OPEN_PARENTHESIS:
				_localctx = new PerformOp3_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((PerformOp3_2Context)_localctx).n3 = perform_op4(0);
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
		public Perform_op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op4; }
	 
		public Perform_op4Context() { }
		public void copyFrom(Perform_op4Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp4_2Context extends Perform_op4Context {
		public Perform_op5Context n3;
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public PerformOp4_2Context(Perform_op4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp4_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp4_1Context extends Perform_op4Context {
		public Perform_op4Context n1;
		public Perform_op5Context n2;
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Perform_op4Context perform_op4() {
			return getRuleContext(Perform_op4Context.class,0);
		}
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public PerformOp4_1Context(Perform_op4Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp4_1(this);
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
			_localctx = new PerformOp4_2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(276);
			((PerformOp4_2Context)_localctx).n3 = perform_op5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PerformOp4_1Context(new Perform_op4Context(_parentctx, _parentState));
					((PerformOp4_1Context)_localctx).n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op4);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					cond_op();
					setState(280);
					((PerformOp4_1Context)_localctx).n2 = perform_op5(0);
					}
					} 
				}
				setState(286);
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
		public Perform_op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op5; }
	 
		public Perform_op5Context() { }
		public void copyFrom(Perform_op5Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp5_1Context extends Perform_op5Context {
		public Perform_op5Context n1;
		public Perform_op6Context n2;
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public PerformOp5_1Context(Perform_op5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp5_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp5_3Context extends Perform_op5Context {
		public Perform_op6Context n3;
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public PerformOp5_3Context(Perform_op5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp5_3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp5_2Context extends Perform_op5Context {
		public Perform_op5Context n1;
		public Add_subContext op;
		public Perform_op6Context n2;
		public Perform_op5Context perform_op5() {
			return getRuleContext(Perform_op5Context.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public PerformOp5_2Context(Perform_op5Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp5_2(this);
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
			_localctx = new PerformOp5_3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(288);
			((PerformOp5_3Context)_localctx).n3 = perform_op6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PerformOp5_1Context(new Perform_op5Context(_parentctx, _parentState));
						((PerformOp5_1Context)_localctx).n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(290);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(291);
						((PerformOp5_1Context)_localctx).n2 = perform_op6(0);
						}
						break;
					case 2:
						{
						_localctx = new PerformOp5_2Context(new Perform_op5Context(_parentctx, _parentState));
						((PerformOp5_2Context)_localctx).n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op5);
						setState(292);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(293);
						((PerformOp5_2Context)_localctx).op = add_sub();
						setState(294);
						((PerformOp5_2Context)_localctx).n2 = perform_op6(0);
						}
						break;
					}
					} 
				}
				setState(300);
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
		public Perform_op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op6; }
	 
		public Perform_op6Context() { }
		public void copyFrom(Perform_op6Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp6_2Context extends Perform_op6Context {
		public Perform_op7Context n3;
		public Perform_op7Context perform_op7() {
			return getRuleContext(Perform_op7Context.class,0);
		}
		public PerformOp6_2Context(Perform_op6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp6_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp6_1Context extends Perform_op6Context {
		public Perform_op6Context n1;
		public Mul_divContext op;
		public Perform_op7Context n2;
		public Perform_op6Context perform_op6() {
			return getRuleContext(Perform_op6Context.class,0);
		}
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public Perform_op7Context perform_op7() {
			return getRuleContext(Perform_op7Context.class,0);
		}
		public PerformOp6_1Context(Perform_op6Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp6_1(this);
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
			_localctx = new PerformOp6_2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(302);
			((PerformOp6_2Context)_localctx).n3 = perform_op7();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PerformOp6_1Context(new Perform_op6Context(_parentctx, _parentState));
					((PerformOp6_1Context)_localctx).n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op6);
					setState(304);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(305);
					((PerformOp6_1Context)_localctx).op = mul_div();
					setState(306);
					((PerformOp6_1Context)_localctx).n2 = perform_op7();
					}
					} 
				}
				setState(312);
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
		public Perform_op7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op7; }
	 
		public Perform_op7Context() { }
		public void copyFrom(Perform_op7Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class PerformOp7_floatContext extends Perform_op7Context {
		public Token n1;
		public TerminalNode FLOAT_LIT() { return getToken(LandParser.FLOAT_LIT, 0); }
		public PerformOp7_floatContext(Perform_op7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp7_float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp7_intContext extends Perform_op7Context {
		public Token n2;
		public TerminalNode INT_LIT() { return getToken(LandParser.INT_LIT, 0); }
		public PerformOp7_intContext(Perform_op7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp7_int(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp7_identifierContext extends Perform_op7Context {
		public Token n4;
		public TerminalNode IDENTIFIER() { return getToken(LandParser.IDENTIFIER, 0); }
		public PerformOp7_identifierContext(Perform_op7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp7_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp7_parContext extends Perform_op7Context {
		public Perform_opContext c;
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public PerformOp7_parContext(Perform_op7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp7_par(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PerformOp7_funcCallContext extends Perform_op7Context {
		public Function_callContext n5;
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PerformOp7_funcCallContext(Perform_op7Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitPerformOp7_funcCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perform_op7Context perform_op7() throws RecognitionException {
		Perform_op7Context _localctx = new Perform_op7Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_perform_op7);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new PerformOp7_parContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(OPEN_PARENTHESIS);
				setState(314);
				((PerformOp7_parContext)_localctx).c = perform_op(0);
				setState(315);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				_localctx = new PerformOp7_funcCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((PerformOp7_funcCallContext)_localctx).n5 = function_call();
				}
				break;
			case 3:
				_localctx = new PerformOp7_floatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				((PerformOp7_floatContext)_localctx).n1 = match(FLOAT_LIT);
				}
				break;
			case 4:
				_localctx = new PerformOp7_intContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				((PerformOp7_intContext)_localctx).n2 = match(INT_LIT);
				}
				break;
			case 5:
				_localctx = new PerformOp7_identifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				((PerformOp7_identifierContext)_localctx).n4 = match(IDENTIFIER);
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
			setState(323);
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
			setState(325);
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
			setState(327);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.o = ctx.o;
			this.type = ctx.type;
		}
	}
	public static class Expression_literalContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expression_literalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_epsilonContext extends ExpressionContext {
		public Expression_epsilonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_epsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_funcCallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Expression_funcCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_funcCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_varContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Expression_varContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_assignmentContext extends ExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Expression_assignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_assignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression_performOpContext extends ExpressionContext {
		public Perform_opContext perform_op() {
			return getRuleContext(Perform_opContext.class,0);
		}
		public Expression_performOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitExpression_performOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Expression_performOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				perform_op(0);
				}
				break;
			case 2:
				_localctx = new Expression_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				literal();
				}
				break;
			case 3:
				_localctx = new Expression_funcCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				function_call();
				}
				break;
			case 4:
				_localctx = new Expression_varContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				var();
				}
				break;
			case 5:
				_localctx = new Expression_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				assignment("unknown type");
				}
				break;
			case 6:
				_localctx = new Expression_epsilonContext(_localctx);
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
			setState(342);
			switch (_input.LA(1)) {
			case COMMA_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(COMMA_TOKEN);
				setState(338);
				expression();
				setState(339);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				variable_declaration();
				setState(345);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				function_declaration();
				setState(348);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				assignment_line();
				setState(351);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				function_call_line();
				setState(354);
				code_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				conditional();
				setState(357);
				code_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				wloop();
				setState(360);
				code_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(362);
				floop();
				setState(363);
				code_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(365);
				dloop();
				setState(366);
				code_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(368);
				printing();
				setState(369);
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
			setState(374);
			match(T__0);
			setState(375);
			match(OPEN_PARENTHESIS);
			setState(376);
			expression();
			setState(377);
			match(CLOSE_PARENTHESIS);
			setState(378);
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

	public static class Return_lineContext extends ParserRuleContext {
		public String s;
		public Return_lineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Return_lineContext(ParserRuleContext parent, int invokingState, String s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_return_line; }
	 
		public Return_lineContext() { }
		public void copyFrom(Return_lineContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class ReturnLine_2Context extends Return_lineContext {
		public ReturnLine_2Context(Return_lineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitReturnLine_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnLine_1Context extends Return_lineContext {
		public TerminalNode RETURN_TOKEN() { return getToken(LandParser.RETURN_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR_TOKEN() { return getToken(LandParser.TERMINATOR_TOKEN, 0); }
		public ReturnLine_1Context(Return_lineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LandVisitor ) return ((LandVisitor<? extends T>)visitor).visitReturnLine_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_lineContext return_line(String s) throws RecognitionException {
		Return_lineContext _localctx = new Return_lineContext(_ctx, getState(), s);
		enterRule(_localctx, 82, RULE_return_line);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case RETURN_TOKEN:
				_localctx = new ReturnLine_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(RETURN_TOKEN);
				setState(381);
				expression();
				setState(382);
				match(TERMINATOR_TOKEN);
				}
				break;
			case CLOSE_BRACE:
				_localctx = new ReturnLine_2Context(_localctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0186\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\5\3_\n\3\3\4\3\4\5\4c\n\4\3\5\3\5\5\5"+
		"g\n\5\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bt\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00ae\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b9\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\5\25\u00c2\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00db\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0101"+
		"\n\35\f\35\16\35\u0104\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u010c"+
		"\n\36\f\36\16\36\u010f\13\36\3\37\3\37\3\37\5\37\u0114\n\37\3 \3 \3 \3"+
		" \3 \3 \3 \7 \u011d\n \f \16 \u0120\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!"+
		"\u012b\n!\f!\16!\u012e\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0137\n\"\f"+
		"\"\16\"\u013a\13\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0144\n#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0152\n\'\3(\3(\3(\3(\3(\5(\u0159\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u0177\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\5+\u0184\n"+
		"+\3+\2\78:>@B,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRT\2\5\3\2\26\27\3\2\30\32\3\2 %\u0187\2Z\3\2\2\2\4^\3"+
		"\2\2\2\6b\3\2\2\2\bf\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16s\3\2\2\2\20}\3\2"+
		"\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2"+
		"\2\32\u009a\3\2\2\2\34\u009e\3\2\2\2\36\u00a1\3\2\2\2 \u00ad\3\2\2\2\""+
		"\u00af\3\2\2\2$\u00b8\3\2\2\2&\u00ba\3\2\2\2(\u00c1\3\2\2\2*\u00c3\3\2"+
		"\2\2,\u00c6\3\2\2\2.\u00c9\3\2\2\2\60\u00da\3\2\2\2\62\u00dc\3\2\2\2\64"+
		"\u00e4\3\2\2\2\66\u00ee\3\2\2\28\u00fa\3\2\2\2:\u0105\3\2\2\2<\u0113\3"+
		"\2\2\2>\u0115\3\2\2\2@\u0121\3\2\2\2B\u012f\3\2\2\2D\u0143\3\2\2\2F\u0145"+
		"\3\2\2\2H\u0147\3\2\2\2J\u0149\3\2\2\2L\u0151\3\2\2\2N\u0158\3\2\2\2P"+
		"\u0176\3\2\2\2R\u0178\3\2\2\2T\u0183\3\2\2\2V[\7\t\2\2W[\7\n\2\2X[\7\13"+
		"\2\2Y[\7\f\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\3\3\2\2\2\\_\5"+
		"\6\4\2]_\5\b\5\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`c\7\4\2\2ac\7\5\2\2b"+
		"`\3\2\2\2ba\3\2\2\2c\7\3\2\2\2dg\7\6\2\2eg\7\7\2\2fd\3\2\2\2fe\3\2\2\2"+
		"g\t\3\2\2\2hk\5\2\2\2ik\7\r\2\2jh\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\7\'"+
		"\2\2mn\7\b\2\2no\5\4\3\2op\7)\2\2p\r\3\2\2\2qt\7\b\2\2rt\5\24\13\2sq\3"+
		"\2\2\2sr\3\2\2\2t\17\3\2\2\2uv\5\2\2\2vw\5\16\b\2wx\5\22\n\2x~\3\2\2\2"+
		"yz\5\2\2\2z{\5\26\f\2{|\5\22\n\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\21\3\2"+
		"\2\2\177\u0080\7\60\2\2\u0080\u0081\5\16\b\2\u0081\u0082\5\22\n\2\u0082"+
		"\u0089\3\2\2\2\u0083\u0084\7\60\2\2\u0084\u0085\5\26\f\2\u0085\u0086\5"+
		"\22\n\2\u0086\u0089\3\2\2\2\u0087\u0089\7)\2\2\u0088\177\3\2\2\2\u0088"+
		"\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\b\2"+
		"\2\u008b\u008c\7.\2\2\u008c\u008d\5L\'\2\u008d\u008e\7/\2\2\u008e\25\3"+
		"\2\2\2\u008f\u0092\5\32\16\2\u0090\u0092\5\30\r\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\5\24\13\2\u0094\u0095"+
		"\7\25\2\2\u0095\u0096\7,\2\2\u0096\u0097\5L\'\2\u0097\u0098\5N(\2\u0098"+
		"\u0099\7-\2\2\u0099\31\3\2\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\25\2"+
		"\2\u009c\u009d\5L\'\2\u009d\33\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0"+
		"\7)\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00a4\7*\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\7,\2"+
		"\2\u00a7\u00a8\5P)\2\u00a8\u00a9\5T+\2\u00a9\u00aa\7-\2\2\u00aa\37\3\2"+
		"\2\2\u00ab\u00ae\5\"\22\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae!\3\2\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\b\2\2"+
		"\u00b1\u00b2\5$\23\2\u00b2#\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00b5\5"+
		"\"\22\2\u00b5\u00b6\5$\23\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b3\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9%\3\2\2\2\u00ba\u00bb\7\b\2\2"+
		"\u00bb\u00bc\7*\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7+\2\2\u00be\'\3\2"+
		"\2\2\u00bf\u00c2\5*\26\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2)\3\2\2\2\u00c3\u00c4\5L\'\2\u00c4\u00c5\5N(\2\u00c5"+
		"+\3\2\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\7)\2\2\u00c8-\3\2\2\2\u00c9"+
		"\u00ca\7\21\2\2\u00ca\u00cb\7*\2\2\u00cb\u00cc\5L\'\2\u00cc\u00cd\7+\2"+
		"\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\5P)\2\u00cf\u00d0\7-\2\2\u00d0\u00d1"+
		"\5\60\31\2\u00d1/\3\2\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00db\5.\30\2\u00d4"+
		"\u00d5\7\22\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\5P)\2\u00d7\u00d8\7-\2"+
		"\2\u00d8\u00db\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7\17\2\2\u00dd"+
		"\u00de\7*\2\2\u00de\u00df\5L\'\2\u00df\u00e0\7+\2\2\u00e0\u00e1\7,\2\2"+
		"\u00e1\u00e2\5P)\2\u00e2\u00e3\7-\2\2\u00e3\63\3\2\2\2\u00e4\u00e5\7\20"+
		"\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\5P)\2\u00e7\u00e8\7-\2\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\5L\'\2\u00eb\u00ec\7+\2\2\u00ec"+
		"\u00ed\7)\2\2\u00ed\65\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef\u00f0\7*\2\2"+
		"\u00f0\u00f1\5L\'\2\u00f1\u00f2\7)\2\2\u00f2\u00f3\5L\'\2\u00f3\u00f4"+
		"\7)\2\2\u00f4\u00f5\5L\'\2\u00f5\u00f6\7+\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"\u00f8\5P)\2\u00f8\u00f9\7-\2\2\u00f9\67\3\2\2\2\u00fa\u00fb\b\35\1\2"+
		"\u00fb\u00fc\5:\36\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff"+
		"\7\36\2\2\u00ff\u0101\5:\36\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u01039\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0105\u0106\b\36\1\2\u0106\u0107\5<\37\2\u0107\u010d\3\2\2\2\u0108"+
		"\u0109\f\4\2\2\u0109\u010a\7\35\2\2\u010a\u010c\5<\37\2\u010b\u0108\3"+
		"\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		";\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\37\2\2\u0111\u0114\5<\37\2"+
		"\u0112\u0114\5> \2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114=\3\2"+
		"\2\2\u0115\u0116\b \1\2\u0116\u0117\5@!\2\u0117\u011e\3\2\2\2\u0118\u0119"+
		"\f\4\2\2\u0119\u011a\5J&\2\u011a\u011b\5@!\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f?\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\b!\1\2\u0122\u0123"+
		"\5B\"\2\u0123\u012c\3\2\2\2\u0124\u0125\f\5\2\2\u0125\u012b\5B\"\2\u0126"+
		"\u0127\f\4\2\2\u0127\u0128\5F$\2\u0128\u0129\5B\"\2\u0129\u012b\3\2\2"+
		"\2\u012a\u0124\3\2\2\2\u012a\u0126\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012dA\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\b\"\1\2\u0130\u0131\5D#\2\u0131\u0138\3\2\2\2\u0132\u0133\f\4\2"+
		"\2\u0133\u0134\5H%\2\u0134\u0135\5D#\2\u0135\u0137\3\2\2\2\u0136\u0132"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"C\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7*\2\2\u013c\u013d\58\35\2\u013d"+
		"\u013e\7+\2\2\u013e\u0144\3\2\2\2\u013f\u0144\5&\24\2\u0140\u0144\7\5"+
		"\2\2\u0141\u0144\7\4\2\2\u0142\u0144\7\b\2\2\u0143\u013b\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0144E\3\2\2\2\u0145\u0146\t\2\2\2\u0146G\3\2\2\2\u0147\u0148\t\3"+
		"\2\2\u0148I\3\2\2\2\u0149\u014a\t\4\2\2\u014aK\3\2\2\2\u014b\u0152\58"+
		"\35\2\u014c\u0152\5\4\3\2\u014d\u0152\5&\24\2\u014e\u0152\5\16\b\2\u014f"+
		"\u0152\5\32\16\2\u0150\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3"+
		"\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152M\3\2\2\2\u0153\u0154\7\60\2\2\u0154\u0155\5L\'\2"+
		"\u0155\u0156\5N(\2\u0156\u0159\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0153"+
		"\3\2\2\2\u0158\u0157\3\2\2\2\u0159O\3\2\2\2\u015a\u015b\5\20\t\2\u015b"+
		"\u015c\5P)\2\u015c\u0177\3\2\2\2\u015d\u015e\5\36\20\2\u015e\u015f\5P"+
		")\2\u015f\u0177\3\2\2\2\u0160\u0161\5\34\17\2\u0161\u0162\5P)\2\u0162"+
		"\u0177\3\2\2\2\u0163\u0164\5,\27\2\u0164\u0165\5P)\2\u0165\u0177\3\2\2"+
		"\2\u0166\u0167\5.\30\2\u0167\u0168\5P)\2\u0168\u0177\3\2\2\2\u0169\u016a"+
		"\5\62\32\2\u016a\u016b\5P)\2\u016b\u0177\3\2\2\2\u016c\u016d\5\66\34\2"+
		"\u016d\u016e\5P)\2\u016e\u0177\3\2\2\2\u016f\u0170\5\64\33\2\u0170\u0171"+
		"\5P)\2\u0171\u0177\3\2\2\2\u0172\u0173\5R*\2\u0173\u0174\5P)\2\u0174\u0177"+
		"\3\2\2\2\u0175\u0177\b)\1\2\u0176\u015a\3\2\2\2\u0176\u015d\3\2\2\2\u0176"+
		"\u0160\3\2\2\2\u0176\u0163\3\2\2\2\u0176\u0166\3\2\2\2\u0176\u0169\3\2"+
		"\2\2\u0176\u016c\3\2\2\2\u0176\u016f\3\2\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177Q\3\2\2\2\u0178\u0179\7\3\2\2\u0179\u017a\7*\2\2\u017a"+
		"\u017b\5L\'\2\u017b\u017c\7+\2\2\u017c\u017d\7)\2\2\u017dS\3\2\2\2\u017e"+
		"\u017f\7\23\2\2\u017f\u0180\5L\'\2\u0180\u0181\7)\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"U\3\2\2\2\33Z^bfjs}\u0088\u0091\u00ad\u00b8\u00c1\u00da\u0102\u010d\u0113"+
		"\u011e\u012a\u012c\u0138\u0143\u0151\u0158\u0176\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}