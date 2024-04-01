package demo.java2.streamapi.collectors.tomap;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarStore {
    private Map<String, Car> carMap;
    private Function<Car, String> carToKey = car -> car.brand().toLowerCase() + car.model().toLowerCase();
    private Function<Car, Car> carToValue = car -> car;

    public CarStore() {
        this.carMap = this.getCarStream()
                .collect(Collectors.toMap(carToKey, carToValue));
    }

    public Optional<Car> getCarByKey(String key) {
        String lookUpKey = key.toLowerCase();
        if (this.carMap.containsKey(lookUpKey)) {
            return Optional.of(this.carMap.get(lookUpKey));
        }
        return Optional.empty();
    }

    private Stream<Car> getCarStream() {
        return Stream.of(
                new Car("Fiat", "500", 92),
                new Car("BMW", "320i", 184),
                new Car("Audi", "A4", 169));
    }
}
