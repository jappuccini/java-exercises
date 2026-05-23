import java.util.Map;

// 3.0
public record Person(String name, int age, Map<Integer, Integer> visits, Profile profile) {}