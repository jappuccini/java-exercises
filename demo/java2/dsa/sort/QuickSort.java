package demo.java2.dsa.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] sortedNumbers = QuickSort.sort(DataSample.getUnsortedQuickSortNumbers());
        QuickSort.printArray(sortedNumbers);
    }

    public static void qs(int[] numbers, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = QuickSort.partition(numbers, low, high);
        QuickSort.qs(numbers, low, pivotIndex - 1);
        QuickSort.qs(numbers, pivotIndex + 1, high);
    }

    public static int partition(int[] numbers, int low, int high) {
        int lowIndex = low;
        int pivotIndex = high;
        for (int i = low; i < high; i++) {
            if (numbers[i] < numbers[pivotIndex]) {
                int lowIndexValue = numbers[lowIndex];
                numbers[lowIndex] = numbers[i];
                numbers[i] = lowIndexValue;
                lowIndex = lowIndex + 1;
            }
        }
        int tmpPivotValue = numbers[pivotIndex];
        numbers[pivotIndex] = numbers[lowIndex];
        numbers[lowIndex] = tmpPivotValue;
        return lowIndex;
    }

    public static int[] sort(int[] numbers) {
        QuickSort.qs(numbers, 0, numbers.length - 1);
        return numbers;
    }

    public static void printInsertionSortStatus(int low, int high, int[] numbers) {
        System.out.println("--------------------------");
        System.out.println("Low: " + low);
        System.out.println("High: " + high);
        System.out.print("Sorted Values: ");
        for (int i = 0; i < low; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Unsorted Values: ");
        for (int i = low; i < high; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------");
    }

    private static void printArray(int[] sortedNumbers) {
        System.out.println("Sorted Numbers");
        for (int i : sortedNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
