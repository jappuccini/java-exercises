package demo.streamapi.mapexample;

import java.util.stream.Stream;

public class CarStore {
    private Stream<Car> getCarStream() {
        return Stream.of(
                new Car("Fiat", "500", 92),
                new Car("BMW", "320i", 184),
                new Car("Audi", "A4", 169));
    }
}
