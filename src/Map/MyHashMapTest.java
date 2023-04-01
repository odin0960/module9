package Map;

public class MyHashMapTest {

    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();

        char v = 'A';
        for (int k = 0; k < 10; k++) {
            myMap.put(k, v);
            v++;
        }

        System.out.println(myMap);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println("myMap.get(4) = " + myMap.get(4));
        System.out.println("myMap.get(44) = " + myMap.get(44));
        myMap.remove(44);
        myMap.remove(4);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println(myMap);
        myMap.put(2, 'X');
        myMap.clear();
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println(myMap);
    }

}
