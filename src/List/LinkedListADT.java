package List;

public interface LinkedListADT<E> extends Iterable {
    E last();
    E first();
    void addFirst(E e);
    void addLast(E e);
    void add(E e);
    void add(int index , E e) throws IllegalArgumentException;
    E removeFirst() throws IllegalAccessException;
    E removeLast() throws IllegalArgumentException;
    E remove() throws IllegalArgumentException;
    E remove(int index) throws IllegalArgumentException;
    void printAll();
    E get(int index) throws IllegalArgumentException;

}
