package de.hochschule_bochum;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.hochschule_bochum.DeutschParser.AdditionContext;
import de.hochschule_bochum.DeutschParser.AnweisungContext;
import de.hochschule_bochum.DeutschParser.AusgabeContext;
import de.hochschule_bochum.DeutschParser.BedingteAnweisungContext;
import de.hochschule_bochum.DeutschParser.DivisionContext;
import de.hochschule_bochum.DeutschParser.MultiplikationContext;
import de.hochschule_bochum.DeutschParser.ProgrammContext;
import de.hochschule_bochum.DeutschParser.SubtraktionContext;
import de.hochschule_bochum.DeutschParser.ZuweisungContext;

public class Codegenerierung extends DeutschBaseListener {
	List<String> zwischenCode = new ArrayList<String>();
	private Map<String, Integer> variablen = new HashMap<>();

	public Codegenerierung() {

	}

	@Override
	public void enterProgramm(ProgrammContext ctx) {
		System.out.println("starte Programm" + ctx);
		super.enterProgramm(ctx);
	}

	@Override
	public void exitProgramm(ProgrammContext ctx) {
		System.out.println("Beende Programm");
		new File("zwischencode.txt");
		Path pathToFile = Paths.get("zwischencode.txt");
		try {
			Files.write(pathToFile, zwischenCode, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.exitProgramm(ctx);
	}

	@Override
	public void enterAnweisung(AnweisungContext ctx) {
		super.enterAnweisung(ctx);
	}

	@Override
	public void enterZuweisung(ZuweisungContext ctx)
	{
		for (int i = 0; i < ctx.getChildCount(); i++)
		{
			TerminalNode typeNode = (TerminalNode)ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL)
			{
				zwischenCode.add("LADE " + typeNode.getText());
			}
		}
		for (int i = 0; i < ctx.getChildCount(); i++)
		{
			TerminalNode typeNode = (TerminalNode)ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE)
			{
				if(variablen.containsKey(typeNode.getText())){
					zwischenCode.add("AUSKELLERN R" + variablen.get(typeNode.getText()));
				} else
				{
					int size = variablen.size();
					variablen.put(typeNode.getText(), size);
					zwischenCode.add("AUSKELLERN R" + size);
				}
			}
		}
		super.enterZuweisung(ctx);
	}

	private int requireVariableIndex(Token varNameToken) {
		Integer varIndex = variablen.get(varNameToken.getText());
		if (varIndex == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return varIndex;
	}

	@Override
	public void enterBedingteAnweisung(BedingteAnweisungContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof TerminalNode) {
				TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
				if (typeNode.getSymbol().getType() == DeutschLexer.OPERATOR) {
					switch (typeNode.getText()) {
					case "größer":

						break;
					case "größer gleich":

						break;
					case "gleich":

						break;
					case "kleiner gleich":

						break;
					case "kleiner":

						break;
					case "und":

						break;
					case "oder":

						break;
					default:
						break;
					}
				} else if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL
						|| typeNode.getSymbol().getType() == DeutschLexer.WAHRHEITSWERT) {
					zwischenCode.add(typeNode.getText());
				} else if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
					zwischenCode.add(Integer.toString(variablen.get(typeNode.getText())));
				}
			}
		}

		super.enterBedingteAnweisung(ctx);
	}

	@Override
	public void exitBedingteAnweisung(BedingteAnweisungContext ctx) {
		// TODO Auto-generated method stub
		super.exitBedingteAnweisung(ctx);
	}

	@Override
	public void enterAusgabe(AusgabeContext ctx) {
		super.enterAusgabe(ctx);
	}

	@Override
	public void enterAddition(AdditionContext ctx) {
		lade(ctx);
		zwischenCode.add("ADD");
		speicher(ctx,3);
		super.enterAddition(ctx);
	}


	private void speicher(ParserRuleContext ctx, int pos){
			TerminalNode typeNode = (TerminalNode) ctx.getChild(pos);
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE || typeNode.getSymbol().getType() == DeutschLexer.ZEICHENKETTE)
			{
				zwischenCode.add("AUSKELLERN R" + Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
	}

	private void lade(ParserRuleContext ctx)
	{
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL || typeNode.getSymbol().getType() == DeutschLexer.ZEICHENKETTE) {
				zwischenCode.add("LADE "+ctx.getChild(i).getText());
			} else if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				zwischenCode.add("LEGE R" +Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
		}
	}

	@Override
	public void enterDivision(DivisionContext ctx) {
		lade(ctx);
		zwischenCode.add("DIV");
		speicher(ctx,1);
		super.enterDivision(ctx);
	}

	@Override
	public void enterMultiplikation(MultiplikationContext ctx) {
		lade(ctx);
		zwischenCode.add("MUL");
		speicher(ctx,1);
		super.enterMultiplikation(ctx);
	}

	@Override
	public void enterSubtraktion(SubtraktionContext ctx) {
		lade(ctx);
		zwischenCode.add("SUB");
		speicher(ctx,3);
		super.enterSubtraktion(ctx);
	}

}
