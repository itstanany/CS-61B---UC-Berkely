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
    int[] items = new int[16];
    public ArrayDeque(int x) {
        items[0] = x;
        size = 1;
    }

    public ArrayDeque() {
        size = 0;

    }

    public T getRecursive(int index) {
        return null;
    }
    public void addFirst(T item) {

        size += 1;
    }

    public void addLast(int item) {
        items[size] = item;
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

    public boolean equals(Object o) {
        return false;
    }
}
