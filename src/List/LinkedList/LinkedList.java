package List.LinkedList;

import List.AbstractList;
import List.LinkedListADT;

import java.util.Iterator;

public class LinkedList<E> extends AbstractList<E> implements LinkedListADT<E> {

    private static class Node<E>{
        E data;
        Node<E> next;

        public E getData(){
            return data;
        }

        /*public void setData(E data){
            this.data=data;
        }*/

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

    //private int size=0;
    private Node<E> head=null;
    private Node<E> tail=null;

   /* @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }*/

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

    @Override
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
    public E get(int index) throws IllegalArgumentException {
        if(isEmpty()) throw new IllegalArgumentException("LinkedList is Empty");
        if(index>=size || index <0) throw new IllegalArgumentException("Invalid index");
        Node<E> temp =head;
        int count=0;
        //E ans;
        while(count< index){
            count++;
            temp=temp.next;
        }
        return temp.getData();
    }

    @Override
    public E remove(int index) throws IllegalArgumentException {
        if (isEmpty()) throw new IllegalArgumentException("LinkedList is Empty");
        if (index >= size || index < 0) throw new IllegalArgumentException("Invalid index");
        if(index == size()-1) return removeLast();
        if(index ==0 ) return removeFirst();
        Node<E> temp = head;
        Node<E> node;
        int count = 0;
        while (count < index - 1) {
            count++;
            temp = temp.getNext();
        }
        node=temp.getNext();
        temp.setNext(node.getNext());
        size--;
    return node.getData();
    }

    @Override
    public void add(int index, E e) throws IllegalArgumentException{
        if(isEmpty()) throw new IllegalArgumentException("LinkedList is Empty");
        if(index>=size || index <0) throw new IllegalArgumentException("Invalid index");
        Node<E> temp =head;
        Node<E> newNode = new Node<>(e,null);
        int count=0;
        while(count < index-1){
            count++;
            temp=temp.next;
        }
        //System.out.println("***************************************"+"count - > "+count+"  index -> "+index);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        size++;
    }

    @Override
    public E remove() throws IllegalArgumentException {
        return removeLast();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
