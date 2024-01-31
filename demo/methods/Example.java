package demo.methods;

public class Example {

    public static void main(String[] args) {
        int result = Example.add(1, 2);
        System.out.println(result);

        String fullName = Example.getFullName("Dottore", "Steffen", "Merk");
        System.out.println(fullName);

        Example.sendLetter();

        String currentTime = Example.getCurrentTime();
        System.out.println(currentTime);
    }

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static String getFullName(String title, String firstName, String lastName) {
        return title + " " + firstName + " " + lastName;
    }

    public static void sendLetter() {
        System.out.println("Sended letter");
    }

    public static String getCurrentTime() {
        return "Es ist fast halb 2";
    }
}
