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
    public LinkedListDeque(T x) {
        first = new Node(x, null);
    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T x) {
        first = new Node<T>(x, first);
    }

    public void addLast(T item) {
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -5;
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
