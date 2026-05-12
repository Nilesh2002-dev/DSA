import java.util.Arrays;

public class MergeSort {

    // Main merge sort function
    static void mergeSort(int[] arr, int left, int right) {

        // Base condition
        // If array has only one element stop recursion
        if (left >= right) {
            return;
        }

        // Find middle index
        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(arr, left, mid);

        // Sort right half
        mergeSort(arr, mid + 1, right);

        // Merge both sorted halves
        merge(arr, left, mid, right);
    }

    // Merge function
    static void merge(int[] arr, int left, int mid, int right) {

        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy left half
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy right half
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Initial indexes
        int i = 0;
        int j = 0;
        int k = left;

        // Compare and merge
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements from R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1, 3};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}