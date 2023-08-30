package demo.streamapi.mapexample;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        Map<Integer, Student> map = getStudents().collect(
                Collectors.toMap((student) -> student.matNr(), student -> student));

        Student mirco = map.get(2);
        System.out.println(mirco.name());
        map.values().stream().forEach(System.out::println);
    }

    private static Stream<Student> getStudents() {
        return Stream.of(
                new Student(1, "Steffen", 28),
                new Student(2, "Mirco", 26),
                new Student(3, "Marianna", 24));
    }

}
