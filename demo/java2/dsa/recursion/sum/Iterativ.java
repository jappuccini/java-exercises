package demo.java2.dsa.recursion.sum;

public class Iterativ {
    public static void main(String[] args) {
        System.out.println(Iterativ.sum(5));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + i + 1;
        }
        return sum;
    }
}
