package Leetcode;



public class problem19 {

    public static int[] twoSumII(int nums[],int tar){
       int n = nums.length - 1;

       int l = 0;
       int r = n;

       while(l<r){
          int mid = (l+r)/2;
          if(nums[mid] <= tar){
            l = mid+1;
            return new int[]{mid, l};
          }

          if(nums[mid]>=tar){
            r = mid-1;
            return new int[]{mid, r};
          }
       }
       return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;

        int res[] = twoSumII(numbers, target);

        for(int i =0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
