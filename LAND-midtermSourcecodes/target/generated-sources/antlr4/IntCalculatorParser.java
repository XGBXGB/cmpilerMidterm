// Generated from IntCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT_LIT=8, WHITESPACE=9;
	public static final int
		RULE_perform_op = 0, RULE_perform_op2 = 1, RULE_perform_op3 = 2, RULE_add_sub = 3, 
		RULE_mul_div = 4;
	public static final String[] ruleNames = {
		"perform_op", "perform_op2", "perform_op3", "add_sub", "mul_div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "INT_LIT", "WHITESPACE"
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
	public String getGrammarFileName() { return "IntCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).enterPerform_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).exitPerform_op(this);
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_perform_op, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(11);
			((Perform_opContext)_localctx).n = perform_op2(0);
			((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Perform_opContext(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
						setState(14);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(15);
						((Perform_opContext)_localctx).n2 = perform_op2(0);
						 
						          								
						          									((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value + ((Perform_opContext)_localctx).n2.value;
						          									if(((Perform_opContext)_localctx).n1.value > 0 && ((Perform_opContext)_localctx).n2.value > 0 && _localctx.value < 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}
						          									if(((Perform_opContext)_localctx).n1.value < 0 && ((Perform_opContext)_localctx).n2.value < 0 && _localctx.value > 0){
						          										throw new ArithmeticException("Value out of range for integer");
						          									}
						          							   
						}
						break;
					case 2:
						{
						_localctx = new Perform_opContext(_parentctx, _parentState);
						_localctx.n1 = _prevctx;
						_localctx.n1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
						setState(18);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(19);
						((Perform_opContext)_localctx).op = add_sub();
						setState(20);
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
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).enterPerform_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).exitPerform_op2(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_perform_op2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			((Perform_op2Context)_localctx).w = perform_op3();

													((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).w.value;
												
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
					setState(32);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(33);
					((Perform_op2Context)_localctx).op = mul_div();
					setState(34);
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
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode INT_LIT() { return getToken(IntCalculatorParser.INT_LIT, 0); }
		public Perform_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perform_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).enterPerform_op3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).exitPerform_op3(this);
		}
	}

	public final Perform_op3Context perform_op3() throws RecognitionException {
		Perform_op3Context _localctx = new Perform_op3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_perform_op3);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				setState(43);
				((Perform_op3Context)_localctx).c = perform_op(0);
				setState(44);
				match(T__1);

													((Perform_op3Context)_localctx).value =  ((Perform_op3Context)_localctx).c.value;
											    
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
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
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntCalculatorListener ) ((IntCalculatorListener)listener).exitMul_div(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return perform_op_sempred((Perform_opContext)_localctx, predIndex);
		case 1:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\2\4\2\4\7\2\4\6\b\n\2\4\3\2\5\6\3\2\7\t8\2\f\3\2\2\2"+
		"\4\36\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f\r\b\2\1\2\r\16"+
		"\5\4\3\2\16\17\b\2\1\2\17\33\3\2\2\2\20\21\f\5\2\2\21\22\5\4\3\2\22\23"+
		"\b\2\1\2\23\32\3\2\2\2\24\25\f\4\2\2\25\26\5\b\5\2\26\27\5\4\3\2\27\30"+
		"\b\2\1\2\30\32\3\2\2\2\31\20\3\2\2\2\31\24\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\b\3\1\2\37 \5"+
		"\6\4\2 !\b\3\1\2!)\3\2\2\2\"#\f\4\2\2#$\5\n\6\2$%\5\6\4\2%&\b\3\1\2&("+
		"\3\2\2\2\'\"\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2"+
		"\2,-\7\3\2\2-.\5\2\2\2./\7\4\2\2/\60\b\4\1\2\60\64\3\2\2\2\61\62\7\n\2"+
		"\2\62\64\b\4\1\2\63,\3\2\2\2\63\61\3\2\2\2\64\7\3\2\2\2\65\66\t\2\2\2"+
		"\66\t\3\2\2\2\678\t\3\2\28\13\3\2\2\2\6\31\33)\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}