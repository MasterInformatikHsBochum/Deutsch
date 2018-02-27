package main.java.de.hochschule_bochum;

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

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import main.java.de.hochschule_bochum.DeutschParser.AdditionContext;
import main.java.de.hochschule_bochum.DeutschParser.AnweisungContext;
import main.java.de.hochschule_bochum.DeutschParser.AusgabeContext;
import main.java.de.hochschule_bochum.DeutschParser.BedingteAnweisungContext;
import main.java.de.hochschule_bochum.DeutschParser.DivisionContext;
import main.java.de.hochschule_bochum.DeutschParser.MultiplikationContext;
import main.java.de.hochschule_bochum.DeutschParser.ProgrammContext;
import main.java.de.hochschule_bochum.DeutschParser.SubtraktionContext;
import main.java.de.hochschule_bochum.DeutschParser.ZuweisungContext;

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
		System.out.println("Beginne Anweisung" + ctx);
		super.enterAnweisung(ctx);
	}

	@Override
	public void enterZuweisung(ZuweisungContext ctx) {
		zwischenCode.add("#Zuweisung start");
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				if (variablen.containsKey(typeNode.getSymbol())) {
					try {
						throw new Exception("Variable schon deklariert");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				variablen.put(typeNode.getText(), variablen.size());
			}

		}
		super.enterZuweisung(ctx);
	}

	@Override
	public void exitZuweisung(ZuweisungContext ctx) {
		Token variable = null;
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL) {

				zwischenCode.add(typeNode.getText());
			}
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				variable = typeNode.getSymbol();
			}
		}
		zwischenCode.add("STORE");
		zwischenCode.add(Integer.toString(requireVariableIndex(variable)));
		zwischenCode.add("#exit Zuweisung");
		super.exitZuweisung(ctx);
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
		System.out.println("Ausgabe");
		super.enterAusgabe(ctx);
	}

	@Override
	public void enterAddition(AdditionContext ctx) {
		zwischenCode.add("#enter Addition");
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL) {
				zwischenCode.add(ctx.getChild(i).getText());
			}
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				zwischenCode.add(Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
		}
		zwischenCode.add("ADD");
		zwischenCode.add("#exit Addition");
		super.enterAddition(ctx);
	}

	@Override
	public void enterDivision(DivisionContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL) {
				zwischenCode.add(ctx.getChild(i).getText());
			}
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				zwischenCode.add(Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
		}
		zwischenCode.add("DIV");
		super.enterDivision(ctx);
	}

	@Override
	public void enterMultiplikation(MultiplikationContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL) {
				zwischenCode.add(ctx.getChild(i).getText());
			}
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				zwischenCode.add(Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
		}
		zwischenCode.add("MUL");
		super.enterMultiplikation(ctx);
	}

	@Override
	public void enterSubtraktion(SubtraktionContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			TerminalNode typeNode = (TerminalNode) ctx.getChild(i);
			if (typeNode.getSymbol().getType() == DeutschLexer.ZAHL) {
				zwischenCode.add(ctx.getChild(i).getText());
			}
			if (typeNode.getSymbol().getType() == DeutschLexer.VARIABLE) {
				zwischenCode.add(Integer.toString(requireVariableIndex(typeNode.getSymbol())));
			}
		}
		zwischenCode.add("SUB");
		super.enterSubtraktion(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		System.out.println("visit Terminal " + node.getText());
		super.visitTerminal(node);
	}
}
