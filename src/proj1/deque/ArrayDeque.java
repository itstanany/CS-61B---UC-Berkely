package proj1.deque;

import java.util.Iterator;

public class ArrayDeque<T> {
    private int size;
    public ArrayDeque(T x) {

        size = 1;
    }

    public ArrayDeque() {

    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T item) {

        size += 1;
    }

    public void addLast(T item) {

        size += 1;
    }

    public boolean isEmpty() {
        return size < 1;
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
