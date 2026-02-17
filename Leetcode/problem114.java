package Leetcode;
import java.util.ArrayList;
import java.util.List;
public class problem114 {

    // atlantic ocean problem //
   public static List<List<Integer>> waterFlow(int grid[][]){

       if(grid==null || grid.length == 0){
            return new ArrayList<>();
       }

       int m = grid.length;
       int n = grid[0].length;

       boolean [][] pacificreach = new boolean[m][n];
       boolean [][] atlanticreach = new boolean[m][n];

       for(int i = 0;i<m;i++){
           dfs(i,0,pacificreach,grid);
           dfs(i,n-1,atlanticreach,grid);
       }

       for(int i = 0;i<n;i++){
         dfs(0,i,atlanticreach,grid);
         dfs(m-1,i,pacificreach,grid);
       }

       List<List<Integer>> res = new ArrayList<>();
       for(int i=0;i<m;i++){
         for(int j = 0;j<n;j++){
            if(pacificreach[i][j] && atlanticreach[i][j]){
                res.add(List.of(i,j));
            }
         }
       }

       return res;
   }

   public static void dfs(int row,int col, boolean reachable[][],int grid[][]){
        
      int [][] dirs = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
      reachable[row][col] = true;

      for(int [] dir: dirs){
        int newrow = row+dir[0];
        int newcol = col+dir[1];

        if(newrow < 0 || newrow >= grid.length || newcol < 0 || newcol >= grid[0].length){
            continue;
        }

        if(reachable[newrow][newcol]){
            continue;
        }

        if(grid[newrow][newcol] < grid[row][col]){
           continue;
        }

        dfs(newrow, newcol, reachable, grid);
         
      }
   }

    public static void main(String[] args) {
        
    }
}
