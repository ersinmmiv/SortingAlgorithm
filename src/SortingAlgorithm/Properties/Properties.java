package SortingAlgorithm.Properties;
import org.jfree.data.xy.XYSeries;

import java.util.Random;

public class Properties {
    public static final Random rand = new Random();
    public static int[] comparisons = new int[4];
    public static int[] worstCaseComp = new int[4], averageCaseComp = new int[4], bestCaseComp = new int[4];
    public static int[] unsortedListOriginal;

    public static long startTime, endTime, duration;
    public static double[][] millisecondsList = new double[4][1000];

    public static int[] unsortedList;
    public static int[] sortedList;

    public static int listSize;
    public static String chooseSort;
    public static boolean isSorted;

    public static XYSeries BubbleSort = new XYSeries("bbs");
    public static XYSeries QuickSort = new XYSeries("qks");
    public static XYSeries InsertionSort = new XYSeries("ins");
    public static XYSeries SelectionSort = new XYSeries("sls");
}