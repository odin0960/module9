package Collections;

import java.util.StringJoiner;

class MyStack<E> implements OurQueue<E> {
    // LIFO
    //Можно делать либо с помощью Node либо с помощью массива.

    Node head = null;

    public void push(E value) {            //добавляет элемент в конец
        head = new Node(value, head);
    }

    public void remove(int index) {
        System.out.println("We are deleting the element with index " + index);
        if (head == null || index > size()) {
            System.out.println("The stack doesn't contain any element with this index");
            return;
        } else if (index == 0) {
            System.out.println("The element number 0 deleted");
            head = head.next;
        } else {
            System.out.println("The element number " + index + " deleted");
            var current = this.head;
            while (index - 1 > 0) {
                index--;
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void clear() {
        head = null;
    }

    public int size() {
        int size = 0;
        var current = this.head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public E peek() {   //возвращает первый элемент в стеке (LIFO)
        return (E) head.value;
    }

    public E pop() { //возвращает первый элемент в стеке и удаляет его из коллекции
        var result = head.value;
        head = head.next;
        return (E) result;
    }

    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        var current = this.head;
        while (current != null) {
            result.add(current.value.toString());
            current = current.next;
        }
        return "[" + result + "]";
    }
}
