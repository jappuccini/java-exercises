package demo.streamapi.numberexample;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {

    public static Predicate<Integer> isEven = number -> number % 2 == 0;

    public static void main(String[] args) {
        Example.getNumbers()
                .limit(5)
                .filter(Example.isEven)
                .forEach(number -> System.out.print(number + " "));

        System.out.println("\n-----------------------------");

        Example.getNumbers()
                .filter(Example.isEven)
                .limit(5)
                .forEach(number -> System.out.print(number + " "));
    }

    public static Stream<Integer> getNumbers() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}
