package Map;

import java.util.Objects;

public class MyHashMap<K, V> implements MyMap {

    /* Нужно делать с помощью односвязной Node.
Не может хранить две ноды с одинаковых ключами одновременно.  */


    public static class MapNode<K, V> {
        final int hash;
        final K key;
        V value;
        public MapNode next;

        MapNode(int hash, K key, V value, MapNode next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private MapNode[] table;
    private int size;
    private int n;   //текущий размер массива - table.length
    private int limit;  //capacity * loadFactor
    private static final int INIT_SIZE = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

//    public MyHashMap() {    //start - (capacity) = 16 и (load factor) = 0.75;
//    }


    final static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private void resize() {
        if (table == null || table.length == 0) {
            n = INIT_SIZE;
            table = new MapNode[n];
        } else {
            MapNode[] newTab = new MapNode[n * 2];
            System.arraycopy(table, 0, newTab, 0, n);

            //перехешировать все элементы и перераспределить по новому массиву newTab !!!!!!?????

            table = newTab;
        }
        n = table.length;
        limit = (int) (n * 8 * DEFAULT_LOAD_FACTOR);
    }

    public void put(Object key, Object value) {
        System.out.println("Add " + key + " - " + value);
        if (table == null || table.length == 0)
            resize();

        int i = (n - 1) & hash(key);
        var tab = table[i];

        if (tab == null) {
            tab = new MapNode(hash(key), key, value, null);
            size++;
        } else if (tab.hash == hash(key) && (Objects.equals(key, tab.key))) {
            System.out.println("Number of " + key + " has been changed");
            V oldValue = (V) tab.value;
            tab.value = (V) value;
        } else
            go:{
                while (tab.next != null) {
                    if (tab.next.hash == hash(key) && (Objects.equals(key, tab.next.key))) {
                        System.out.println("Number of " + key + " has been changed");
                        V oldValue = (V) tab.next.value;
                        tab.next.value = value;
                        break go;
                    }
                    tab = tab.next;
                }
                tab.next = new MapNode(hash(key), key, value, null);
                size++;
//                table[i] = tab.next;
            }
        table[i] = tab;
        if (size > limit) resize();
    }

    public void remove(Object key) {
        System.out.println("Remove " + key);
//        n = table.length;
        int i = (n - 1) & hash(key);
        var tab = table[i];

        if (table == null || n == 0 || tab == null) {
            System.out.println("This table is null");
            return;
        }
//        if (tab.hash == hash(key) &&
//                (tab.key == key || (key != null && key.equals(tab.key)))) {
        if (key.equals(table[i].key) && table[i].next == null) {
            table[i] = null;
            size--;
            return;
        } else if (key.equals(table[i].key) && table[i].next != null) {
            table[i] = table[i].next;
            size--;
            return;
        } else {
            while (table[i].next != null) {
                if (key.equals(table[i].next.key)) {
                    table[i].next = table[i].next.next;
                    size--;
                    return;
                }
                table[i] = table[i].next;
            }
        }
        System.out.println("This key doesn't exist");
    }

    public void clear() {
        System.out.println("Clear all hash-table");
        table = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(Object key) {   // возвращает значение(Object value) по ключу
        System.out.println("Get number of " + key);
//        n = table.length;
        int i = (n - 1) & hash(key);
        var tab = table[i];

        if (table == null || n == 0 || tab == null)
            return null;

        do {
            if (tab.hash == hash(key) && (Objects.equals(key, tab.key)))
                return (V) tab.value;
            tab = tab.next;
        } while (tab != null);
        System.out.println("This key doesn't exist");
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyMap:\n");

        for (MapNode tab : table) {

            while (tab != null) {
                sb.append(tab.key.toString()).append(" - ").append(tab.value.toString());
                sb.append("\n");
                tab = tab.next;
            }
        }
        return sb.toString();
    }
}
