import java.util.ArrayList;
import java.util.Collections;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Coordinate> coordinates = new ArrayList<>();

    coordinates.add(new Coordinate(3, 5));
    coordinates.add(new Coordinate(7, 6));
    coordinates.add(new Coordinate(2, 1));
    coordinates.add(new Coordinate(6, 8));
    coordinates.add(new Coordinate(1, 9));

    Collections.sort(coordinates);

    for (Coordinate c : coordinates) {
      System.out.println(c + ": " + c.getDistanceToOriginPoint());
    }
  }
}
