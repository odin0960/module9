package Collections;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue <Character> listChar = new MyQueue<>();
        MyQueue <Integer> listInt = new MyQueue<>();

        for (Character c = 'A'; c <= 'F'; c++)
            listChar.add(c);

        for (Integer i = 1; i < 10; i++) {
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
