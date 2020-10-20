package List;

public interface LinkedListADT<E> extends Iterable {
    public boolean isEmpty();
    public  int size();
    public E last();
    public E first();
    public void addFirst(E e);
    public void addLast(E e);
    public void add(E e);
    public E removeFirst() throws IllegalAccessException;
    public E removeLast() throws IllegalArgumentException;
    public E remove() throws IllegalArgumentException;
    public void printAll();
    public E get(int index) throws IllegalArgumentException;
    public void add(int index , E e) throws IllegalArgumentException;
}
