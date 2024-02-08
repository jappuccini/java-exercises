package demo.arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        // ArrayList vom Typ String erstellen
        // Beachte, dass ein komplexer Datentyp notwendig ist!
        ArrayList<String> namesArrayList = new ArrayList<>();

        // Elemente der Liste hinzufügen
        namesArrayList.add("Steffen");
        namesArrayList.add("Marianna");
        namesArrayList.add("Mirco");

        // Alle Elemente der ArrayList mit einer for-each Schleife ausgeben
        for (String name : namesArrayList) {
            System.out.println(name);
        }

        // Wert an zweiter Stelle (Index 1) überschreiben
        namesArrayList.set(1, "Fritz");

        // Wert an zweiter Stelle (Index 1) einfügen
        namesArrayList.add(1, "Fritz");

        // Alle Elemente der ArrayList mit einer for Schleife ausgeben
        for (int i = 0; i < namesArrayList.size(); i++) {
            // Element bei Index i auslesen
            String element = namesArrayList.get(i);
            System.out.println(element);
        }

        // Alle Elemente aus der ArrayList löschen
        namesArrayList.clear();
    }
}
