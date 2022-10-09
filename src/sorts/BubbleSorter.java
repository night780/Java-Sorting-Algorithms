package sorts;

import utilities.Utility;

import java.util.Arrays;

/**
 * Runtime: O(n^2)
 * @author jacob jonas
 * @version 1
 */
public class BubbleSorter {


    /**
     * Entry bubble sort method.
     *
     * @param array the array
     */
    public static void sort(int[] array) {

        sort(array, 0, array.length - 1);
    }
    /**
     * Private Buble sort algorithm.
     *
     * @param array the array to be sorted
     * @param low the lowest index of the array
     * @param high the index of the last element in the array
     */
    private static void sort(int[] array, int low, int high) {
        for (int i = 0; i < array.length - 1; i++) {
            //a pass that compares adjacent elements and bubbles the largest element to the largest index
            int swapCount = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {

                //is there an inversion (checking)
                if (array[j] > array[j + 1]) {
                    //swap them...
                    Utility.swap(array, j, j + 1);
                    swapCount++;
                }
            }
            //if no swaps made short circuit (stop early)
            if (swapCount == 0) {
                break;
            }

            System.out.println(swapCount + "    Pass #" + i + "  - " + Arrays.toString(array));

        }
    }

}
