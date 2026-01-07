public class Exercise {

  public static void main(String[] args) {
    /* Datenobjekte */
    // Spieler
    String nameOfPlayer1;
    String nameOfPlayer2;

    // Kämpfer
    String nameOfFighter1;
    int healthPointsOfFighter1;
    String nameOfFighter2;
    int healthPointsOfFighter2;

    /* Wertezuweisungen */
    nameOfPlayer1 = "Hans";
    nameOfFighter1 = "Gregor";
    healthPointsOfFighter1 = 8;

    nameOfPlayer2 = "Peter";
    nameOfFighter2 = "Bonekraka";
    healthPointsOfFighter2 = 10;

    /* Ausgabe */
    System.out.println("Spieler 1, Name: " + nameOfPlayer1);
    System.out.println("Spieler 1, Kämpfer 1, Name: " + nameOfFighter1);
    System.out.println("Spieler 1, Kämpfer 1, LP: " + healthPointsOfFighter1);
    System.out.println();

    System.out.println("Spieler 2, Name: " + nameOfPlayer2);
    System.out.println("Spieler 2, Kämpfer 1, Name: " + nameOfFighter2);
    System.out.println("Spieler 2, Kämpfer 1, LP: " + healthPointsOfFighter2);
  }
}
