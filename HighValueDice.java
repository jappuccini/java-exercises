import java.util.Random;

public class HighValueDice extends Dice {

  public HighValueDice(int id) {
    super(id);
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(3) + 4;
  }
}
