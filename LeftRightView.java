class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}
public class LeftRightView {
    public static void leftView(Node root) {
        if(root == null){
            System.out.println("Empty tree cant print left view");
        }
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.left;
        }
        System.out.println();
    }
    public static void rightView(Node root) {
        if(root == null){
            System.out.println("Empty tree cant print right view");
            return;
        }
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        leftView(root);
        rightView(root);
    }
}
