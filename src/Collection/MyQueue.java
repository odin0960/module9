package Collection;

import java.util.StringJoiner;

public class MyQueue implements OurQueue {

// FIFO
//Можно делать либо с помощью Node либо с помощью массива.
// Queue

    DoublyNode head = null;
    DoublyNode tail = null;

    public void add(Object value) {
        if (tail == null) {
            var node = new DoublyNode(value, null, null);
            tail = node;
            head = node;
        } else {
            var node = new DoublyNode(value, tail, null);
            tail.next = node;
            tail = node;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public int size() {
        if (tail == null)
            return 0;

        int size = 0;
        var current = this.head;

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public Object peek() {   //возвращает первый элемент в очереди (FIFO)
        if (tail == null)
            return null;
        return head.value;
    }

    Object poll() {  //возвращает первый элемент в очереди и удаляет его из коллекции   */
        if (tail == null)
            return null;

        var result = head.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return result;
    }

    public String toString () {
        StringJoiner result = new StringJoiner(", ");
        var current = this.head;
        while (current != null) {
            result.add(current.value.toString());
            current = current.next;
        }
        return "[" + result + "]";
    }

}
