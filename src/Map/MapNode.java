package Map;

public class MapNode<K,V> {

    public K key;
    public V value;
    public MapNode next;

    MapNode(K key, V value, MapNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
