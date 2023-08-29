package demo.streamapi.numberexample;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {

    public static Predicate<Integer> isEven = number -> number % 2 == 0;

    public static void main(String[] args) {
    }

    public static Stream<Integer> getNumbers() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}
