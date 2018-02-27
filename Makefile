default: Deutsch

.PHONY: Grammatik
Grammatik:
	cd Grammatik && \
	antlr4 Deutsch.g4 -o generiert && \
	cp generiert/*.java ../Quelldateien/de/hochschule_bochum/ && \
	grep -rL "package de.hochschule_bochum;" ../Quelldateien/de/hochschule_bochum/*.java | xargs sed -i '1s/^/package de.hochschule_bochum;\n/'

Deutsch:
	mvn clean install assembly:single

Test:
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Leeres Programm.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Hallo Welt.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Ein- und Ausgabe.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Arithmetik.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Kommentare.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Bedingte Anweisungen.deutsch" && \
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Wiederholungen.deutsch"


Prototyp:
	antlr4 -Dlanguage=Python2 Grammatik/Deutsch.g4 -o Grammatik/Prototyp
	cp Grammatik/proto_parser.py Grammatik/Prototyp/
