public enum SkatCardColor {
  DIAMONDS("Diamonds"),
  HEARTS("Hearts"),
  SPADE("Spade"),
  CLUBS("Clubs");

  private final String description;

  SkatCardColor(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
