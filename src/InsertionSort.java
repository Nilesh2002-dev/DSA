import java.util.Arrays;

public class InsertionSort {

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Traverse from index 1
        for (int i = 1; i < n; i++) {

            // Current element to insert
            int key = arr[i];

            // Previous index
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];

                j--;
            }

            // Insert key at correct j+1 position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
       // Converts array into readable string format.

        insertionSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}