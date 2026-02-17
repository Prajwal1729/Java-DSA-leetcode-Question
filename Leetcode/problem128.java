package Leetcode;
import java.util.Arrays;

public class problem128 {

    public static int fewestNumberCoins(int coins[],int amount){
        int n = coins.length;

        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);

        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int j =0;j<n;j++){
                if (i >= coins[j] && dp[i - coins[j]] != amount + 1) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        
        if(dp[amount] < amount+1){
           return dp[amount];
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 11;

        int res = fewestNumberCoins(coins, amount);
        System.out.println(res);
    }
}
