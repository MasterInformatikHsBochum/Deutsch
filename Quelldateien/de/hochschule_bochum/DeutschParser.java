package de.hochschule_bochum;
// Generated from Deutsch.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeutschParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, VARIABLE=34, ZAHL=35, WAHRHEITSWERT=36, ZEICHENKETTE=37, 
		OPERATOR=38, LEERRAUM=39, KOMMENTAR=40;
	public static final int
		RULE_programm = 0, RULE_anweisung = 1, RULE_zeichenkette = 2, RULE_zuweisung = 3, 
		RULE_ausgabe = 4, RULE_eingabe = 5, RULE_addition = 6, RULE_subtraktion = 7, 
		RULE_multiplikation = 8, RULE_division = 9, RULE_bedingteAnweisung = 10, 
		RULE_wiederholung = 11, RULE_tätigkeit = 12, RULE_tätigkeitsAufruf = 13;
	public static final String[] ruleNames = {
		"programm", "anweisung", "zeichenkette", "zuweisung", "ausgabe", "eingabe", 
		"addition", "subtraktion", "multiplikation", "division", "bedingteAnweisung", 
		"wiederholung", "tätigkeit", "tätigkeitsAufruf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Von Anfang'", "'bis Ende.'", "'\"'", "'Erschaffe '", "' und weise '", 
		"' zu.'", "'Gebe '", "' aus.'", "'Gebe Wert für '", "' ein:'", "'Füge '", 
		"' zu '", "' hinzu.'", "'Ziehe '", "' von '", "' ab.'", "'Vervielfältige '", 
		"' um '", "'.'", "'Teile '", "' durch '", "'Falls '", "' dann '", "'Anweisungsende.'", 
		"' sonst '", "'Solange '", "'Tätigkeitsbeschreibung von '", "':'", "'Benötigt wird folgendes:'", 
		"'Anweisungen:'", "'Schließe Tätigkeit ab.'", "'Führe Tätigkeit '", "' mit '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
		"ZAHL", "WAHRHEITSWERT", "ZEICHENKETTE", "OPERATOR", "LEERRAUM", "KOMMENTAR"
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
	public String getGrammarFileName() { return "Deutsch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeutschParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public TätigkeitContext tätigkeit() {
			return getRuleContext(TätigkeitContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			setState(37);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__31))) != 0)) {
					{
					{
					setState(29);
					anweisung();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(T__1);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tätigkeit();
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

	public static class AnweisungContext extends ParserRuleContext {
		public ZuweisungContext zuweisung() {
			return getRuleContext(ZuweisungContext.class,0);
		}
		public AusgabeContext ausgabe() {
			return getRuleContext(AusgabeContext.class,0);
		}
		public EingabeContext eingabe() {
			return getRuleContext(EingabeContext.class,0);
		}
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public SubtraktionContext subtraktion() {
			return getRuleContext(SubtraktionContext.class,0);
		}
		public MultiplikationContext multiplikation() {
			return getRuleContext(MultiplikationContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public BedingteAnweisungContext bedingteAnweisung() {
			return getRuleContext(BedingteAnweisungContext.class,0);
		}
		public WiederholungContext wiederholung() {
			return getRuleContext(WiederholungContext.class,0);
		}
		public TätigkeitsAufrufContext tätigkeitsAufruf() {
			return getRuleContext(TätigkeitsAufrufContext.class,0);
		}
		public AnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitAnweisung(this);
		}
	}

	public final AnweisungContext anweisung() throws RecognitionException {
		AnweisungContext _localctx = new AnweisungContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anweisung);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				zuweisung();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				ausgabe();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				eingabe();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				addition();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				subtraktion();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				multiplikation();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				division();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				bedingteAnweisung();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(47);
				wiederholung();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 10);
				{
				setState(48);
				tätigkeitsAufruf();
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

	public static class ZeichenketteContext extends ParserRuleContext {
		public List<TerminalNode> ZEICHENKETTE() { return getTokens(DeutschParser.ZEICHENKETTE); }
		public TerminalNode ZEICHENKETTE(int i) {
			return getToken(DeutschParser.ZEICHENKETTE, i);
		}
		public List<TerminalNode> LEERRAUM() { return getTokens(DeutschParser.LEERRAUM); }
		public TerminalNode LEERRAUM(int i) {
			return getToken(DeutschParser.LEERRAUM, i);
		}
		public ZeichenketteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeichenkette; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterZeichenkette(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitZeichenkette(this);
		}
	}

	public final ZeichenketteContext zeichenkette() throws RecognitionException {
		ZeichenketteContext _localctx = new ZeichenketteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_zeichenkette);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(52);
					_la = _input.LA(1);
					if ( !(_la==ZEICHENKETTE || _la==LEERRAUM) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(58);
			match(T__2);
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

	public static class ZuweisungContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public TerminalNode WAHRHEITSWERT() { return getToken(DeutschParser.WAHRHEITSWERT, 0); }
		public ZeichenketteContext zeichenkette() {
			return getRuleContext(ZeichenketteContext.class,0);
		}
		public ZuweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterZuweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitZuweisung(this);
		}
	}

	public final ZuweisungContext zuweisung() throws RecognitionException {
		ZuweisungContext _localctx = new ZuweisungContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__3);
			setState(61);
			match(VARIABLE);
			setState(62);
			match(T__4);
			setState(67);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(63);
				match(ZAHL);
				}
				break;
			case VARIABLE:
				{
				setState(64);
				match(VARIABLE);
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(65);
				match(WAHRHEITSWERT);
				}
				break;
			case T__2:
				{
				setState(66);
				zeichenkette();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
			match(T__5);
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

	public static class AusgabeContext extends ParserRuleContext {
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public ZeichenketteContext zeichenkette() {
			return getRuleContext(ZeichenketteContext.class,0);
		}
		public TerminalNode WAHRHEITSWERT() { return getToken(DeutschParser.WAHRHEITSWERT, 0); }
		public TerminalNode VARIABLE() { return getToken(DeutschParser.VARIABLE, 0); }
		public AusgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausgabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterAusgabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitAusgabe(this);
		}
	}

	public final AusgabeContext ausgabe() throws RecognitionException {
		AusgabeContext _localctx = new AusgabeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__6);
			setState(76);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(72);
				match(ZAHL);
				}
				break;
			case T__2:
				{
				setState(73);
				zeichenkette();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(74);
				match(WAHRHEITSWERT);
				}
				break;
			case VARIABLE:
				{
				setState(75);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			match(T__7);
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

	public static class EingabeContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(DeutschParser.VARIABLE, 0); }
		public EingabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eingabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterEingabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitEingabe(this);
		}
	}

	public final EingabeContext eingabe() throws RecognitionException {
		EingabeContext _localctx = new EingabeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eingabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__8);
			{
			setState(81);
			match(VARIABLE);
			}
			setState(82);
			match(T__9);
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

	public static class AdditionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__10);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==ZAHL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(86);
			match(T__11);
			setState(87);
			match(VARIABLE);
			setState(88);
			match(T__12);
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

	public static class SubtraktionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public SubtraktionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraktion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterSubtraktion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitSubtraktion(this);
		}
	}

	public final SubtraktionContext subtraktion() throws RecognitionException {
		SubtraktionContext _localctx = new SubtraktionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subtraktion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__13);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==ZAHL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(92);
			match(T__14);
			setState(93);
			match(VARIABLE);
			setState(94);
			match(T__15);
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

	public static class MultiplikationContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public MultiplikationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplikation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterMultiplikation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitMultiplikation(this);
		}
	}

	public final MultiplikationContext multiplikation() throws RecognitionException {
		MultiplikationContext _localctx = new MultiplikationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplikation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__16);
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==ZAHL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(98);
			match(T__17);
			setState(99);
			match(VARIABLE);
			setState(100);
			match(T__18);
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

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__19);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==ZAHL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(104);
			match(T__20);
			setState(105);
			match(VARIABLE);
			setState(106);
			match(T__18);
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

	public static class BedingteAnweisungContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(DeutschParser.OPERATOR, 0); }
		public List<TerminalNode> ZAHL() { return getTokens(DeutschParser.ZAHL); }
		public TerminalNode ZAHL(int i) {
			return getToken(DeutschParser.ZAHL, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public List<TerminalNode> WAHRHEITSWERT() { return getTokens(DeutschParser.WAHRHEITSWERT); }
		public TerminalNode WAHRHEITSWERT(int i) {
			return getToken(DeutschParser.WAHRHEITSWERT, i);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public BedingteAnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bedingteAnweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterBedingteAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitBedingteAnweisung(this);
		}
	}

	public final BedingteAnweisungContext bedingteAnweisung() throws RecognitionException {
		BedingteAnweisungContext _localctx = new BedingteAnweisungContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bedingteAnweisung);
		int _la;
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				match(T__21);
				setState(109);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(110);
				match(OPERATOR);
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(112);
				match(T__22);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					anweisung();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__31))) != 0) );
				}
				setState(118);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(120);
				match(T__21);
				setState(121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(122);
				match(OPERATOR);
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(124);
				match(T__22);
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					anweisung();
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__31))) != 0) );
				setState(130);
				match(T__24);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					anweisung();
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__31))) != 0) );
				}
				setState(136);
				match(T__23);
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

	public static class WiederholungContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(DeutschParser.OPERATOR, 0); }
		public List<TerminalNode> ZAHL() { return getTokens(DeutschParser.ZAHL); }
		public TerminalNode ZAHL(int i) {
			return getToken(DeutschParser.ZAHL, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public List<TerminalNode> WAHRHEITSWERT() { return getTokens(DeutschParser.WAHRHEITSWERT); }
		public TerminalNode WAHRHEITSWERT(int i) {
			return getToken(DeutschParser.WAHRHEITSWERT, i);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public WiederholungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiederholung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterWiederholung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitWiederholung(this);
		}
	}

	public final WiederholungContext wiederholung() throws RecognitionException {
		WiederholungContext _localctx = new WiederholungContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wiederholung);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__25);
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(142);
			match(OPERATOR);
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ZAHL) | (1L << WAHRHEITSWERT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					anweisung();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TätigkeitContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public TätigkeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tätigkeit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterTätigkeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitTätigkeit(this);
		}
	}

	public final TätigkeitContext tätigkeit() throws RecognitionException {
		TätigkeitContext _localctx = new TätigkeitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tätigkeit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__26);
			{
			setState(151);
			match(VARIABLE);
			}
			setState(152);
			match(T__27);
			setState(153);
			match(T__28);
			{
			setState(154);
			match(VARIABLE);
			}
			setState(155);
			match(T__29);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__25) | (1L << T__31))) != 0)) {
				{
				{
				setState(156);
				anweisung();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__30);
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

	public static class TätigkeitsAufrufContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(DeutschParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DeutschParser.VARIABLE, i);
		}
		public TätigkeitsAufrufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tätigkeitsAufruf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterTätigkeitsAufruf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitTätigkeitsAufruf(this);
		}
	}

	public final TätigkeitsAufrufContext tätigkeitsAufruf() throws RecognitionException {
		TätigkeitsAufrufContext _localctx = new TätigkeitsAufrufContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tätigkeitsAufruf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__31);
			{
			setState(165);
			match(VARIABLE);
			}
			setState(166);
			match(T__32);
			{
			setState(167);
			match(VARIABLE);
			}
			setState(168);
			match(T__7);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3"+
		"\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5F\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\fu\n\f\r\f\16"+
		"\fv\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0081\n\f\r\f\16\f\u0082\3\f\3"+
		"\f\6\f\u0087\n\f\r\f\16\f\u0088\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\39\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2"+
		"\'\'))\3\2$%\3\2$&\u00b6\2\'\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b>\3\2"+
		"\2\2\nI\3\2\2\2\fR\3\2\2\2\16V\3\2\2\2\20\\\3\2\2\2\22b\3\2\2\2\24h\3"+
		"\2\2\2\26\u008c\3\2\2\2\30\u008e\3\2\2\2\32\u0098\3\2\2\2\34\u00a6\3\2"+
		"\2\2\36\"\7\3\2\2\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2"+
		"\2\2#%\3\2\2\2$\"\3\2\2\2%(\7\4\2\2&(\5\32\16\2\'\36\3\2\2\2\'&\3\2\2"+
		"\2(\3\3\2\2\2)\64\5\b\5\2*\64\5\n\6\2+\64\5\f\7\2,\64\5\16\b\2-\64\5\20"+
		"\t\2.\64\5\22\n\2/\64\5\24\13\2\60\64\5\26\f\2\61\64\5\30\r\2\62\64\5"+
		"\34\17\2\63)\3\2\2\2\63*\3\2\2\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2\2\63"+
		".\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3"+
		"\2\2\2\659\7\5\2\2\668\t\2\2\2\67\66\3\2\2\28;\3\2\2\29:\3\2\2\29\67\3"+
		"\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\5\2\2=\7\3\2\2\2>?\7\6\2\2?@\7$\2\2@E\7"+
		"\7\2\2AF\7%\2\2BF\7$\2\2CF\7&\2\2DF\5\6\4\2EA\3\2\2\2EB\3\2\2\2EC\3\2"+
		"\2\2ED\3\2\2\2FG\3\2\2\2GH\7\b\2\2H\t\3\2\2\2IN\7\t\2\2JO\7%\2\2KO\5\6"+
		"\4\2LO\7&\2\2MO\7$\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2"+
		"\2PQ\7\n\2\2Q\13\3\2\2\2RS\7\13\2\2ST\7$\2\2TU\7\f\2\2U\r\3\2\2\2VW\7"+
		"\r\2\2WX\t\3\2\2XY\7\16\2\2YZ\7$\2\2Z[\7\17\2\2[\17\3\2\2\2\\]\7\20\2"+
		"\2]^\t\3\2\2^_\7\21\2\2_`\7$\2\2`a\7\22\2\2a\21\3\2\2\2bc\7\23\2\2cd\t"+
		"\3\2\2de\7\24\2\2ef\7$\2\2fg\7\25\2\2g\23\3\2\2\2hi\7\26\2\2ij\t\3\2\2"+
		"jk\7\27\2\2kl\7$\2\2lm\7\25\2\2m\25\3\2\2\2no\7\30\2\2op\t\4\2\2pq\7("+
		"\2\2qr\t\4\2\2rt\7\31\2\2su\5\4\3\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xy\7\32\2\2y\u008d\3\2\2\2z{\7\30\2\2{|\t\4\2\2|}\7(\2"+
		"\2}~\t\4\2\2~\u0080\7\31\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\7\33\2\2\u0085\u0087\5\4\3\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\7\32\2\2\u008b\u008d\3\2\2\2\u008cn\3\2\2\2\u008cz\3"+
		"\2\2\2\u008d\27\3\2\2\2\u008e\u008f\7\34\2\2\u008f\u0090\t\4\2\2\u0090"+
		"\u0091\7(\2\2\u0091\u0095\t\4\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\31\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\35\2\2\u0099\u009a\7$\2"+
		"\2\u009a\u009b\7\36\2\2\u009b\u009c\7\37\2\2\u009c\u009d\7$\2\2\u009d"+
		"\u00a1\7 \2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7!\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\"\2\2"+
		"\u00a7\u00a8\7$\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab"+
		"\7\n\2\2\u00ab\35\3\2\2\2\16\"\'\639ENv\u0082\u0088\u008c\u0095\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}