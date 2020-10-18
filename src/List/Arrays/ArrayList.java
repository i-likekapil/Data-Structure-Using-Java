package List.Arrays;

import List.ListADT;

import java.util.Iterator;

public class ArrayList<E> implements ListADT<E> {

    private E[] data;
    private int size=0;
    private final static int CAPACITY=4;

    public ArrayList(int capacity){
        data=(E[])new Object[capacity];
    }

    public ArrayList(){
        this(CAPACITY);
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void add(E element) throws IndexOutOfBoundsException {

    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {

    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        //return Arrays.toString(data);
        StringBuilder sb =new StringBuilder();
        sb.append('[');
        for(int i=0;i<size;i++)
            sb.append(data[i]).append(',');
        sb.deleteCharAt(sb.length()-1);
        sb.append(']');
        return sb.toString();
    }
}
