package Leetcode;
import java.util.ArrayList;
import java.util.List;

public class problem146 {

    public static int[][] insertInterval(int arr1[][],int arr2[]){
          
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = arr1.length;

        // 1. Add all intervals before new interval
        while (i < n && arr1[i][1] < arr2[0]) {
            ans.add(arr1[i]);
            i++;
        }

        // 2. Merge overlapping intervals
        while (i < n && arr1[i][0] <= arr2[1]) {
            arr2[0] = Math.min(arr2[0], arr1[i][0]);
            arr2[1] = Math.max(arr2[1], arr1[i][1]);
            i++;
        }

        // Add merged new interval
        ans.add(arr2);

        // 3. Add remaining intervals
        while (i < n) {
            ans.add(arr1[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);

    }
    public static void main(String[] args) {
        int interval[][] = {{1,3},{6,9}};
        int newInterval[] = {2,5};
        int[][] result = insertInterval(interval, newInterval);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0] + " "+ result[i][1]);
        }
    }
}
