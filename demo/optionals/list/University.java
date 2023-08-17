package demo.optionals.list;

import java.util.ArrayList;
import java.util.Optional;

public class University {
    private ArrayList<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }
    }

    public Optional<Student> findStudentByName(String name) {
        for (Student student : students) {
            if (student.name().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}
