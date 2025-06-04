public class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

class SLL{
    Node head;
    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSize(){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    void deleteAtHead() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    void deleteByValue(int val){
        if(head == null) return;

        if (head.data == val) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data != val){
            temp=temp.next;
        }

        if(temp.next == null){
            System.out.println("Value not found");
            return;
        }

        Node tobeDeleted = temp.next;
        temp.next = temp.next.next;
        tobeDeleted = null;
    }

    void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DriverCode {
    public static void main(String args[]){
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.printll();
        sll.insertAtTail(50);
        sll.insertAtTail(60);
        sll.printll();
    }
}
