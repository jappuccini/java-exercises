import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Queries {

    private ArrayList<Footballer> footballers;

    public Queries(ArrayList<Footballer> footballers) {
        this.footballers = footballers;
    }

    public int getTotalOfAllGoalsByMidfielders() {
        return footballers.stream()
                .filter(footballer -> footballer.position().equals(Position.MIDFIELDER))
                .mapToInt(footballer -> footballer.numberOfGoals())
                .sum();
    }

    public Optional<Footballer> getNameOfVfLWolfsburgFootballerWithMostPlayedGames() {
        Predicate<Footballer> isFromWolfsburg = footballer -> footballer
                .footballClub().equals(new FootballClub("VfL Wolfsburg", 3, 1145));
        Comparator<Footballer> sortNumberOfGoalsAscending = (footballer1, footballer2) -> Integer
                .valueOf(footballer1.numberOfGames()).compareTo(footballer2.numberOfGames());

        return footballers.stream()
                .filter(isFromWolfsburg)
                .max(sortNumberOfGoalsAscending);
    }

    public List<FootballClub> getNameOfAllFootballClubs() {
        return footballers.stream()
                .map(footballer -> footballer.footballClub())
                .distinct()
                .toList();
    }

    public boolean isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() {
        return footballers.stream()
                .anyMatch(footballer -> footballer.sizeInCm() < 170 && footballer.numberOfGoals() > 0);
    }

    public Map<Integer, List<Footballer>> getAllFootballersByBirthyear() {
        Function<Footballer, Integer> birthYear = footballer -> footballer.birthDate().getYear();
        return footballers.stream()
                .collect(Collectors.groupingBy(birthYear));
    }

    public  OptionalDouble getAverageNumberOfPointsFromAllBundesligaFootballClubs() {
        return footballers.stream()
                .map(footballer -> footballer.footballClub())
                .distinct()
                .filter(footballClub -> footballClub.positionInAllTimeTable() != -1)
                .mapToInt(footballClub -> footballClub.pointsInAllTimeTable())
                .average();
    }
}
