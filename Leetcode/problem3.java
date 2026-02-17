package Leetcode;

import java.util.HashSet;

public class problem3 {

    public static boolean duplicateIntegerII(int nums[],int k){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        int nums[] = {0,5,2,4,5,1,6};
        int k = 3;

        boolean res = duplicateIntegerII(nums, k);
        System.out.println(res);

    }
}
