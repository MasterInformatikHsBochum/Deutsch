package de.hochschule_bochum;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Einstiegspunkt {
    public static void main(String[] args) throws IOException {
       // ANTLRFileStream inputFileStream = new ANTLRFileStream(args[0], "utf-8");
        ANTLRFileStream inputFileStream = new ANTLRFileStream("Beispiele/Addition_Beispiel_mit_Variable.deutsch", "utf-8");
        System.out.println("Eingabe: " + inputFileStream.toString());

        DeutschLexer lexer = new DeutschLexer(inputFileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DeutschParser parser = new DeutschParser(tokens);
        ParseTree tree = parser.programm();


        Codegenerierung generator = new Codegenerierung();
        ParseTreeWalker läufer = new ParseTreeWalker();
        läufer.walk(generator, tree);

        AbstrakteKellerMaschine abstrakteKellerMaschine = new AbstrakteKellerMaschine();
        abstrakteKellerMaschine.parseCode(new File("zwischencode.txt"));

        System.out.println("mache jetzt geilen stuff");
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);


        try {
            viewer.save("Abstrakter Syntaxbaum.png");
            System.out.println("Abstrakter Syntaxbaum wurde nach \"Abstrakter Syntaxbaum.png\" geschrieben.");
        } catch (Exception e) {
            System.err.println("Bild des abstrakten Syntaxbaumes konnte nicht gespeichert werden.");
        }
    }
}
