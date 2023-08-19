import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    Tournament tournament = new Tournament("Football Cup", new ArrayList<>(), new ArrayList<>());

    tournament.addClub(new Club("SC Freiburg", 165));
    tournament.addClub(new Club("Bayern Muenchen", 926));
    tournament.addClub(new Club("Borussia Dortmund", 462));

    tournament.pairs().forEach(System.out::println);
  }
}
