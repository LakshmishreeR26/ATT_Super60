import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphAdjListDirected {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // n-> number of nodes
            // m-> number of edges
            int n=sc.nextInt();
            int m=sc.nextInt();
            //Adjacency list Representation
            List<List<Integer>> adjList=new ArrayList<>();
            //Initialize the adjacency list with empty lists for each node
            // 1{empty}, 2{empty}, and so on
            for(int i=0;i<=n;i++){
                adjList.add(new ArrayList<>());
            }
            //read the edges & update th elist
            for(int i=0;i<m;i++){
                int u=sc.nextInt();
                int v=sc.nextInt();
                //Undirected Graph u<--->v
                adjList.get(u).add(v);
                //adjList.get(v).add(u); //Skip this for a directed graph
            }
            //Print the adjacency list
            for(int i=1;i<=n;i++){
                System.out.print("Node -> " + i + "Neighbors:->");
                for(int v : adjList.get(i)){
                    System.out.print(v + " ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
