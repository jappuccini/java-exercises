package demo.maps.unsorted;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example {

    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            students.put(i, new Student("Steffen", 28 + i));
        }

        for (Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
