package de.hochschule_bochum;
// Generated from Deutsch.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeutschParser}.
 */
public interface DeutschListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeutschParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(DeutschParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(DeutschParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void enterAnweisung(DeutschParser.AnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#anweisung}.
	 * @param ctx the parse tree
	 */
	void exitAnweisung(DeutschParser.AnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DeutschParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DeutschParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#zahl}.
	 * @param ctx the parse tree
	 */
	void enterZahl(DeutschParser.ZahlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#zahl}.
	 * @param ctx the parse tree
	 */
	void exitZahl(DeutschParser.ZahlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#wahrheitswert}.
	 * @param ctx the parse tree
	 */
	void enterWahrheitswert(DeutschParser.WahrheitswertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#wahrheitswert}.
	 * @param ctx the parse tree
	 */
	void exitWahrheitswert(DeutschParser.WahrheitswertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#zeichenkette}.
	 * @param ctx the parse tree
	 */
	void enterZeichenkette(DeutschParser.ZeichenketteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#zeichenkette}.
	 * @param ctx the parse tree
	 */
	void exitZeichenkette(DeutschParser.ZeichenketteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DeutschParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DeutschParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void enterZuweisung(DeutschParser.ZuweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#zuweisung}.
	 * @param ctx the parse tree
	 */
	void exitZuweisung(DeutschParser.ZuweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void enterAusgabe(DeutschParser.AusgabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void exitAusgabe(DeutschParser.AusgabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#eingabe}.
	 * @param ctx the parse tree
	 */
	void enterEingabe(DeutschParser.EingabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#eingabe}.
	 * @param ctx the parse tree
	 */
	void exitEingabe(DeutschParser.EingabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(DeutschParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(DeutschParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#subtraktion}.
	 * @param ctx the parse tree
	 */
	void enterSubtraktion(DeutschParser.SubtraktionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#subtraktion}.
	 * @param ctx the parse tree
	 */
	void exitSubtraktion(DeutschParser.SubtraktionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#multiplikation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplikation(DeutschParser.MultiplikationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#multiplikation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplikation(DeutschParser.MultiplikationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(DeutschParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(DeutschParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#bedingteAnweisung}.
	 * @param ctx the parse tree
	 */
	void enterBedingteAnweisung(DeutschParser.BedingteAnweisungContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#bedingteAnweisung}.
	 * @param ctx the parse tree
	 */
	void exitBedingteAnweisung(DeutschParser.BedingteAnweisungContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#wiederholung}.
	 * @param ctx the parse tree
	 */
	void enterWiederholung(DeutschParser.WiederholungContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#wiederholung}.
	 * @param ctx the parse tree
	 */
	void exitWiederholung(DeutschParser.WiederholungContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#tätigkeit}.
	 * @param ctx the parse tree
	 */
	void enterTätigkeit(DeutschParser.TätigkeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#tätigkeit}.
	 * @param ctx the parse tree
	 */
	void exitTätigkeit(DeutschParser.TätigkeitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeutschParser#tätigkeitsAufruf}.
	 * @param ctx the parse tree
	 */
	void enterTätigkeitsAufruf(DeutschParser.TätigkeitsAufrufContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeutschParser#tätigkeitsAufruf}.
	 * @param ctx the parse tree
	 */
	void exitTätigkeitsAufruf(DeutschParser.TätigkeitsAufrufContext ctx);
}