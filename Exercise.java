public class Exercise {

  public static void main(String[] args) {
    Dice dice = new Dice(1);

    System.out.println("ID - Wuerfelwert");
    for (int i = 1; i <= 5; i++) {
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }
}
