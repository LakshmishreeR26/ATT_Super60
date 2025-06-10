import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElement {
    public static int kthSmallestElement(int[] arr, int k) {
        //We will use a min heap with reverse order to create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        int ans=kthSmallestElement(arr,k);
        System.out.println("The " + k + "rd smallest elemenmts in the array " + Arrays.toString(arr) + " is "+ans);
    }
}
