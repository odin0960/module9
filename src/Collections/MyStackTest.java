package Collections;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack <Character> stackChar = new MyStack<>();
        MyStack <Integer> stackInt = new MyStack<>();

        for (Character c = 'A'; c <= 'F'; c++)
            stackChar.push(c);

        for (Integer i = 1; i < 10; i++) {
            stackInt.push(i);
        }

        System.out.println(stackChar);
        System.out.println(stackInt);
        System.out.println("stackInt.size() = " + stackInt.size());
        System.out.println("stackInt.peek() = " + stackInt.peek());
        System.out.println("stackInt.pop() = " + stackInt.pop());
        System.out.println("stackInt.size() = " + stackInt.size());
        System.out.println(stackInt);
        stackInt.remove(4);
        System.out.println(stackInt);
        System.out.println("stackInt.size() = " + stackInt.size());
        stackInt.remove(44);
        stackInt.clear();
        System.out.println("stackInt.size() = " + stackInt.size());
        System.out.println(stackInt);
    }

}
