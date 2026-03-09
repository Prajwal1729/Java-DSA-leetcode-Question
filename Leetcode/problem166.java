package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class problem166 {

    public static boolean isValidSuduko(int mat[][]){

        List<HashSet<Integer>> rows = new ArrayList<>();
        List<HashSet<Integer>> cols = new ArrayList<>();
        List<HashSet<Integer>> submat = new ArrayList<>();


        for(int i = 0;i<9;i++){
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            submat.add(new HashSet<>());
        }

        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                int val = mat[i][j];

                if(val==0) continue;

                if(rows.get(i).contains(val)){
                    return false;
                }
                rows.get(i).add(val);

                if(cols.get(j).contains(val)){
                    return false;
                }

                cols.get(j).add(val);

                int idx = (i/3)*3 + (j/3);

                if(submat.get(idx).contains(val)){
                    return false;
                }

                submat.get(idx).add(val);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        

        int arr[][] = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        boolean res = isValidSuduko(arr);
        System.out.println(res);
    }
}
