package demo.java2.dsa.stack;

public class Stack {
    public Node head = null;

    public void push(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            /*
             * There is nothing on the Stack
             * So we set our new Node as the Head
             * Starting State: head --> null
             * Result State: head --> A
             */
            this.head = newNode;
        } else {
            /*
             * There is something on the Stack
             * So we set our new Node as the head and
             * link the old head as the next value.
             * Starting State: head --> A --> null
             * Result State: head --> B --> A --> null
             */
            newNode.next = this.head; // head --> A --> null, but B --> A
            this.head = newNode; // head --> B --> A --> null
        }
    }

    public String pop() {
        if (this.head == null) {
            /*
             * There is nothing on the stack
             * so we return null.
             * Starting State: head --> null
             */
            return null;
        } else {
            /*
             * There is something on the stack
             * So we need to remove the head and
             * link the head to the removed nodes next node
             * Starting State: head --> B --> A --> null
             * Result State: head --> A --> null
             */
            Node currentHead = this.head;
            this.head = currentHead.next; // head --> A --> null, but B --> A
            currentHead.next = null; // head --> A --> null
            return currentHead.value;
        }
    }

    public String peek() {
        if (this.head == null) {
            /*
             * There is nothing on the stack
             * so we return null.
             * Starting State: head --> null
             */
            return null;
        } else {
            /*
             * There is something on the stack
             * so we return the value of the head.
             * Starting State: head --> A
             */
            return this.head.value;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        Stack nameStack = new Stack();
        nameStack.push("Steffen");
        nameStack.push("Marianna");
        nameStack.push("Mirco");
        System.out.println(nameStack.pop());
        System.out.println(nameStack.peek());
        nameStack.pop();
        nameStack.pop();
    }
}
