package demo.java2.dsa.search.tests;

import demo.java2.dsa.search.examples.LinearSearch;

public class LinearSearchTest {
    private long start;
    private long finish;

    public void search(int target, int[] searchRoom, int times) {
        start = System.nanoTime();
        for (int j = 0; j < times; j++) {
            LinearSearch.search(target, searchRoom);
        }
        finish = System.nanoTime();
    }

    public void printSearchDuration() {
        long duration = (finish - start) / 1000000;
        System.out.println("Linear Search Time: " + duration + "ms");
    }
}
