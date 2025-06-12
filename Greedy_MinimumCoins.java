import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_greedy_minimumcoins {
    static void findMinimumCoins(List<Integer> coins, int V) {
        List<Integer> result = new ArrayList<>();
        //If the array/list id not sorted, sort it first
        //Traverse the sorted array from the end to the beginning
        for(int i=coins.size()-1;i>=0;i--){
            while(V>=coins.get(i)){
                V-=coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Coins Selected: -> ");
        for(int coin : result){
            System.out.print(coin+" ");
        }
        System.out.println();
        System.out.println("Minimum number of coins selected: -> " + result.size());
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int V1=91;
        findMinimumCoins(coins,V1);
        int V2=30;
        findMinimumCoins(coins,V2);
    }
}
