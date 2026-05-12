import java.util.Arrays;

public class BidirectionalSelectionSort {

    public static void bidirectionalSelectionSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int minIndex = left;
            int maxIndex = right;

            // Find min and max
            for (int i = left; i <= right; i++) {

                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }

                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap minimum with left
            int temp = arr[left];
            arr[left] = arr[minIndex];
            arr[minIndex] = temp;

            // Important:
            // if max element was at left,
            // its index changes after first swap
            if (maxIndex == left) {
                maxIndex = minIndex;
            }

            // Swap maximum with right
            temp = arr[right];
            arr[right] = arr[maxIndex];
            arr[maxIndex] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 2, 1};

        bidirectionalSelectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}