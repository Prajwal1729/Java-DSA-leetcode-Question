package Leetcode;
import java.util.Arrays;

public class problem147 {
    public static int minimumNoOfInterval(int arr[][]){
        if(arr.length == 0){
            return 0;
        }

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        int prev = 0;
        int count = 0;

        for(int i = 1;i<arr.length;i++){
          if(arr[prev][1] > arr[i][0]){
           if(arr[prev][1] > arr[i][1]){
              prev = i;
           }
           count++;
        }
        else{
            prev = i;
         }
      }

      return count;


    }
    public static void main(String[] args) {
        // non overlapping interval //
        int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        int res = minimumNoOfInterval(intervals);
        System.out.println(res);


    }
}
