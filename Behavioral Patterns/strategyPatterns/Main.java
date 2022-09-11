package strategyPatterns;

import java.util.ArrayList;
import java.util.List;

import strategyPatterns.sort.Sort;
import strategyPatterns.sort.sortMethod.MergeSort;
import strategyPatterns.sort.sortMethod.SelectionSort;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(5);
        array.add(7);
        array.add(2);
        Sort sort = new Sort(array);
        sort.SetSortStrategy(new SelectionSort());
        sort.sortList();
        System.out.println(array);
    }
}
