package SortingAlgorithm;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Properties {
    public static final Random rand = new Random();
    public static int[] comparisons = new int[4];
    public static int[] worstCaseComp = new int[4], averageCaseComp = new int[4], bestCaseComp = new int[4];
    public static int[] unsortedListOriginal;

    public static long startTime, endTime, duration;
    public static double[] millisecondsList = new double[10];

    public static int[] unsortedList;
    public static int[] sortedList;

    public static int listSize;
    public static String chooseSort;
    public static boolean isSorted;
}