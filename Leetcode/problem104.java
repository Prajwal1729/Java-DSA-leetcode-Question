package Leetcode;

public class problem104 {

    public static int maxAreaOfIsland(int grid[][]){

        if(grid==null || grid.length == 0){
            return 0;
        }
        
        int maxArea = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    int area = dfs(grid,i,j);
                    maxArea = Math.max(maxArea,area);
                    
                }

            }
        }

        return maxArea; 
    }

    public static int dfs(int grid[][],int row,int col){
        if(row < 0 || col < 0 || row>=grid.length || col >= grid[row].length || grid[row][col] == 0){
            return 0;
        }

        
        int area = 1;
        area+=dfs(grid,row,col+1);
        area+=dfs(grid,row,col-1);
        area+=dfs(grid,row+1,col);
        area+=dfs(grid,row-1,col);

        return area;
    }


    public static void main(String[] args) {
        

    }
}