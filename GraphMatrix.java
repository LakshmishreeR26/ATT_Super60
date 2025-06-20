import java.util.Scanner;

public class GraphMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //n->nodes
        //m->edges
        //We cover all the nodes, so Time Complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n+1][n+1]; // for 0-based indexing
        //Take the edges as input
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            //Undirected -> u <---> v
            matrix[u][v] =1;
            matrix[v][u]=1; //Dont do this for directed
        }
        //Print the Adjacency Matrix
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
