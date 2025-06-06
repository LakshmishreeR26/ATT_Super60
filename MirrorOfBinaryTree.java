package Interview_Questions;

public class MirrorOfBinaryTree {
    int data;
    MirrorOfBinaryTree left;
    MirrorOfBinaryTree right;
    MirrorOfBinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    private static void Inorder(MirrorOfBinaryTree root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
}
private static MirrorOfBinaryTree Mirror(MirrorOfBinaryTree root) {
        if (root == null) {
            return root;
        }
        //Swap the left and right subtrees
    MirrorOfBinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
        //Recursively swap the left and the right subtrees
    if (root.left != null) {
        Mirror(root.left);
    }
    if (root.right != null) {
        Mirror(root.right);
    }
        return root;
}
public static void main(String[] args) {
        MirrorOfBinaryTree root = new MirrorOfBinaryTree(1);
        root.left = new MirrorOfBinaryTree(2);
        root.right = new MirrorOfBinaryTree(3);
        root.left.left = new MirrorOfBinaryTree(4);
        root.left.right = new MirrorOfBinaryTree(5);
        root.right.left = new MirrorOfBinaryTree(6);
        root.right.right = new MirrorOfBinaryTree(7);
        System.out.println("Inorder of Original Tree:");
        Inorder(root);
        System.out.println();
        root=Mirror(root);
        System.out.println("Inorder of Mirror Tree:");
        Inorder(root);
        System.out.println();
}
}
