package demo.java2.dsa.lists;

public class Node {
    public String value;
    public Node previous;
    public Node next;

    public Node(String item) {
        this(item, null, null);
    }

    public Node(String item, Node previous, Node next) {
        this.value = item;
        this.previous = previous;
        this.next = next;
    }
}
