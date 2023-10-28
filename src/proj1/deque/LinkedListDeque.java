package proj1.deque;

import java.util.Iterator;

public class LinkedListDeque<T> {
    private static class Node<T> {
        T item;
        Node<T> prev;
        Node<T> next;

        Node(T i, Node<T> prev, Node<T> next) {
            item = i;
            this.prev = prev;
            this.next = next;
        }
    }
    private Node<T> sentinelFront;
    private Node<T> sentinelBack;
//    private Node<T> last;
    private int size;
    public LinkedListDeque(T x) {
//        item value \\here 101\\ is not important and just a placeholder
        sentinelFront = new Node(1, null, null);
        sentinelBack = new Node(0, null, null);
        Node<T> newNode = new Node<>(x, sentinelFront, sentinelBack);
        sentinelFront.next = newNode;
        sentinelBack.prev = newNode;
        size = 1;
    }

    public LinkedListDeque() {
        sentinelFront = new Node(101, null, null);
        sentinelBack = new Node(101, null, null);
        sentinelFront.next = sentinelBack;
        sentinelBack.prev = sentinelFront;
    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item, sentinelFront.next.prev, sentinelFront.next);
        sentinelFront.next.prev = newNode;
        sentinelFront.next = newNode;
        size += 1;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item, sentinelBack.prev, sentinelBack.prev.next);
        sentinelBack.prev.next = newNode;
        sentinelBack.prev = newNode;
        size += 1;
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
