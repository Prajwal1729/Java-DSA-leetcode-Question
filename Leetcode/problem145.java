package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class problem145 {

    public static int[][] mergeAllOverlappingIntervals(int arr[][]){
          int n = arr.length;
          Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
          LinkedList<int[]> ans  = new LinkedList<>();
          
          for(int a[]: arr){
            if(ans.isEmpty() || ans.getLast()[1] < a[0]){
                ans.add(a);
            }
            else{
                ans.getLast()[1] = Math.max(ans.getLast()[1],a[1]);
            }
          }

          return ans.toArray(new int[ans.size()][]);
    }
   public static void main(String[] args) {
        int interval[][] = {{1,3},{2,6},{8,10},{15,18}};
        int res[][] = mergeAllOverlappingIntervals(interval);
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i][0] + " " + res[i][1]);
        }

   }
}
