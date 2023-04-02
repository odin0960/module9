package Collections;

public class Node<E> {
    public E value;
    public Node next;

    Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }
}
