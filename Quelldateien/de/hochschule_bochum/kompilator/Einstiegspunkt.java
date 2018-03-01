package de.hochschule_bochum.kompilator;

import de.hochschule_bochum.Codegenerierung;
import de.hochschule_bochum.DeutschLexer;
import de.hochschule_bochum.DeutschParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;

import java.io.IOException;

public class Einstiegspunkt {
    public static int main(String args[]) {
        Options options = new Options();

        Option input = new Option("i", "input", true, "input file");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file");
        output.setRequired(true);
        options.addOption(output);

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


        ANTLRFileStream inputFileStream = null;
        try {
            inputFileStream = new ANTLRFileStream(eingabeDatei, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();

            return 1;
        }

        DeutschLexer lexer = new DeutschLexer(inputFileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DeutschParser deutschParser = new DeutschParser(tokens);
        ParseTree tree = deutschParser.programm();

        Codegenerierung generator = new Codegenerierung(ausgabeDatei, false);
        ParseTreeWalker läufer = new ParseTreeWalker();
        läufer.walk(generator, tree);

        return 0;
    }
}
