package proj1.deque;

import java.util.Iterator;

public class LinkedListDeque<T> implements Iterable<T>{
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
        if (index < 0 || index > size - 1) {
            return null;
        }
        return helperGetRecursive(index, sentinelFront);
    }

    private T helperGetRecursive(int index, Node<T> currentNode) {
        if(index == 0) {
            return currentNode.next.item;
        }
        return helperGetRecursive(index-1, currentNode.next);
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
        return size < 1;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
    }
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T item = sentinelFront.next.item;
        sentinelFront.next = sentinelFront.next.next;
        sentinelFront.next.prev = sentinelFront;
        size -= 1;
        return item;
    }
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        T item = sentinelBack.prev.item;
        Node<T> newLast = sentinelBack.prev.prev;
        sentinelBack.prev = newLast;
        newLast.next = sentinelBack;
        size -= 1;
        return item;
    }
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        Node<T> currentNode = sentinelFront.next;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return currentNode.item;
            }
            currentNode = currentNode.next;
        }
        throw new AssertionError();
    }
    @Override
    public Iterator<T> iterator() {
        return new IterableLinkedListDeque();
    }
    public boolean equals(Object o) {
        return false;
    }

    private class IterableLinkedListDeque implements Iterator<T>{
        private int iteratorPos;
        public  IterableLinkedListDeque() {
         iteratorPos = 0;
        }
        @Override
        public boolean hasNext() {
            return iteratorPos < size;
        }

        @Override
        public T next() {
            T returnItem = getRecursive(iteratorPos);
            iteratorPos += 1;
            return returnItem;
        }
    }
}
