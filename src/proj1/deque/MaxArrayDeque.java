package proj1.deque;

import java.util.Comparator;

public class MaxArrayDeque<T> extends  ArrayDeque<T> {
    int deqArrSize = size();
    private final Comparator<T> comparator;

    public MaxArrayDeque(Comparator<T> c) {
        comparator = c;
    }
    public T max() {
        return max(comparator);
    }

    public T max(Comparator<T> c) {
        if (isEmpty()) {
            return null;
        }
        int maxDex = 0;
        for (int i = 1; i < deqArrSize; i=+1) {
            if (c.compare(get(i), get(maxDex)) > 0) {
                maxDex = i;
            }
        }
        return get(maxDex);
    }

}