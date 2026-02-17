package Leetcode;
import java.util.Arrays;

public class problem135 {

    public static int raceCar(int tar){

        int dp[] = new int[tar+1];
        Arrays.fill(dp,1,dp.length,-1);

        return racecar(tar,dp);
    }

    public static int racecar(int tar,int dp[]){
        if(dp[tar] >= 0){
          return dp[tar];
        }

        dp[tar] = Integer.MAX_VALUE;
        int x = 1;
        int j = 1;

        int m = 0;
        for(;j<tar;j=(1<<++m)-1){
            for(int q = 0; q < m - 1; ++q){
                int p = (1 << q) - 1;
                dp[tar] = Math.min(dp[tar], x + 1 + q + 1 + racecar(tar - (j - p), dp));
            }
        }

        dp[tar] = Math.min(dp[tar],x+(tar==j ? 0 : 1+ racecar(j-tar, dp)));

        return dp[tar];
    }
    public static void main(String[] args) {

        // dyanmic programming last problem //
       // int tar = 9;

    }
}
