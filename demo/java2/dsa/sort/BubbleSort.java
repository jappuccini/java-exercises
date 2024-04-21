package demo.java2.dsa.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] sortedNumbers = BubbleSort.sort(DataSample.getUnsortedNumbers());
        BubbleSort.printArray(sortedNumbers);
    }

    public static int[] sort(int[] numbers) {
        int high = numbers.length - 1;
        while (high > 0) {
            printBubbleSortStatus(high, numbers);
            for (int currentIndex = 0; currentIndex < high; currentIndex++) {
                int nextIndex = currentIndex + 1;
                if (numbers[currentIndex] > numbers[nextIndex]) {
                    int nextIndexValue = numbers[nextIndex];
                    numbers[nextIndex] = numbers[currentIndex];
                    numbers[currentIndex] = nextIndexValue;
                }
            }
            high = high - 1;
        }
        return numbers;
    }

    public static void printBubbleSortStatus(int high, int[] numbers) {
        System.out.println("--------------------------");
        printArray(numbers);
        System.out.println("--------------------------");
    }

    private static void printArray(int[] sortedNumbers) {
        for (int i : sortedNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
