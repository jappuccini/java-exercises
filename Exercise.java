public class Exercise {

  public static void main(String[] args) {
    String name = "Daniel";
    int age = 40;
    char gender = 'M';

    Exercise.printPersonData("Daniel", 40, 'M');
    Exercise.printPersonData(name, age, gender);
  }

  public static void printPersonData(String name, int age, char gender) {
    System.out.println("Name: " + name);
    System.out.println("Alter: " + age);
    System.out.println("Geschlecht: " + gender);
  }
}
