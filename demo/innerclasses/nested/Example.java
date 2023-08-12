package demo.innerclasses.nested;

import java.util.ArrayList;
import java.util.Collections;

import demo.innerclasses.Helper;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = Helper.getExampleNumbers();
        Helper.printNumbers(numbers);

        Collections.sort(numbers, new Nested.NumberAscComparator());
        Helper.printNumbers(numbers);
    }
}
