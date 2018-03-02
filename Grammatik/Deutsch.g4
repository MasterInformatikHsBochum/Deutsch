grammar Deutsch;

programm
    :   (tätigkeit)*? 'Von Anfang' (anweisung)*? 'bis Ende.'
    ;

anweisung
    :   zuweisung
    |   ausgabe
    |   eingabe
    |   addition
    |   subtraktion
    |   multiplikation
    |   division
    |   bedingteAnweisung
    |   wiederholung
    |   tätigkeitsAufruf
    ;

variable
    :   VARIABLE
    ;

zahl
    :   ZAHL
    ;

wahrheitswert
    :   WAHRHEITSWERT
    ;

zeichenkette
    :   ZEICHENKETTE
    ;

operator
    :   OPERATOR
    ;

zuweisung
    :   'Erschaffe ' variable ' und weise ' (zahl | variable | wahrheitswert | zeichenkette) ' zu.'
    ;

ausgabe
    :   'Gebe ' (zahl | wahrheitswert | variable | zeichenkette) ' aus.'
    ;

eingabe
    :   'Gebe Wert für ' (variable) ' ein:'
    ;

addition
    :   'Füge ' (zahl | variable) ' zu ' variable ' hinzu.'
    ;

subtraktion
    :   'Ziehe ' (zahl | variable) ' von ' variable ' ab.'
    ;

multiplikation
    :   'Vervielfältige ' variable ' um ' (zahl | variable) '.'
    ;

division
    :   'Teile ' variable ' durch ' (zahl | variable) '.'
    ;

bedingteAnweisung
    :   'Falls' (zahl | variable | wahrheitswert) operator (zahl | variable | wahrheitswert) 'dann' anweisung+? 'Anweisungsende.'
    ;

wiederholung
    :   'Solange' (zahl | variable | wahrheitswert) operator (zahl | variable | wahrheitswert) (anweisung)* 'Wiederholungsende.'
    ;

tätigkeit
    :   'Tätigkeitsbeschreibung von' (variable) ':' 'Benötigt wird folgendes:' (variable) 'Anweisungen:' (anweisung)* ('Gebe ' (zahl | variable | wahrheitswert | zeichenkette) ' zurück.')? 'Schließe Tätigkeit ab.'
    ;

tätigkeitsAufruf
    :   'Führe Tätigkeit ' (variable) ' mit ' (variable) ' aus.'
    ;

VARIABLE
    :   [a-zA-Z]+
    ;

ZAHL
    :   [0-9]+
    ;

WAHRHEITSWERT
    :   'wahr'
    |   'falsch'
    ;

ZEICHENKETTE
    :   '"' .*? '"'
    ;

OPERATOR
    :   ' größer '
    |   ' größer gleich '
    |   ' gleich '
    |   ' kleiner gleich '
    |   ' kleiner '
    |   ' und '
    |   ' oder '
    ;

LEERRAUM
    :   [ \n\t]+ -> skip
    ;

KOMMENTAR
   :   'Kommentar:' .*? 'Kommentar Ende.' -> skip
   ;
