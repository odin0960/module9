package Map;

public class MyHashMapTest {

    public static void main(String[] args) {
        MyMap < String, Integer> myMap = new MyHashMap<>();

        myMap.put("Ivanov Ivan", 199);
        myMap.put("Petrenko Petro", 316);
        myMap.put("Semenchenko Semen", 201);
        myMap.put("John Smith", 789);
        myMap.put("Samanta Fox", 358);
        myMap.put("Tom Waits", 555);
        myMap.put("Pink Floyd", 888);
        myMap.put("Semenchenko Semen", 999);
        myMap.put("Semenchenko Semen", 201);



        System.out.println(myMap);
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println("myMap.get(John Smith) = " + myMap.get("John Smith"));
        System.out.println("myMap.get(Nobody Man) = " + myMap.get("Nobody Man"));
        myMap.remove("Nobody Man");
        System.out.println("myMap.size() = " + myMap.size());
        myMap.remove("John Smith");
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println(myMap);
        myMap.clear();
        System.out.println("myMap.size() = " + myMap.size());
    }

}
