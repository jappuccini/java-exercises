public class SkatCard {

  private SkatCardColor color;
  private SkatCardValue value;

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
