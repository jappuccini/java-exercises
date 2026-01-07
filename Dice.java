import java.util.Random;

public class Dice {

  private int value;

  public Dice() {
    value = 6;
  }

  public int getValue() {
    return value;
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(1, 7);
  }
}
