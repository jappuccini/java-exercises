public class Player {

  private String name;
  private int score;
  private boolean isActive;
  private boolean specialAvailable;

  public Player(String name) {
    this.name = name;
    isActive = true;
    specialAvailable = true;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean getSpecialAvailable() {
    return specialAvailable;
  }

  public void setSpecialAvailable(boolean specialAvailable) {
    this.specialAvailable = specialAvailable;
  }
}
