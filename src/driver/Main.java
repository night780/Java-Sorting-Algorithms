package driver;

import sorts.BubbleSorter;
import sorts.MergeSorter;
import utilities.Utilities;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selection Sorter\n");
        int[] testArray={45,54,12,33,11,74,1,85};
//        int[] testArray= Utilities.generateArray(20, 1, 50);

        MergeSorter sorter = new MergeSorter();
        sorter.mergeSort(testArray);

    }
    private static void testBubbleSort(){
        int[] testArray = Utilities.generateArray(20, 1, 50);

        System.out.println("Bubble Sorter\n");

        System.out.println("Before :" + Arrays.toString(testArray));
        System.out.println();

        System.out.println("Swap # - # of Passes - Swaps");
        BubbleSorter.sort(testArray);
        System.out.println();

        System.out.println("After :" + Arrays.toString(testArray));
        String sorted = !Utilities.containsInversions(testArray) ? "Yes" : "No";
        System.out.println();

        System.out.println("Is the array sorted? " + sorted);
    }

}
