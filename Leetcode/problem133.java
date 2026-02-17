package Leetcode;

import java.util.HashSet;

public class problem133 {

    public static boolean wordBreak(String str,String w[]){
          int n = str.length();
          if(n==0){
            return true;
          }

          boolean dp[] = new boolean[n+1];
          dp[0] = true;

          HashSet<String> strs = new HashSet<>();

          for(String word: w){
            strs.add(word);
          }

          for(int i =1 ;i<=n;i++){
            for(int j =0 ;j<i;j++){
                if(dp[j] && strs.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
          }

          return dp[str.length()];

    }
    public static void main(String[] args) {
        String s = "leetcode";
        String words[] = {"leet","code"};
        boolean res = wordBreak(s, words);
        System.out.println(res);
       


    }
}
