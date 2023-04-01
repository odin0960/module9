package Examples;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        for (char c = 'A'; c <= 'G'; c++)
            myList.add(c);
        System.out.println(myList.toString());
        myList.reverse();
        System.out.println(myList.toString());

    }

}
