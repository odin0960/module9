package Collection;

import Examples.LinkedList;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList listChar = new MyLinkedList();
        MyLinkedList listInt = new MyLinkedList();

        for (char c = 'A'; c <= 'F'; c++)
            listChar.add(c);

        for (int i = 0; i < 10; i++) {
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
