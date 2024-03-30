package demo.java2.hashcollection.hashmap.studentgrades;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();
        // add value by key
        studentGrades.put("Steffen", 3.4);
        studentGrades.put("Steffen", 4.4); // replaces the existing value

        studentGrades.put("Marianna", 1.4);
        studentGrades.put("Mirco", 5.4);

        // get value by key
        double gradeOfSteffen = studentGrades.get("Steffen");
        System.out.println(gradeOfSteffen);

        // remove value by key
        studentGrades.remove("Steffen");

        // all keys
        Set<String> keys = studentGrades.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // all values
        Collection<Double> values = studentGrades.values();
        for (Double value : values) {
            System.out.println(value);
        }

        // all entries
        Set<Entry<String, Double>> entries = studentGrades.entrySet();
        for (Entry<String, Double> entry : entries) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // get number of entries
        int numberOfEntries = studentGrades.size();
        System.out.println(numberOfEntries);

        // remove all entries
        studentGrades.clear();
    }
}
