// Generated from C:/Users/daisy/Documents/24X/COSC 59/Project/CS59 Final Project/Autograde.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AutogradeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, LETTER=2, SEMICOLON=3, LBRACK=4, RBRACK=5, LPREN=6, RPREN=7, 
		EQUAL=8, COLON=9, FALSE=10, TRUE=11, COMMA=12, DOT=13, UNDERSCORE=14, 
		SLASH=15, NEW=16, STRING=17, WS=18, CONFIGURE=19, POINTS=20, TEST_CASES=21, 
		FUNCTION=22, DUE_DATE=23, LATE_PENALTY=24, EARLY_TIME=25, EARLY_REWARD=26, 
		LANGUAGE=27, FUNCTIONS=28;
	public static final int
		RULE_start = 0, RULE_list = 1, RULE_expr = 2, RULE_new = 3, RULE_variable = 4, 
		RULE_test_list = 5, RULE_test_item = 6, RULE_input_list = 7, RULE_input = 8, 
		RULE_expected_output = 9, RULE_points = 10, RULE_configure = 11, RULE_config_list = 12, 
		RULE_config_item = 13, RULE_config_key = 14, RULE_config_value = 15, RULE_function_list = 16, 
		RULE_method_call = 17, RULE_method_list = 18, RULE_method_item = 19, RULE_method_item_val = 20, 
		RULE_id = 21, RULE_submission_time = 22, RULE_name = 23, RULE_function_name = 24, 
		RULE_num = 25, RULE_decimal = 26, RULE_bool = 27, RULE_string_literal = 28, 
		RULE_date = 29, RULE_time = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "list", "expr", "new", "variable", "test_list", "test_item", 
			"input_list", "input", "expected_output", "points", "configure", "config_list", 
			"config_item", "config_key", "config_value", "function_list", "method_call", 
			"method_list", "method_item", "method_item_val", "id", "submission_time", 
			"name", "function_name", "num", "decimal", "bool", "string_literal", 
			"date", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "'{'", "'}'", "'('", "')'", "'='", "':'", "'False'", 
			"'True'", "','", "'.'", "'_'", "'/'", "'new'", null, null, "'configure'", 
			"'points'", "'test_cases'", "'function'", "'due_date'", "'late_penalty'", 
			"'early_time'", "'early_reward'", "'language'", "'functions'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIGIT", "LETTER", "SEMICOLON", "LBRACK", "RBRACK", "LPREN", "RPREN", 
			"EQUAL", "COLON", "FALSE", "TRUE", "COMMA", "DOT", "UNDERSCORE", "SLASH", 
			"NEW", "STRING", "WS", "CONFIGURE", "POINTS", "TEST_CASES", "FUNCTION", 
			"DUE_DATE", "LATE_PENALTY", "EARLY_TIME", "EARLY_REWARD", "LANGUAGE", 
			"FUNCTIONS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Autograde.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutogradeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			list(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		return list(0);
	}

	private ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState);
		ListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(67);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(68);
					expr();
					}
					} 
				}
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public NewContext new_() {
			return getRuleContext(NewContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConfigureContext configure() {
			return getRuleContext(ConfigureContext.class,0);
		}
		public Test_listContext test_list() {
			return getRuleContext(Test_listContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				new_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				configure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				test_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				method_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AutogradeParser.EQUAL, 0); }
		public TerminalNode NEW() { return getToken(AutogradeParser.NEW, 0); }
		public TerminalNode LPREN() { return getToken(AutogradeParser.LPREN, 0); }
		public TerminalNode RPREN() { return getToken(AutogradeParser.RPREN, 0); }
		public NewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewContext new_() throws RecognitionException {
		NewContext _localctx = new NewContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			name();
			setState(82);
			match(EQUAL);
			setState(83);
			match(NEW);
			setState(84);
			name();
			setState(85);
			match(LPREN);
			setState(86);
			match(RPREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AutogradeParser.EQUAL, 0); }
		public Test_listContext test_list() {
			return getRuleContext(Test_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			name();
			setState(89);
			match(EQUAL);
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(90);
				test_list();
				}
				break;
			case LETTER:
				{
				setState(91);
				id();
				}
				break;
			case DIGIT:
			case DOT:
				{
				setState(92);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Test_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AutogradeParser.LBRACK, 0); }
		public List<Test_itemContext> test_item() {
			return getRuleContexts(Test_itemContext.class);
		}
		public Test_itemContext test_item(int i) {
			return getRuleContext(Test_itemContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AutogradeParser.RBRACK, 0); }
		public Test_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterTest_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitTest_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitTest_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_listContext test_list() throws RecognitionException {
		Test_listContext _localctx = new Test_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_test_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LBRACK);
			setState(96);
			test_item();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142358L) != 0)) {
				{
				{
				setState(97);
				test_item();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Test_itemContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(AutogradeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutogradeParser.COMMA, i);
		}
		public Expected_outputContext expected_output() {
			return getRuleContext(Expected_outputContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AutogradeParser.SEMICOLON, 0); }
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public Test_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterTest_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitTest_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitTest_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_itemContext test_item() throws RecognitionException {
		Test_itemContext _localctx = new Test_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_test_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				setState(105);
				input_list();
				}
				break;
			case DIGIT:
			case LETTER:
			case FALSE:
			case TRUE:
			case DOT:
			case STRING:
				{
				setState(106);
				input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(COMMA);
			setState(110);
			expected_output();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(111);
				match(COMMA);
				setState(112);
				points();
				}
			}

			setState(115);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AutogradeParser.LBRACK, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AutogradeParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AutogradeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutogradeParser.COMMA, i);
		}
		public Input_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterInput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitInput_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitInput_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_listContext input_list() throws RecognitionException {
		Input_listContext _localctx = new Input_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LBRACK);
			setState(118);
			input();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				input();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				num();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				string_literal();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expected_outputContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Expected_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expected_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterExpected_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitExpected_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitExpected_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expected_outputContext expected_output() throws RecognitionException {
		Expected_outputContext _localctx = new Expected_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expected_output);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				num();
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				string_literal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointsContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode POINTS() { return getToken(AutogradeParser.POINTS, 0); }
		public TerminalNode EQUAL() { return getToken(AutogradeParser.EQUAL, 0); }
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_points);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				num();
				}
				break;
			case POINTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(POINTS);
				setState(141);
				match(EQUAL);
				setState(142);
				num();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigureContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AutogradeParser.DOT, 0); }
		public TerminalNode CONFIGURE() { return getToken(AutogradeParser.CONFIGURE, 0); }
		public TerminalNode LBRACK() { return getToken(AutogradeParser.LBRACK, 0); }
		public Config_listContext config_list() {
			return getRuleContext(Config_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AutogradeParser.RBRACK, 0); }
		public TerminalNode UNDERSCORE() { return getToken(AutogradeParser.UNDERSCORE, 0); }
		public ConfigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterConfigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitConfigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitConfigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigureContext configure() throws RecognitionException {
		ConfigureContext _localctx = new ConfigureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_configure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			id();
			setState(146);
			match(DOT);
			setState(147);
			match(CONFIGURE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(148);
				match(UNDERSCORE);
				setState(149);
				id();
				}
			}

			setState(152);
			match(LBRACK);
			setState(153);
			config_list();
			setState(154);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Config_listContext extends ParserRuleContext {
		public List<Config_itemContext> config_item() {
			return getRuleContexts(Config_itemContext.class);
		}
		public Config_itemContext config_item(int i) {
			return getRuleContext(Config_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutogradeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutogradeParser.COMMA, i);
		}
		public Config_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterConfig_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitConfig_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitConfig_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_listContext config_list() throws RecognitionException {
		Config_listContext _localctx = new Config_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_config_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			config_item();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				config_item();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Config_itemContext extends ParserRuleContext {
		public Config_keyContext config_key() {
			return getRuleContext(Config_keyContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AutogradeParser.EQUAL, 0); }
		public Config_valueContext config_value() {
			return getRuleContext(Config_valueContext.class,0);
		}
		public Config_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterConfig_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitConfig_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitConfig_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_itemContext config_item() throws RecognitionException {
		Config_itemContext _localctx = new Config_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_config_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			config_key();
			setState(165);
			match(EQUAL);
			setState(166);
			config_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Config_keyContext extends ParserRuleContext {
		public TerminalNode DUE_DATE() { return getToken(AutogradeParser.DUE_DATE, 0); }
		public TerminalNode LATE_PENALTY() { return getToken(AutogradeParser.LATE_PENALTY, 0); }
		public TerminalNode EARLY_TIME() { return getToken(AutogradeParser.EARLY_TIME, 0); }
		public TerminalNode EARLY_REWARD() { return getToken(AutogradeParser.EARLY_REWARD, 0); }
		public TerminalNode LANGUAGE() { return getToken(AutogradeParser.LANGUAGE, 0); }
		public TerminalNode FUNCTIONS() { return getToken(AutogradeParser.FUNCTIONS, 0); }
		public TerminalNode FUNCTION() { return getToken(AutogradeParser.FUNCTION, 0); }
		public TerminalNode TEST_CASES() { return getToken(AutogradeParser.TEST_CASES, 0); }
		public TerminalNode POINTS() { return getToken(AutogradeParser.POINTS, 0); }
		public Config_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterConfig_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitConfig_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitConfig_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_keyContext config_key() throws RecognitionException {
		Config_keyContext _localctx = new Config_keyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_config_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 535822336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Config_valueContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Config_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterConfig_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitConfig_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitConfig_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Config_valueContext config_value() throws RecognitionException {
		Config_valueContext _localctx = new Config_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_config_value);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				function_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				function_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				num();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AutogradeParser.LBRACK, 0); }
		public List<Function_nameContext> function_name() {
			return getRuleContexts(Function_nameContext.class);
		}
		public Function_nameContext function_name(int i) {
			return getRuleContext(Function_nameContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AutogradeParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AutogradeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutogradeParser.COMMA, i);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitFunction_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitFunction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LBRACK);
			setState(180);
			function_name();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				function_name();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AutogradeParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Method_listContext method_list() {
			return getRuleContext(Method_listContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			id();
			setState(191);
			match(DOT);
			setState(192);
			name();
			setState(193);
			method_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_listContext extends ParserRuleContext {
		public TerminalNode LPREN() { return getToken(AutogradeParser.LPREN, 0); }
		public List<Method_itemContext> method_item() {
			return getRuleContexts(Method_itemContext.class);
		}
		public Method_itemContext method_item(int i) {
			return getRuleContext(Method_itemContext.class,i);
		}
		public TerminalNode RPREN() { return getToken(AutogradeParser.RPREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AutogradeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutogradeParser.COMMA, i);
		}
		public Method_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterMethod_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitMethod_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitMethod_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_listContext method_list() throws RecognitionException {
		Method_listContext _localctx = new Method_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LPREN);
			setState(196);
			method_item();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				method_item();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RPREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_itemContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AutogradeParser.EQUAL, 0); }
		public Method_item_valContext method_item_val() {
			return getRuleContext(Method_item_valContext.class,0);
		}
		public Method_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterMethod_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitMethod_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitMethod_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_itemContext method_item() throws RecognitionException {
		Method_itemContext _localctx = new Method_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_method_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			name();
			setState(207);
			match(EQUAL);
			setState(208);
			method_item_val();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_item_valContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutogradeParser.STRING, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Submission_timeContext submission_time() {
			return getRuleContext(Submission_timeContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Method_item_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_item_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterMethod_item_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitMethod_item_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitMethod_item_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_item_valContext method_item_val() throws RecognitionException {
		Method_item_valContext _localctx = new Method_item_valContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method_item_val);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				submission_time();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				bool();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AutogradeParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AutogradeParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LETTER);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					_la = _input.LA(1);
					if ( !(_la==DIGIT || _la==LETTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(222);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Submission_timeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public TerminalNode COLON() { return getToken(AutogradeParser.COLON, 0); }
		public Submission_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submission_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterSubmission_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitSubmission_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitSubmission_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Submission_timeContext submission_time() throws RecognitionException {
		Submission_timeContext _localctx = new Submission_timeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_submission_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(DIGIT);
			setState(224);
			match(DIGIT);
			setState(225);
			match(COLON);
			setState(226);
			match(DIGIT);
			setState(227);
			match(DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(AutogradeParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(AutogradeParser.LETTER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(AutogradeParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(AutogradeParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(LETTER);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16390L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16390L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPREN() { return getToken(AutogradeParser.LPREN, 0); }
		public TerminalNode RPREN() { return getToken(AutogradeParser.RPREN, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			name();
			setState(236);
			match(LPREN);
			setState(237);
			match(RPREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_num);
		try {
			int _alt;
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(239);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(242); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AutogradeParser.DOT, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decimal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(247);
				match(DIGIT);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(DOT);
			setState(255); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(254);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(257); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AutogradeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AutogradeParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AutogradeParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AutogradeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AutogradeParser.DIGIT, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AutogradeParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AutogradeParser.SLASH, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DIGIT);
			setState(264);
			match(DIGIT);
			setState(265);
			match(SLASH);
			setState(266);
			match(DIGIT);
			setState(267);
			match(DIGIT);
			setState(268);
			match(SLASH);
			setState(269);
			match(DIGIT);
			setState(270);
			match(DIGIT);
			setState(271);
			match(DIGIT);
			setState(272);
			match(DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(AutogradeParser.LETTER, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutogradeListener ) ((AutogradeListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutogradeVisitor ) return ((AutogradeVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			num();
			setState(275);
			match(LETTER);
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
		case 1:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0116\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004^\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005c\b\u0005\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007"+
		"\f\u0007}\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0085\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0097\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a0\b"+
		"\f\n\f\f\f\u00a3\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00b2\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00b8\b\u0010\n\u0010\f\u0010\u00bb\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00c8\b\u0012\n\u0012\f\u0012\u00cb\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00d7\b\u0014\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00db\b\u0015\n\u0015\f\u0015\u00de\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u00e8\b\u0017\u000b\u0017\f\u0017\u00e9\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00f1\b\u0019\u000b"+
		"\u0019\f\u0019\u00f2\u0001\u0019\u0003\u0019\u00f6\b\u0019\u0001\u001a"+
		"\u0005\u001a\u00f9\b\u001a\n\u001a\f\u001a\u00fc\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0004\u001a\u0100\b\u001a\u000b\u001a\f\u001a\u0101\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0000\u0001\u0002\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0004\u0001"+
		"\u0000\u0014\u001c\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0002\u000e"+
		"\u000e\u0001\u0000\n\u000b\u011a\u0000>\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006Q\u0001"+
		"\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000"+
		"\fk\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010\u0084"+
		"\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u008f"+
		"\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u009c"+
		"\u0001\u0000\u0000\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00a8"+
		"\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00b3\u0001"+
		"\u0000\u0000\u0000\"\u00be\u0001\u0000\u0000\u0000$\u00c3\u0001\u0000"+
		"\u0000\u0000&\u00ce\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000"+
		"*\u00d8\u0001\u0000\u0000\u0000,\u00df\u0001\u0000\u0000\u0000.\u00e5"+
		"\u0001\u0000\u0000\u00000\u00eb\u0001\u0000\u0000\u00002\u00f5\u0001\u0000"+
		"\u0000\u00004\u00fa\u0001\u0000\u0000\u00006\u0103\u0001\u0000\u0000\u0000"+
		"8\u0105\u0001\u0000\u0000\u0000:\u0107\u0001\u0000\u0000\u0000<\u0112"+
		"\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?\u0001\u0001\u0000"+
		"\u0000\u0000@A\u0006\u0001\uffff\uffff\u0000AB\u0003\u0004\u0002\u0000"+
		"BG\u0001\u0000\u0000\u0000CD\n\u0001\u0000\u0000DF\u0003\u0004\u0002\u0000"+
		"EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JP\u0003\u0006\u0003\u0000KP\u0003\b\u0004\u0000LP\u0003"+
		"\u0016\u000b\u0000MP\u0003\n\u0005\u0000NP\u0003\"\u0011\u0000OJ\u0001"+
		"\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0005\u0001\u0000"+
		"\u0000\u0000QR\u0003.\u0017\u0000RS\u0005\b\u0000\u0000ST\u0005\u0010"+
		"\u0000\u0000TU\u0003.\u0017\u0000UV\u0005\u0006\u0000\u0000VW\u0005\u0007"+
		"\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0003.\u0017\u0000Y]\u0005"+
		"\b\u0000\u0000Z^\u0003\n\u0005\u0000[^\u0003*\u0015\u0000\\^\u00032\u0019"+
		"\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^\t\u0001\u0000\u0000\u0000_`\u0005\u0004\u0000\u0000`d\u0003"+
		"\f\u0006\u0000ac\u0003\f\u0006\u0000ba\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0005\u0000"+
		"\u0000h\u000b\u0001\u0000\u0000\u0000il\u0003\u000e\u0007\u0000jl\u0003"+
		"\u0010\b\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0005\f\u0000\u0000nq\u0003\u0012\t\u0000op\u0005"+
		"\f\u0000\u0000pr\u0003\u0014\n\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0003\u0000\u0000"+
		"t\r\u0001\u0000\u0000\u0000uv\u0005\u0004\u0000\u0000v{\u0003\u0010\b"+
		"\u0000wx\u0005\f\u0000\u0000xz\u0003\u0010\b\u0000yw\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0005\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0085"+
		"\u00032\u0019\u0000\u0081\u0085\u00036\u001b\u0000\u0082\u0085\u00038"+
		"\u001c\u0000\u0083\u0085\u0003*\u0015\u0000\u0084\u0080\u0001\u0000\u0000"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0011\u0001\u0000\u0000"+
		"\u0000\u0086\u008a\u00032\u0019\u0000\u0087\u008a\u00036\u001b\u0000\u0088"+
		"\u008a\u00038\u001c\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0013"+
		"\u0001\u0000\u0000\u0000\u008b\u0090\u00032\u0019\u0000\u008c\u008d\u0005"+
		"\u0014\u0000\u0000\u008d\u008e\u0005\b\u0000\u0000\u008e\u0090\u00032"+
		"\u0019\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000"+
		"\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0003*\u0015"+
		"\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u0096\u0005\u0013\u0000\u0000"+
		"\u0094\u0095\u0005\u000e\u0000\u0000\u0095\u0097\u0003*\u0015\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099"+
		"\u009a\u0003\u0018\f\u0000\u009a\u009b\u0005\u0005\u0000\u0000\u009b\u0017"+
		"\u0001\u0000\u0000\u0000\u009c\u00a1\u0003\u001a\r\u0000\u009d\u009e\u0005"+
		"\f\u0000\u0000\u009e\u00a0\u0003\u001a\r\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0019\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u001c"+
		"\u000e\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f"+
		"\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0000\u0000"+
		"\u0000\u00a9\u001d\u0001\u0000\u0000\u0000\u00aa\u00b2\u0003<\u001e\u0000"+
		"\u00ab\u00b2\u0003:\u001d\u0000\u00ac\u00b2\u0003.\u0017\u0000\u00ad\u00b2"+
		"\u00030\u0018\u0000\u00ae\u00b2\u0003 \u0010\u0000\u00af\u00b2\u0003*"+
		"\u0015\u0000\u00b0\u00b2\u00032\u0019\u0000\u00b1\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000"+
		"\u0000\u00b4\u00b9\u00030\u0018\u0000\u00b5\u00b6\u0005\f\u0000\u0000"+
		"\u00b6\u00b8\u00030\u0018\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd"+
		"!\u0001\u0000\u0000\u0000\u00be\u00bf\u0003*\u0015\u0000\u00bf\u00c0\u0005"+
		"\r\u0000\u0000\u00c0\u00c1\u0003.\u0017\u0000\u00c1\u00c2\u0003$\u0012"+
		"\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000"+
		"\u00c4\u00c9\u0003&\u0013\u0000\u00c5\u00c6\u0005\f\u0000\u0000\u00c6"+
		"\u00c8\u0003&\u0013\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd%\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0003.\u0017\u0000\u00cf\u00d0\u0005\b"+
		"\u0000\u0000\u00d0\u00d1\u0003(\u0014\u0000\u00d1\'\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d7\u0005\u0011\u0000\u0000\u00d3\u00d7\u0003:\u001d\u0000"+
		"\u00d4\u00d7\u0003,\u0016\u0000\u00d5\u00d7\u00036\u001b\u0000\u00d6\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7)\u0001"+
		"\u0000\u0000\u0000\u00d8\u00dc\u0005\u0002\u0000\u0000\u00d9\u00db\u0007"+
		"\u0001\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd+\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e1\u0005\u0001"+
		"\u0000\u0000\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e3\u0005\u0001\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0001\u0000\u0000\u00e4-\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0005\u0002\u0000\u0000\u00e6\u00e8\u0007\u0002\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea/\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003.\u0017\u0000\u00ec\u00ed"+
		"\u0005\u0006\u0000\u0000\u00ed\u00ee\u0005\u0007\u0000\u0000\u00ee1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0005\u0001\u0000\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u00034\u001a\u0000\u00f5\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f63\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0005\u0001\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005\r\u0000\u0000"+
		"\u00fe\u0100\u0005\u0001\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u01025\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0007\u0003\u0000\u0000\u01047\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0005\u0011\u0000\u0000\u01069\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0001\u0000\u0000\u0108\u0109\u0005\u0001\u0000\u0000\u0109\u010a\u0005"+
		"\u000f\u0000\u0000\u010a\u010b\u0005\u0001\u0000\u0000\u010b\u010c\u0005"+
		"\u0001\u0000\u0000\u010c\u010d\u0005\u000f\u0000\u0000\u010d\u010e\u0005"+
		"\u0001\u0000\u0000\u010e\u010f\u0005\u0001\u0000\u0000\u010f\u0110\u0005"+
		"\u0001\u0000\u0000\u0110\u0111\u0005\u0001\u0000\u0000\u0111;\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u00032\u0019\u0000\u0113\u0114\u0005\u0002\u0000"+
		"\u0000\u0114=\u0001\u0000\u0000\u0000\u0016GO]dkq{\u0084\u0089\u008f\u0096"+
		"\u00a1\u00b1\u00b9\u00c9\u00d6\u00dc\u00e9\u00f2\u00f5\u00fa\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}