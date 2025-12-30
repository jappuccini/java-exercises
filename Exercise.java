public class Exercise {

  public static void main(String[] args) {
    Student steffen = new Student("Steffen", 28);
    Student kid = new Student("Kind", 15);

    FilteredStudents adultStudents = new FilteredStudents((student) -> student.age > 18);
    adultStudents.add(steffen);
    steffen.age = 17;
    adultStudents.add(kid);
    adultStudents.forEach(student -> System.out.println(student.name.toUpperCase()));

    System.out.println("-----------------------");

    FilteredStudents teenStudents = new FilteredStudents(student -> student.age < 18);
    teenStudents.add(steffen);
    teenStudents.add(kid);
    teenStudents.forEach(student -> System.out.println(student.name.toLowerCase()));
  }
}
