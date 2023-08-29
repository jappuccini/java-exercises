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
    }
}
