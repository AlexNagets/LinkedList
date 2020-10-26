package linklist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        list.reverse();
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(1));
        list.printMiddle();
    }
}
