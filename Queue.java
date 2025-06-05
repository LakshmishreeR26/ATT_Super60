public class Queue {
    private static final int MAXSIZE = 10;
    private int[] arr = new int[MAXSIZE];
    private int front;
    private int rear;
    public Queue() {
        front=rear=-1;
    }
    public boolean isEmpty() {
        return (front==-1 && rear == -1);
    }
    public boolean isFull() {
        return rear==MAXSIZE-1;
    }
    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue is full. Can't enqueue item");
            return;
        }
        else if(isEmpty()){
            front = rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=item;
        System.out.println("The element is enqueued is: " + item);
    }
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Can't dequeue item");
        }
        else if(front==rear){
            front = rear=-1;
        }
        else{
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()) {
            System.out.println("Queue is empty. Can't get front item");
            return -1;
        }else{
            return arr[front];
        }
    }
    public int getRear(){
        if(isEmpty()) {
            System.out.println("Queue is empty. Can't get front item");
            return -1;
        }else{
            return arr[rear];
        }
    }

    public void display(){
        if(isEmpty()) {
            System.out.println("Queue is empty. No items in the queue");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return rear+1;
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        int[] arr = {10,20,30,40,50};
        for (int x : arr){
            q.enqueue(x);
        }
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Front element " + q.getFront());
        System.out.println("Rear element " + q.getRear());
        System.out.println("Size of queue is " + q.size());
        q.display();
    }
}
