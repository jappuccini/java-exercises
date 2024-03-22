package demo.functionalprogramming;

import java.util.Comparator;

public class AgeComparator implements Comparator<Human> {
    public int compare(Human h1, Human h2) {
        if (h1.age() > h1.age()) {
            return 1;
        } else {
            return -1;
        }
    }
}
