package demo.arrays;

public class Arrays {
    public static void main(String[] args) {

        // Array mit Werten erstellen
        String[] names = { "Steffen", "Marianna", "Mirco" };

        // Länge des Arrays ermitteln
        System.out.println(names.length);
    
        // Wert eines Arrays an der zweiten Stelle (Index 1) lesen
        String marianna = names[1];
        System.out.println(marianna);

        // Wert eines Arrays an der zweiten Stelle (Index 1) schreiben
        names[1] = "Fritz";
        System.out.println(names[1]);

        // Alle Werte eines Arrays mit einer for-each Schleife ausgeben
        for (String anyName : names) {
            System.out.println(anyName);
        }

        // Alle Werte eines Arrays mit einer for Schleife ausgeben
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Array mit einer festen Länge von 3 erstellen
        String[] grades = new String[3];

        // Alle Werte eines Arrays mit einer for-each Schleife ausgeben
        // Beachte die Standardwerte ja nach Datentyp!
        for (String i : grades) {
            System.out.println(i);
        }
    }
}
