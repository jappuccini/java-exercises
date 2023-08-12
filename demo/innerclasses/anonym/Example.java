package demo.innerclasses.anonym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 2, 9, -4, 4900, 300, -5000));

        Collections.sort(numbers, new Comparator<Integer>() {
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
        });
    }
}
