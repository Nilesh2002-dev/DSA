import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        // Traverse array
        for (int i = 0; i < arr.length - 1; i++) {

            //asume current index as minimum
            int minIndex = i ;

            // find an actual minimum element
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                //swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

        }
        return arr;
    }

    static void main(String[] args) {
        int[] arr = { 9,8,7,6,5,4,3,2,1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
