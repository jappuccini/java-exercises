package demo.java2.dsa.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] sortedNumbers = MergeSort.sort(DataSample.getUnsortedNumbers());
        for (int i : sortedNumbers) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] numbers) {
        int length = numbers.length;
        if (length < 2) {
            return;
        }
        int middleIndex = length / 2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[length - middleIndex];
        for (int i = 0; i < length; i++) {
            if (i < middleIndex) {
                leftSide[i] = numbers[i];
            } else {
                rightSide[i - middleIndex] = numbers[i];
            }
        }
        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(numbers, leftSide, rightSide);
    }

    public static void merge(int[] numbers, int[] leftSide, int[] rightSide) {
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (leftIndex >= leftSide.length) { // only right side left
                numbers[i] = rightSide[rightIndex];
                rightIndex = rightIndex + 1;
                continue;
            } else if (rightIndex >= rightSide.length) { // only left side left
                numbers[i] = leftSide[leftIndex];
                leftIndex = leftIndex + 1;
                continue;
            } else if (leftSide[leftIndex] <= rightSide[rightIndex]) {
                numbers[i] = leftSide[leftIndex];
                leftIndex = leftIndex + 1;
                continue;
            } else if (leftSide[leftIndex] > rightSide[rightIndex]) {
                numbers[i] = rightSide[rightIndex];
                rightIndex = rightIndex + 1;
                continue;
            }
        }
    }

    public static int[] sort(int[] numbers) {
        mergeSort(numbers);
        return numbers;
    }
}
