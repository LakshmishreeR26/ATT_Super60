package Interview_Questions;
class TNode{
    int data;
    TNode left;
    TNode right;
    public TNode(int x){
        data=x;
        left=null;
        right=null;
    }
}

public class IdenticalTrees {
    static boolean areIdenticalTree(TNode t1, TNode t2){
        //if both of them are null they are identical
        if(t1==null && t2==null){
            return true;
        }
        //one of them is empty they are not identical
        if (t1 == null || t2 == null) {
            return false;
        }
        //compare the root data of both the trees
        if (t1.data != t2.data) {
            return false;
        }
        //Use recursion to check the left and right subtree of both the trees
        return(areIdenticalTree(t1.left,t2.left) && (areIdenticalTree(t1.right,t2.right)));
    }
    public static void main(String[] args) {
        TNode t1 = new TNode(1);
        t1.left = new TNode(2);
        t1.right = new TNode(3);

        TNode t2 = new TNode(1);
        t2.left = new TNode(2);
        t2.right = new TNode(3);

        if(areIdenticalTree(t1,t2)){
            System.out.println("T1 & T2 Trees are identical");
        }
        else{
            System.out.println("T1 & T2 Trees are not identical");
        }
        TNode t3 = new TNode(1);
        t3.left = new TNode(2);
        t3.right = new TNode(3);

        TNode t4 = new TNode(1);
        t4.left = new TNode(2);
        t4.right = new TNode(4);
        if(areIdenticalTree(t3,t4)){
            System.out.println("T3 & T4 Trees are identical");
        }
        else{
            System.out.println("T3 & T4 Trees are not identical");
        }
    }
}
