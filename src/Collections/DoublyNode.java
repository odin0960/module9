package Collections;

public class DoublyNode<E> {
    E value;
    DoublyNode previous;
    DoublyNode next;

    DoublyNode(E value, DoublyNode previous, DoublyNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
