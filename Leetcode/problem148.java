package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem148 {

    public static List<List<Integer>> removingInterval(int arr[][],int tobeRemoved[]){
       List<List<Integer>> res = new ArrayList<>();

       for(int a[]: arr){
          if(a[0] > tobeRemoved[1] || a[1] < tobeRemoved[0]){
              res.add(Arrays.asList(a[0],a[1]));
          }
          else{
            if(a[0] < tobeRemoved[0]){
                res.add(Arrays.asList(a[0],tobeRemoved[0]));
          }
          if(a[1] > tobeRemoved[1]){
            res.add(Arrays.asList(tobeRemoved[1],a[1]));
          }

       }
     }

     return res;
    }
    
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{5,7},{9,11}};
        int tobeRemoved[] = {2,6};

        List<List<Integer>> result = removingInterval(intervals, tobeRemoved);
        System.out.println(result);

    }
}
