package proj1.deque;

import java.util.Iterator;

public class LinkedListDeque<T> {
    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T i, Node<T> n) {
            item = i;
            next = n;
        }
    }
    private Node<T> sentinel;
//    private Node<T> last;
    private int size;
    public LinkedListDeque(T x) {
//        first = new Node(x, null);
//        item value \\here 101\\ is not important and just a placeholder
        sentinel = new Node(101, null);
        sentinel.next = new Node(x, sentinel.next);
//        last = sentinel;
        size = 1;
    }

    public LinkedListDeque() {
        sentinel = new Node(101, null);
    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T x) {
//        first = new Node<T>(x, first);
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    public void addLast(T item) {
//        Node<T> newLast = new Node<T>(item, null);
//        last.next = newLast;
//        last = newLast;
        size += 1;
        // Course Instructor implementation
        Node<T> p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node<T>(item, null);
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
    }
    public T removeFirst() {
        return null;
    }
    public T removeLast() {
        return null;
    }
    public T get(int index) {
        return null;
    }
    public Iterator<T> iterator() {
        return null;
    }
    public boolean equals(Object o) {
        return false;
    }
}
