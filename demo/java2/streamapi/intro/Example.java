package demo.java2.streamapi.intro;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Steffen", "Merk", 28));
        students.add(new Student("Marianna", "Maglio", 24));
        students.add(new Student("Mirco Francesco Omar", "Cafaro", 26));

        // Klassische Manipulation von Collections
        int numberOfStudents = 0;
        for (Student student : students) {
            if (student.age() > 24
                    && student.firstName().length() > 4
                    && (student.firstName().length() + student.lastName().length()) > 20) {
                numberOfStudents++;
            }
        }
        System.out.println(numberOfStudents);

        // Manipulation von Collections mit der Stream API
        long sum = students.stream()
                .filter(student -> student.age() > 24)
                .filter(student -> student.firstName().length() > 4)
                .map(student -> student.firstName() + student.lastName())
                .filter(fullName -> fullName.length() > 20)
                .count();
        System.out.println(sum);
    }
}
