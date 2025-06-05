//Generate binary from 1 to N using a queue
//say n=5->00,01,10,11

import java.util.Queue;
import java.util.LinkedList;

public class BinaryGenerator {
    public static void generateBinaryNumbers(int N) {
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while(N-->0){
            String current=q.poll();
            System.out.println(current+" ");
            q.offer(current+"0");
            q.offer(current+"1");
        }
    }

    public static void main(String[] args) {
        int n=5;
        generateBinaryNumbers(n);
    }
}
