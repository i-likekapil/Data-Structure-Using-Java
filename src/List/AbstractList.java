package List;

public abstract class AbstractList<E> {

    protected int size=0;
    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }
}
