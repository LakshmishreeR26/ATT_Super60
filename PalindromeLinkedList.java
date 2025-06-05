import java.util.Stack;

class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            next = null;
        }
    }
    public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp=head;
        //First traversal to store the elements onto the stack
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        //Now compare the nodes with the top of the stack
        while(temp!=null){
            if(temp.data!=stack.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        //1->2->3->null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        System.out.println(isPalindrome(head)?"Palindrome.":"Not a palindrome.");
    }
}
