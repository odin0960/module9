package Map;

interface MyMap {

    void put(Object key, Object value);
    void remove(Object key);
    void clear();
    int size();
    Object get(Object key);
}
