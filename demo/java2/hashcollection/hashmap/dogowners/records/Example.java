package demo.java2.hashcollection.hashmap.dogowners.records;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example {
    public static void main(String[] args) {
        // dogs und jeweilige besitzende
        HashMap<Dog, String> dogsInventory = new HashMap<>();
        dogsInventory.put(new Dog("Bello", 2), "Steffen");
        dogsInventory.put(new Dog("Bello", 2), "Marianna");
        System.out.println(dogsInventory.size());

        for (Entry<Dog, String> entry : dogsInventory.entrySet()) {
            System.out.println("Key: " + entry.getKey().toString());
            System.out.println("Value: " + entry.getValue().toString());
        }

        // cats und jeweilige besitzende
        HashMap<Cat, String> catsInventory = new HashMap<>();
        Cat cat1 = new Cat("Mauzi", 2, 30);
        Cat cat2 = new Cat("Mauzi", 2, 30);
        catsInventory.put(cat1, "Marianna");
        catsInventory.put(cat2, "Steffen");

        for (Entry<Cat, String> entry : catsInventory.entrySet()) {
            System.out.println("Key: " + entry.getKey().toString());
            System.out.println("Value: " + entry.getValue().toString());
        }
    }
}
