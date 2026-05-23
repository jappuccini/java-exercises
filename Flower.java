
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// 14.5
public record Flower(String name, Color color, int deliveryYear, Optional<String> careInstructions) { // 3.0

    public static Predicate<Flower> hasAwesomeColor = // 1.0
            flower -> Color.getAwesomeColors().stream().anyMatch(color -> flower.color().equals(color)); // 1.0

    public static Function<Flower, Flower> makeDangerous = // 1.0
            flower -> new Flower(flower.name(), Color.RED, 2025, flower.careInstructions()); // 1.0

    public static Consumer<Flower> printHashvalue = // 1.0
            flower -> System.out.println("Hash: " + flower.hashCode()); // 1.0

    public static Predicate<Flower> needsNoSpecialCare = // 1.0
            flower -> flower.careInstructions().isEmpty(); // 1.0

    public static Predicate<Flower> deliverableBetween(int from, int to) { // 1.0
        return flower -> flower.deliveryYear() >= from && flower.deliveryYear() <= to; // 1.0
    }

    public static Stream<Flower> getFlowers() { // 0.5
        return Stream.of( // 0.5
                new Flower("Daisy", Color.GREEN, 2023, Optional.of("sunlight"))); // 0.5
    }
}