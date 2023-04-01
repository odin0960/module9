package Collection;

public class DoublyNode {
    Object value;
    DoublyNode previous;
    DoublyNode next;

    DoublyNode(Object value, DoublyNode previous, DoublyNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
