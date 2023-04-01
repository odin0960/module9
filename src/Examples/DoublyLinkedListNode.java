package Examples;

import java.util.Iterator;

public class DoublyLinkedListNode {
    Object value;
    DoublyLinkedListNode previous;
    DoublyLinkedListNode next;

    DoublyLinkedListNode(Object value, DoublyLinkedListNode previous, DoublyLinkedListNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}

