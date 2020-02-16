package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class No322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j<n ; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5};
        System.out.println((new No322()).coinChange(arr,22));
    }
}
