package demo.streamapi.studentexample;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Introduction {
    // static lambdas
    public static Predicate<Student> minimumFirstName = student -> student.firstName().length() > 4;
    public static Predicate<Student> olderThan24Years = student -> student.age() > 24;

    // dynamic lambdas
    public static Predicate<Student> olderThanYears(int maxAge) {
        return student -> student.age() > maxAge;
    }

    public static Predicate<Student> fullNameIsLongerThan(int maxLength) {
        return student -> {
            String fullName = student.firstName() + student.lastName();
            return fullName.length() > maxLength;
        };
    }

    // composed lambdas
    public static Predicate<Student> composedLambdas(int maxAge, int maxFullLength) {
        return olderThanYears(maxAge).and(fullNameIsLongerThan(maxFullLength)).and(minimumFirstName);
    }

    public static Function<Student, String> toFullName = student -> student.firstName() + student.lastName();

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Steffen", "Merk", 28));
        students.add(new Student("Marianna", "Maglio", 24));
        students.add(new Student("Mirco Francesco Omar", "Cafaro", 26));

        // Klassische Manipulation von Collections
        int numberOfStudents = 0;
        for (Student student : students) {
            if (student.firstName().length() > 4 && (student.firstName().length() + student.lastName().length()) > 20
                    && student.age() > 24) {
                numberOfStudents++;
            }
        }
        System.out.println(numberOfStudents);

        // Manipulation von Collections mit der Stream API
        // long sum = students.stream()
        // .filter(student -> student.firstName().length() > 4)
        // .filter(student -> student.age() > 24)
        // .map(student -> student.firstName() + student.lastName())
        // .filter(fullName -> fullName.length() > 20)
        // .count();
        // System.out.println(sum);

        // Stream API mit ausgelagerten und dynamischen lambdas
        long sum = students.stream()
                .filter(Introduction.composedLambdas(24, 20))
                .count();
        System.out.println(sum);

        // Methodenreferenzen
        students.forEach((student) -> System.out.println(student));
        students.forEach(System.out::println);

        class OneTimePrinter {
            public OneTimePrinter(Object o) {
                System.out.println("Printer: " + o);
            }
        }
        students.forEach(OneTimePrinter::new);
    }
}
