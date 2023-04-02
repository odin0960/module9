package Collections;

public class MyLinkedListTest {

    public static void main(String[] args) {
        OurList <Character> listChar = new MyLinkedList<>();
        OurList <Integer> listInt = new MyLinkedList<>();

        for (Character c = 'A'; c <= 'F'; c++)
            listChar.add(c);

        for (Integer i = 0; i < 10; i++) {
            listInt.add(i);
        }

        System.out.println(listChar);
        System.out.println(listInt);
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println("listInt.get(4) = " + listInt.get(4));
        listInt.remove(4);
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println(listInt);
        listInt.clear();
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println(listInt);
    }

}
