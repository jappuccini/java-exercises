package demo.classes.human;

public class Exercise {

    public static void main(String[] args) {

        Human steffen = new Human();
        steffen.firstName = "Steffen";
        steffen.lastName = "Merk";

        Human marianna = new Human();
        Human temp = marianna;
        marianna = steffen;
        marianna.firstName = "Marianna";
        marianna.lastName = "Maglio";

        System.out.println(steffen.firstName);

        char steff = 's';
        char mar = steff;
        mar = 'm';
        System.out.println(steff);
    }
}
