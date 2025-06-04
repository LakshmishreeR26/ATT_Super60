import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex=i;
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            if(minIndex!=i){ //Only swap if the min index has changed
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,9,1,6,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
