package demo.finalmodifier;

public class Example {
    public static void main(String[] args) {
        final char gender = 'm';
        System.out.println(gender);

        Human steffen = new Human("Steffen");
        System.out.println(steffen.firstName);
    }
}