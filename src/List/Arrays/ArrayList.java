package List.Arrays;

import List.AbstractList;
import List.ListADT;

import java.util.Iterator;

public class ArrayList<E> extends AbstractList<E> implements ListADT<E>, Cloneable  {

    private E[] data;
    //private int size=0;
    private final static int CAPACITY=4;

    public ArrayList(int capacity){
        data=(E[])new Object[capacity];
    }

    public ArrayList(){
        this(CAPACITY);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


   /* @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }*/

    @Override
    public boolean contains(E e) {
        for(int i=0;i<size();i++)
            if(data[i]==e)
                return true;
        return false;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        checkIndex(index,size());
        return data[index];
        //throw  new IndexOutOfBoundsException("Invalid index");
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        checkIndex(index,size());
        E temp = data[index];
        data[index]=element;
        return temp;
    }

    @Override
    public void add(E element) throws IndexOutOfBoundsException {
        /*checkIndex(size(),size()+1);
        data[size++]=element;*/
        add(size(),element);
    }

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        checkIndex(index,size()+1);
        if (size()== data.length)
            reSize(5* data.length);
        for(int i= size()-1;i>=index;i--)
            data[i+1]=data[i];
        data[index]=element;
        size++;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index,size());
        E element = data[index];
        for(int k=index;k<size;k++){
            data[k]=data[k+1];
        }
        data[size()-1] = null; //garbage collection
        size--;
        return element;
    }

    @Override
    public void clear() {
        data=(E [])new Object[CAPACITY];
        size=0;
    }

    @Override
    public E remove(){
        return remove(size()-1);
    }

    private void checkIndex(int index,int size) throws IndexOutOfBoundsException{
        if(index <0 | index>=size)
        throw  new IndexOutOfBoundsException("Invalid index");
    }

    private void reSize(int capacity){
        E[] temp = (E []) new Object[capacity];
        for(int i=0;i<size;i++)
            temp[i]=data[i];
        data=temp;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int indexOf(E e) throws IndexOutOfBoundsException {
        if (contains(e)){
            for(int i=0;i<size();i++)
                if(data[i]==e)
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) throws IndexOutOfBoundsException {
        int lastIndex=-1;
        if (contains(e)){
            for(int i=0;i<size();i++)
                if(data[i]==e)
                    lastIndex =i;
        }
        return lastIndex;
    }



    @Override
    public String toString() {
        if(size()==0) return "[]";
        StringBuilder sb =new StringBuilder();
        sb.append('[');
        for(int i=0;i<size;i++)
            sb.append(data[i]).append(',');
        sb.deleteCharAt(sb.length()-1);
        sb.append(']');
        return sb.toString();
    }
}
