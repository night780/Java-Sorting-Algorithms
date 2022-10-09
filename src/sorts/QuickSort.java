package sorts;

import utilities.Utility;


/**
 * This class is a quick sort algorithm that sorts an array of integers
 *
 * @author Jacob J
 * @version 1.0
 */
public class QuickSort {

    /**
     * Calls the quickSort method on the entire array
     *
     * @param array This is the array that we want to sort.
     */
    public static void sort(int[] array) {
        // This is calling the quickSort method on the entire array.
        quickSort(array, 0, array.length - 1);
    }


    /**
     * If the minimum value is less than the maximum value, then partition the array and call the quickSort method on the
     * left and right side of the pivot
     *
     * @param array This is the array that is being sorted.
     * @param min   This is the starting index of the array.
     * @param max   The last index of the array.
     */
    private static void quickSort(int[] array, int min, int max) {

        // This is the recursive call.
        if (min < max) {
            // Calling the partition method and setting the pivot to the value returned by the partition method.
            int pivot = partition(array, min, max);

            // This is calling the quickSort method on the left side of the pivot.
            quickSort(array, min, pivot - 1);

            // This is calling the quickSort method on the right side of the pivot.
            quickSort(array, pivot + 1, max);
        }
    }

    /**
     * The function takes the last element as pivot, places the pivot element at its correct position in sorted array, and
     * places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot
     *
     * @param array the array to be sorted
     * @param min   the index of the first element in the array
     * @param max   the last index of the array
     * @return The index of the pivot element.
     */
    private static int partition(int[] array, int min, int max) {
        // This is setting the pivot to the last element in the array.
        int pivot = array[max];

        // This is setting the index of the first element in the array to the variable i.
        int i = (min - 1);


        for (int j = min; j <= max - 1; j++) {

            // This is comparing the value at the index j to the pivot.
            if (array[j] < pivot) {
                i++;
                // Swapping the values at the index i and j.
                Utility.swap(array, i, j);
            }
        }
        // This is swapping the value at the index i+1 with the value at the index max.
        Utility.swap(array, i + 1, max);

        // This is returning the index of the pivot element.
        return (i + 1);
    }

}
