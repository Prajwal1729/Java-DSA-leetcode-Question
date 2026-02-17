package Leetcode;

public class problem124 {

    public static int robHouses(int arr[]){
        int n = arr.length;

        int dp[] = new int[n];
        
        dp[0] = arr[0];
        dp[1] = Math.max(dp[0],arr[1]);


        for(int i = 2;i<n;i++){
            dp[i] = Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[n-1];

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int res = robHouses(arr);
        System.err.println(res);
    }
}
