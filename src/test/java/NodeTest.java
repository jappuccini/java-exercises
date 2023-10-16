import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    @DisplayName("A node with a value should be created")
    public void whenNewNode() {
        Node<Integer> node = new Node<Integer>(5, null);
        assertNotNull(node, "constructor of Node needs to return an instance");
        assertEquals(5, node.value, "New node's value needs to be 5, when passed to constructor");
        assertNull(node.next, "New node's next needs to point to null, when passed to constructor");
    }
}
