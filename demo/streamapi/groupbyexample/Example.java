package demo.streamapi.groupbyexample;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(List.of(
                new Car("BMW", "320i", 190),
                new Car("BMW", "120i", 150),
                new Car("Audi", "A4", 170),
                new Car("Audi", "A5", 214)));

    }
}
