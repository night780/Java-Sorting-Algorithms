package driver;

import sorts.BubbleSorter;
import sorts.MergeSorter;
import sorts.QuickSort;
import sorts.SelectionSorter;
import utilities.Utility;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * This function is the main function that runs the program. It asks the user to pick a sorter, and then runs the test
     * function for that sorter
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        String one = "1. Bubble Sorter";
        String two = "2. Merge Sorter";
        String three = "3. Selection Sorter";
        String four = "4. Quick Sorter";
        String five = "5. --exit-- ";

        System.out.println();
        System.out.println("Pick a sorter:");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

        System.out.println();

        String input = scanner.nextLine();

        //Used Switch instead of If and El-If due to too many el-if's causing linter error
        switch (input) {
            case "1" -> {
                testBubbleSort();
                main(args);
            }
            case "2" -> {
                testMergeSorter();
                main(args);
            }
            case "3" -> {
                testSelectionSort();
                main(args);
            }
            case "4" -> {
                testQuickSorter();
                main(args);
            }
            case "5" -> {
                System.out.println("Exiting...");
                System.exit(0);
            }



    }}

    private static void testBubbleSort(){
        int[] testArray = Utility.generateArray(20, 1, 50);

        System.out.println("Bubble Sorter\n");

        System.out.println("Before :" + Arrays.toString(testArray));
        System.out.println();

        BubbleSorter.sort(testArray);
        System.out.println();

        System.out.println("After :" + Arrays.toString(testArray));
        String sorted = !Utility.containsInversions(testArray) ? "Yes" : "No";
        System.out.println();

        System.out.println("Is the array sorted? " + sorted);
    }

    private static void testSelectionSort(){
        int[] testArray = Utility.generateArray(20, 1, 50);

        System.out.println("Selection Sorter\n");

        System.out.println("Before :" + Arrays.toString(testArray));
        System.out.println();

        SelectionSorter.sort(testArray);
        System.out.println();

        System.out.println("After :" + Arrays.toString(testArray));
        String sorted = !Utility.containsInversions(testArray) ? "Yes" : "No";
        System.out.println();

        System.out.println("Is the array sorted? " + sorted);
    }

    private static void testMergeSorter(){
        int[] testArray = Utility.generateArray(10, 1, 20);

        System.out.println("Merge Sorter\n");

        System.out.println("Before :" + Arrays.toString(testArray));
        System.out.println();
        MergeSorter.sort(testArray);
        System.out.println();
        System.out.println("After :" + Arrays.toString(testArray));
        String sorted = !Utility.containsInversions(testArray) ? "Yes" : "No";
        System.out.println();

        System.out.println("Is the array sorted? " + sorted);
    }

    private static void testQuickSorter(){
        int[] testArray = Utility.generateArray(20, 1, 50);

        System.out.println("Quick Sorter\n");

        System.out.println("Before :" + Arrays.toString(testArray));
        System.out.println();

        QuickSort.sort(testArray);
        System.out.println();

        System.out.println("After :" + Arrays.toString(testArray));
        String sorted = !Utility.containsInversions(testArray) ? "Yes" : "No";
        System.out.println();

        System.out.println("Is the array sorted? " + sorted);
    }

}
