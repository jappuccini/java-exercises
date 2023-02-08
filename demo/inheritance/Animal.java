package demo.inheritance;

public class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
