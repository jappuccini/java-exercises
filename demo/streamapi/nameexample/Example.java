package demo.streamapi.nameexample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Steffen");
        names.add("Marianna");
        names.add("Mirco");

        // Terminal führt aus
        names.stream()
                .filter(name -> name.length() > 4)
                .map(name -> name.toUpperCase())
                .map(name -> {
                    // wird nicht ausgeführt, da keine terminal operation
                    System.out.println(name);
                    return name;
                })
                .limit(2);

        names.stream()
                .filter(name -> name.length() > 4)
                .map(name -> name.toUpperCase())
                .map(name -> {
                    // wird ausgeführt, da terminal operation
                    System.out.println(name);
                    return name;
                })
                .limit(2)
                .forEach(System.out::println);

        // Single Use Pipeline
        Stream<String> namesStream1 = names.stream()
                .filter(name -> name.length() > 4)
                .map(name -> name.toUpperCase())
                .limit(2);
        namesStream1.forEach(System.out::println);
        // namesStream1.forEach(System.out::println); funktioniert nicht, da schon
        // ausgeführt
    }
}
