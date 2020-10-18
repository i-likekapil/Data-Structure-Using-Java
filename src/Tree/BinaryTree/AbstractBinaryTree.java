package Tree.BinaryTree;

import List.Arrays.ArrayList;
import List.ListADT;
import Position.Position;
import Tree.AbstractTree;



public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
        ListADT<Position<E>> snapshot=new ArrayList<>(2);
        if(left(p)!=null)
            snapshot.add(left(p));
        if(right(p)!=null)
            snapshot.add(right(p));

        return snapshot;
    }
    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        int count=0;
        if(left(p)!=null)
            count++;

        if(right(p)!=null)
            count++;

        return count;
    }

    @Override
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException {
        Position<E> parent=parent(p);
        if(parent==null) return null;
        if(p==left(parent))
            return right(parent);
        else
            return left(parent);
    }


}
