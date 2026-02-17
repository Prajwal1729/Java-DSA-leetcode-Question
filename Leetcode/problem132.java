package Leetcode;

public class problem132 {

    public static int longestCommonSubsequence(String s1,String s2){

        int m = s1.length();
        int n = s2.length();

        if(m == 0 || n == 0){
            return 0;
        }

        int dp[][] = new int[m+1][n+1];

        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

                }
            }
        }

        return dp[m][n];

    }
    public static void main(String[] args) {
        String t1 = "abcde";
        String t2 = "ace";

        int res = longestCommonSubsequence(t1, t2);
        System.out.println(res);
    }
}
