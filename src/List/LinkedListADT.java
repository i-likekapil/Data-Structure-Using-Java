package List;

public interface LinkedListADT<E> extends Iterable {
    public boolean isEmpty();
    public  int size();
    public E last();
    public E first();
    public void addFirst(E e);
    public void addLast(E e);
    public E removeFirst() throws IllegalAccessException;
    public void printAll();
}
