package Leetcode;

public class problem169 {
     private static final int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
     private static int m, n;
    public static int longestIncreasingPath(int mat[][]){
        if (mat.length == 0){
            return 0;
        }
       int m = mat.length, n = mat[0].length;
       int cache[][] = new int[m][n];
       int ans = 0;

       for(int i = 0;i<m;i++){
        for(int j = 0;j<n;j++){
            ans = Math.max(ans,dfs(mat,i,j,cache));
        }
       }

       return ans;
    
    }

    public static int dfs(int mat[][],int i,int j,int cache[][]){
        if(cache[i][j]!=0){
            return cache[i][j];
        }

        for(int d[]: dirs){
            int x = i + d[0], y = j + d[1];
            if(0 <= x && x < m && 0 <=y && y < n && mat[x][y] > mat[i][j]){
                cache[i][j] = Math.max(cache[i][j],dfs(mat,x,y,cache));
            }
        }
        return ++cache[i][j];
    }
    public static void main(String[] args) {
        int mat[][] = {{9,9,4},{6,6,8},{2,1,1}};

        int res = longestIncreasingPath(mat);
        System.out.println(res);
    }
}
