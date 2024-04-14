package demo.java2.dsa.search.tests;

import demo.java2.dsa.search.examples.BinarySearch;

public class BinarySearchTest {
    private long start;
    private long finish;

    public void search(int target, int[] searchRoom, int times) {
        start = System.nanoTime();
        for (int j = 0; j < times; j++) {
            BinarySearch.search(target, searchRoom);
        }
        finish = System.nanoTime();
    }

    public void printSearchDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("Binary Search Time: " + duration + "ms");
    }
}
