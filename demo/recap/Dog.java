package demo.recap;

public class Dog implements Item {
    public final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.name;
    }
}
