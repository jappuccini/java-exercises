package demo.java2.dsa.search.examples;

import demo.java2.dsa.search.DataSample;

public class LinearSearch {

    public static void main(String[] args) {
        int target = 90;

        int[] searchRoom = DataSample.getUnsortedNumbers();

        System.out.println(LinearSearch.search(target, searchRoom));
    }

    public static int search(int target, int[] searchRoom) {
        for (int i = 0; i < searchRoom.length; i++) {
            if (searchRoom[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
