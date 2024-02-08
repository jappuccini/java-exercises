package demo.controlflow;

public class Switch {

    public static void main(String[] args) {
        int age = 18;

        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Du bist aber klein!");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Kein Alk!");
                break;
            case 16:
            case 17:
                System.out.println("Du kriegst Bier und Wein!");
                break;
            default:
                System.out.println("Du kriegst Alles!");
        }

        char c = '*';
        switch (c) {
            case 'w':
            case 'W':
            case 'f':
            case 'F':
                System.out.println("Anrede ist Frau");
                break;
            case 'm':
            case 'M':
                System.out.println("Anrede ist Herr");
                break;
            default:
                System.out.println("Anrede ist Vorname und Nachname");
                break;
        }
    }
}
