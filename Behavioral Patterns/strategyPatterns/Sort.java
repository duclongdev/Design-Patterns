package strategyPatterns.sort;

import java.util.List;

import strategyPatterns.SortStrategy;
import strategyPatterns.sort.sortMethod.SelectionSort;

public class Sort {
    private SortStrategy sortStrategy;
    private List<Integer> items;
    public Sort(List<Integer> items){
        this.items = items;
    }
    public void SetSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    
    public void sortList() {
        if(sortStrategy == null)
            sortStrategy = new SelectionSort();
        sortStrategy.SortList(items);
    }
}
