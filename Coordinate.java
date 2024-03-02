public class Coordinate implements Comparable<Coordinate> {

  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public double getDistanceToOriginPoint() {
    return Math.hypot(x, y);
  }

  public int compareTo(Coordinate c) {
    if (getDistanceToOriginPoint() < c.getDistanceToOriginPoint()) {
      return 1;
    } else if (getDistanceToOriginPoint() > c.getDistanceToOriginPoint()) {
      return -1;
    } else {
      return 0;
    }
  }
}
