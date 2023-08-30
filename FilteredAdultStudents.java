import java.util.ArrayList;

public class FilteredAdultStudents {
  private ArrayList<Student> students;

  public FilteredAdultStudents() {
    this.students = new ArrayList<>();
  }

  public void add(Student student) {
    if (student.age > 18) {
      this.students.add(student);
    }
  }

  public void printStudents() {
    this.students.forEach((student) -> System.out.println(student));
  }
}
