package demo.java2.introdsa.performance.examples;

import demo.java2.introdsa.performance.tests.ListTest;
import demo.java2.introdsa.performance.tests.MapTest;

record Student(String name) {
}

public class Search {
    public static void main(String[] args) {
        final int numberOfStudents = 1_000_000; // 1 Millionen
        final int numberOfSearches = 1000; // 1 Tausend Suchvorgänge
        final int lastAddedItem = numberOfStudents - 1; 

        ListTest arrayList = new ListTest(numberOfStudents);
        arrayList.search(lastAddedItem, numberOfSearches);
        arrayList.printSearchDuration();

        MapTest hashMapTest = new MapTest(numberOfStudents);
        hashMapTest.search(lastAddedItem, numberOfSearches);
        hashMapTest.printSearchDuration();
    }
}
