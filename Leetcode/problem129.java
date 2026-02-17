package Leetcode;

public class problem129 {

    public static int decodeWays(String str){
        int n = str.length();

        int dp[] = new int[n];
        dp[0] = 1;

        for(int i = 1;i<n;i++){
            if(str.charAt(i)!='0'){
                dp[i] = dp[i-1];
            }

            int twoDigit = Integer.parseInt(str.substring(i-1,i+1));
            if(twoDigit >=10 && twoDigit<=26){
                if(i>=2){
                    dp[i]+=dp[i-2];
                }
                else{
                    dp[i]++;
                }
            }
            
        }
        return dp[n-1];

    }
    public static void main(String[] args) {
        // decode ways //
        String s = "12";
        System.out.println(decodeWays(s));
    }
}
