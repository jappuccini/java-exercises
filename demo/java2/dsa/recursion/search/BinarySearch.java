package demo.java2.dsa.recursion.search;

import demo.java2.dsa.search.DataSample;

public class BinarySearch {

    public static void main(String[] args) {
        int target = 60;
        int[] searchRoom = DataSample.getSortedNumbers();
        System.out.println(BinarySearch.recursion(target, searchRoom));
    }

    public static int inner(int target, int[] searchRoom, int low, int high) {
        int middleIndex = low + (high - low) / 2;
        int middleValue = searchRoom[middleIndex];
        // Base Cases
        // Base Case 1: Wir haben den gesuchten Wert gefunden.
        if (middleValue == target) {
            return middleIndex;
        }
        // Base Case 2: Der gesuchte Wert exisitiert nicht.
        if (low == high) {
            return -1;
        }

        // Recursion
        if (target > middleValue) {
            /*
             * Suchraum verkleinern. Da das Zielelement größer ist,
             * als der Wert des Elements in der Mitte, KANN das Zielelement
             * nur weiter hinten im Array sein. D.h. das untere Ende des
             * Suchraumes ist nun an der Stelle des mittleren Index, jedoch
             * um 1 erhöht.
             */
            return inner(target, searchRoom, middleIndex + 1, high);
        }
        if (target < middleValue) {
            /*
             * Suchraum verkleinern. Da das Zielelement kleiner ist,
             * als der Wert des Elements in der Mitte, KANN das Zielelement
             * nur weiter vorne im Array sein. D.h. das obere Ende des
             * Suchraumes ist nun an der Stelle des mittleren Index, jedoch
             * um 1 verringert.
             */
            high = middleIndex - 1;
            return inner(target, searchRoom, low, middleIndex - 1);
        }
        return -1; // needed because int
    }

    public static int recursion(int target, int[] searchRoom) {
        return BinarySearch.inner(target, searchRoom, 0, searchRoom.length - 1);
    }

    public static int iterativ(int target, int[] searchRoom) {
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
