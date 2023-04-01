package Collection;

import java.util.StringJoiner;

public class MyLinkedList implements OurList {
// двусвязный список

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

    public Object get(int index) {
        if (tail == null)
            return null;

        var current = this.head;

        while (index != 0) {
            current = current.next;
            index--;
        }

        return current.value;
    }

    public void remove(int index) {
        var current = this.head;
        while (index != 0) {
            current = current.next;
            index--;
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
    }

    public void clear() {
        head = null;
        tail = null;
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
