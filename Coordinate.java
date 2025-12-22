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
    return Double.valueOf(this.getDistanceToOriginPoint()).compareTo(c.getDistanceToOriginPoint());
  }
}
