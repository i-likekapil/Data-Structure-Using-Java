package List.LinkedList.demo;

import List.LinkedList.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printAll();
        list.removeLast();
        list.printAll();
        list.add(6);
        list.add(7);
        list.add(8);
        list.addFirst(0);
        list.printAll();
        list.addLast(9);
        list.printAll();
    }
}
