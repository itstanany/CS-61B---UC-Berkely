package proj1.deque;

import javax.lang.model.type.ArrayType;
import java.sql.Array;
import java.util.Iterator;

//         0 1 2 3
// items: [2 5 6 -88 0 0 0 0 0 0 0 0 0 0 0]
// size: 4

/* Invariants
    * add last is item[size]
    * get last is item[size -1]
    * size: the number of items in the last should be "size"
 */
public class ArrayDeque<T> {
    private int size;
    T[] items = (T[]) new Object[50];
    public ArrayDeque(T x) {
        items[0] = x;
        size = 1;
    }

    public ArrayDeque() {
        size = 0;

    }

    public void addFirst(T item) {

        size += 1;
    }

    public void addLast(T item) {
        if (size >= items.length) {
            resizeArray(size * 2);
        }
        items[size] = item;
        size += 1;
    }

    private void resizeArray(int capacity) {
        T[] newArr = (T []) new Object[capacity];
        System.arraycopy(items, 0, newArr, 0, size);
        items = newArr;
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
        if ( (float) size / items.length < 0.25) {
            resizeArray(items.length/2);
        }
        T deletedItem = items[size-1];
        // null not even integer because it is a generic ++ it is better to remove reference to deleted items
        // which may be a large object
        items[size-1] = null;
        size -= 1;
        return deletedItem;
    }
    public T get(int index) {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }
}
