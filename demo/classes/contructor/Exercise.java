package demo.classes.contructor;

public class Exercise {
    
    public static void main(String[] args) {
        Human steffen = new Human("Steffen", "Merk");
        Human marianna = new Human("Marianna;Maglio");
        System.out.println(marianna.firstName);
        System.out.println(marianna.lastName);
    }
}
