import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //Reverse is maxheap
        maxHeap.add(22);
        maxHeap.add(1);
        maxHeap.add(33);
        maxHeap.add(34);
        maxHeap.add(50);
        System.out.println("Max Heap:" +maxHeap);
        System.out.println("Max Element:" +maxHeap.poll());

    }
}
