/**
 * SortingAlgorithms.java
 * This class contains different sorting algorithms implementations.
 *
 * @author Ricky G
 */

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] sampleArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(sampleArray);

        selectionSort(sampleArray);
        System.out.println("Sorted array:");
        printArray(sampleArray);
    }

    /**
     * Sorts an integer array using the Selection Sort algorithm.
     *
     * @param arr The array to be sorted
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /**
     * Prints the elements of an integer array separated by spaces.
     *
     * @param arr The array to be printed
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
