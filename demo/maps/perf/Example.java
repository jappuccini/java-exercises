package demo.maps.perf;

record Student(String name) {
}

public class Example {
    public static void main(String[] args) {
        final int size = 1000;
        final int times = 100000;
        final int searchedItem = size - 1;

        ArrayListTest arrayTest = new ArrayListTest(size);
        arrayTest.test(searchedItem, times);

        HashMapTest hashMapTest = new HashMapTest(size);
        hashMapTest.test(searchedItem, times);

    }
}
