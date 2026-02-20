package Leetcode;

import java.util.Arrays;

public class problem144 {

    public static boolean attendMettings(int arr[][]){
         
       Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

       for(int i = 0;i<arr.length;i++){
          if(arr[i][1] > arr[i+1][0]){
            return false;
          }
       }


       return true;



    }
    public static void main(String[] args) {
        int arr[][] = {{0,30},{5,10},{15,20}};
        boolean res = attendMettings(arr);
        System.out.println(res);

    }
}
