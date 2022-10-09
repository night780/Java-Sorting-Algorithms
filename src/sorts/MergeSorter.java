package sorts;

/**
 * The type Merge sorter.
 */
public class MergeSorter {

    private static int[] auxArray;

    /**
     * Merge sort.
     *
     * @param array the array
     */
    public static void sort(int[] array) {
        // Checks if the array is already sorted
        if (array.length <= 1) {
            return;//already sorted
        }

        //create the aux array for use in merge()
        auxArray = new int[array.length];

        mergeSort(array, 0, array.length - 1);
    }


    /**
     * Merge sort.
     * <p>
     * Recursive (hides the implementation of merge sort)
     * Perform the divide and conquer
     * Divide - recursively split up the array until left and right sides are sorted
     * Conquer - merge the left and right sorted array
     *
     * @param array the array
     * @param low   the array
     * @param high  the array
     */
    private static void mergeSort(int[] array, int low, int high) {
        //BASE CASE, the sub array is one or fewer elements
        if (high - low <= 0) {
//            System.out.println("Reached a base case: "+array[high]);
            return;//the sub array is already sorted
        }

        int mid = (low + high) / 2;

        //recursively sort the left and right sub arrays
        mergeSort(array, low, mid);//sort the left FIRST
        mergeSort(array, mid + 1, high);//sort the right LAST

        //merge
        merge(array, low, high);
    }

    private static void merge(int[] array, int low, int high) {
        //TODO write the merge routine
    }
}
