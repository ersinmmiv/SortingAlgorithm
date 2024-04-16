package SortingAlgorithm.Algorithms;

import SortingAlgorithm.Properties;

public class InsertionSort extends Properties {

    public int[] insertionSort(int count) {
        startTime = System.nanoTime();

        int[] sortedList = performSort(unsortedList);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        millisecondsList[count] = duration / 1e9;

        return sortedList;
    }

    private int[] performSort(int[] n) {
        comparisons[2] = 0;
        for (int i = 1; i < n.length; i++) {
            int key = n[i];
            int j = i - 1;
            while (j >= 0 && n[j] > key) {
                n[j + 1] = n[j];
                j--;
                //Broken???
                comparisons[2]++;
            }
            n[j + 1] = key;
        }

        worstCaseComp[2] = (int) Math.pow(n.length, 2);
        averageCaseComp[2] = worstCaseComp[2];
        bestCaseComp[2] = n.length;
        return n;
    }
}
