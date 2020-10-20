package List;


public interface ListADT<E> extends Iterable<E> {
    boolean contains(E e);
    int indexOf(E e) throws IndexOutOfBoundsException;
    int lastIndexOf(E e) throws IndexOutOfBoundsException;
    E get(int index)throws IndexOutOfBoundsException;
    E set(int index,E element)throws IndexOutOfBoundsException;
    void add(E element)throws IndexOutOfBoundsException;
    void add(int index,E element)throws IndexOutOfBoundsException;
    E remove(int index)throws IndexOutOfBoundsException;
    E remove()throws IndexOutOfBoundsException;
    void clear();
    //Object clone();
}
