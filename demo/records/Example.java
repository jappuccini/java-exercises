package demo.records;

public class Example {
    public static void main(String[] args) {
        Cat miau = new Cat("Merlin", 2, 20);
        Cat miau2 = new Cat("Merlin", 2, 20);
        System.out.println("Cat:");
        System.out.println("Equal: " + miau.equals(miau2));
        System.out.println("toString: " + miau.toString());

        Dog doggo = new Dog("Bello", 4, 40);
        Dog doggo2 = new Dog("Bello", 4, 40);
        System.out.println("Dog:");
        System.out.println("Equal: " + doggo.equals(doggo2));
        System.out.println("toString: " + doggo.toString());
    }
}
