package demo.maps.basic;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example {

    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();

        students.put(123, new Student("Steffen", 28));
        students.put(456, new Student("Marianna", 24));
        Student marianna = students.get(456);
        students.remove(456);
        students.containsKey(123);
        students.containsValue(marianna);
        students.size();
        students.clear(); // diese Zeile auskommentieren um  loops zu testen

        for (Integer key : students.keySet()) {
            System.out.println("Key:" + key);
        }

        for (Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key:" + entry.getKey());
            System.out.println("Value:" + entry.getValue());
        }

        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
