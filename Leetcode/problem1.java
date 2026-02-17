package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class problem1 {

    public static int[] twoSum(int nums[],int tar){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int comp = tar - nums[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
             map.put(nums[i],i);
            
        }
       return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {15,7,2,11};
        int tar = 9;

       int res[] = twoSum(arr, tar);

       for(int i = 0;i<res.length;i++){
          System.out.print(res[i] + " ");
       }

    }
    
}
