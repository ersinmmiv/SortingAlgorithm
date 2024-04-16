package SortingAlgorithm;

public class MainClass extends Properties {

    public static void main(String[] args) {
        // Set size of unsorted List:
        listSize = 50;

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
        */
        chooseSort = "1,3";

        // Choose if list should already be sorted : true,false
        isSorted = false;



        FillAndSort.start();
    }
}