package demo.java2.dsa.queue;

public class Queue {
    public Node head;
    public Node tail;

    public void enque(String value) {
        Node newNode = new Node(value);
        if (this.tail == null) {
            /*
             * There is no End and also no Beginning
             * So we need set the head and tail to
             * the new Node
             * Result State: head --> A <-- tail
             */
            this.head = newNode;
            this.tail = newNode;
        } else {
            /*
             * There is already something in the Queue
             * So we need set the new tail and link
             * the previous tail to the new tail.
             * Starting State: head --> A --> B <-- tail
             * Result State: head --> A --> B --> C <-- tail
             */
            tail.next = newNode; // head --> A --> B --> C, but B <-- tail
            this.tail = newNode; // head --> A --> B --> C <-- tail
        }
    }

    public String dequeue() {
        if (this.head == null) {
            /*
             * There is nothing in the queue.
             * So we return null.
             * Starting State: head --> null <-- tail
             */
            return null;
        } else {
            /*
             * There is already something in the Queue
             * So we need set the new head and unlink
             * the previous head to the new head.
             * Starting State: head --> A --> B <-- tail
             * Result State: head --> B <-- tail
             */
            Node removedNode = this.head;
            this.head = removedNode.next; // head --> B <-- tail, but A --> B
            removedNode.next = null; // head --> B <-- tail A

            /*
             * It could be, that we remove the last
             * Element from the queue.
             * So we need set the tail to null
             * Starting State: head --> null A <-- tail
             * Result State: head --> null <-- tail
             */
            if (head == null) {
                this.tail = null;
            }
            return removedNode.value;
        }
    }

    public String peek() {
        if (this.head == null) {
            /*
             * There is nothing in the queue.
             * So we return null.
             * Starting State: head --> null <-- tail
             */
            return null;
        } else {
            /*
             * There is something in the queue.
             * So we return the value of the head.
             * Starting State: head --> A <-- tail
             */
            return this.head.value;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        Queue studentsQueue = new Queue();
        studentsQueue.enque("Steffen");
        studentsQueue.enque("Marianna");
        studentsQueue.enque("Mirco");
        System.out.println(studentsQueue.peek());
        studentsQueue.dequeue();
        studentsQueue.dequeue();
        studentsQueue.dequeue();
        System.out.println(studentsQueue.isEmpty());
    }
}
