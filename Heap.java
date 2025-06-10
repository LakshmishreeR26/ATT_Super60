public class Heap {
    private int[] arr;
    private int size;
    public Heap() {
        arr = new int[10];
        arr[0]=-1; //Sentinal value just for reference
        size=0;
    }
    public void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int val) {
        size++;
        arr[size]=val;
        int index = size;
        while(index>1){
            int parent = index/2;
            if(arr[parent]<arr[index]){
                swap(parent,index);
                index=parent;
            }
            else{
                return; //It's at the correct position no swap required
            }
        }
    }
    public void deleteFromHeap(){
        if(size==0){
            System.out.println("Nothing to delete Heap is empty");
            return;
        }
        arr[1]=arr[size]; //Move last element to root
        size--; //Remove last element
        //Propagate the root to it's correct position
        int i=1;
        while(i<size){
            int leftIndex=2*i;
            int rightIndex=2*i+1;
            if(leftIndex <= size && arr[i] < arr[leftIndex]){
                swap(i,leftIndex);
                i=leftIndex;
            }
            else if(rightIndex <= size && arr[i] < arr[rightIndex]){
                swap(i,rightIndex);
                i=rightIndex;
            }
            else{
                return;
            }
        }
    }
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        if(left<=n && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<=n && arr[largest]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }
    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(50);
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.print();
        maxHeap.deleteFromHeap();
        maxHeap.print();
        int[] arr = {-1,54,53,55,52,50};
        int n = 5;
        for(int i=n/2;i>0;i--){//Only non-leaf nodes
            heapify(arr,n,i);
        }
        System.out.println("Array after heapify:");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
