package Leetcode;

public class problem134 {

    public static boolean regexMatching(String p,String q){
          int m = p.length();
          int n = q.length();

         if(p==null || q==null){
            return false;
         }

          boolean dp[][] = new boolean[m+1][n+1];
          dp[0][0] = true;

          for(int i = 0;i<m;i++){
            if(p.charAt(i) == '*' && dp[0][i-1]){
                 dp[0][i+1] = true;
            }
          }

           for(int i = 0;i<m;i++){
               for(int j = 0;j<n;j++){
                 if(p.charAt(j) == '.'){
                    dp[i+1][j+1] = dp[i][j];
                 }

                 if(p.charAt(j) == q.charAt(i)){
                    dp[i+1][j+1] = dp[i][j];
                 }

                 if(p.charAt(j) == '*'){
                    if(p.charAt(j-1)!=q.charAt(i) && p.charAt(j-1)!='.'){
                        dp[i+1][j+1] = dp[i+1][j-1];
                    }
                    else{
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                 }
               }
           }

           return dp[m][n];
    }
    public static void main(String[] args) {
        String p = "ab";
        String q = ".*";

       boolean res = regexMatching(p, q);
       System.out.println(res);
    }
}
