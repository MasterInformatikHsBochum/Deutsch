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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, VARIABLE=37, ZAHL=38, 
		WAHRHEITSWERT=39, ZEICHENKETTE=40, OPERATOR=41, LEERRAUM=42, KOMMENTAR=43;
	public static final int
		RULE_programm = 0, RULE_anweisung = 1, RULE_variable = 2, RULE_zahl = 3, 
		RULE_wahrheitswert = 4, RULE_zeichenkette = 5, RULE_operator = 6, RULE_zuweisung = 7, 
		RULE_ausgabe = 8, RULE_eingabe = 9, RULE_addition = 10, RULE_subtraktion = 11, 
		RULE_multiplikation = 12, RULE_division = 13, RULE_bedingteAnweisung = 14, 
		RULE_wiederholung = 15, RULE_tätigkeit = 16, RULE_tätigkeitsAufruf = 17;
	public static final String[] ruleNames = {
		"programm", "anweisung", "variable", "zahl", "wahrheitswert", "zeichenkette", 
		"operator", "zuweisung", "ausgabe", "eingabe", "addition", "subtraktion", 
		"multiplikation", "division", "bedingteAnweisung", "wiederholung", "tätigkeit", 
		"tätigkeitsAufruf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Von Anfang'", "'bis Ende.'", "'Erschaffe '", "' und weise '", 
		"' zu.'", "'Gebe '", "' aus.'", "'Gebe Wert für '", "' ein:'", "'Füge '", 
		"' zu '", "' hinzu.'", "'Ziehe '", "' von '", "' ab.'", "'Vervielfältige '", 
		"' um '", "'.'", "'Teile '", "' durch '", "'Falls'", "'dann'", "'sonst'", 
		"'Anweisungsende.'", "'Solange'", "'Wiederholungsende.'", "'Tätigkeitsbeschreibung von'", 
		"':'", "'Benötigt wird folgendes:'", "'Anweisungen:'", "'Gib'", "'zurück.'", 
		"'Schließe Tätigkeit ab.'", "'Führe Tätigkeit'", "'mit'", "'aus.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "VARIABLE", "ZAHL", "WAHRHEITSWERT", "ZEICHENKETTE", "OPERATOR", 
		"LEERRAUM", "KOMMENTAR"
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
			setState(45);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0)) {
					{
					{
					setState(37);
					anweisung();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__1);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
			setState(57);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				zuweisung();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				ausgabe();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				eingabe();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				addition();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				subtraktion();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				multiplikation();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				division();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				bedingteAnweisung();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				wiederholung();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 10);
				{
				setState(56);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(DeutschParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VARIABLE);
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

	public static class ZahlContext extends ParserRuleContext {
		public TerminalNode ZAHL() { return getToken(DeutschParser.ZAHL, 0); }
		public ZahlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zahl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterZahl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitZahl(this);
		}
	}

	public final ZahlContext zahl() throws RecognitionException {
		ZahlContext _localctx = new ZahlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_zahl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ZAHL);
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

	public static class WahrheitswertContext extends ParserRuleContext {
		public TerminalNode WAHRHEITSWERT() { return getToken(DeutschParser.WAHRHEITSWERT, 0); }
		public WahrheitswertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wahrheitswert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterWahrheitswert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitWahrheitswert(this);
		}
	}

	public final WahrheitswertContext wahrheitswert() throws RecognitionException {
		WahrheitswertContext _localctx = new WahrheitswertContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wahrheitswert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(WAHRHEITSWERT);
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
		public TerminalNode ZEICHENKETTE() { return getToken(DeutschParser.ZEICHENKETTE, 0); }
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
		enterRule(_localctx, 10, RULE_zeichenkette);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ZEICHENKETTE);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(DeutschParser.OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeutschListener ) ((DeutschListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OPERATOR);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
		public WahrheitswertContext wahrheitswert() {
			return getRuleContext(WahrheitswertContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(70);
			variable();
			setState(71);
			match(T__3);
			setState(76);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(72);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(73);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(74);
				wahrheitswert();
				}
				break;
			case ZEICHENKETTE:
				{
				setState(75);
				zeichenkette();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			match(T__4);
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
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
		public WahrheitswertContext wahrheitswert() {
			return getRuleContext(WahrheitswertContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ZeichenketteContext zeichenkette() {
			return getRuleContext(ZeichenketteContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_ausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__5);
			setState(85);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(81);
				zahl();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(82);
				wahrheitswert();
				}
				break;
			case VARIABLE:
				{
				setState(83);
				variable();
				}
				break;
			case ZEICHENKETTE:
				{
				setState(84);
				zeichenkette();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			match(T__6);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_eingabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			{
			setState(90);
			variable();
			}
			setState(91);
			match(T__8);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(96);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(94);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(95);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(T__10);
			setState(99);
			variable();
			setState(100);
			match(T__11);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_subtraktion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__12);
			setState(105);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(103);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(104);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			match(T__13);
			setState(108);
			variable();
			setState(109);
			match(T__14);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_multiplikation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(114);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(112);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(113);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			match(T__16);
			setState(117);
			variable();
			setState(118);
			match(T__17);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__18);
			setState(123);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(121);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(122);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(T__19);
			setState(126);
			variable();
			setState(127);
			match(T__17);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ZahlContext> zahl() {
			return getRuleContexts(ZahlContext.class);
		}
		public ZahlContext zahl(int i) {
			return getRuleContext(ZahlContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<WahrheitswertContext> wahrheitswert() {
			return getRuleContexts(WahrheitswertContext.class);
		}
		public WahrheitswertContext wahrheitswert(int i) {
			return getRuleContext(WahrheitswertContext.class,i);
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
		enterRule(_localctx, 28, RULE_bedingteAnweisung);
		int _la;
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__20);
				setState(133);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(130);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(131);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(132);
					wahrheitswert();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				operator();
				setState(139);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(136);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(137);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(138);
					wahrheitswert();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				match(T__21);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					anweisung();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0) );
				setState(147);
				match(T__22);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					anweisung();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0) );
				setState(153);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__20);
				setState(159);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(156);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(157);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(158);
					wahrheitswert();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161);
				operator();
				setState(165);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(162);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(163);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(164);
					wahrheitswert();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167);
				match(T__21);
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					anweisung();
					}
					}
					setState(171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0) );
				setState(173);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ZahlContext> zahl() {
			return getRuleContexts(ZahlContext.class);
		}
		public ZahlContext zahl(int i) {
			return getRuleContext(ZahlContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<WahrheitswertContext> wahrheitswert() {
			return getRuleContexts(WahrheitswertContext.class);
		}
		public WahrheitswertContext wahrheitswert(int i) {
			return getRuleContext(WahrheitswertContext.class,i);
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
		enterRule(_localctx, 30, RULE_wiederholung);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__24);
			setState(181);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(178);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(179);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(180);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			operator();
			setState(187);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(184);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(185);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(186);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0)) {
				{
				{
				setState(189);
				anweisung();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__25);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public ZahlContext zahl() {
			return getRuleContext(ZahlContext.class,0);
		}
		public WahrheitswertContext wahrheitswert() {
			return getRuleContext(WahrheitswertContext.class,0);
		}
		public ZeichenketteContext zeichenkette() {
			return getRuleContext(ZeichenketteContext.class,0);
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
		enterRule(_localctx, 32, RULE_tätigkeit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__26);
			{
			setState(198);
			variable();
			}
			setState(199);
			match(T__27);
			setState(200);
			match(T__28);
			{
			setState(201);
			variable();
			}
			setState(202);
			match(T__29);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__24) | (1L << T__33))) != 0)) {
				{
				{
				setState(203);
				anweisung();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(209);
				match(T__30);
				setState(214);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(210);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(211);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(212);
					wahrheitswert();
					}
					break;
				case ZEICHENKETTE:
					{
					setState(213);
					zeichenkette();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216);
				match(T__31);
				}
			}

			setState(220);
			match(T__32);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		enterRule(_localctx, 34, RULE_tätigkeitsAufruf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__33);
			{
			setState(223);
			variable();
			}
			setState(224);
			match(T__34);
			{
			setState(225);
			variable();
			}
			setState(226);
			match(T__35);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\5\2\60\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\nX\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fc\n\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\5\rl\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16"+
		"u\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17~\n\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u0088\n\20\3\20\3\20\3\20\3\20\5\20\u008e"+
		"\n\20\3\20\3\20\6\20\u0092\n\20\r\20\16\20\u0093\3\20\3\20\6\20\u0098"+
		"\n\20\r\20\16\20\u0099\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a2\n\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00a8\n\20\3\20\3\20\6\20\u00ac\n\20\r\20\16\20"+
		"\u00ad\3\20\3\20\5\20\u00b2\n\20\3\21\3\21\3\21\3\21\5\21\u00b8\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00be\n\21\3\21\7\21\u00c1\n\21\f\21\16\21\u00c4"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00cf\n\22\f"+
		"\22\16\22\u00d2\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d9\n\22\3\22\3"+
		"\22\5\22\u00dd\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00ff\2/\3\2\2\2\4;\3"+
		"\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20G\3\2"+
		"\2\2\22R\3\2\2\2\24[\3\2\2\2\26_\3\2\2\2\30h\3\2\2\2\32q\3\2\2\2\34z\3"+
		"\2\2\2\36\u00b1\3\2\2\2 \u00b3\3\2\2\2\"\u00c7\3\2\2\2$\u00e0\3\2\2\2"+
		"&*\7\3\2\2\')\5\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2"+
		"\2,*\3\2\2\2-\60\7\4\2\2.\60\5\"\22\2/&\3\2\2\2/.\3\2\2\2\60\3\3\2\2\2"+
		"\61<\5\20\t\2\62<\5\22\n\2\63<\5\24\13\2\64<\5\26\f\2\65<\5\30\r\2\66"+
		"<\5\32\16\2\67<\5\34\17\28<\5\36\20\29<\5 \21\2:<\5$\23\2;\61\3\2\2\2"+
		";\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2"+
		"\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\'\2\2>\7\3\2\2\2?@\7("+
		"\2\2@\t\3\2\2\2AB\7)\2\2B\13\3\2\2\2CD\7*\2\2D\r\3\2\2\2EF\7+\2\2F\17"+
		"\3\2\2\2GH\7\5\2\2HI\5\6\4\2IN\7\6\2\2JO\5\b\5\2KO\5\6\4\2LO\5\n\6\2M"+
		"O\5\f\7\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\7\7\2\2"+
		"Q\21\3\2\2\2RW\7\b\2\2SX\5\b\5\2TX\5\n\6\2UX\5\6\4\2VX\5\f\7\2WS\3\2\2"+
		"\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\t\2\2Z\23\3\2\2\2[\\\7"+
		"\n\2\2\\]\5\6\4\2]^\7\13\2\2^\25\3\2\2\2_b\7\f\2\2`c\5\b\5\2ac\5\6\4\2"+
		"b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2de\7\r\2\2ef\5\6\4\2fg\7\16\2\2g\27\3\2"+
		"\2\2hk\7\17\2\2il\5\b\5\2jl\5\6\4\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mn\7"+
		"\20\2\2no\5\6\4\2op\7\21\2\2p\31\3\2\2\2qt\7\22\2\2ru\5\b\5\2su\5\6\4"+
		"\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\23\2\2wx\5\6\4\2xy\7\24\2\2y\33\3"+
		"\2\2\2z}\7\25\2\2{~\5\b\5\2|~\5\6\4\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\7\26\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7\24\2\2\u0082\35"+
		"\3\2\2\2\u0083\u0087\7\27\2\2\u0084\u0088\5\b\5\2\u0085\u0088\5\6\4\2"+
		"\u0086\u0088\5\n\6\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\5\16\b\2\u008a\u008e\5\b\5\2"+
		"\u008b\u008e\5\6\4\2\u008c\u008e\5\n\6\2\u008d\u008a\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\30\2\2"+
		"\u0090\u0092\5\4\3\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7\31\2\2"+
		"\u0096\u0098\5\4\3\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\32\2\2"+
		"\u009c\u00b2\3\2\2\2\u009d\u00a1\7\27\2\2\u009e\u00a2\5\b\5\2\u009f\u00a2"+
		"\5\6\4\2\u00a0\u00a2\5\n\6\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\5\16\b\2\u00a4\u00a8\5"+
		"\b\5\2\u00a5\u00a8\5\6\4\2\u00a6\u00a8\5\n\6\2\u00a7\u00a4\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\30"+
		"\2\2\u00aa\u00ac\5\4\3\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\32"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u0083\3\2\2\2\u00b1\u009d\3\2\2\2\u00b2"+
		"\37\3\2\2\2\u00b3\u00b7\7\33\2\2\u00b4\u00b8\5\b\5\2\u00b5\u00b8\5\6\4"+
		"\2\u00b6\u00b8\5\n\6\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\5\16\b\2\u00ba\u00be\5\b\5\2"+
		"\u00bb\u00be\5\6\4\2\u00bc\u00be\5\n\6\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\5\4\3\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\34\2\2\u00c6"+
		"!\3\2\2\2\u00c7\u00c8\7\35\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\7\36\2"+
		"\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00d0\7 \2\2\u00cd\u00cf"+
		"\5\4\3\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00dc\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\7!"+
		"\2\2\u00d4\u00d9\5\b\5\2\u00d5\u00d9\5\6\4\2\u00d6\u00d9\5\n\6\2\u00d7"+
		"\u00d9\5\f\7\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\"\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\7#\2\2\u00df#\3\2\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e2"+
		"\5\6\4\2\u00e2\u00e3\7%\2\2\u00e3\u00e4\5\6\4\2\u00e4\u00e5\7&\2\2\u00e5"+
		"%\3\2\2\2\31*/;NWbkt}\u0087\u008d\u0093\u0099\u00a1\u00a7\u00ad\u00b1"+
		"\u00b7\u00bd\u00c2\u00d0\u00d8\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}