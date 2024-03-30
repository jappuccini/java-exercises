package demo.java2.hashcollection.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<Integer>(List.of(1, 2, 3, 4));
        Set<Integer> b = new HashSet<Integer>(List.of(2, 3, 5));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        printValuesInSet(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        printValuesInSet(intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        printValuesInSet(difference);
    }

    private static void printValuesInSet(Set<Integer> numbers) {
        System.out.println("Values in Set: " + numbers.size());
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}