package SortingAlgorithm;

public enum SortEnums {
    BUBBLE_SORT(0),
    QUICK_SORT(1),
    INSERTION_SORT(2),
    SELECTION_SORT(3);

    private final int currentSort;

    SortEnums(int sort) {
        this.currentSort = sort;
    }

    public int getCurrentSort() {
        return currentSort;
    }
}
