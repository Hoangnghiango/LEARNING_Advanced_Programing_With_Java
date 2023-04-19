package Lesson12_BinarySearchTree.InstallBST.Service;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
