package demo.java2.streamapi.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(List.of(
                new Car("BMW", "320i", 190),
                new Car("BMW", "120i", 150),
                new Car("Audi", "A4", 170),
                new Car("Audi", "A5", 214)));

        Map<String, List<Car>> brandMap = cars.stream().collect(Collectors.groupingBy(car -> car.brand()));
        brandMap.get("BMW").forEach((System.out::println));
    }
}
