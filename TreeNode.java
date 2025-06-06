package Nonlinear_Traversals;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
    public static void preOrder(TreeNode root){
      if(root != null){
          System.out.print(root.data+" ");
          preOrder(root.left);
          preOrder(root.right);
      }
    }
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args){
        // The tree is formed / built top to bottom & left to right (level by level)
        //Level 0
        TreeNode root = new TreeNode(1);
        //Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("Preorder Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        postOrder(root);
        System.out.println();

    }
}
