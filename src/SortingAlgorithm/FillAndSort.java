package SortingAlgorithm;

import java.util.ArrayList;

public class FillAndSort extends Properties {
    MainClass main = new MainClass();
    private static final int firstUnsortedListLength = unsortedList.length;
    private static final int[][] firstResults = new int[4][listSize];
    private static final boolean[] firstResultSaved = new boolean[4];


    public static void start() {
        fillList();
        System.arraycopy(unsortedList, 0, unsortedListOriginal, 0, unsortedList.length);
        doSort();
    }


    protected static void fillList() {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int temp;
        boolean isUnique;
        if (!isSorted) {
            for (int i = 0; i < unsortedList.length; i++) {
                do {
                    temp = rand.nextInt(1000);
                    if (!uniqueNumbers.contains(temp)) {
                        unsortedList[i] = temp;
                        uniqueNumbers.add(temp);
                        isUnique = true;
                    } else
                        isUnique = false;
                } while (!isUnique);
            }
        } else {
            for (int i = 0; i < unsortedList.length; i++) {
                unsortedList[i] = i + 1;
            }
        }
    }

    private static void doSort() {
        SortOptions options = new SortOptions();

        boolean skippedFirstRun = false, chooseAll = false;
        if (chooseSort.toUpperCase().contains("ALL"))
            chooseAll = true;

        for (int i = 0; i < 10; i++) {
            if (skippedFirstRun) {
                increaseSizeAndFill();
            } else
                skippedFirstRun = true;


            if (chooseSort.contains("1") || chooseAll) {
                sortedList = options.bbs.bubbleSort(i);
                if (!firstResultSaved[0]) {
                    System.arraycopy(sortedList, 0, firstResults[0], 0, sortedList.length);
                    firstResultSaved[0] = true;
                    outputInfo(SortEnums.BUBBLE_SORT);
                }
            }

            //_______________________________________________________________
            if (chooseSort.contains("2") || chooseAll) {
                sortedList = options.qks.quickSort(i);
                if (!firstResultSaved[1]) {
                    System.arraycopy(sortedList, 0, firstResults[1], 0, sortedList.length);
                    firstResultSaved[1] = true;
                    outputInfo(SortEnums.QUICK_SORT);
                }
            }

            //_______________________________________________________________
            if (chooseSort.contains("3") || chooseAll) {
                sortedList = options.ins.insertionSort(i);
                if (!firstResultSaved[2]) {
                    System.arraycopy(sortedList, 0, firstResults[2], 0, sortedList.length);
                    firstResultSaved[2] = true;
                    outputInfo(SortEnums.INSERTION_SORT);
                }
            }

            //_______________________________________________________________
            if (chooseSort.contains("4") || chooseAll) {
                sortedList = options.sls.selectionSort(i);
                if (!firstResultSaved[3]) {
                    System.arraycopy(sortedList, 0, firstResults[3], 0, sortedList.length);
                    firstResultSaved[3] = true;
                    outputInfo(SortEnums.SELECTION_SORT);
                }
            }
        }
    }

    private static void increaseSizeAndFill() {
        unsortedList = new int[(unsortedList.length + firstUnsortedListLength)];
        fillList();
    }

    private static void outputInfo(SortEnums currentSort) {
        System.out.println("________________________________");
        System.out.println("________________________________");

        outputResultAscending(currentSort);
        System.out.println("________________________________");
        outputResultDescending(currentSort);

        int j = currentSort.getCurrentSort();
        System.out.println("Worst Case Anzahl vergleiche: " + worstCaseComp[j]);
        System.out.println("Average Case Anzahl vergleiche: " + averageCaseComp[j]);
        System.out.println("Best Case Anzahl vergleiche: " + bestCaseComp[j]);
        System.out.println("Anzahl vergleiche: " + comparisons[j]);
        System.out.println("Zeit in S: " + millisecondsList[0]);
        System.out.println("Average Zeit in S: " + calculateAverageTime());
    }


    private static double calculateAverageTime() {
        double average = 0;
        for (double num : millisecondsList) {
            average += num;
        }
        return average / 10;
    }

    private static void outputResultAscending(SortEnums currentSort) {
        algorithmTitle(currentSort);
        for (int i = 0; i < firstResults[currentSort.getCurrentSort()].length; i++) {
            System.out.println((i + 1) + ". " + firstResults[currentSort.getCurrentSort()][i] + " || " + unsortedListOriginal[i]);
        }
    }

    private static void outputResultDescending(SortEnums currentSort) {
        int count = 1;
        algorithmTitle(currentSort);
        for (int i = firstResults[currentSort.getCurrentSort()].length - 1; i >= 0; i--) {
            System.out.println(count + ". " + firstResults[currentSort.getCurrentSort()][i] + " || " + unsortedListOriginal[i]);
            count++;
        }
    }

    private static void algorithmTitle(SortEnums currentSort) {
        switch (currentSort) {
            case BUBBLE_SORT:
                System.out.println("Bubble-Sort:");
                break;
            case QUICK_SORT:
                System.out.println("Quick-Sort");
                break;
            case INSERTION_SORT:
                System.out.println("Insertion-Sort");
                break;
            case SELECTION_SORT:
                System.out.println("Selection-Sort");
                break;

        }
    }
}