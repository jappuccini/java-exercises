package demo.classes.staticmodifier;

public class Exercise {

    public static void main(String[] args) {
        String name = "Steffen";

        double pi = Math.PI;
        double res = Math.abs(-pi);

        Human steffen = new Human("Steffen", "Merk");
        Human marianna = new Human("Marianna", "Maglio");
        for (Human human : Human.humans) {
            System.out.println(human.firstName);
        }
    }
}
