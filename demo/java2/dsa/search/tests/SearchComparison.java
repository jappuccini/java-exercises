package demo.java2.dsa.search.tests;

import demo.java2.dsa.search.DataSample;

public class SearchComparison {

    public static void main(String[] args) {
        int target = 244_198;
        int times = 100000;
        int[] searchRoom = DataSample.getSortedNumbersFromOneTill(1_000_000);

        BinarySearchTest binarySearchTest = new BinarySearchTest();
        binarySearchTest.search(target, searchRoom, times);
        binarySearchTest.printSearchDuration();

        LinearSearchTest linearSearchTest = new LinearSearchTest();
        linearSearchTest.search(target, searchRoom, times);
        linearSearchTest.printSearchDuration();
    }
}
