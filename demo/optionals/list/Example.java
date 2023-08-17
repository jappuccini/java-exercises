package demo.optionals.list;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        University dhbw = new University();
        dhbw.addStudent(new Student("Mirco", 26));

        Optional<Student> searchedStudent = dhbw.findStudentByName("Mirco");
        if (searchedStudent.isPresent()) {
            System.out.println("Student exisitiert:");
            System.out.println(searchedStudent.get().toString());
        } else {
            System.out.println("Student Mirco existiert nicht!");
        }
    }
}
