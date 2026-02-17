package Leetcode;
import java.util.Arrays;


public class problem6 {

    public static int[] productArray(int nums[]){
          int n = nums.length;
          int pre = 1;
          int post = 1;
          int res[] = new int[n];
          Arrays.fill(res,1);
        
          for(int i = 0;i<nums.length;i++){
            res[i] = pre;
            pre = nums[i]*pre;

          }

          for(int i = nums.length-1;i>=0;i--){
             res[i] = res[i]*post;
             post = nums[i]*post;
          }

          return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productArray(nums);
        
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
      }
      System.out.println();
    }
}
