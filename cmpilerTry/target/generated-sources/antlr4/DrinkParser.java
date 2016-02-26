// Generated from Drink.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrinkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT_LIT=5, WHITESPACE=6;
	public static final int
		RULE_perform_op = 0, RULE_perform_op2 = 1, RULE_add_sub = 2, RULE_mul_div = 3;
	public static final String[] ruleNames = {
		"perform_op", "perform_op2", "add_sub", "mul_div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INT_LIT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Drink.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrinkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Perform_opContext extends ParserRuleContext {
		public int value;
		public Perform_opContext n1;
		public Perform_op2Context n;
		public Add_subContext op;
		public Perform_op2Context n2;
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
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterPerform_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitPerform_op(this);
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
			setState(9);
			((Perform_opContext)_localctx).n = perform_op2(0);
			((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Perform_opContext(_parentctx, _parentState);
					_localctx.n1 = _prevctx;
					_localctx.n1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_perform_op);
					setState(12);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(13);
					((Perform_opContext)_localctx).op = add_sub();
					setState(14);
					((Perform_opContext)_localctx).n2 = perform_op2(0);
					 
					          							   		if((((Perform_opContext)_localctx).op!=null?_input.getText(((Perform_opContext)_localctx).op.start,((Perform_opContext)_localctx).op.stop):null).equalsIgnoreCase("+")){
					          										((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value + ((Perform_opContext)_localctx).n2.value;
					          									} else{
					          										((Perform_opContext)_localctx).value =  ((Perform_opContext)_localctx).n1.value - ((Perform_opContext)_localctx).n2.value;
					          									}
					          							   
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public Token n;
		public Mul_divContext op;
		public Token n2;
		public TerminalNode INT_LIT() { return getToken(DrinkParser.INT_LIT, 0); }
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
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterPerform_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitPerform_op2(this);
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
			setState(23);
			((Perform_op2Context)_localctx).n = match(INT_LIT);

										    	((Perform_op2Context)_localctx).value = Integer.parseInt((((Perform_op2Context)_localctx).n!=null?((Perform_op2Context)_localctx).n.getText():null));
										    
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
					setState(26);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(27);
					((Perform_op2Context)_localctx).op = mul_div();
					setState(28);
					((Perform_op2Context)_localctx).n2 = match(INT_LIT);

					          									
					          									if((((Perform_op2Context)_localctx).op!=null?_input.getText(((Perform_op2Context)_localctx).op.start,((Perform_op2Context)_localctx).op.stop):null).equalsIgnoreCase("*")){
					          										((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n1.value * Integer.parseInt((((Perform_op2Context)_localctx).n2!=null?((Perform_op2Context)_localctx).n2.getText():null));
					          									} else{
					          										((Perform_op2Context)_localctx).value =  ((Perform_op2Context)_localctx).n1.value / Integer.parseInt((((Perform_op2Context)_localctx).n2!=null?((Perform_op2Context)_localctx).n2.getText():null));
					          									}
					          								
					}
					} 
				}
				setState(35);
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

	public static class Add_subContext extends ParserRuleContext {
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitMul_div(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		Mul_divContext _localctx = new Mul_divContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mul_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%"+
		"\13\3\3\4\3\4\3\5\3\5\3\5\2\4\2\4\6\2\4\6\b\2\4\3\2\3\4\3\2\5\6(\2\n\3"+
		"\2\2\2\4\30\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n\13\b\2\1\2\13\f\5\4\3\2\f"+
		"\r\b\2\1\2\r\25\3\2\2\2\16\17\f\4\2\2\17\20\5\6\4\2\20\21\5\4\3\2\21\22"+
		"\b\2\1\2\22\24\3\2\2\2\23\16\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26"+
		"\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\31\b\3\1\2\31\32\7\7\2\2\32\33"+
		"\b\3\1\2\33#\3\2\2\2\34\35\f\4\2\2\35\36\5\b\5\2\36\37\7\7\2\2\37 \b\3"+
		"\1\2 \"\3\2\2\2!\34\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2"+
		"%#\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\t\3\2\2)\t\3\2\2\2\4\25#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}