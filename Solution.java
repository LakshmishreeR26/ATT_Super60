import java.util.Arrays;

class Solution {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    private static int solve(int n, int[] dp){
        if(n==0 || n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=solve(n-1, dp)+solve(n-2,dp);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("Solution:"+climbStairs(n));
    }
}
