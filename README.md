# Deutsch

<p align="center">
    <img alt="Wappen" src="Bilder/Wappen.png">
</p>

## Installation von Deutsch

```
mvn clean install assembly:single
```

## Kompilierung von deutschen Quelltexten

```
java -jar Kompilate/Kompilator.jar -i "Beispiele/Hallo Welt.deutsch" -o "Hallo Welt.kompiliert"
```

## Ausführung von deutschen Programmen

```
java -jar Kompilate/Ausführer.jar "Hallo Welt.kompiliert"
```
