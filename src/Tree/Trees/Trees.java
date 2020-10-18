package Tree.Trees;

import Position.Position;
import Tree.Tree;

import java.util.Iterator;

public class Trees implements Tree {

    @Override
    public Position root() {
        return null;
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
    public boolean isRoot(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isExternal(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean isInternal(Position p) throws IllegalArgumentException {
        return false;
    }

    @Override
    public int numChildren(Position p) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public Iterable<Position> children(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Position parent(Position p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Iterable<Position> positions() {
        return null;
    }
}
