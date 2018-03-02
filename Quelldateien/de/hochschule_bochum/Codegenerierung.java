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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.hochschule_bochum.DeutschParser.AdditionContext;
import de.hochschule_bochum.DeutschParser.AnweisungContext;
import de.hochschule_bochum.DeutschParser.AusgabeContext;
import de.hochschule_bochum.DeutschParser.BedingteAnweisungContext;
import de.hochschule_bochum.DeutschParser.DivisionContext;
import de.hochschule_bochum.DeutschParser.EingabeContext;
import de.hochschule_bochum.DeutschParser.MultiplikationContext;
import de.hochschule_bochum.DeutschParser.OperatorContext;
import de.hochschule_bochum.DeutschParser.ProgrammContext;
import de.hochschule_bochum.DeutschParser.SubtraktionContext;
import de.hochschule_bochum.DeutschParser.TätigkeitContext;
import de.hochschule_bochum.DeutschParser.TätigkeitsAufrufContext;
import de.hochschule_bochum.DeutschParser.VariableContext;
import de.hochschule_bochum.DeutschParser.WahrheitswertContext;
import de.hochschule_bochum.DeutschParser.WiederholungContext;
import de.hochschule_bochum.DeutschParser.ZahlContext;
import de.hochschule_bochum.DeutschParser.ZeichenketteContext;
import de.hochschule_bochum.DeutschParser.ZuweisungContext;

public class Codegenerierung extends DeutschBaseListener {
	private List<String> zwischenCode = new ArrayList<String>();
	private Map<String, Integer> variablen = new HashMap<>();
	private List<String> taetigkeiten = new ArrayList<>();
	private String pathToSave = "";
	private boolean debug = true;
	private int taetigkeitsCounter = 0;
	private ProgrammContext prgctx = null;
	public Codegenerierung(String pathToSave) {
		this.pathToSave = pathToSave;
	}

	public Codegenerierung(String pathToSave, boolean debug) {
		this.pathToSave = pathToSave;
		this.debug = debug;
	}

	@Override
	public void enterProgramm(ProgrammContext ctx) {
		if (this.debug) {
			System.out.println("starte Programm" + ctx);
			System.out.println(ctx.toStringTree());
		}
	this.prgctx = ctx;
		super.enterProgramm(ctx);
	}

	@Override
	public void exitProgramm(ProgrammContext ctx) {
		if (this.debug) {
			System.out.println("Beende Programm");
		}
		Path pathToFile = Paths.get(this.pathToSave);
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
		// System.out.println("Parten : " + ctx.getParent().getClass());
		// if(ctx.getParent() instanceof BedingteAnweisungContext){
		// (BedingteAnweisungContext)ctx.getParent().
		// }
		super.enterAnweisung(ctx);
	}

	@Override
	public void enterZuweisung(ZuweisungContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof ZahlContext) {
				zwischenCode.add("LADE " + ((TerminalNode) ctx.getChild(i).getChild(0)).getSymbol().getText());
			} else if (ctx.getChild(i) instanceof VariableContext
					&& ctx.getChild(i - 1).getText().trim().equals("und weise")) {
				if (ctx.getChild(i).getText().equals("wahr")) {
					zwischenCode.add("LADE " + "wahr");
					break;
				} else if (ctx.getChild(i).getText().equals("falsch")) {
					zwischenCode.add("LADE " + "falsch");
					break;
				}
				VariableContext varctx = (VariableContext) ctx.getChild(i);
				zwischenCode.add("LEGE R"
						+ Integer.toString(requireVariableIndex(((TerminalNode) varctx.getChild(0)).getSymbol())));
			} else if (ctx.getChild(i) instanceof ZeichenketteContext) {
				String zeichenKette = ((TerminalNode) ctx.getChild(i).getChild(0)).getSymbol().getText();
				zeichenKette = zeichenKette.substring(zeichenKette.indexOf("\"") + 1, zeichenKette.lastIndexOf("\""));
				zwischenCode.add("LADE " + zeichenKette);
			} else if (ctx.getChild(i) instanceof WahrheitswertContext) {
				WahrheitswertContext warContext = (WahrheitswertContext) ctx.getChild(i);
				if (warContext.getText().trim().equalsIgnoreCase("wahr")) {
					zwischenCode.add("LADE " + 1);
				} else if (warContext.getText().trim().equalsIgnoreCase("falsch")) {
					zwischenCode.add("LADE " + 0);
				}
			}
		}
		if (ctx.getChild(1) instanceof VariableContext) {
			VariableContext varctx = (VariableContext) ctx.getChild(1);
			putVarInReg(varctx.getChild(0).getText());
		}
		super.enterZuweisung(ctx);
	}

	private void putVarInReg(String store)
	{
		if (variablen.containsKey(store)) {
			zwischenCode.add("AUSKELLERN R" + variablen.get(store));
		} else {
			for (int r = 0; r < AbstrakteKellerMaschine.REGISTER_SIZE -10; r++) {
				if (!variablen.containsValue(r)) {
					variablen.put(store, r);
					zwischenCode.add("AUSKELLERN R" + r);
					break;

				}
			}
		}
	}

	private void putTaeInReg(String store, boolean first)
	{
		int r = 0;
		if(!taetigkeiten.contains(store)) {
		taetigkeiten.add(store);
		r = taetigkeiten.indexOf(store) + AbstrakteKellerMaschine.REGISTER_SIZE -10;
		variablen.put(store, r);

	}

		r = taetigkeiten.indexOf(store) + AbstrakteKellerMaschine.REGISTER_SIZE -10;
		if (!first)
	{
		zwischenCode.add("AUSKELLERN R" + r);
	}
	//	zwischenCode.add("STORE: " + store);
	}

	@Override
	public void enterTätigkeit(TätigkeitContext ctx) {
		zwischenCode.add("GEHEZU " + ctx.hashCode() + "Taetigkeitsende");
		zwischenCode.add("MARKIERUNG " + ctx.getChild(1).getText() + "Taetigkeit");

		super.enterTätigkeit(ctx);
	}

	@Override
	public void exitTätigkeit(TätigkeitContext ctx) {
		putTaeInReg(ctx.getChild(1).getText(),true);
	//	zwischenCode.add("ctx: " + ctx.getChild(1).getText());
	//	zwischenCode.add("Reg Index :"+ variablen.get(ctx.getChild(1).getText()));
		zwischenCode.add("LEGE R"+ variablen.get(ctx.getChild(1).getText()));
		zwischenCode.add("GEHEZUSTAPEL");
		zwischenCode.add("MARKIERUNG " + ctx.hashCode() + "Taetigkeitsende");
		super.exitTätigkeit(ctx);
	}

	@Override
	public void enterTätigkeitsAufruf(TätigkeitsAufrufContext ctx) {
		zwischenCode.add("LADE " + ctx.getChild(1).getText() +"ENDE"+taetigkeitsCounter);
		putTaeInReg(ctx.getChild(1).getText(),false);
		zwischenCode.add("GEHEZU " + ctx.getChild(1).getText() + "Taetigkeit");
		super.enterTätigkeitsAufruf(ctx);
	}
	@Override
	public void exitTätigkeitsAufruf(TätigkeitsAufrufContext ctx) {
		zwischenCode.add("MARKIERUNG "+ ctx.getChild(1).getText()+"ENDE"+taetigkeitsCounter);
		taetigkeitsCounter++;
		super.exitTätigkeitsAufruf(ctx);
	}
	@Override
	public void enterVariable(VariableContext ctx) {
		if (ctx.getParent() instanceof TätigkeitContext) {
			for (int r = 0; r < AbstrakteKellerMaschine.REGISTER_SIZE; r++) {
				if (!variablen.containsValue(r)) {
					variablen.put(ctx.getText(), r);
					break;
				}

			}
		}
		super.enterVariable(ctx);
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
	public void enterWahrheitswert(WahrheitswertContext ctx) {
		// TODO Auto-generated method stub
		super.enterWahrheitswert(ctx);
	}

	private void zwischenSpeichern() {
		for (int r = 0; r < AbstrakteKellerMaschine.REGISTER_SIZE; r++) {
			if (!variablen.containsValue(r)) {
				variablen.put("PlaceHolder", r);
				zwischenCode.add("AUSKELLERN R" + r);
				break;
			}

		}
	}

	private void zwischenLaden(String key) {
		zwischenCode.add("LEGE R" + Integer.toString(variablen.get(key)));
	}

	@Override
	public void enterBedingteAnweisung(BedingteAnweisungContext ctx) {

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof OperatorContext) {
				TerminalNode operator = (TerminalNode) ctx.getChild(i).getChild(0);
				switch (operator.getText().trim()) {
				case "größer":
					lade(ctx, 3);
					lade(ctx, 1);
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				case "größer gleich":
					lade(ctx, 3);
					lade(ctx, 1);
					zwischenCode.add("SUB");
					zwischenSpeichern();
					zwischenLaden("PlaceHolder");
					zwischenLaden("PlaceHolder");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "gleich":
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "kleiner gleich":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("SUB");
					zwischenSpeichern();
					zwischenLaden("PlaceHolder");
					zwischenLaden("PlaceHolder");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "kleiner":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				case "und":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("MUL");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				case "oder":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("ADD");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				default:
					System.out.println("default");
					break;
				}
				zwischenCode.add("GEHEZU " + ctx.hashCode() + "ENDE");
				zwischenCode.add("MARKIERUNG M" + ctx.hashCode());
			}

		}
		super.enterBedingteAnweisung(ctx);
	}

	@Override
	public void enterWiederholung(WiederholungContext ctx) {
		zwischenCode.add("GEHEZU " + ctx.hashCode() + "PreJump");
		zwischenCode.add("MARKIERUNG M" + ctx.hashCode());
		super.enterWiederholung(ctx);
	}

	@Override
	public void exitWiederholung(WiederholungContext ctx) {
		zwischenCode.add("MARKIERUNG " + ctx.hashCode() + "PreJump");

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i) instanceof OperatorContext) {
				TerminalNode operator = (TerminalNode) ctx.getChild(i).getChild(0);
				switch (operator.getText().trim()) {
				case "größer":
					lade(ctx, 3);
					lade(ctx, 1);
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				case "größer gleich":
					lade(ctx, 3);
					lade(ctx, 1);
					zwischenCode.add("SUB");
					zwischenSpeichern();
					zwischenLaden("PlaceHolder");
					zwischenLaden("PlaceHolder");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "gleich":
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "kleiner gleich":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("SUB");
					zwischenSpeichern();
					zwischenLaden("PlaceHolder");
					zwischenLaden("PlaceHolder");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					zwischenCode.add("GEHEFALSCH M" + ctx.hashCode());
					break;
				case "kleiner":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("SUB");
					zwischenCode.add("GEHEWAHR M" + ctx.hashCode());
					break;
				case "und":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("MUL");
					break;
				case "oder":
					lade(ctx, 1);
					lade(ctx, 3);
					zwischenCode.add("ADD");
					break;
				default:
					if (this.debug) {
						System.out.println("default");
					}
					break;
				}
			}

		}
		super.exitWiederholung(ctx);
	}

	@Override
	public void exitBedingteAnweisung(BedingteAnweisungContext ctx) {
		zwischenCode.add("MARKIERUNG " + ctx.hashCode() + "ENDE");
		super.exitBedingteAnweisung(ctx);
	}

	@Override
	public void enterAusgabe(AusgabeContext ctx) {
		lade(ctx, 1);
		zwischenCode.add("AUS");
		super.enterAusgabe(ctx);
	}

	@Override
	public void enterEingabe(EingabeContext ctx) {
		zwischenCode.add("EIN");
		speicher(ctx, 1);
		super.enterEingabe(ctx);
	}

	@Override
	public void enterAddition(AdditionContext ctx) {
		lade(ctx, 1);
		lade(ctx, 3);
		zwischenCode.add("ADD");
		speicher(ctx, 3);
		super.enterAddition(ctx);
	}

	private void speicher(ParserRuleContext ctx, int pos) {
		if (ctx.getChild(pos) instanceof VariableContext || ctx.getChild(pos) instanceof ZeichenketteContext) {
			zwischenCode.add("AUSKELLERN R" + Integer
					.toString(requireVariableIndex(((TerminalNode) ctx.getChild(pos).getChild(0)).getSymbol())));
		}
	}

	private void lade(ParserRuleContext ctx, int pos) {
		if (ctx.getChild(pos) instanceof ZahlContext) {
			zwischenCode.add("LADE " + ((TerminalNode) ctx.getChild(pos).getChild(0)).getSymbol().getText());
		} else if (ctx.getChild(pos) instanceof VariableContext) {
			if (ctx.getChild(pos).getText().equals("wahr")) {
				zwischenCode.add("LADE " + "wahr");
			} else if (ctx.getChild(pos).getText().equals("falsch")) {
				zwischenCode.add("LADE " + "falsch");
			} else {
				VariableContext varctx = (VariableContext) ctx.getChild(pos);
				zwischenCode.add("LEGE R"
						+ Integer.toString(requireVariableIndex(((TerminalNode) varctx.getChild(0)).getSymbol())));

			}
		} else if (ctx.getChild(pos) instanceof ZeichenketteContext) {

			String zeichenKette = ((TerminalNode) ctx.getChild(pos).getChild(0)).getSymbol().getText();
			zeichenKette = zeichenKette.substring(zeichenKette.indexOf("\"") + 1, zeichenKette.lastIndexOf("\""));
			zwischenCode.add("LADE " + zeichenKette);
		} else if (ctx.getChild(pos) instanceof WahrheitswertContext) {
			WahrheitswertContext warContext = (WahrheitswertContext) ctx.getChild(pos);
			if (warContext.getText().trim().equalsIgnoreCase("wahr")) {
				zwischenCode.add("LADE " + 1);
			} else if (warContext.getText().trim().equalsIgnoreCase("falsch")) {
				zwischenCode.add("LADE " + 0);
			}
		}
	}

	@Override
	public void enterDivision(DivisionContext ctx) {
		lade(ctx, 1);
		lade(ctx, 3);
		zwischenCode.add("DIV");
		speicher(ctx, 1);
		super.enterDivision(ctx);
	}

	@Override
	public void enterMultiplikation(MultiplikationContext ctx) {
		lade(ctx, 1);
		lade(ctx, 3);
		zwischenCode.add("MUL");
		speicher(ctx, 1);
		super.enterMultiplikation(ctx);
	}

	@Override
	public void enterSubtraktion(SubtraktionContext ctx) {
		lade(ctx, 1);
		lade(ctx, 3);
		zwischenCode.add("SUB");
		speicher(ctx, 3);
		super.enterSubtraktion(ctx);
	}

}
