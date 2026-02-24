package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class problem155 {
    public static List<List<Integer>> combinationSumII(int nums[],int tar){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> combination = new ArrayList<>();
        backTrack(tar,res,combination,0,nums);
        return res;
    }

    public static void backTrack(int tar,List<List<Integer>> res,List<Integer> combination,int start,int nums[]){
        if(tar==0){
            res.add(new ArrayList<>(combination));
        }

        for(int i=start;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }

            if(tar - nums[i] < 0){
                break;
            }

            combination.add(nums[i]);
            backTrack(tar - nums[i], res, combination, i+1, nums);
            combination.remove(combination.size() - 1);
        }
         
    }
    public static void main(String[] args) {
        // Combination sum II(no duplicate combination) //
        int candidates[] = {2,1,2,3,4};
        int target = 5;

        List<List<Integer>> res = combinationSumII(candidates, target);
        System.out.println(res);

    }
}
