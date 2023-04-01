package Examples;

public class LinkedList {
    public LinkedListNode head = null;

    //Вставка элемента в начало списка
    public void add(Object value) {
        head = new LinkedListNode(value, head);
    }

    //Вставка элемента в середину или конец списка
    public void insert(int index, Object value) {
        if (head == null) {
            head = new LinkedListNode(value, null);
        } else if (index == 0) {
            add(value);
        } else {
            var current = head;
            while (current.next != null && index > 0) {
                current = current.next;
                index = index - 1;
            }

            current.next = new LinkedListNode(value, current.next);
        }
    }

    //Поиск элемента
    public boolean contains(Object value) {
        var current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Определение длины списка
    public int length() {
        var result = 0;
        var current = this.head;

        while (current != null) {
            result = result + 1;
            current = current.next;
        }

        return result;
    }

    //Извлечение значения и удаление элемента из начала списка
    public Object remove() {
        if (head == null) {
            return null;
        }

        var value = head.value;
        head = head.next;

        return value;
    }

    //Извлечение значения и удаление элемента из середины или конца списка
    // («есть ли узел за следующим узлом»)
    public Object removeAt(int index) {
        if (head == null) {
            return null;
        } else if (index == 0 || head.next == null) {
            return remove();
        } else {
            var current = this.head;
            while (current.next.next != null && index > 0) {
                current = current.next;
                index = index - 1;
            }

            var value = current.value;
            current.next = current.next.next;

            return value;
        }
    }

    void reverse() {
        if (head.next == null) return;

        var current = head.next;
        head.next = null;

        while (current != null) {
            LinkedListNode nextCurrent = current.next;
            current.next = head.next;
            head.next = current;
            current = nextCurrent;
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList[");
        for (LinkedListNode i = head.next; i != null; i = i.next) {
            sb.append("'").append(i.value).append("'");
            if (i.next != null) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}
