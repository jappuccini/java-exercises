import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Coordinate> coordinates = new ArrayList<>();

    coordinates.add(new Coordinate(3, 5));
    coordinates.add(new Coordinate(7, 6));
    coordinates.add(new Coordinate(2, 1));
    coordinates.add(new Coordinate(6, 8));
    coordinates.add(new Coordinate(1, 9));

    Collections.sort(coordinates, new Comparator<Coordinate>() {
      @Override
      public int compare(Coordinate c1, Coordinate c2) {
        return Integer.valueOf(c1.getY()).compareTo(c2.getY());
      }
    });

    for (Coordinate c : coordinates) {
      System.out.println(c + ": " + c.getDistanceToOriginPoint());
    }
  }
}
