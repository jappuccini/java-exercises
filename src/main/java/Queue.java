public class Queue<T> {
    public int length;
    public Node<T> head;
    public Node<T> tail;

    public Queue() {
        length = 0;
        head = null;
        tail = null;
    }

    public void enqueue(T item) {
        if (item == null) {
            return;
        }
        length++;
        final Node<T> node = new Node<T>(item, null);
        if (this.length == 1) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T deque() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            length--;
            Node<T> tmp = head;
            tmp.next = null;
            head = null;
            tail = null;
            return tmp.value;
        } else {
            length--;
            Node<T> tmp = head;
            head = head.next;
            tmp.next = null;
            return tmp.value;
        }
    }

    public T peek() {
        if (head != null) {
            return head.value;
        }
        return null;
    }
}
