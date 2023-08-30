import java.util.ArrayList;

public class FilteredTeenStudents {
    private ArrayList<Student> students;

    public FilteredTeenStudents() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        if (student.age < 18) {
            this.students.add(student);
        }
    }

    public void printStudents() {
        this.students.forEach((student) -> System.out.println(student));
    }
}
