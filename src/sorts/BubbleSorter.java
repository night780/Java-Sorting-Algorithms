package sorts;

import utilities.Utilities;

import java.util.Arrays;

/**
 * Runtime: O(n^2)
 */
public class BubbleSorter {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //a pass that compares adjacent elements and bubbles the largest element to the largest index
            int swapCount = 0;
            for (int j = 0; j < array.length - 1 - i; j++) {

                //is there an inversion (checking)
                if (array[j] > array[j + 1]) {
                    //swap them...
                    Utilities.swap(array, j, j + 1);
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
