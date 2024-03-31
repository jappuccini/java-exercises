package demo.java2.functionalinterfaces.owninterfaces;

public record Customer(String name, double credit, int age) {
    public boolean isAdult() {
        return age() > 18;
    }
}
