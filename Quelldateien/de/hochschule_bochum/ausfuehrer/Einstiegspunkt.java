package de.hochschule_bochum.ausfuehrer;

import de.hochschule_bochum.AbstrakteKellerMaschine;

import java.io.File;

public class Einstiegspunkt {
    public static int main(String args[]) {
        String eingabeDatei = null;

        if (args.length == 0) {
            System.err.println("Welches Kompilat soll ausgeführt werden?");

            return 1;
        } else {
            eingabeDatei = args[0];
        }

        File f = new File(eingabeDatei);
        if (!f.exists() || f.isDirectory()) {
            System.err.println("Fehler: " + eingabeDatei + " konnte nicht gefunden werden.");

            return 1;
        }

        AbstrakteKellerMaschine abstrakteKellerMaschine = new AbstrakteKellerMaschine();
        abstrakteKellerMaschine.setDebug(true);
        abstrakteKellerMaschine.parseCode(new File(eingabeDatei));

        return 0;
    }
}
