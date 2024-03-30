package demo.java2.hashcollection.hashmap.dogowners.bug;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example {
    public static void main(String[] args) {
        Map<Dog, String> dogInventory = new HashMap<>();
        dogInventory.put(new Dog("Bello"), "Steffen");
        var a = dogInventory.get(new Dog("Bello"));
        System.out.println(a);
        System.out.println(dogInventory.size());
        for (Entry<Dog, String> entry : dogInventory.entrySet()) {
            System.out.println(entry.getKey().name);
            System.out.println(entry.getValue());
        }
    }
}
