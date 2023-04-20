package OngDev.tree;

public interface TreeADT<T> extends  Comparable<T>{
    boolean isEmpty();
    int size();
    int height();
    boolean contains(T element);
    boolean add(T element);
    boolean remove(T element);
    Iterable<T> traverse(TraverseType type);




}
