class NewNode{
    int data;
    NewNode next;
    NewNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectCycle {
    public static boolean detectcycle(NewNode head){
        NewNode slow=head;
        NewNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        NewNode head=new NewNode(1);
        NewNode second=new NewNode(2);
        NewNode third=new NewNode(3);
        NewNode fourth=new NewNode(4);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=second;
        System.out.println(detectcycle(head)?"Cycle detected.":"No cycle detected");
    }
}

