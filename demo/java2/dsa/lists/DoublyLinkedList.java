package demo.java2.dsa.lists;

public class DoublyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public int length() {
        return length;
    }

    public void prepend(String item) {
        Node node = new Node(item);
        length++;
        if (head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        /*
         * Example List State
         * A <--> B <--> C
         * We want to add the new Node node before A
         * Result should be node <--> A <--> B <--> C
         */
        node.next = this.head; // node --> A
        node.next.previous = node; // node <--> A
        this.head = node;
    }

    public void append(String item) {
        Node node = new Node(item);
        length++;
        if (tail == null) {
            this.tail = node;
            this.head = node;
            return;
        }
        /*
         * Example List State
         * A <--> B <--> C
         * We want to add the new Node node after C
         * Result should be A <--> B <--> C <--> node
         */
        this.tail.next = node; // C --> node
        node.previous = this.tail; // C <--> node
        this.tail = node;
    }

    public void insertAt(String item, int index) {
        if (index > length) {
            throw new IllegalArgumentException();
        }
        if (length == 0) {
            prepend(item);
        }
        length++;
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        /*
         * Example List State
         * A <--> B <--> C
         * We want to add the new Node node after A and Before B
         * Result should be A <--> node <--> B <--> C
         */

        Node node = new Node(item);
        node.previous = currentNode.previous; // A <-- node
        node.next = currentNode; // A <-- node --> B
        node.previous.next = node; // A <--> node --> B
        node.next.previous = node; // A <--> node <--> B
    }

    public void remove(String item) {
        if (head == null) {
            return;
        }
        Node current = this.head;
        for (int i = 0; i < length; i++) {
            if (current.value.equals(item)) {
                length--;
                current.previous.next = current.next;
                current.next.previous = current.previous;
                current.previous = null;
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

    public void removeAt(int index) {
        if (index > length) {
            throw new IllegalArgumentException();
        }
        length--;
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        /*
         * Example List State
         * A <--> B <--> C
         * We want to add the new Node node after A and Before B
         * Result should be A <--> node <--> B <--> C
         */
        currentNode.previous.next = currentNode.next;
        currentNode.next.previous = currentNode.previous;
        currentNode.next = null;
        currentNode.previous = null;
    }

    public String get(int index) {
        if (index > length) {
            throw new IllegalArgumentException();
        }
        Node currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public static void main(String[] args) {
        var a = new DoublyLinkedList();
        a.append("A");
        a.append("B");
        a.append("C");
        a.removeAt(1);
        Node current = a.head;
        for (int i = 0; i < a.length; i++) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
