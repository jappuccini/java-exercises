import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k;
    float p;
    int n;

    boolean loop;
    do {
      System.out.print("Gib bitte das Startkapital ein (in Euro): ");
      k = scanner.nextInt();

      System.out.print("Gib bitte den Prozentsatz ein: ");
      p = scanner.nextFloat();

      System.out.print("Gib bitte die Anzahl Jahre ein: ");
      n = scanner.nextInt();

      System.out.println(
          "Ergebnis: Das Endkapital betraegt " + (int) calculateInterest(k, p, n) + " Euro");

      System.out.print("Willst Du eine weitere Zinsrechnung durchfuehren (true, false)?: ");
      loop = scanner.nextBoolean();
    } while (loop);
    scanner.close();
  }

  static double calculateInterest(int k, float p, int n) {
    if (n == 0) {
      return k;
    }
    return calculateInterest(k, p, n - 1) * (1 + p / 100);
  }
}
