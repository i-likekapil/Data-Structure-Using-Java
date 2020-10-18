package List.LinkedList;

import List.LinkedListADT;

import java.util.Iterator;

public class LinkedList<E> implements LinkedListADT<E> {

    private static class Node<E>{
        E data;
        Node<E> next;

        public E getData(){
            return data;
        }

        public void setData(E data){
            this.data=data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

    }

    public LinkedList() {

    }

    private int size=0;
    public Node<E> head=null;
    public Node<E> tail=null;


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E last() {
        return null;
    }

    @Override
    public E first() {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public void printAll() {

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
