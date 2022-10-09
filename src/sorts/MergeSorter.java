package sorts;

/**
 * Class that implements the merge sort algorithm.
 * @author Jacob j
 * @version 1.2
 */
public class MergeSorter {

    private static int[] aux;


    /**
     * Entry method for the merge sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void sort(int[] array)
    {
        if (array.length > 1) {

            // Creating a new array of the same length as the array that is being sorted.
            aux = new int[array.length];

            // Calling the recursive sort function on the array, starting at index 0 and ending at the last index.
            sort(array, 0, array.length - 1);
        }

    }

    /**
     * Private merge sort algorithm.
     *
     * @param array the array to be sorted
     * @param low the lowest index of the array
     * @param high the highest index of the array
     */
    private static void sort(int[] array, int low, int high)
    {
        int mid;
        if (high - low > 0) {

            // Splitting the array into two parts and sorting each part by recursively dividing.
             mid = (high + low) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
        }

        mid = (high + low) / 2;
        int left = low;
        int right = mid + 1;
        int mergeIndex = high - low + 1;

        // Copying the elements from the aux array to the array that is being sorted.
        for (int i = 0; i < mergeIndex; i++)
        {
            // If the left index is greater than the mid index, then the left index is out of bounds.
            if (left > mid)
            {
                aux[i] = array[right];
                right++;
            }
            // This is checking to see if the right index is out of bounds.
            else if (right <= high) {

                // This is comparing the values of the left and right indexes to see which one is smaller.
                if (array[left] < array[right])
                {
                    aux[i] = array[left];
                    left++;
                }
                // Checking to see if the right index is out of bounds.
                else
                {
                    aux[i] = array[right];
                    right++;
                }
            // Checking to see if the left index is out of bounds.
            } else {
                aux[i] = array[left];
                left++;
            }
        }

        // This is checking to see if the mergeIndex is greater than or equal to 0.
        if (mergeIndex >= 0) {
            // Copying the elements from the aux array to the array that is being sorted.
            System.arraycopy(aux, 0, array, low, mergeIndex);
        }
    }

}
