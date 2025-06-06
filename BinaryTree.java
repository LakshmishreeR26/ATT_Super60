package Nonlinear_Traversals;

import java.util.LinkedList;
import java.util.Queue;

class Tree1Node{
    int data;
    Tree1Node left;
    Tree1Node right;
    Tree1Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree {
    public static void LevelOrderTraversal(Tree1Node root){
        //Base Case
        //If the root is empty, dont traverse
        if(root == null){
            return;
        }
        Queue<Tree1Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
         Tree1Node node = queue.poll();// Removes & stores the front element
         System.out.print(node.data+" ");
         //Left subtree
            if(node.left != null){
                queue.add(node.left);
            }
         //Right Subtree
            if(node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Tree1Node root = new Tree1Node(1);
        root.left = new Tree1Node(2);
        root.right = new Tree1Node(3);
        root.left.left = new Tree1Node(4);
        root.right.right = new Tree1Node(5);
        System.out.println("Level Order Traversal of Binary Tree is ");
        LevelOrderTraversal(root);
    }
}
