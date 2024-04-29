package demo.java2.dsa.trees.heap;

import java.util.ArrayList;

public class MinHeap {
    public int length;
    private ArrayList<Integer> queue;

    public MinHeap() {
        this.length = 0;
        this.queue = new ArrayList<>();
    }

    public void insert(int value) {
        this.queue.add(this.length, value);
        this.heapifyUp(this.length);
        this.length++;
    }

    public int delete() {
        if (this.length == 0) {
            throw new IllegalArgumentException();
        }

        int value = queue.get(0);
        if (this.length == 1) {
            this.queue.clear();
            this.length--;
            return value;
        }
        this.length--;
        this.queue.set(0, this.queue.get(length));
        this.heapifyDown(0);
        return value;
    }

    private void heapifyUp(int index) {
        if (index == 0) {
            return;
        }
        int currentValue = queue.get(index);
        int parentIndex = getParent(index);
        int parentValue = queue.get(parentIndex);
        if (currentValue < parentValue) {
            queue.set(parentIndex, currentValue);
            queue.set(index, parentValue);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        if (index >= length) {
            return;
        }
        int leftChildIndex = getLeftChild(index);
        int rightChildIndex = getRightChild(index);
        if (leftChildIndex >= length) {
            return;
        }
        int leftChildValue = queue.get(leftChildIndex);
        int rightChildValue = queue.get(rightChildIndex);
        int currentValue = queue.get(index);
        if (leftChildValue < rightChildValue && currentValue > leftChildValue) {
            queue.set(index, leftChildValue);
            queue.set(leftChildIndex, currentValue);
            heapifyDown(leftChildIndex);
        }
        if (rightChildValue < leftChildValue && currentValue > rightChildValue) {
            queue.set(index, rightChildValue);
            queue.set(rightChildIndex, currentValue);
            heapifyDown(rightChildIndex);
        }
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    private int getRightChild(int index) {
        return 2 * index + 2;
    }

    public static void main(String[] args) {
        MinHeap m = new MinHeap();
        m.insert(900);
        m.insert(4);
        m.insert(9);
        m.insert(6);
        m.insert(0);
        m.insert(56);
        System.out.println(m.delete());
        System.out.println(m.delete());
        System.out.println(m.delete());
        System.out.println(m.delete());
        System.out.println(m.delete());
        System.out.println(m.delete());
    }

}