package demo.java2.optional.human;

public class Example {

    public static void main(String[] args) {
        Human steffen = new Human("Steffen", "Merk", null);
        Human mirco = new Human("Mirco", "Cafaro", "Omar Francesco");
        steffen.printName();
        mirco.printName();
    }
}
