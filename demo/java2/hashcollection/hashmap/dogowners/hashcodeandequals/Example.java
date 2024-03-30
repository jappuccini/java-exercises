package demo.java2.hashcollection.hashmap.dogowners.hashcodeandequals;

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
    }
}
