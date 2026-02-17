package Leetcode;

public class problem138 {

    public static int minimumJunps(int arr[]){
        int n = arr.length;

       int maxReach = 0;
       int currEnd = 0;
       int jumps = 0;

       for(int i = 0;i<n-1;i++){
          maxReach = Math.max(maxReach,i+arr[i]);
          if(i==currEnd){
            jumps++;
            currEnd = maxReach;
          }

       }

       return jumps;
    
    }
    public static void main(String[] args) {
         int nums[] = {2,3,1,1,4};
         int res = minimumJunps(nums);
         System.out.println(res);
    }
}
