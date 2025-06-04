import java.util.Arrays;

public class count_sort {

    public static void countSort(int[] arr) {
        // Step 1: find the max
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[0];
            }
        }

        //Create a count array of 0 to max
        int[] count = new int[k + 1];

        //Calculate the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //Calculate the cumulative count
        //c = c + p
        //Skip index 0 & go from 1 till max
        //Because index 0 has no prev index
        for (int i=1;i<=k;i++){
            count[i]+=count[i-1]; // c = c+p
        }

        //Create the output array
        int[] output = new int[arr.length];
        //Start from the end of the array -> R to L
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]] = arr[i];
        }
        //Copy the output back to the input
        //for (int i=0;i<arr.length;i++){
            //arr[i]=output[i];
        //}
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {6,4,3,4,1,3,2,3,1};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
