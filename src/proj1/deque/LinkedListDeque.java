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
    private Node<T> first;
    private Node<T> last;
    private int size;
    public LinkedListDeque(T x) {
        first = new Node(x, null);
        last = first;
        size = 1;
    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T x) {
        first = new Node<T>(x, first);
        size += 1;
    }

    public void addLast(T item) {
        Node<T> newLast = new Node<T>(item, null);
        last.next = newLast;
        last = newLast;
        size += 1;
        // Course Instructor implementation
//        Node<T> p = first;
//        while (p.next != null) {
//            p = p.next;
//        }
//        p.next = new Node<T>(item, null);
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
