package de.hochschule_bochum.kompilator;

import de.hochschule_bochum.AbstrakterSyntaxbaum;
import de.hochschule_bochum.Codegenerierung;
import de.hochschule_bochum.DeutschLexer;
import de.hochschule_bochum.DeutschParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.Arrays;

public class Einstiegspunkt {
    public static int main(String args[]) {
        Options options = new Options();

        Option input = new Option("i", "input", true, "Eingabedatei");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "Ausgabedatei");
        output.setRequired(true);
        options.addOption(output);

        Option showBaum = new Option("b", "baum", false, "Baum anzeigen");
        options.addOption(showBaum);

        Option debugOption = new Option("d", "debug", false, "Informationen anzeigen");
        options.addOption(debugOption);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            formatter.printHelp("Kompilator", options);

            return 1;
        }

        String eingabeDatei = cmd.getOptionValue("input");
        String ausgabeDatei = cmd.getOptionValue("output");

        boolean zeigeBaum = false;
        if (cmd.hasOption("baum")) {
            zeigeBaum = true;
        }

        boolean debug = false;
        if (cmd.hasOption("debug")) {
            debug = true;
        }

        if (debug) {
            System.out.println("Information: " + eingabeDatei + " wird eingelesen.");
        }

        ANTLRFileStream inputFileStream = null;
        try {
            inputFileStream = new ANTLRFileStream(eingabeDatei, "utf-8");
        } catch (IOException e) {
            if (debug) {
                System.err.println("Fehler: " + eingabeDatei + " konnte nicht eingelesen werden.");
            }

            return 1;
        }

        if (debug) {
            System.out.println("Information: Lexikograph wird ausgeführt.");
        }

        DeutschLexer deutschLexer = new DeutschLexer(inputFileStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(deutschLexer);

        if (debug) {
            System.out.println("Information: Analysierer wird ausgeführt.");
        }

        DeutschParser deutschParser = new DeutschParser(commonTokenStream);
        ParseTree parseTree = deutschParser.programm();

        if (debug) {
            System.out.println("Information: Kompilator wird ausgeführt.");
        }

        Codegenerierung codegenerierung = new Codegenerierung(ausgabeDatei, false);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(codegenerierung, parseTree);

        if (zeigeBaum) {
            if (debug) {
                System.out.println("Information: Abstrakter Syntaxbaum wird visualisiert.");
            }

            AbstrakterSyntaxbaum abstrakterSyntaxbaum = new AbstrakterSyntaxbaum(
                Arrays.asList(deutschParser.getRuleNames()),
                parseTree
            );

            abstrakterSyntaxbaum.zeige(eingabeDatei);
        }

        return 0;
    }
}
