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
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E last() {
        return tail.getData();
    }

    @Override
    public E first() {
        return head.getData();
    }

    @Override
    public void addFirst(E e) {
        head=new Node<>(e,head);
        if(isEmpty())
            tail=head;
        size++;

    }

    public  void add(E e){
        addLast(e);
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e,null);
        if(isEmpty())
            head=newNode;
        else
            tail.setNext(newNode);
        tail=newNode;
        size++;
    }

    @Override
    public E removeFirst() throws IllegalArgumentException {
        E temp;
        if(isEmpty()) throw new IllegalArgumentException("LinkedList is Empty");
        else{
            temp=head.getData();
            head=head.next;
            size--;
        }
        if(size==0)
            tail=null;
        return temp;
    }

    public E removeLast() throws IllegalArgumentException{
        if(isEmpty()) throw new IllegalArgumentException("LinkedList is Empty");
        E ans =tail.getData();
        Node<E> temp = head;
        while (temp.next != null && temp.next != tail)
            temp=temp.next;
        temp.setNext(null);
        tail=temp;
        size--;
        if(size == 0)
            head=null;
        return ans;
    }

    @Override
    public void printAll() {
        StringBuilder sb =new StringBuilder();
        Node<E> temp=head;
        sb.append('[');
        while(temp != null){
            sb.append(temp.data).append(',');
            temp=temp.next;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(']');
        System.out.println(sb.toString());
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
