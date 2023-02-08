package demo.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow!");
    }
}
