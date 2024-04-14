package demo.java2.dsa.recursion.sum;

public class Rekursiv {

    public static void main(String[] args) {
        System.out.println(Rekursiv.sum(5));
    }

    public static int sum(int number) {
        // Base Case
        if (number == 1) {
            // throw new ArithmeticException();
            return 1;
        }
        // Rekursion
        return number + Rekursiv.sum(number - 1);

        // Detailed Rekursion
        // Pre Base Case;
        // int newNumber = number - 1;

        // Recurse
        // int resultNumber = Rekursiv.sum(newNumber);

        // Post Recurse
        // return number + resultNumber;
    }
}
