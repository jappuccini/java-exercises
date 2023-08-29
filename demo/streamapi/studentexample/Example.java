package demo.streamapi.studentexample;

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
            if (student.firstName().length() > 4 && (student.firstName().length() + student.lastName().length()) > 20
                    && student.age() > 24) {
                numberOfStudents++;
            }
        }
        System.out.println(numberOfStudents);
    }
}
