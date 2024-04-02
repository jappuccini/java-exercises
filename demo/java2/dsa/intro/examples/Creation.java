package demo.java2.dsa.intro.examples;

import demo.java2.dsa.intro.tests.ListTest;
import demo.java2.dsa.intro.tests.MapTest;

public class Creation {
    public static void main(String[] args) {
        final int numberOfStudents = 10_000_000;

        ListTest arrayTest = new ListTest(numberOfStudents);
        arrayTest.printCreationDuration();

        MapTest hashMapTest = new MapTest(numberOfStudents);
        hashMapTest.printCreationDuration();
    }
}
