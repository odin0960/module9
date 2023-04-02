package Map;

public class MyHashMap<K, V> implements MyMap{

    /* Нужно делать с помощью односвязной Node.
Не может хранить две ноды с одинаковых ключами одновременно.  */

    MapNode head = null;

    public void put(Object key, Object value) {  //добавляет пару ключ + значение
        var current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                System.out.println("This key already exist");
                return;
            }
            current = current.next;
        }
        head = new MapNode(key, value, head);
    }

    public void remove(Object key) {  // удаляет пару по ключу
        System.out.println("Удаляем пару по ключу " + key);
        if (head.key.equals(key))
            head = head.next;

        var current = head;
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Такой ключ отсутствует в MyHashMap");
    }

    public void clear() {
        head = null;
    }

    public int size() {
        int size = 0;
        var current = this.head;
        while (current != null){
            current = current.next;
            size++;
        }
        return size;
    }

    public V get(Object key) {   // возвращает значение(Object value) по ключу
                var current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return (V) current.value;
            }
            current = current.next;
        }
        System.out.println("The object aren't found");
        return null;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder("MyMap [");
        var current = this.head;
        while (current != null) {
            sb.append(current.key.toString()).append(" - ").append(current.value.toString());
            if (current.next != null)
                sb.append("; ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
