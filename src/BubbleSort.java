import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            // Optimization:
            // if no swap happened, array already sorted
            if(!flag){
                break;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
