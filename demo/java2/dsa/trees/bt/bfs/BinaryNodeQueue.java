package demo.java2.dsa.trees.bt.bfs;

import demo.java2.dsa.trees.bt.BinaryNode;

public class BinaryNodeQueue {
    public BinaryNodeQueueNode head;
    public BinaryNodeQueueNode tail;

    public void enque(BinaryNode value) {
        BinaryNodeQueueNode newNode = new BinaryNodeQueueNode(value);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.next = newNode;
            this.tail = newNode;
        }
    }

    public BinaryNode dequeue() {
        if (this.head == null) {
            return null;
        } else {
            BinaryNodeQueueNode removedNode = this.head;
            this.head = removedNode.next;
            removedNode.next = null;

            if (head == null) {
                this.tail = null;
            }
            return removedNode.value;
        }
    }

    public BinaryNode peek() {
        if (this.head == null) {
            return null;
        } else {
            return this.head.value;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
