package demo.innerclasses.local;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import demo.innerclasses.Helper;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = Helper.getExampleNumbers();
        Helper.printNumbers(numbers);

        class NumberAscComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        Collections.sort(numbers, new NumberAscComparator());
        Helper.printNumbers(numbers);
    }
}
