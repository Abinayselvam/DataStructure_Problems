import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void givenLinkedList_WhenInserted40After30_ShouldPass() {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        Node<Integer> node = list.searchNode(30);

        list.insertAfter(node, 40);

        boolean result = list.searchNode(40) != null;

        assertTrue(result);
    }
}