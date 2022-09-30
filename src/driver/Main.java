package driver;

import sorts.BubbleSorter;
import utilities.Utilities;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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
