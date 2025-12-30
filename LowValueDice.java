import java.util.Random;

public class LowValueDice extends Dice {

  public LowValueDice(int id) {
    super(id);
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(3) + 1;
  }
}
