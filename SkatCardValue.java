public enum SkatCardValue {
  SEVEN("Seven", 7),
  EIGHT("Eight", 8),
  NINE("Nine", 9),
  TEN("Ten", 10),
  JACK("Jack", 2),
  CHECKERS("Checkers", 3),
  KING("King", 4),
  ACE("Ace", 11);

  private final String description;
  private final int value;

  private SkatCardValue(String description, int value) {
    this.description = description;
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public int getValue() {
    return value;
  }
}
