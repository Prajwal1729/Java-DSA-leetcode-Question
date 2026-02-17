package Leetcode;

public class problem103 {

    public static int noOfIsalnds(int grid[][]){

        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }

        return count;
    }

    public static void dfs(int [][] grid,int row,int col){

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }

        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }
    
    public static void main(String[] args) {
        
    }
}
