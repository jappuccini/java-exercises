package demo.java2.dsa.search;

import java.util.stream.IntStream;

public class DataSample {
    public static int[] getUnsortedNumbers() {
        return new int[] { 10, 50, 30, 70, 80, 20, 90, 40 };
    }

    public static int[] getSortedNumbers() {
        return new int[] { 10, 20, 30, 40, 50, 70, 80, 90 };
    }

    public static int[] getSortedNumbersFromOneTill(int till) {
        return IntStream.rangeClosed(1, till)
                .toArray();
    }
}
