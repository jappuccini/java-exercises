import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    @DisplayName("An empty queue should be created")
    public void whenEmptyQueue() {
        Queue<Integer> queue = new Queue<Integer>();
        assertNotNull(queue, "constructor of Queue needs to return an instance");
        assertEquals(0, queue.length, "Empty queue needs to have a length of 0");
        assertNull(queue.peek(), "Empty queue needs to return null for peek()");
        assertNull(queue.head, "Empty queue needs to return null for head");
        assertNull(queue.tail, "Empty queue needs to return null for tail");
    }

    @Test
    @DisplayName("A queue with one item")
    public void whenQueueWithOneItem() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(8);
        assertEquals(1, queue.length, "Queue with one item needs to have a length of 1");
        assertEquals(8, queue.peek(), "Queue with one item needs to return 8 for peek()");
        assertInstanceOf(Node.class, queue.head, "In a queue with one item, head needs to point to a node");
        assertInstanceOf(Node.class, queue.tail, "In a queue with one item, tail needs to point to a node");
        assertEquals(queue.head, queue.tail,
                "In a queue with one item, head and tail needs to point to the same value");
        assertEquals(8, queue.head.value, "Queue with the single item 8, needs to return 8 for the value of head");
        assertEquals(8, queue.tail.value, "Queue with the single item 8, needs to return 8 for the value of tail");
    }

    @Test
    @DisplayName("A queue with three items")
    public void whenQueueWithThreeItems() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(3);

        assertEquals(3, queue.length, "Queue with three items needs to have a length of 3");
        assertEquals(8, queue.peek(), "Queue with three items needs to return 8 for peek()");
        assertInstanceOf(Node.class, queue.head, "In a queue with three items, head needs to point to a node");
        assertInstanceOf(Node.class, queue.tail, "In a queue with three items, tail needs to point to a node");
        assertEquals(8, queue.head.value, "Queue with the items { 8, 4, 3 } needs to return 8 for the value of head");
        assertEquals(3, queue.tail.value, "Queue with the items { 8, 4, 3 } needs to return 3 for the value of tail");
    }

    @Test
    @DisplayName("A queue with three items and complete dequeing")
    public void whenQueueWithThreeItemsGotDequed() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(3);

        assertEquals(8, queue.deque(), "Queue with items {8, 4, 3 } needs to return 8 for first deque()");
        assertEquals(4, queue.deque(), "Queue with items {8, 4, 3 } needs to return 4 for second deque()");
        assertEquals(3, queue.deque(), "Queue with items {8, 4, 3 } needs to return 3 for third deque()");
        assertEquals(0, queue.length, "Dequed queue needs to have a length of 3");
        assertNull(queue.peek(), "Dequed queue needs to return null for peek()");
        assertNull(queue.head, "The head of a dequed queue needs to point to null");
        assertNull(queue.tail, "The tail of a dequed queue needs to point to null");
    }

    @Test
    @DisplayName("A queue with no items and deque")
    public void whenQueueNoItemsGotDequed() {
        Queue<Integer> queue = new Queue<Integer>();

        assertNull(queue.deque(), "Queue with no items needs to return null for deque()");
        assertEquals(0, queue.length, "Dequed queue needs to have a length of 0");
        assertNull(queue.peek(), "Dequed queue needs to return null for peek()");
        assertNull(queue.head, "The head of a dequed queue needs to point to null");
        assertNull(queue.tail, "The tail of a dequed queue needs to point to null");
    }
}
