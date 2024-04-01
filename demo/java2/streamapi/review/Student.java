package demo.java2.streamapi.review;

import java.util.function.Function;
import java.util.function.Predicate;

public record Student(String firstName, String lastName, int age) {

    // static lambdas
    public static Predicate<Student> minimumFirstName = student -> student.firstName().length() > 4;
    public static Predicate<Student> olderThan24Years = student -> student.age() > 24;
    public static Function<Student, String> toFullName = student -> student.firstName() + student.lastName();

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

}
