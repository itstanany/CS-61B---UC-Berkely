package proj1.deque;

import java.util.Iterator;

public class LinkedListDeque<T> {
    private T item;
    private LinkedListDeque<T> next;
    public LinkedListDeque(T x) {
        item = x;
        next = null;
    }
    public LinkedListDeque(T i, LinkedListDeque<T> n) {
        item = i;
        next = n;
    }
    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T x) {
        next = new LinkedListDeque<T>(item, next);
        item = x;
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
