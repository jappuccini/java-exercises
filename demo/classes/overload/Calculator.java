package demo.classes.overload;

public class Calculator {

    // public int add(int numA, int numB) {
    //     return numA + numB;
    // }

    // public double add(double numA, double numB) {
    //     return numA + numB;
    // }

    // public double add(String numA, double numB) {
    //     return add(Double.valueOf(numA), numB);
    // }

    public double add(String numA, String numB) {
        return add(Double.valueOf(numA), Double.valueOf(numB));
    }
}
