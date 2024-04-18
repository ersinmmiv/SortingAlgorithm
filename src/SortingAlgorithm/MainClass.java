package SortingAlgorithm;

import SortingAlgorithm.Properties.Properties;

public class MainClass extends Properties {

    public static void main(String[] args) {
        // Set size of unsorted List:
        listSize = 100;

        unsortedList = new int[listSize];
        unsortedListOriginal = new int[listSize];


        /*
        Choose sorting algorithm:
        1. Bubble-Sort
        2. Quick-Sort
        3. Insertion-Sort
        4. Selection-Sort
        5. ALL

        e.g.: "1,2,4" or "ALL"
        But if you choose more than one Operation, the freechart will not work. Either choose all or one.
        */
        chooseSort = "all";

        // Choose if list should already be sorted : true,false
        isSorted = false;



        FillAndSort.start();
    }
}