public class Exercise {

  public static void main(String[] args) {
    Student steffen = new Student("Steffen", 28);
    Student kid = new Student("Kind", 15);

    FilteredAdultStudents adultStudents = new FilteredAdultStudents();
    adultStudents.add(steffen);
    adultStudents.add(kid);
    adultStudents.printStudents();

    System.out.println("-----------------------");

    FilteredTeenStudents teenStudents = new FilteredTeenStudents();
    teenStudents.add(steffen);
    teenStudents.add(kid);
    teenStudents.printStudents();
  }
}
