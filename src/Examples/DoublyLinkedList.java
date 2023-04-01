package Examples;

import java.util.Iterator;
import java.util.NoSuchElementException;

class DoublyLinkedList implements Iterable<Object> {

    DoublyLinkedListNode head = null;
    DoublyLinkedListNode tail = null;

    //Вставка узла в начало списка
    public void insertBegin(Object value) {
        if (head == null) {
            var node = new DoublyLinkedListNode(value, null, null);
            head = node;
            tail = node;
        } else {
            var node = new DoublyLinkedListNode(value, null, head);
            head.previous = node;
            head = node;
        }
    }

    //Вставка узла в конец списка
    public void insertEnd(Object value) {
        if (tail == null) {
            var node = new DoublyLinkedListNode(value, null, null);
            tail = node;
            head = node;
        } else {
            var node = new DoublyLinkedListNode(value, tail, null);
            tail.next = node;
            tail = node;
        }
    }

    //Удаление первого узла
    public Object removeBegin() {
        if (head == null) {
            return null;
        }

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

    //Удаление последнего узла
    public Object removeEnd() {
        if (head == null) {
            return null;
        }

        var result = tail.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }

        return result;
    }

    @Override
    public Iterator<Object> iterator() {
        return new DoubleLinkedListIterator();
    }

    private class DoubleLinkedListIterator implements Iterator<Object> {
        DoublyLinkedListNode current = head;

        @Override
        public Object next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            var lastReturnedNode = current;
            current = current.next;
            return lastReturnedNode.value;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }
    }
}
