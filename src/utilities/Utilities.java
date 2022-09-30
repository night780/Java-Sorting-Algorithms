package utilities;

import java.util.Random;

public class Utilities {
    public static boolean containsInversions(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                return true;
            }
        }
        //we found no inversions
        return false;
    }

    //generate an array of arrraySize elements in the reange low and high bounds
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

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex] = temp;
    }
}
