package Map;

public class MapNode {

    public Object key;
    public Object value;
    public MapNode next;

    MapNode(Object key, Object value, MapNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

}
