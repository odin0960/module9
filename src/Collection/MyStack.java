package Collection;

import java.util.StringJoiner;

class MyStack implements OurQueue {
    // LIFO
    //Можно делать либо с помощью Node либо с помощью массива.
    //Stack

    Node head = null;

    public void push(Object value) {            //добавляет элемент в конец
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

    public Object peek() {   //возвращает первый элемент в стеке (LIFO)
        return head.value;
    }

    public Object pop() { //возвращает первый элемент в стеке и удаляет его из коллекции
        var result = head.value;
        head = head.next;
        return result;
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
