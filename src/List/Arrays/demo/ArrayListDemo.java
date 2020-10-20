package List.Arrays.demo;

import List.Arrays.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> list =new ArrayList<>(10);
        /*list.add(12);
        list.add(13);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);
        System.out.println(list.size());
        list.add(4, 11);
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println(list.toString());
        list.set(3,100);
        System.out.println(list.toString());
        System.out.println(list.get(3));
        list.clear();
        System.out.println(list.size());
        System.out.println(list.toString());
        //System.out.println(list.get(0));*/
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        ArrayList<Integer> temp= (ArrayList<Integer>)list.clone();
        System.out.println(temp.toString());
        System.out.println(list.toString());
        /*System.out.println(temp.get(12));
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(1));*/

    }
}
