package demo.controlflow;

public class If {
    public static void main(String[] args) {

        int age = 15;
        boolean areParentsPresent = false;

        if (age <= 15) {
            if (areParentsPresent) {
                System.out.println("Du kriegst Alles was du willst!");
            } else {
                System.out.println("Kein Alkohol");
            }
            // Alternativ mit ausgelagerter Methode:
            If.analyzeKidSituation(areParentsPresent);
        } else if (age < 18) {
            System.out.println("Du kriegst Bier und Wein!");
        } else {
            System.out.println("Du kriegst Alles was du willst!");
        }

        char c = 'w';
        if (c == 'w') {
            System.out.println("Anrede ist Frau");
        } else if (c == 'm') {
            System.out.println("Anrede ist Mann");
        } else {
            System.out.println("Anrede ist Vorname und Nachname");
        }

    }

    public static void analyzeKidSituation(boolean areParentsPresent) {
        if (areParentsPresent) {
            System.out.println("Du kriegst Alles was du willst!");
        } else {
            System.out.println("Kein Alkohol");
        }
    }
}
