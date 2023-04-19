package Lesson10_DSA_DanhSach.LinkedList_E;

public class LinkedList<E> extends java.util.LinkedList<E> {
    private Node<E> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }
    private class Node<E> {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }



}
