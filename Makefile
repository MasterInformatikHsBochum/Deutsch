default: Deutsch

Grammatik:
	cd Grammatik && \
	antlr4 Deutsch.g4 -o generiert && \
	cp generiert/*.java ../Quelldateien/main/java/de/hochschule_bochum/

Deutsch:
	mvn clean install assembly:single

Test:
	java -jar Kompilate/Deutsch-Alpha-jar-with-dependencies.jar "Beispiele/Hallo Welt.deutsch"

Prototyp:
	antlr4 -Dlanguage=Python2 Grammatik/Deutsch.g4 -o Grammatik/Prototyp
	cp Grammatik/proto_parser.py Grammatik/Prototyp/
