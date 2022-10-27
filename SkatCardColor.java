public enum SkatCardColor {

  DIAMONDS("Karo"),
  HEARTS("Herz"),
  SPADE("Pik"),
  CLUBS("Kreuz");

  private String description;

  SkatCardColor(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
