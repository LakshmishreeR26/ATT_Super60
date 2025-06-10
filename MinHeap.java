import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(13);
        minHeap.add(7);
        minHeap.add(9);
        System.out.println("Min Heap:" +minHeap);
        System.out.println("Smallest Element:" +minHeap.poll());
    }
}
