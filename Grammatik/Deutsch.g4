@header {
package de.hochschule_bochum;
}

grammar Deutsch;

programm
    :   'Von Anfang' (anweisung)+ 'bis Ende.'
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
    |   tätigkeit
    ;

zeichenkette
    :   '"'ZEICHENKETTE'"'
    ;

zuweisung
    :   'Erschaffe ' VARIABLE ' und weise ' (ZAHL | VARIABLE | WAHRHEITSWERT | zeichenkette) ' zu.'
    ;

ausgabe
    :   'Gebe ' (ZAHL | zeichenkette | WAHRHEITSWERT | VARIABLE) ' aus.'
    ;

eingabe
    :   'Gebe Wert für ' (VARIABLE) ' ein:'
    ;

addition
    :   'Füge ' (ZAHL | VARIABLE) ' zu ' VARIABLE ' hinzu.'
    ;

subtraktion
    :   'Ziehe ' (ZAHL | VARIABLE) ' von ' VARIABLE ' ab.'
    ;

multiplikation
    :   'Vervielfältige ' (ZAHL | VARIABLE) ' um ' VARIABLE '.'
    ;

division
    :   'Teile ' (ZAHL | VARIABLE) ' durch ' VARIABLE '.'
    ;

bedingteAnweisung
    :   ('Falls ' (ZAHL | VARIABLE | WAHRHEITSWERT) OPERATOR (ZAHL | VARIABLE | WAHRHEITSWERT) ' dann ' (anweisung)+)
    |   ('Falls ' (ZAHL | VARIABLE | WAHRHEITSWERT) OPERATOR (ZAHL | VARIABLE | WAHRHEITSWERT) ' dann ' (anweisung)+ ' sonst ' (anweisung)+)
    ;

wiederholung:
    'Solange '
    (ZAHL | VARIABLE | WAHRHEITSWERT)
    OPERATOR
    (ZAHL | VARIABLE | WAHRHEITSWERT)
    (anweisung)*
    ;

tätigkeit
    :   'Tätigkeitsbeschreibung von ' (VARIABLE) ': ' 'Benötigt wird folgendes: ' (VARIABLE) 'Anweisungen: ' (anweisung)* 'Schließe Tätigkeit ab.'
    ;


VARIABLE
    :   [a-z]+
    ;

ZAHL
    :   [0-9]+
    ;

WAHRHEITSWERT
    :   'wahr'
    |   'falsch'
    ;

ZEICHENKETTE
    :   [a-zA-Z]+
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

COMMENT
   :   'Kommentar: ' [ a-zA-Z0-9]* 'Kommentar Ende.' -> skip
   ;
