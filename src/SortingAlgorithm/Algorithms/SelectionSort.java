package SortingAlgorithm.Algorithms;

import SortingAlgorithm.Properties;

public class SelectionSort extends Properties {

    public int[] selectionSort(int count) {
        startTime = System.nanoTime();

        int[] sortedList = performSort(unsortedList);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        millisecondsList[count] = duration / 1e9;

        return sortedList;
    }

    private int[] performSort(int[] n) {

        comparisons[3] = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n.length; j++) {
                comparisons[3]++;
                if (n[j] < n[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = n[minIndex];
            n[minIndex] = n[i];
            n[i] = temp;
        }

        double nSquare = Math.pow(n.length, 2);
        worstCaseComp[3] = (int) nSquare;
        averageCaseComp[3] = (int) nSquare;
        bestCaseComp[3] = (int) nSquare;

        return n;
    }
}
