import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Steffen", 28));
    students.add(new Student("Marianna", 24));
    students.add(new Student("Mirco", 26));
    students.add(new Student("Dennis", 30));
    students.add(new Student("Peter", 29));
    students.add(new Student("Leander", 29));
    students.add(new Student("Alu", 32));
    students.add(new Student("Yannik", 28));
    students.add(new Student("Hanni", 29));
    students.add(new Student("Manu", 30));

    students.forEach(
        new Consumer<Student>() {
          @Override
          public void accept(Student student) {
            if (student.age() > 26) {
              System.out.println(student.name() + " ist " + student.age() + " Jahre alt");
            }
          }
        });

    students.forEach(
        (student) -> {
          if (student.age() > 26) {
            System.out.println(student.name() + " ist " + student.age() + " Jahre alt");
          }
        });
  }
}
