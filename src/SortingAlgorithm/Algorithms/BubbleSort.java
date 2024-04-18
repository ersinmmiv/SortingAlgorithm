package SortingAlgorithm.Algorithms;

import SortingAlgorithm.Properties.Properties;

public class BubbleSort extends Properties {

    public int[] bubbleSort(int count) {
        startTime = System.nanoTime();

        int[] sortedList = performSort(unsortedList);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        millisecondsList[0][count] = (duration / 1e9) * 1000;

        return sortedList;
    }
    private int[] performSort(int[] n) {

        comparisons[0] = 0;
        int[] sortedList = new int[n.length];
        int temp;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                comparisons[0]++;
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }


        System.arraycopy(n, 0, sortedList, 0, n.length);

        double nSquare = Math.pow(n.length, 2);
        worstCaseComp[0] = (int) nSquare;
        averageCaseComp[0] = (int) nSquare;
        bestCaseComp[0] = n.length;
        return sortedList;
    }
}
