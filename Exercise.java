public class Exercise {

  public static void main(String[] args) {
    Student steffen = new Student("Steffen", 28);
    Student kid = new Student("Kind", 15);

    FilteredStudents adultStudents = new FilteredStudents((student) -> student.age > 18);
    adultStudents.add(steffen);
    adultStudents.add(kid);
    adultStudents.printStudents();

    System.out.println("-----------------------");

    FilteredStudents teenStudents = new FilteredStudents(student -> student.age < 18);
    teenStudents.add(steffen);
    teenStudents.add(kid);
    teenStudents.printStudents();
  }
}
