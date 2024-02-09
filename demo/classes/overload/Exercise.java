package demo.classes.overload;

public class Exercise {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = (int) calculator.add("A", String.valueOf(2.3));
    }
}
