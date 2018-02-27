package de.hochschule_bochum;

import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Einstiegspunkt {
    public static void main(String[] args) throws IOException {
        ANTLRFileStream inputFileStream = new ANTLRFileStream(args[0], "utf-8");
        System.out.println("Eingabe: " + inputFileStream.toString());

        DeutschLexer lexer = new DeutschLexer(inputFileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DeutschParser parser = new DeutschParser(tokens);
        ParseTree tree = parser.programm();

        AbstrakterSyntaxbaum abstrakterSyntaxbaum = new AbstrakterSyntaxbaum(
            Arrays.asList(parser.getRuleNames()),
            tree
        );

        try {
            abstrakterSyntaxbaum.speicherAlsPng(args[0]);
        } catch (Exception e) {
            System.err.println("Bild des abstrakten Syntaxbaumes konnte nicht gespeichert werden.");
        }
    }
}
