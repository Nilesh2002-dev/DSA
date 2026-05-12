import java.util.Arrays;

public class QuickSort {

    // Quick Sort Function
    static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low < high) {

            // Partition index
            int pivotIndex = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pivotIndex - 1);

            // Sort right side
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition Function
    static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];

        // Pointer for smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {

                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1, 3};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}