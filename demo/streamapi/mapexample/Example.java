package demo.streamapi.mapexample;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        Optional<Car> car = carStore.getCarByKey("bmw320i");
        car.ifPresent(System.out::println);
    }
}
