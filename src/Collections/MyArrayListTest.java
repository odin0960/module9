package Collections;

public class MyArrayListTest {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        OurList<Character> list = new MyArrayList<>();

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

//        for (Integer i = 0; i < 22; i += 2) {
//            list.add(i);
//        }

        for (char ch = 'A'; ch <= 'G'; ch++) {
            list.add(ch);
        }

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(5) = " + list.get(5));
        list.remove(5);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
    }
}
