package demo.java2.introdsa.performance.examples;

import demo.java2.introdsa.performance.tests.ListTest;
import demo.java2.introdsa.performance.tests.MapTest;

public class Deletion {
    public static void main(String[] args) {
        final int numberOfStudents = 10_000_000;
        final int deleteFirstNStudents = 1000;

        ListTest arrayTest = new ListTest(numberOfStudents);
        arrayTest.delete(deleteFirstNStudents);
        arrayTest.printDeletionDuration();
        arrayTest.printCreationDuration();

        ListTest linkedTest = new ListTest(numberOfStudents, true);
        linkedTest.delete(deleteFirstNStudents);
        linkedTest.printDeletionDuration();
        linkedTest.printCreationDuration();

        MapTest hashMapTest = new MapTest(numberOfStudents);
        hashMapTest.delete(deleteFirstNStudents);
        hashMapTest.printDeletionDuration();
        hashMapTest.printCreationDuration();
    }
}
