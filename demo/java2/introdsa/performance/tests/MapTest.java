package demo.java2.introdsa.performance.tests;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    private Map<String, Student> students;
    private final long creationStart;
    private final long creationFinish;
    private long start;
    private long finish;

    public MapTest(int size) {
        creationStart = System.nanoTime();
        students = createHashMap(size);
        creationFinish = System.nanoTime();
    }

    public void search(int item, int times) {
        start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            students.get("Steffen" + item);
        }
        finish = System.nanoTime();
    }

    public void delete(int numberOfStudents) {
        start = System.nanoTime();
        for (int i = 0; i < numberOfStudents; i++) {
            students.remove("Student" + i);
        }
        finish = System.nanoTime();
    }

    private HashMap<String, Student> createHashMap(int size) {
        HashMap<String, Student> students = new HashMap<>();
        for (int i = 0; i < size; i++) {
            students.put("Steffen" + i, new Student("Steffen" + i));
        }
        return students;
    }

    public void printCreationDuration() {
        long duration = (creationFinish - creationStart) / 1000000;
        System.out.println("HashMap Creation Time: " + duration + "ms");
    }

    public void printDeletionDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("HashMap Deletion Time: " + duration + "ms");
    }

    public void printSearchDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("HashMap Search Time: " + duration + "ms");
    }
}
