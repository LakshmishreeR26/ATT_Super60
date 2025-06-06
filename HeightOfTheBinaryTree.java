package Interview_Questions;
class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data=x;
        left=null;
        right=null;
    }
}

public class HeightOfBinaryTree {
    static int FindHeightOfBinaryTree(Node root) {
        //Base Case: If the root is null, tree is empty, height is 0
        if(root==null){
            return 0;
        }
        int leftHeight=FindHeightOfBinaryTree(root.left);
        int rightHeight=FindHeightOfBinaryTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
        //We are adding 1 for the root node

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.println("Height of the tree: " + FindHeightOfBinaryTree(root));
        Node r1=null;
        System.out.println("Height of the tree: " + FindHeightOfBinaryTree(r1));
    }
}
