public class SkatCard {

  private final SkatCardColor color;
  private final SkatCardValue value;

  public SkatCard(SkatCardColor color, SkatCardValue value) {
    this.color = color;
    this.value = value;
  }

  public SkatCardColor getColor() {
    return color;
  }

  public SkatCardValue getValue() {
    return value;
  }

  public String getCardDescription() {
    return color.getDescription() + " " + value.getDescription();
  }
}
