import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}
//Comparator for the Priority queue(min-heap)
class Comp implements Comparator<Node> {
    public int compare(Node a, Node b){
        return a.data-b.data; //Min Heap:smaller data has higher priority
    }
}
public class Solution {
    private void traversal(Node root,List<String> ans, String temp){
        //Base Case
        if(root.left == null && root.right==null){
            ans.add(temp);
            return;
        }
        if(root.left!=null){
            traversal(root.left,ans,temp + "0");
        }
        if(root.right!=null){
            traversal(root.right,ans,temp +"1");
        }

    }
    public List<String> huffmanCodes(String S, List<Integer> f, int N) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comp());
        //Create the leaf nodes and add to the priority queue
        for(int i=0;i<N;i++){ //N is the size
            pq.add(new Node(f.get(i)));
        }
        //Build the Huffman Tree
        while(pq.size()>1){
            Node left = pq.poll();
            Node right =pq.poll();
            Node newNode = new Node(left.data+right.data);
            newNode.left = left;
            newNode.right=right;
            pq.add(newNode);
        }
        Node root = pq.peek();
        List<String> ans= new ArrayList<>();
        traversal(root,ans," ");
        return ans;
    }

        public static void main (String[]args){
        Solution solution = new Solution();
        String s="abcdef";
        List<Integer> freq= Arrays.asList(5,9,12,13,16,45);
        int N=freq.size();
        List<String> huffmanCodes = solution.huffmanCodes(s, freq, N);
        System.out.println("Huffman Codes: " + huffmanCodes);
        }
    }
