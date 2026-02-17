package Leetcode;

public class problem127 {

    public static int[][] pascalsTraingle(int numRows){

        int [][] dp = new int [numRows][numRows];

        if(numRows == 1){
           return new int[][]{{1},{1}};
        }

       for(int i = 0;i<numRows;i++){
          for(int j = 0;j<=i;j++){
            if(j==0 || j==i){
                dp[i][j] = 1;
            }
            else{
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
          }
       }

       return dp;

    }
    public static void main(String[] args) {
        int numRows = 5;
        int res[][] = pascalsTraingle(numRows);
       for(int i=0;i<numRows;i++){
        for(int j=0;j<=i;j++){
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
       }
    }
}
