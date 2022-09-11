package strategyPatterns.sort.sortMethod;

import java.util.List;

import strategyPatterns.SortStrategy;

public class SelectionSort implements SortStrategy {
    @Override
    public void SortList(List<Integer> items) {
        Integer i, j, last;
        Integer array_size = items.size();
        for (i = 1; i < array_size; i++) {
            last = items.get(i);
            j = i;
            while ((j > 0) && (items.get(j - 1) > last)) {
                items.set(j, items.get(j - 1));
                j = j - 1;
            }
            items.set(j, last);
        }
    }
}
