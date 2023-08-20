package demo.maps.perf;

import java.util.ArrayList;

public class ArrayListTest {
    private ArrayList<Student> students;

    public ArrayListTest(int size) {
        this.students = createArrayList(size);
    }

    public void test(int item, int times) {
        long searchArrayListStart = System.nanoTime();
        for (int j = 0; j < times; j++) {
            for (int i = 0; i < this.students.size(); i++) {
                Student stud = this.students.get(i);
                if (stud.name().equals("Steffen" + item)) {
                    break;
                }
            }
        }
        long searchArrayListFinish = System.nanoTime();
        System.out.println("Search in ArrayList:");
        System.out.println((searchArrayListFinish - searchArrayListStart) / 1000000 + " ms");

    }

    private ArrayList<Student> createArrayList(int size) {
        long arrayListCreationStart = System.nanoTime();
        ArrayList<Student> arrayStudents = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayStudents.add(new Student("Steffen" + i));
        }
        long arrayListCreationFinish = System.nanoTime();
        System.out.println("ArrayList Creation Time:");
        System.out.println((arrayListCreationFinish - arrayListCreationStart) / 1000000 + " ms");
        return arrayStudents;
    }

}
