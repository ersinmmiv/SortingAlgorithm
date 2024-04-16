package SortingAlgorithm.Algorithms;

import SortingAlgorithm.Properties;

public class QuickSort extends Properties {

    public int[] quickSort(int count) {
        startTime = System.nanoTime();

        int[] sortedList = performSort(unsortedList);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        millisecondsList[count] = duration / 1e9;

        return sortedList;
    }

    private int[] performSort(int[] array) {
        comparisons[1] = 0;
        quickSort(array, 0, array.length - 1);


        worstCaseComp[1] = (int) Math.pow(array.length, 2);
        double nlogn = array.length * Math.log(array.length);
        averageCaseComp[1] = (int) nlogn;
        bestCaseComp[1] = (int) nlogn;


        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisons[1]++;
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
