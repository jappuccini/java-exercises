package demo.streamapi.nameexample;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Steffen");
        names.add("Marianna");
        names.add("Mirco");

        names.stream()
                .filter(name -> name.length() > 4)
                .map(name -> name.toUpperCase())
                .limit(2)
                .forEach(System.out::println);

        // Intermediation Operations sind optional
        names.stream()
                .forEach(System.out::println);

        // Terminal ist erforderlich!
        // Denn ohne Terminal Operation passiert nichts:
        names.stream()
                .map(name -> {
                    System.out.println("Map Funktion"); // wird nicht ausgegeben
                    return name;
                });

        // Mit Terminal Operation passiert was:
        names.stream()
                .map(name -> {
                    System.out.println("Map Funktion"); // wird ausgegeben
                    return name;
                })
                .forEach(System.out::println);
    }
}
