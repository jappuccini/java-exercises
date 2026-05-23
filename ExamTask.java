import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 9.5
public class ExamTask { // 0.5
  public static void main(String[] args) { // 0.5
    Map<Integer, Integer> aliceVisits = new HashMap<>(); // 0.5
    aliceVisits.put(2023, 5); // 0.25
    aliceVisits.put(2024, 2); // 0.25

    Person alice = new Person("Alice", 45, aliceVisits, new Profile("11880", "a@b.de")); // 1
    Person bob = new Person("Bob", 30, new HashMap<>(), new Profile("0815")); // 1.5
    List<Person> visitors = List.of(alice, bob); // 0.5

    List<Area> areas = List.of( // 0.5
        new Area("Rose Garden", 2010, 10.0, 15.0), // 0.5
        new Area("Tropical House", 2018, 8.0, 12.0)); // 0.5

    List<Flower> flowers = Flower.getFlowers().toList(); // 0.5

    Garden garden = new Garden(visitors, areas, flowers); // 0.5

    garden.q9() // 0.5
        .entrySet().stream() // 0.5
        .forEach( // 0.5
            System.out::println); // 0.5
  }
}