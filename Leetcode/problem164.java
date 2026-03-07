package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class problem164 {

    public static List<Integer> spiralMatrix(int mat[][]){
        int m = mat.length;
        int n = mat[0].length;

       int visited = 101;
       int row = 0,col = 0;

       int direction[][] = {{0,1},{1,0},{0,-1},{-1,0}};
       int currdirection = 0,changedirection = 0;
       List<Integer> res = new ArrayList<>();

       res.add(mat[0][0]);
       mat[0][0] = visited;


       while(changedirection < 2){
        while(row+direction[currdirection][0]>=0 && 
            row+direction[currdirection][0] < m && 
            col+direction[currdirection][1]>=0 && 
            col+direction[currdirection][1] < n &&
            mat[row+direction[currdirection][0]][col+direction[currdirection][1]] != visited)
            {
                changedirection = 0;
                row = row + direction[currdirection][0];
                col = col + direction[currdirection][1];

                res.add(mat[row][col]);
                mat[row][col] = visited;

            }

            currdirection = (currdirection+1)%4;
            changedirection++;
       }

       return res;
       
    }
    public static void main(String[] args) {
       
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = spiralMatrix(matrix);
        System.out.println(res);

    }
}
