package demo.java2.dsa.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedNumbers = SelectionSort.sort(DataSample.getUnsortedNumbers());
        SelectionSort.printArray(sortedNumbers);
    }

    public static int[] sort(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            printSelectionSortStatus(low, high, numbers);
            int lowestIndex = low;
            for (int currentIndex = low; currentIndex < numbers.length; currentIndex++) {
                if (numbers[currentIndex] < numbers[lowestIndex]) {
                    lowestIndex = currentIndex;
                }
            }
            int lowValue = numbers[low];
            numbers[low] = numbers[lowestIndex];
            numbers[lowestIndex] = lowValue;
            low = low + 1;
        }
        return numbers;
    }

    public static void printSelectionSortStatus(int low, int high, int[] numbers) {
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