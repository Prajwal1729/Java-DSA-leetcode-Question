package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class problem109 {

    // rotten organges //
    public static int minmumNoOfMinutes(int grid[][]){
        
        if(grid == null || grid.length == 0){
            return -1;
        }

        int freshCount = 0;
        Queue<int[]> rottenQueue = new LinkedList<>();

        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    freshCount++;
                }
                else if(grid[i][j] == 2){
                    rottenQueue.offer(new int[]{i,j});
                }
            }
        }

        if(freshCount == 0){
            return 0;
        }

        int min = 0;
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!rottenQueue.isEmpty()){
            int size = rottenQueue.size();

            for(int i = 0;i<size;i++){
                int rotten[] = rottenQueue.poll();
                for(int dir[] : directions){
                    int x = rotten[0] + dir[0];
                    int y = rotten[1] + dir[1];

                    if(x >=0 && x < grid.length && y>=0 && y<grid[0].length && grid[x][y] == 1){
                        grid[x][y] = 2;
                        freshCount--;
                        rottenQueue.offer(new int[]{x,y});
                    }
                }
            }
            min++;
        }

        return freshCount == 0 ? min: -1;

    }
    public static void main(String[] args) {
        
        int arr[][] = {{2,1,1},{1,1,0},{0,1,1}};
        int res = minmumNoOfMinutes(arr);

        System.out.println(res);
    
    }
}
