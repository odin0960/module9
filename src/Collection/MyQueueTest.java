package Collection;

import java.util.Collection;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue listChar = new MyQueue();
        MyQueue listInt = new MyQueue();

        for (char c = 'A'; c <= 'F'; c++)
            listChar.add(c);

        for (int i = 1; i < 10; i++) {
            listInt.add(i);
        }

        System.out.println(listChar);
        System.out.println(listInt);
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println("listInt.peek() = " + listInt.peek());
        System.out.println("listInt.poll() = " + listInt.poll());
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println(listInt);
        listInt.clear();
        System.out.println("listInt.size() = " + listInt.size());
        System.out.println(listInt);
    }
}
