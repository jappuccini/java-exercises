package demo.java2.dsa.intro.tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private List<Student> students;
    private final long creationStart;
    private final long creationFinish;
    private long start;
    private long finish;

    public ListTest(int size) {
        creationStart = System.nanoTime();
        students = createArrayList(size, false);
        creationFinish = System.nanoTime();
    }

    public ListTest(int size, boolean linkedList) {
        creationStart = System.nanoTime();
        students = createArrayList(size, linkedList);
        creationFinish = System.nanoTime();
    }

    private List<Student> createArrayList(int size, boolean linkedList) {
        List<Student> students = linkedList ? new LinkedList<>() : new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(new Student("Steffen" + i));
        }
        return students;
    }

    public void search(int item, int times) {
        start = System.nanoTime();
        for (int j = 0; j < times; j++) {
            for (int i = 0; i < students.size(); i++) {
                Student currentStudent = students.get(i);
                if (currentStudent.name().equals("Steffen" + item)) {
                    break;
                }
            }
        }
        finish = System.nanoTime();
    }

    public void delete(int numberOfStudents) {
        start = System.nanoTime();
        for (int i = 0; i < numberOfStudents; i++) {
            students.remove(0);
        }
        finish = System.nanoTime();
    }

    public void printCreationDuration() {
        long duration = (creationFinish - creationStart) / 1000000;
        System.out.println("ArrayList Creation Time: " + duration + "ms");
    }

    public void printDeletionDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("ArrayList Deletion Time: " + duration + "ms");
    }

    public void printSearchDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("ArrayList Search Time: " + duration + "ms");
    }
}
