
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 27,75
public record Garden(List<Person> visitors, List<Area> areas, List<Flower> flowers) { // 2.5

    // 3.75
    public List<String> q1() { // 0.25
        return visitors().stream() // 0.25
                .sorted((v1, v2) -> Integer.compare(v2.age(), v1.age())) // 1
                .limit(10) // 0.5
                .sorted((v1, v2) -> Integer.compare(v1.age(), v2.age())) // 1
                .map(visitor -> visitor.name().toUpperCase()) // 0.5
                .toList(); // 0.25
    }

    // 2.75
    public List<Person> q2() { // 0.25
        return visitors().stream() // 0.25
                .filter(
                        visitor -> visitor.visits().values().stream() // 1
                                .filter(value -> value > 3) // 0.5
                                .count() >= 2) // 0.5
                .toList(); // 0.25
    }

    // 2.75
    public Map<Integer, List<Person>> q3(int visitedYear) { // 0.5
        return visitors().stream() // 0.25
                .filter(
                        visitor -> visitor.visits().keySet().stream() // 1
                                .anyMatch(year -> year == visitedYear)) // 0.5
                .collect(Collectors.groupingBy(visitor -> visitor.age())); // 0.5
    }

    // 2
    public double q4() { // 0.25
        return areas().stream() // 0.25
                .filter(area -> area.openingYear() < 2015) // 0.5
                .mapToDouble(area -> area.width() * area.length()) // 0.5
                .sum(); // 0.5
    }

    // 1.75
    public List<Integer> q5() { // 0.25
        return visitors().stream() // 0.25
                .map(Person::age) // 0.5
                .distinct() // 0.5
                .toList(); // 0.25
    }

    // 4.0
    public long q6() { // 0.25
        return visitors().stream() // 0.25
                .map(
                        visitor -> visitor
                                .visits() // 0.5
                                .values()
                                .stream() // 1
                                .mapToInt(Integer::intValue) // 0.5
                                .sum()) // 0.5
                .mapToInt(Integer::intValue) // 0.5
                .sum(); // 0.5
    }

    // 2
    public void q7() { // 0.25
        flowers().stream() // 0.25
                .filter(Flower.hasAwesomeColor) // 0.5
                .map(Flower.makeDangerous) // 0.5
                .forEach(Flower.printHashvalue); // 0.5
    }

    // 2
    public List<Flower> q8(int from, int to) { // 0.5
        return flowers().stream() // 0.25
                .filter(Flower.deliverableBetween(from, to)) // 0.5
                .filter(Flower.needsNoSpecialCare) // 0.5
                .toList(); // 0.25
    }

    // 2.5
    public Map<String, String> q9() { // 0.25
        return flowers().stream() // 0.25
                .collect(Collectors.toMap( // 0.5
                        flower -> flower.name(), // 0.5
                        flower -> flower.careInstructions().orElse("")) // 1.0
                );
    }

    // 1.75
    public List<Person> q10() { // 0.25
        return visitors().stream() // 0.25
                .filter(visitor -> visitor.profile().isValidated()) // 1.0
                .toList(); // 0.25
    }
}