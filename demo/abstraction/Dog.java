package demo.abstraction;

public class Dog extends Animal {

    public void makeSound() {
        System.out.println("Wuff!");
    }

    public final void bark() { // Diese Methode kann von ableitenden Klassen nicht abgeleited werden
        System.out.println("Wuff!");
    }
}
