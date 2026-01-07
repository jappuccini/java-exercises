import java.util.Random;
import java.util.Scanner;

public class Exercise {

  @SuppressWarnings({"resource", "unused"})
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    /* Datenobjekte */
    // Spieler
    String nameOfPlayer1;
    String nameOfPlayer2;

    // Kämpfer
    String nameOfFighter1;
    int healthPointsOfFighter1;
    String nameOfFighter2;
    int healthPointsOfFighter2;

    // Würfel
    int diceValue1OfPlayer1;
    int diceValue2OfPlayer1;
    int diceValue3OfPlayer1;
    int diceValue4OfPlayer1;
    int diceValue5OfPlayer1;
    int diceValue1OfPlayer2;
    int diceValue2OfPlayer2;
    int diceValue3OfPlayer2;
    int diceValue4OfPlayer2;
    int diceValue5OfPlayer2;

    /* Wertezuweisungen */
    System.out.print("Spieler 1, Name eingeben: ");
    nameOfPlayer1 = scanner.next();
    System.out.print("Spieler 1, Kämpfer 1, Name eingeben: ");
    nameOfFighter1 = scanner.next();
    System.out.print("Spieler 1, Kämpfer 1, LP eingeben: ");
    healthPointsOfFighter1 = scanner.nextInt();
    System.out.println();
    System.out.print("Spieler 2, Name eingeben: ");
    nameOfPlayer2 = scanner.next();
    System.out.print("Spieler 2, Kämpfer 1, Name eingeben: ");
    nameOfFighter2 = scanner.next();
    System.out.print("Spieler 2, Kämpfer 1, LP eingeben: ");
    healthPointsOfFighter2 = scanner.nextInt();

    /* Spielablauf */
    // Zug 1 - Ausgabe
    System.out.println();
    System.out.println("*-------*");
    System.out.println("* Zug 1 *");
    System.out.println("*-------*");
    System.out.println(
        "Kämpfer von "
            + nameOfPlayer1
            + ": "
            + nameOfFighter1
            + " ("
            + healthPointsOfFighter1
            + " LP)");
    System.out.println(
        "Kämpfer von "
            + nameOfPlayer2
            + ": "
            + nameOfFighter2
            + " ("
            + healthPointsOfFighter2
            + " LP)");
    System.out.println();
    System.out.println(nameOfFighter1 + " greift " + nameOfFighter2 + " an.");

    // Zug 1 - Treffer
    diceValue1OfPlayer1 = random.nextInt(1, 7);
    diceValue2OfPlayer1 = random.nextInt(1, 7);
    diceValue3OfPlayer1 = random.nextInt(1, 7);
    diceValue4OfPlayer1 = random.nextInt(1, 7);
    System.out.println(
        nameOfFighter1
            + " würfelt "
            + diceValue1OfPlayer1
            + ", "
            + diceValue2OfPlayer1
            + ", "
            + diceValue3OfPlayer1
            + " und "
            + diceValue4OfPlayer1
            + ".");
    int totalHits =
        diceValue1OfPlayer1 + diceValue2OfPlayer1 + diceValue3OfPlayer1 + diceValue4OfPlayer1;
    System.out.println(nameOfFighter1 + " erzielt " + totalHits + " Treffer.");

    // Zug 1 - Blocks
    diceValue1OfPlayer2 = random.nextInt(1, 7);
    diceValue2OfPlayer2 = random.nextInt(1, 7);
    diceValue3OfPlayer2 = random.nextInt(1, 7);
    int totalBlocks = diceValue1OfPlayer2 + diceValue2OfPlayer2 + diceValue3OfPlayer2;
    System.out.println(
        nameOfFighter2
            + " würfelt "
            + diceValue1OfPlayer2
            + ", "
            + diceValue2OfPlayer2
            + " und "
            + diceValue3OfPlayer2
            + ".");
    System.out.println(nameOfFighter2 + " erzielt " + totalBlocks + " Blocks.");

    // Zug 1 - Schaden
    int damage = totalHits - totalBlocks;
    healthPointsOfFighter2 -= damage;
    System.out.println(
        nameOfFighter2
            + " erleidet "
            + damage
            + " Schaden und hat noch "
            + healthPointsOfFighter2
            + " LP.");
    System.out.println();

    // Zug 2 - Ausgabe
    System.out.println();
    System.out.println("*-------*");
    System.out.println("* Zug 2 *");
    System.out.println("*-------*");
    System.out.println(
        "Kämpfer von "
            + nameOfPlayer1
            + ": "
            + nameOfFighter1
            + " ("
            + healthPointsOfFighter1
            + " LP)");
    System.out.println(
        "Kämpfer von "
            + nameOfPlayer2
            + ": "
            + nameOfFighter2
            + " ("
            + healthPointsOfFighter2
            + " LP)");
    System.out.println();
    System.out.println(nameOfFighter2 + " greift " + nameOfFighter1 + " an.");

    // Zug 2 - Treffer
    diceValue1OfPlayer2 = random.nextInt(1, 7);
    diceValue2OfPlayer2 = random.nextInt(1, 7);
    diceValue3OfPlayer2 = random.nextInt(1, 7);
    diceValue4OfPlayer2 = random.nextInt(1, 7);
    System.out.println(
        nameOfFighter2
            + " würfelt "
            + diceValue1OfPlayer2
            + ", "
            + diceValue2OfPlayer2
            + ", "
            + diceValue3OfPlayer2
            + " und "
            + diceValue4OfPlayer2
            + ".");
    totalHits =
        diceValue1OfPlayer2 + diceValue2OfPlayer2 + diceValue3OfPlayer2 + diceValue4OfPlayer2;
    System.out.println(nameOfFighter2 + " erzielt " + totalHits + " Treffer.");

    // Zug 2 - Blocks
    diceValue1OfPlayer1 = random.nextInt(1, 7);
    diceValue2OfPlayer1 = random.nextInt(1, 7);
    diceValue3OfPlayer1 = random.nextInt(1, 7);
    totalBlocks = diceValue1OfPlayer1 + diceValue2OfPlayer1 + diceValue3OfPlayer1;
    System.out.println(
        nameOfFighter1
            + " würfelt "
            + diceValue1OfPlayer1
            + ", "
            + diceValue2OfPlayer1
            + " und "
            + diceValue3OfPlayer1
            + ".");
    System.out.println(nameOfFighter1 + " erzielt " + totalBlocks + " Blocks.");

    // Zug 2 - Schaden
    damage = totalHits - totalBlocks;
    healthPointsOfFighter1 -= damage;
    System.out.println(
        nameOfFighter1
            + " erleidet "
            + damage
            + " Schaden und hat noch "
            + healthPointsOfFighter1
            + " LP.");
    System.out.println();
  }
}
