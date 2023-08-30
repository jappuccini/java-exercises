package demo.streamapi.mapexample;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

    }

    private static Stream<Student> getStudents() {
        return Stream.of(
                new Student(1, "Steffen", 28),
                new Student(2, "Mirco", 26),
                new Student(2, "Marianna", 24));
    }

}
