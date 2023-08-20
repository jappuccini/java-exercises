package demo.maps.perf;

import java.util.HashMap;

public class HashMapTest {

    private HashMap<String, Student> hashMap;

    public HashMapTest(int size) {
        this.hashMap = createHashMap(size);
    }

    public void test(int item, int times) {
        long searchHashMapStart = System.nanoTime();
        for (int i = 0; i < times; i++) {
            this.hashMap.get("Steffen" + item);
        }
        long searchHashMapFinish = System.nanoTime();
        System.out.println("Search in HashMap:");
        System.out.println((searchHashMapFinish - searchHashMapStart) / 1000000 + " ms");
    }

    private HashMap<String, Student> createHashMap(int size) {
        long hashMapCreationStart = System.nanoTime();
        HashMap<String, Student> hashMapStudents = new HashMap<>();
        for (int i = 0; i < size; i++) {
            hashMapStudents.put("Steffen" + i, new Student("Steffen" + i));
        }
        long hashMapCreationFinish = System.nanoTime();
        System.out.println("HashMap Creation Time:");
        System.out.println((hashMapCreationFinish - hashMapCreationStart) / 1000000 + " ms");
        return hashMapStudents;
    }

}
