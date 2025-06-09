class TNode{
    int data;
    TNode left;
    TNode right;
    TNode(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class BinarySearchTree { //Left<Node<Right for each node
    //TC=O(log N)
    //The height is not balanced -> That's a disadvantage of BST
    //To solve this problem, we use AVL trees & Red Black Trees height(0,+ or -1)
    //For ascending or descending order data, it becomes a linked list TC:O(N)
    static void inOrderTraversal(TNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }
    static TNode insert(TNode root, int key){
        if(root==null){
            TNode newNode = new TNode(key);
            return  new TNode(key); //Create a new node & return that
        }
        if(key<root.data){
            root.left = insert(root.left,key);
        }
        else if(key>root.data){
            root.right = insert(root.right,key);
        }
        return root;
    }
    static TNode search(TNode root, int key){
        //Empty
        //What if the data is at the root only
        if(root==null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }
    static TNode findMin(TNode root){
        TNode curr = root;
        while(curr!=null && curr.left!=null){
            curr = curr.left;
        }
        return curr;
    }
    static TNode delete(TNode root, int key){
        if(root==null){
            return root;
        }
        if(key<root.data){
            root.left = delete(root.left,key);
        }
        else if(key>root.data){
            root.right = delete(root.right,key);
        }
        else{
            if(root.left==null){//left child doesn't exist
                TNode temp = root.right;
                root=null;
                return temp;
            }
            else if(root.right==null){//right child doesnt exist
                TNode temp = root.left;
                root=null;
                return temp;
            }
            //Node with two children
            //Find the in-order successor & replace the root node with that value
            //Find the minimum @ the right side subtree
            TNode temp = findMin(root.right);
            //Replace the root node with that value
            root.data = temp.data;
            //From the right side, call delete again to delete the duplicate data
            root.right = delete(root.right,temp.data);
        }
        return root;
    }
    public static void main(String[] args){
        TNode root = null;
        root = insert(root,50);
        insert(root,30);
        insert(root,20);
        insert(root,40);
        insert(root,60);
        insert(root,70);
        insert(root,80);
        System.out.println("Inorder traversal is: ");
        inOrderTraversal(root);
        System.out.println("\nDeleted\n");
        root = delete(root,50);
        inOrderTraversal(root);
        System.out.println("\nDeleted\n");
        root = delete(root,90);
        inOrderTraversal(root);
        System.out.println();
        TNode result = search(root,40);
        if(result==null){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found: "+result.data);
        }
    }
}
