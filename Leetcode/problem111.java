package Leetcode;

public class problem111 {

    public static void solve(int grid[][]){
        if(grid == null || grid.length==0){ return; }

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1 && grid[i][j] == 'O'){
                    dfs(grid,i,j);
                }
            }
        }

         for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
               if(grid[i][j] == 'O'){
                   grid[i][j] = 'X';
               }
               else if(grid[i][j] == 'T'){
                   grid[i][j] = 'O';
               }
            }
        }
    }

    public static void dfs(int grid[][],int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='O'){
            return;
        }

        grid[i][j] = 'T';
        dfs(grid,i+1,j);
        dfs(grid, i-1, j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);


    }
    public static void main(String[] args) {
        
    }
}
