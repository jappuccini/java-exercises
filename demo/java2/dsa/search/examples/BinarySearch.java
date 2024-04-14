package demo.java2.dsa.search.examples;

import demo.java2.dsa.search.DataSample;

public class BinarySearch {

    public static void main(String[] args) {
        int target = 90;
        int[] searchRoom = DataSample.getSortedNumbers();
        System.out.println(BinarySearch.search(target, searchRoom));
    }

    public static int search(int target, int[] searchRoom) {
        int low = 0;
        int high = searchRoom.length - 1;
        while (low <= high) {
            // BinarySearch.showSearchStatus(low, high, searchRoom);
            int middleIndex = low + (high - low) / 2;
            int middleValue = searchRoom[middleIndex];
            if (middleValue == target) {
                return middleIndex;
            } else if (target > middleValue) {
                /*
                 * Suchraum verkleinern. Da das Zielelement größer ist,
                 * als der Wert des Elements in der Mitte, KANN das Zielelement
                 * nur weiter hinten im Array sein. D.h. das untere Ende des
                 * Suchraumes ist nun an der Stelle des mittleren Index, jedoch
                 * um 1 erhöht.
                 */
                low = middleIndex + 1;
            } else if (target < middleValue) {
                /*
                 * Suchraum verkleinern. Da das Zielelement kleiner ist,
                 * als der Wert des Elements in der Mitte, KANN das Zielelement
                 * nur weiter vorne im Array sein. D.h. das obere Ende des
                 * Suchraumes ist nun an der Stelle des mittleren Index, jedoch
                 * um 1 verringert.
                 */
                high = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void showSearchStatus(int low, int high, int[] numbers) {
        System.out.print("Suchraum: ");
        for (int i = low; i <= high; i++) {
            System.out.print("" + numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Low Index: " + low + " High Index: " + high);
        System.out.println();
    }
}
