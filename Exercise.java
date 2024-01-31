public class Exercise {

  public static void main(String[] args) {
    int[] one = { 1, 2, 3, 4 };
    int[] two = { 5, 6, 7, 8 };
    int[] both = Exercise.merge(one, two);
    for (int number : both) {
      System.out.println(number);
    }
  }

  public static int[] merge(int[] first, int[] second) {
    int newSize = first.length + second.length;
    int[] mergedArray = new int[newSize];
    for (int i = 0; i < first.length; i++) {
      mergedArray[i] = first[i];
    }
    for (int i = 0; i < second.length; i++) {
      mergedArray[i + first.length] = second[i];
    }
    return mergedArray;
  }
}
