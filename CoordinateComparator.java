import java.util.Comparator;

public class CoordinateComparator implements Comparator<Coordinate> {

  public int compare(Coordinate c1, Coordinate c2) {
    if (c1.getDistanceToOriginPoint() > c2.getDistanceToOriginPoint()) {
      return 1;
    } else if (c1.getDistanceToOriginPoint() < c2.getDistanceToOriginPoint()) {
      return -1;
    } else {
      return 0;
    }
  }
}
