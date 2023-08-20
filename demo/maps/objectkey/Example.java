package demo.maps.objectkey;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        // dogs und jeweilige besitzende
        HashMap<Dog, String> dogsInventory = new HashMap<>();
        dogsInventory.put(new Dog("Bello", 2), "Steffen");
        dogsInventory.put(new Dog("Bello", 2), "Marianna");
        System.out.println(dogsInventory.size());
        dogsInventory.entrySet().stream().forEach((k) -> {
            System.out.println("Key: " + k.getKey().toString() + "Value: " +
                    k.getValue().toString());
        });

        // cats und jeweilige besitzende
        HashMap<Cat, String> catsInventory = new HashMap<>();
        Cat cat1 = new Cat("Mauzi", 2);
        Cat cat2 = new Cat("Mauzi", 2);
        catsInventory.put(cat1, "Marianna");
        catsInventory.put(cat2, "Steffen");
        catsInventory.entrySet().stream().forEach((k) -> {
            System.out.println("Key: " + k.getKey().toString() + "Value: " +
                    k.getValue().toString());
        });
    }
}
