package Leetcode;

public class problem137 {

    public static boolean jumpGame(int arr[]){
        int n = arr.length;
        if(n==0){
            return false;
        }

        int maxReach = 0;
        for(int i = 0;i<n;i++){
            if(maxReach < i){
                return false;
            }
           
            maxReach = Math.max(maxReach, i + arr[i]);
            if (maxReach >= n - 1) {
                return true;
            }
            
        }

        return false;

    }
    public static void main(String[] args) {
       int nums[] = {2,3,1,1,4};
       boolean res = jumpGame(nums);
       System.out.println(res);
    }
}
