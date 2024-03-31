package demo.java2.functionalinterfaces.methodreferences;

public record Customer(String name, double credit, int age) {
    public boolean isAdult() {
        return age() > 18;
    }
}
