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
		"' um '", "'.'", "'Teile '", "' durch '", "'Falls'", "'dann'", "'Anweisungsende.'", 
		"'Solange'", "'Wiederholungsende.'", "'Tätigkeitsbeschreibung von'", "':'", 
		"'Benötigt wird folgendes:'", "'Anweisungen:'", "' zurück.'", "'Schließe Tätigkeit ab.'", 
		"'Führe Tätigkeit '", "' mit '"
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
		public List<TätigkeitContext> tätigkeit() {
			return getRuleContexts(TätigkeitContext.class);
		}
		public TätigkeitContext tätigkeit(int i) {
			return getRuleContext(TätigkeitContext.class,i);
		}
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(36);
					tätigkeit();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			match(T__0);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(43);
					anweisung();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(49);
			match(T__1);
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
			setState(61);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				zuweisung();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				ausgabe();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				eingabe();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				addition();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				subtraktion();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				multiplikation();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				division();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				bedingteAnweisung();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				wiederholung();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
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
			setState(63);
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
			setState(65);
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
			setState(67);
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
			setState(69);
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
			setState(71);
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
			setState(73);
			match(T__2);
			setState(74);
			variable();
			setState(75);
			match(T__3);
			setState(80);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(76);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(77);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(78);
				wahrheitswert();
				}
				break;
			case ZEICHENKETTE:
				{
				setState(79);
				zeichenkette();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
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
			setState(84);
			match(T__5);
			setState(89);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(85);
				zahl();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(86);
				wahrheitswert();
				}
				break;
			case VARIABLE:
				{
				setState(87);
				variable();
				}
				break;
			case ZEICHENKETTE:
				{
				setState(88);
				zeichenkette();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
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
			setState(93);
			match(T__7);
			{
			setState(94);
			variable();
			}
			setState(95);
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
			setState(97);
			match(T__9);
			setState(100);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(98);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(99);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(T__10);
			setState(103);
			variable();
			setState(104);
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
			setState(106);
			match(T__12);
			setState(109);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(107);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(108);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(T__13);
			setState(112);
			variable();
			setState(113);
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
			setState(115);
			match(T__15);
			setState(116);
			variable();
			setState(117);
			match(T__16);
			setState(120);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(118);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(119);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
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
			setState(124);
			match(T__18);
			setState(125);
			variable();
			setState(126);
			match(T__19);
			setState(129);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(127);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(128);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__20);
			setState(137);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(134);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(135);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(136);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
			operator();
			setState(143);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(140);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(141);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(142);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			match(T__21);
			setState(147); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(146);
					anweisung();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(151);
			match(T__22);
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
			setState(153);
			match(T__23);
			setState(157);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(154);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(155);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(156);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			operator();
			setState(163);
			switch (_input.LA(1)) {
			case ZAHL:
				{
				setState(160);
				zahl();
				}
				break;
			case VARIABLE:
				{
				setState(161);
				variable();
				}
				break;
			case WAHRHEITSWERT:
				{
				setState(162);
				wahrheitswert();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << T__31))) != 0)) {
				{
				{
				setState(165);
				anweisung();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__24);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__25);
			{
			setState(174);
			variable();
			}
			setState(175);
			match(T__26);
			setState(176);
			match(T__27);
			{
			setState(177);
			variable();
			}
			setState(178);
			match(T__28);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					anweisung();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(194);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(185);
				match(T__5);
				setState(190);
				switch (_input.LA(1)) {
				case ZAHL:
					{
					setState(186);
					zahl();
					}
					break;
				case VARIABLE:
					{
					setState(187);
					variable();
					}
					break;
				case WAHRHEITSWERT:
					{
					setState(188);
					wahrheitswert();
					}
					break;
				case ZEICHENKETTE:
					{
					setState(189);
					zeichenkette();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				match(T__29);
				}
			}

			setState(196);
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
			setState(198);
			match(T__31);
			{
			setState(199);
			variable();
			}
			setState(200);
			match(T__32);
			{
			setState(201);
			variable();
			}
			setState(202);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\5\fg\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rp\n\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\5\16{\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0084\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008c\n\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0092\n\20\3\20\3\20\6\20\u0096\n\20\r\20\16\20\u0097"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00a0\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00a6\n\21\3\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\22\3\22\5\22\u00c5\n\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5)\60\u0097\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00e0\2)\3\2\2\2\4?\3\2\2\2\6A\3"+
		"\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22V\3"+
		"\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30l\3\2\2\2\32u\3\2\2\2\34~\3\2\2\2\36"+
		"\u0087\3\2\2\2 \u009b\3\2\2\2\"\u00af\3\2\2\2$\u00c8\3\2\2\2&(\5\"\22"+
		"\2\'&\3\2\2\2(+\3\2\2\2)*\3\2\2\2)\'\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\60\7"+
		"\3\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61\63"+
		"\3\2\2\2\62\60\3\2\2\2\63\64\7\4\2\2\64\3\3\2\2\2\65@\5\20\t\2\66@\5\22"+
		"\n\2\67@\5\24\13\28@\5\26\f\29@\5\30\r\2:@\5\32\16\2;@\5\34\17\2<@\5\36"+
		"\20\2=@\5 \21\2>@\5$\23\2?\65\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2"+
		"\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2"+
		"\2\2AB\7$\2\2B\7\3\2\2\2CD\7%\2\2D\t\3\2\2\2EF\7&\2\2F\13\3\2\2\2GH\7"+
		"\'\2\2H\r\3\2\2\2IJ\7(\2\2J\17\3\2\2\2KL\7\5\2\2LM\5\6\4\2MR\7\6\2\2N"+
		"S\5\b\5\2OS\5\6\4\2PS\5\n\6\2QS\5\f\7\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TU\7\7\2\2U\21\3\2\2\2V[\7\b\2\2W\\\5\b\5\2X\\\5\n"+
		"\6\2Y\\\5\6\4\2Z\\\5\f\7\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\]"+
		"\3\2\2\2]^\7\t\2\2^\23\3\2\2\2_`\7\n\2\2`a\5\6\4\2ab\7\13\2\2b\25\3\2"+
		"\2\2cf\7\f\2\2dg\5\b\5\2eg\5\6\4\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\7\r"+
		"\2\2ij\5\6\4\2jk\7\16\2\2k\27\3\2\2\2lo\7\17\2\2mp\5\b\5\2np\5\6\4\2o"+
		"m\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\7\20\2\2rs\5\6\4\2st\7\21\2\2t\31\3\2"+
		"\2\2uv\7\22\2\2vw\5\6\4\2wz\7\23\2\2x{\5\b\5\2y{\5\6\4\2zx\3\2\2\2zy\3"+
		"\2\2\2{|\3\2\2\2|}\7\24\2\2}\33\3\2\2\2~\177\7\25\2\2\177\u0080\5\6\4"+
		"\2\u0080\u0083\7\26\2\2\u0081\u0084\5\b\5\2\u0082\u0084\5\6\4\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\35\3\2\2\2\u0087\u008b\7\27\2\2\u0088\u008c\5\b\5\2\u0089\u008c"+
		"\5\6\4\2\u008a\u008c\5\n\6\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\5\16\b\2\u008e\u0092\5"+
		"\b\5\2\u008f\u0092\5\6\4\2\u0090\u0092\5\n\6\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\30"+
		"\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\31"+
		"\2\2\u009a\37\3\2\2\2\u009b\u009f\7\32\2\2\u009c\u00a0\5\b\5\2\u009d\u00a0"+
		"\5\6\4\2\u009e\u00a0\5\n\6\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\5\16\b\2\u00a2\u00a6\5"+
		"\b\5\2\u00a3\u00a6\5\6\4\2\u00a4\u00a6\5\n\6\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\5\4"+
		"\3\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\33"+
		"\2\2\u00ae!\3\2\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2"+
		"\7\35\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b8\7\37\2"+
		"\2\u00b5\u00b7\5\4\3\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c4\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00c0\7\b\2\2\u00bc\u00c1\5\b\5\2\u00bd\u00c1\5\6\4\2\u00be\u00c1\5\n"+
		"\6\2\u00bf\u00c1\5\f\7\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7 "+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7!\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9"+
		"\u00ca\5\6\4\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7\t"+
		"\2\2\u00cd%\3\2\2\2\24)\60?R[foz\u0083\u008b\u0091\u0097\u009f\u00a5\u00aa"+
		"\u00b8\u00c0\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}