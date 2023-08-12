package demo.innerclasses;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static ArrayList<Integer> getExampleNumbers() {
        return new ArrayList<>(List.of(4, 2, 9, -4, 4900, 300, -5000));
    }

    public static void printNumbers(ArrayList<Integer> numbers) {
        System.out.println("Start Printing Numbers");
        for (Integer integer : numbers) {
            System.out.println(integer);
        }
        System.out.println("Finished Printing Numbers");
    }
}
