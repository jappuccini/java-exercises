import java.util.List;

public enum Color {
  RED,
  GREEN,
  BLUE;

  public static List<Color> getAwesomeColors() {
    return List.of(RED, BLUE);
  }
}