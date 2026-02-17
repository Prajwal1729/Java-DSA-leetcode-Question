package Leetcode;

import java.util.HashSet;

public class problem10 {

    public static int longestConsecutive(int nums[]){
        
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
           set.add(nums[i]);
        }

        int lcs = 1;

        for(int num: set){
            if(set.contains(num-1)){
                continue;
            }
            else{
                int curr = num;
                int currsub = 1;
                while(set.contains(curr+1)){
                    curr++;
                    currsub++;
                }

                lcs = Math.max(lcs,currsub);
            }
        }

        return lcs;

    }
    public static void main(String[] args) {
         
        int nums[] = {100,99,4,200,1,3,2};
        int res = longestConsecutive(nums);
        System.out.println("The longest comman subsequence is: "+ res);
    }
}
