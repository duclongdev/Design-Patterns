package strategyPatterns.sort.sortMethod;

import java.util.List;

import strategyPatterns.SortStrategy;

public class MergeSort implements SortStrategy {

    @Override
    public void SortList(List<Integer> items) {
        System.out.print("Merge sort");
    }

}
