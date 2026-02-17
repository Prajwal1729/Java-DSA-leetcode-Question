package Leetcode;

public class problem131 {

    public static int longestIncreasingSubsequence(int arr[]){
        int n = arr.length;
        if(n==0){
            return 0;
        }

        // recurssion relation //
        
        int dp[] = new int[n];
        dp[0] = 1;

        for(int i = 1;i<n;i++){
            dp[i] = 1;
            for(int j = 0;j<i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int maxLength = 0;
        for(int i = 0;i<n;i++){
            maxLength = Math.max(dp[i],maxLength);
        }

        return maxLength;
        
    }
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        int res = longestIncreasingSubsequence(nums);
        System.out.println(res);


    }
}
