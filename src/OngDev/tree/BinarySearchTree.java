package OngDev.tree;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADT<T>{

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public Iterable<T> traverse(TraverseType type) {
        return null;
    }


    @Override
    public int compareTo(T o) {
        return 0;
    }
}
