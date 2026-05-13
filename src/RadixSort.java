import java.util.Arrays;

public class RadixSort {

    // Function to perform counting sort on a specific digit
    static void countingSort(int[] arr, int exp) {

        int n = arr.length;

        int[] output = new int[n];

        // Digits 0-9
        int[] count = new int[10];

        // Store count of occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Convert count array into prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (right to left for stability)
        for (int i = n - 1; i >= 0; i--) {

            int digit = (arr[i] / exp) % 10;

            output[count[digit] - 1] = arr[i];

            count[digit]--;
        }

        // Copy output to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main radix sort function
    static void radixSort(int[] arr) {

        // Find maximum element
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {

            countingSort(arr, exp);
        }
    }

    public static void main(String[] args) {

        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}