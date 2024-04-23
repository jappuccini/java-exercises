package demo.java2.dsa.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedNumbers = InsertionSort.sort(DataSample.getUnsortedNumbers());
        InsertionSort.printArray(sortedNumbers);
    }

    public static int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int previousIndex = i - 1;
            while (previousIndex >= 0 && numbers[previousIndex] > numbers[previousIndex + 1]) {
                int previousValue = numbers[previousIndex];
                numbers[previousIndex] = numbers[previousIndex + 1];
                numbers[previousIndex + 1] = previousValue;
                previousIndex--;
            }
        }
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