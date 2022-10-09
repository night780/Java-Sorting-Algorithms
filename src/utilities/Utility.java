package utilities;

import java.util.Random;

/**
 *
 * @author Jacob J
 * @version 1.0
 */
public class Utility {
    /**
     * If the array is sorted, then there are no inversions
     *
     * @param array the array to check for inversions
     * @return A boolean value.
     */
    public static boolean containsInversions(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                return true;
            }
        }
        //we found no inversions
        return false;
    }

    /**
     * It generates an array of random integers between lowBound and highBound
     *
     * @param arraySize the size of the array to be generated
     * @param lowBound the lowest number that can be generated
     * @param highbound the highest number that can be generated
     * @return An array of random numbers
     */
    public static int[] generateArray(int arraySize, int lowBound, int highbound) {
        int[] result = new int[arraySize];

        //generate random elements
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            int randomNum = lowBound + random.nextInt(highbound-lowBound+1);
            result[i]=randomNum;
        }
        return result;
    }

    /**
     * Swap the values at the first and second indices of the given array.
     *
     * @param array the array that you want to sort
     * @param firstIndex the index of the first element in the array
     * @param secondIndex the index of the second element to swap
     */
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex] = temp;
    }
}
